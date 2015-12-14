package br.ufmg.dcc.fernandes.ivan.symbols;

import br.ufmg.dcc.fernandes.ivan.parser.Type;

public class SymbolsTable {
	public static final int NMAX = 1000;
	public static final int MAX = 10000;
	private int nivel;
	int L;
	int[] escopo;
	public TableEntry[] entries;
	
	public SymbolsTable() {
		nivel = 0;
		L = 0;
		escopo = new int[NMAX];
		entries = new TableEntry[MAX];
	}
	
	public void enterBlock(){
		nivel++;
		if(nivel > NMAX)
			System.err.println("Nivel muito grande");
		escopo[nivel] = L;
	}
	public void leaveBlock(){
		L = escopo[nivel];
		nivel--;
	}
	
	public int getEntry(String x){
		for(int i = L-1; i >=0; i--){
			if(entries[i].nome.equals(x))
				return i;
		}
		return -1;
	}
	
	public int install(String nome, Type tipo){
		for(int i = L-1; i >= escopo[nivel]; i--){
			if(entries[i].nome.equals(nome))
				return -1;
		}
		if(L > MAX)
			return -1;
		entries[L] = new TableEntry();
		entries[L].nome = nome;
		entries[L].tipo = tipo;
		L++;
		return L-1;
	}
	
	
	public static class TableEntry{
		public String nome;
		public Type tipo;
	}
	
}
