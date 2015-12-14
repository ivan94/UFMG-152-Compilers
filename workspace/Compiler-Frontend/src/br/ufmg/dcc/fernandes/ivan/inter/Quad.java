package br.ufmg.dcc.fernandes.ivan.inter;

public class Quad {
	
	private Command c;
	private Object op1, op2, op3;
	
	public Quad(Command c, Object op1, Object op2, Object op3) {
		this.c = c;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
	}
	
	

	public Command getC() {
		return c;
	}



	public void setC(Command c) {
		this.c = c;
	}



	public Object getOp1() {
		return op1;
	}



	public void setOp1(Object op1) {
		this.op1 = op1;
	}



	public Object getOp2() {
		return op2;
	}



	public void setOp2(Object op2) {
		this.op2 = op2;
	}



	public Object getOp3() {
		return op3;
	}



	public void setOp3(Object op3) {
		this.op3 = op3;
	}



	public static enum Command{
		ATTR, MULT, UNMINUS
		
	}
}
