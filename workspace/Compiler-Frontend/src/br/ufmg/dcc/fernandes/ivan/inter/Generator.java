package br.ufmg.dcc.fernandes.ivan.inter;

import java.util.ArrayList;

import br.ufmg.dcc.fernandes.ivan.inter.Quad.Command;

public class Generator {
	private ArrayList<Quad> quads = new ArrayList<Quad>();
	private int tempCount = 0;
	
	public void gen(Command operation, Object op1, Object op2, Object op3){
		quads.add(new Quad(operation, op1, op2, op3));
	}
	
	public void fixGotoAddress(int quadIndex, Object addr){
		quads.get(quadIndex).setOp2(addr);
	}
	
	public String newTemp(){
		String temp = "t"+tempCount;
		tempCount++;
		return temp;
	}
}
