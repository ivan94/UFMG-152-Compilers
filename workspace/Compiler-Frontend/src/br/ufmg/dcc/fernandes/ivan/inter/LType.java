package br.ufmg.dcc.fernandes.ivan.inter;

import br.ufmg.dcc.fernandes.ivan.parser.Type;

public class LType {
	public LType(Type tipo, String t, Object array) {
		this.type = tipo;
		this.t = t;
		this.array = array;
	}
	public Type type;
	public Object array;
	public String t;
}
