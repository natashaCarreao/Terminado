package br.com.teste.mercado.bo;

import java.util.ArrayList;

import br.com.teste.mercado.bean.Mercadoria;
import br.com.teste.mercado.enumeration.Tipo;

public class MercadoriaBO {
	
	private ArrayList<Mercadoria> listaMercadorias = new ArrayList<Mercadoria>();
	private static int sequence = 0;
	
	public ArrayList<Mercadoria> buscarTodas(){
		
		return listaMercadorias = carregarListaMercadorias();
	}
	
	public void vender(Mercadoria mercadoria){
		mercadoria.setCodigo(sequence++);
		listaMercadorias.add(mercadoria);
	}
	
	public Mercadoria buscaPorCodigo(int codigo){
		for (Mercadoria merc: listaMercadorias){
			if (merc.getCodigo() == codigo){
				return merc;
			}
		}
		return null;
	}
	
	
	public void comprar(int codigo){
		Mercadoria merc = buscaPorCodigo(codigo);
		listaMercadorias.remove(codigo);
	}
	
	
	
	private ArrayList<Mercadoria> carregarListaMercadorias(){
	
		Mercadoria merc1 = new Mercadoria();
		Mercadoria merc2 = new Mercadoria();
		Mercadoria merc3 = new Mercadoria();
		Mercadoria merc4 = new Mercadoria();
		
		merc1.setCodigo(sequence++);
		merc1.setNome("Microondas 27 litros");
		merc1.setPreco(700.00);
		merc1.setQuantidade(9);
		merc1.setTipo(Tipo.ELETRODOMESTICO);
		
		listaMercadorias.add(merc1);
		
		merc2.setCodigo(sequence++);
		merc2.setNome("Tevevisão Led 32'");
		merc2.setPreco(1700.00);
		merc2.setQuantidade(4);
		merc2.setTipo(Tipo.ELETRONICO);
		
		listaMercadorias.add(merc2);
		
		merc3.setCodigo(sequence++);
		merc3.setNome("Guarda-roupa casal 8 portas.");
		merc3.setPreco(4850.00);
		merc3.setQuantidade(3);
		merc3.setTipo(Tipo.MOVEIS);
		
		listaMercadorias.add(merc3);
		
		merc4.setCodigo(sequence++);
		merc4.setNome("Smartphone LG Prime");
		merc4.setPreco(700.00);
		merc4.setQuantidade(10);
		merc4.setTipo(Tipo.SMARTPHONE);
		
		listaMercadorias.add(merc4);
		
		return listaMercadorias;
	}

}
