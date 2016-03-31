package br.com.teste;

import java.util.ArrayList;

import br.com.teste.mercado.bean.Mercadoria;
import br.com.teste.mercado.bo.MercadoriaBO;

public class TesteDeMetodos {

	public static void main(String[] args) {
		
		MercadoriaBO bo = new MercadoriaBO();
		ArrayList <Mercadoria>  lista = bo.buscarTodas(); 
		for (Mercadoria merc : lista) {
			System.out.println(merc.getCodigo()+" "+ merc.getNome()+" "+merc.getPreco());
		}
			
	}

}
