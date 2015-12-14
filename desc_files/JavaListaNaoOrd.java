import java.io.*;
 
import java.util.*;
 
 
                        public class ListaNO extends Thread {
 
 
                                final static int NMax = 1000;     /*
Numero maximo de niveis possiveis */
 
                                int escopo[] = new int[10];
 
                                int nivel;    /* inteiro que contem o
numero do nivel atual */
 
                                int L;     /* inteiro que contem o
indice do ultimo elemento da Tabela de Simbolos */
 
                                int Raiz;   /* inteiro que contem o
indice do primeiro elemento da Tabela de Simbolos */
 
                                TabelaS tb = new TabelaS();
 
                                Date d = new Date();
 
 
 
 
 
 
public void run() {
 
 
 L = 0;    /* Considera-se que a primeira posicao da tabela eh a de
indice 1.
 
                                                        L eh o final da
arvore binaria */
 
 Raiz = -1;
 
 nivel = 1;           /* O primeiro nivel , o 1 */
 
 escopo[nivel] = 0;             /* escopo[1] contem o indice do primeiro
elemento */
 
 
 
 System.out.print("Entrada_______________________________________\n");
 
 Entrada_Bloco();
 
 System.out.print("Instala a_______________________________________\n");
 
 Instala("ab","int");
 
 System.out.print("Instala b_______________________________________\n");
 
 Instala("bb","int");
 
 System.out.print("Instala c_______________________________________\n");
 
 Instala("cb","int");
 
 System.out.print("Instala d_______________________________________\n");
 
 Instala("db","int");
 
 System.out.print("Instala e_______________________________________\n");
 
 Instala("eb","int");
 
 System.out.print("Instala f_______________________________________\n");
 
 Instala("fb","int");
 
 System.out.print("Instala g_______________________________________\n");
 
 Instala("gb","int");
 
 System.out.print("Instala h_______________________________________\n");
 
 Instala("hb","int");
 
 System.out.print("Pesquisa
a_______________________________________\n");
 
 Get_Entry("ab");
 
 System.out.print("Pesquisa
d_______________________________________\n");
 
 Get_Entry("db");
 
 System.out.print("Entrada_______________________________________\n");
 
 Entrada_Bloco();
 
  System.out.print("Pesquisa
a_______________________________________\n");
 
 Get_Entry("ab");
 
 System.out.print("Pesquisa
d_______________________________________\n");
 
 Get_Entry("db");
 
 System.out.print("Instala i_______________________________________\n");
 
 Instala("ib","int");
 
 System.out.print("Instala j_______________________________________\n");
 
 Instala("jb","int");
 
 System.out.print("Instala k_______________________________________\n");
 
 Instala("kb","int");
 
 System.out.print("Instala l_______________________________________\n");
 
 Instala("lb","int");
 
 System.out.print("Instala m_______________________________________\n");
 
 Instala("mb","int");
 
 System.out.print("Instala n_______________________________________\n");
 
 Instala("nb","int");
 
 System.out.print("Instala o_______________________________________\n");
 
 Instala("ob","int");
 
 System.out.print("Instala p_______________________________________\n");
 
 Instala("pb","int");
 
 System.out.print("Instala q_______________________________________\n");
 
 Instala("qb","int");
 
 System.out.print("Pesquisa
a_______________________________________\n");
 
 Get_Entry("ab");
 
 System.out.print("Pesquisa
d_______________________________________\n");
 
 Get_Entry("db");
 
 System.out.print("Entrada_______________________________________\n");
 
 Entrada_Bloco();
 
 System.out.print("Pesquisa
a_______________________________________\n");
 
 Get_Entry("ab");
 
 System.out.print("Pesquisa
d_______________________________________\n");
 
 Get_Entry("db");
 
 System.out.print("Instala r_______________________________________\n");
 
 Instala("rb","int");
 
 System.out.print("Instala s_______________________________________\n");
 
 Instala("sb","int");
 
 System.out.print("Instala t_______________________________________\n");
 
 Instala("tb","int");
 
 System.out.print("Instala u_______________________________________\n");
 
 Instala("ub","int");
 
 System.out.print("Instala v_______________________________________\n");
 
 Instala("vb","int");
 
 System.out.print("Instala w_______________________________________\n");
 
 Instala("wb","int");
 
 System.out.print("Instala x_______________________________________\n");
 
 Instala("xb","int");
 
 System.out.print("Instala y_______________________________________\n");
 
 Instala("yb","int");
 
 System.out.print("Instala z_______________________________________\n");
 
 Instala("zb","int");
 
 System.out.print("Pesquisa
a_______________________________________\n");
 
 Get_Entry("ab");
 
 System.out.print("Pesquisa
d_______________________________________\n");
 
 Get_Entry("db");
 
 System.out.print("Saida_______________________________________\n");
 
 Saida_Bloco();
 
 System.out.print("Pesquisa
a_______________________________________\n");
 
 Get_Entry("ab");
 
 System.out.print("Pesquisa
d_______________________________________\n");
 
 Get_Entry("db");
 
 
System.out.print("Saida______________________________________________\n");
 
 Saida_Bloco();
 
 System.out.print("Pesquisa
a_______________________________________\n");
 
 Get_Entry("ab");
 
 System.out.print("Pesquisa
d_______________________________________\n");
 
 Get_Entry("db");
 
 
System.out.print("Saida______________________________________________\n");
 
 Saida_Bloco();
 
}
 
 
public static void main(String argv[]) {
 
        ListaNO lno = new ListaNO();
 
        lno.start();
 
        }
 
 
 
 
 
/**************************************************************************
 
 
Implementacoes
 
***************************************************************************/
 
 
 
 
 
 
/************  Funcao que define os erros provaveis de ocorrer
**********/
 
 
void Erro(int num)
 
{
 
 switch (num) {
 
                        case 1: System.out.print("Tabela de Sibolos
cheia\n");  break;
 
                        case 2: System.out.print("Este item nao foi
encontrado\n");  break;
 
                        case 3: System.out.print("Este item ja foi
inserido\n"); break;
 
                        default: ;
 
                                                        }
 
}
 
 
/*******************     Funcao de entrada num bloco
********************/
 
 
void Entrada_Bloco()
 
{
 
 long tempo1 = System.currentTimeMillis();
 
 nivel++;
 
 for (int i = 1; i<=100000 ; i++)
 
 {
 
  if (nivel > NMax) Erro(1);
 
  else escopo[nivel] = L;
 
        //System.out.print("\nEntrada no nivel  %d",nivel);
 
 }
 
long tempo2 = System.currentTimeMillis();
 
long tempo3 = tempo2 - tempo1;
 
String.valueOf(tempo3);
 
System.out.print("Tempo:\n"+tempo3+"\n");
 
}
 
 
 
/********************  Funcao de saida de um bloco
***********************/
 
 
void Saida_Bloco()
 
{
 
 long tempo1 = System.currentTimeMillis();
 
 for (int i = 1; i<=100000 ; i++)
 
 {
 
   L = escopo[nivel];
 
 }
 
 // System.out.print("\nSaida do nivel ");
 
nivel--;
 
long tempo2 = System.currentTimeMillis();
 
long tempo3 = tempo2 - tempo1;
 
String.valueOf(tempo3);
 
System.out.print("Tempo:\n"+tempo3+"\n");
 
}
 
 
 
 
/****************  Funcao que pesquisa item na tabela
*******************/
 
 
void Get_Entry(String x)   /* Pesquisa o simbolo "x" e retorna o indice
 
                                                da Tabela de simbolos
onde ele se encontra */
 
{
 
 int S, K, aux, achou;
 
 
 
long tempo1 = System.currentTimeMillis();
 
 
 for(int i=0;i<=100000;i++) {
 
 achou = 0;
 
 K = L;
 
 while ((K > 0)&&(achou == 0))
 
 {
 
        K--;
 
        if(x.equals(tb.nome[K])) achou = 1;
 
 
        //aux = strcmpi(TabelaS[k].nome,x);
 
        //if (aux == 0)         else k = TabelaS[k].col;
 
 }
 
 if (achou == 1)
 
 {
 
         //System.out.print("O item esta no nivel  %d",
TabelaS[k].nivel);
 
         //System.out.print("               Indice %u",k);
 
         //return (k);  /* Retorna o indice no vetor TabelaS do elemento
procurado*/
 
 }
 
 else
 
 {
 
         Erro(2);
 
         //return(0);
 
 }
 
 }
 
long tempo2 = System.currentTimeMillis();
 
long tempo3 = tempo2 - tempo1;
 
String.valueOf(tempo3);
 
System.out.print("Tempo:\n"+tempo3+"\n");
 
}
 
 
 
 
/***************  Funcao que instala o item na tabela
*****************/
 
 
void Instala(String X, String atribut) /* Instala o simbolo "X" com o
atributo atribut na Tabela
 
                                                        de Simbolos */
 
{
 
int igual, k, aux;
 
long tempo1 = System.currentTimeMillis();
 
 
        for(int i=0;i<=100000;i++) {
 
        igual = 0;
 
        k = L;
 
        while (k > escopo[nivel])
 
        {
 
                k--;
 
                if(X.equals(tb.nome[k])) { igual = 1; }
 
                // aux = strcmpi(TabelaS[k].nome,X);
 
        }
 
        if (L == NMax + 1)      Erro(1);
 
        else if (igual == 0)
 
        {
 
         tb.nivel[L] = nivel;
 
         tb.atributo[L] = atribut;
 
         tb.nome[L] = X;
 
         L++;
 
        }
 
 }
 
long tempo2 = System.currentTimeMillis();
 
long tempo3 = tempo2 - tempo1;
 
String.valueOf(tempo3);
 
System.out.print("Tempo:\n"+tempo3+"\n");
 
}
 
 
}
 
 
 
 
                 class TabelaS {
 
 
                        String nome[] = new String[100] ;
 
                        String atributo[] = new String[100];
 
                        int nivel[] = new int[100];
 
 
 
                        }
 
