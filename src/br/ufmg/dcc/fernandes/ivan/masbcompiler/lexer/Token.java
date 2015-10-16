/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmg.dcc.fernandes.ivan.masbcompiler.lexer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ivan
 */
public class Token {
    private TokenType type;
    private String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
   

    public static enum TokenType{
        ID(1, "[a-zA-Z][a-zA-Z0-9]*"),
        NUM(1, "[0-9]+"),
        REAL(1, "[0-9]+(.[0-9]+)?(e[\\+-]?[0-9]+)?"),
        DELIM(1, "[\\{\\}\\(\\)\\[\\]\\;\\s]"),
        ASSIGN(5, "="),
        BOOLOP(5, "(\\&\\&)|(\\|\\|)"),
        EQOP(5, "(==)|(!=)"),
        RELOP(5, "(<=)|(<)|(>=)|(>)"),
        SUMOP(5, "[\\+-]"),
        MULOP(5, "[\\*/]"),
        UNOP(5, "[!-]"),
        COMMENT(8, "//"),
        INT(10, "int"),
        CHAR(10, "char"),
        FLOAT(10, "float"),
        BOOL(10, "bool"),
        IF(10, "if"),
        ELSE(10, "else"),
        WHILE(10, "while"),
        DO(10, "do"),
        BREAK(10, "break"),
        TRUE(10, "true"),
        FALSE(10, "false");
        
        
        private int priority;
        private Pattern pattern;
        
        private TokenType(int priority, String regexString){
            this.priority = priority;
            this.pattern = Pattern.compile(regexString);
        }

        public int getPriority() {
            return priority;
        }
        
        public boolean match(String entry){
            Matcher m = this.pattern.matcher(entry);
            return (m.matches() && m.start() == 0 && m.end() == entry.length());
        }
    }
    
}
