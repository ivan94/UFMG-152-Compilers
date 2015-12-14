package br.ufmg.dcc.fernandes.ivan.inter;

import java.util.ArrayList;

import br.ufmg.dcc.fernandes.ivan.parser.Type;
import java_cup.runtime.Symbol;

public class Expression {
	public Object r;
	public Type type;
	
	public ArrayList<Integer> trueList = new ArrayList<Integer>();
	public ArrayList<Integer> falseList = new ArrayList<Integer>();
	
	
	
	public Expression(Object r, Type type) {
		super();
		this.r = r;
		this.type = type;
	}
	


	public Expression() {
		super();
	}


	public void tst(){
		Symbol symbol;
	}
}
