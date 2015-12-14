package br.ufmg.dcc.fernandes.ivan;

import java.io.File;
import java.io.FileReader;

import br.ufmg.dcc.fernandes.ivan.lexer.Lexer;
import br.ufmg.dcc.fernandes.ivan.parser.parser;
import br.ufmg.dcc.fernandes.ivan.symbols.SymbolsTable;

public class Main {

	public static void main(String[] args) throws Exception {
		parser p = new parser(new Lexer(new FileReader(new File("in.masb"))));
		
		p.parse();
		
		SymbolsTable t = p.table;
		System.out.println("SUCCESS");
		
	}

}
