package br.ufmg.dcc.fernandes.ivan.parser;

public class ArrayType extends Type{
	
	Type innerType;
	int length;
	
	public ArrayType(Type type, int length) {
		super("Array", type.size*length);
		innerType = type;
		this.length = length;
	}

}
