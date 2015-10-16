/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmg.dcc.fernandes.ivan.masbcompiler;

import br.ufmg.dcc.fernandes.ivan.masbcompiler.lexer.Lexer;
import br.ufmg.dcc.fernandes.ivan.masbcompiler.lexer.Token;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ivan
 */
public class MASBCompiler {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        Lexer l = new Lexer(new FileReader(file), 100);
        Token t = l.readToken();
        while(t != null){
            System.out.printf("<%s, %s>%n", t.getType().toString(), t.getValue());
            t = l.readToken();
        }
    }
    
}
