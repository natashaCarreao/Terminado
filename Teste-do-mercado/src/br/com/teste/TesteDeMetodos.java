package br.com.teste;

import java.util.ArrayList;

import br.com.teste.mercado.bean.Mercadoria;
import br.com.teste.mercado.bo.MercadoriaBO;
import br.com.teste.mercado.enumeration.Tipo;

public class TesteDeMetodos {

	public static void main(String[] args) {
		
		MercadoriaBO bo = new MercadoriaBO();
		ArrayList <Mercadoria>  lista = bo.buscarTodas(); 
		for (Mercadoria merc : lista) {
			System.out.println(merc.getCodigo()+" "+ merc.getNome()+" "+merc.getPreco());
		}
		
		Mercadoria merc = new Mercadoria();
		merc.setNome("teste");
		merc.setPreco(12222.00);
		merc.setQuantidade(3);
		merc.setTipo(Tipo.ELETRODOMESTICO);
		
		bo.vender(merc);
		
		for (Mercadoria merc1 : lista) {
			System.out.println(merc1.getCodigo()+" "+ merc1.getNome()+" "+merc1.getPreco());
		}
		
		bo.comprar(4);
		
		for (Mercadoria merc1 : lista) {
			System.out.println(merc1.getCodigo()+" "+ merc1.getNome()+" "+merc1.getPreco());
		}
			
	}

}
