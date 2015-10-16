/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmg.dcc.fernandes.ivan.masbcompiler.lexer;

import br.ufmg.dcc.fernandes.ivan.masbcompiler.lexer.Token.TokenType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/**
 *
 * @author ivan
 */
public class Lexer {
    private BufferedReader reader;
    char[] buffer;
    int bufferPointer;
    public Lexer(Reader ir, int bufferSize){
        this.reader = new BufferedReader(ir);
        this.buffer = new char[bufferSize];
    }
    
    public Token readToken() throws IOException{
        this.bufferPointer = 0;
        
        ArrayList<TokenType> oldTokens = null;
        ArrayList<TokenType> newTokens = null;
        do{
            oldTokens = newTokens;
            reader.mark(buffer.length);
            int input = reader.read();
            buffer[bufferPointer] = (char)input;
            bufferPointer++;
            if(input == -1){
                break;
            }
            newTokens = getPossibleTokens();
        }while(newTokens != null && !newTokens.isEmpty());
        
        reader.reset();
        bufferPointer--;
        
        if(oldTokens == null){
            //Invalid character, no matches since begining
            return null;
        }
        
        TokenType token = null;
        for(TokenType t: oldTokens){
            if(token == null || t.getPriority() > token.getPriority()){
                token = t;
            }
        }
        return new Token(token, new String(buffer, 0, bufferPointer));
    }
    
    private ArrayList<TokenType> getPossibleTokens(){
        ArrayList<TokenType> possibilities = new ArrayList<>();
        String entry = new String(buffer, 0, bufferPointer);
        
        for(TokenType t : TokenType.values()){
            if(t.match(entry)){
                possibilities.add(t);
            }
        }
        
        return possibilities;
    }
}
