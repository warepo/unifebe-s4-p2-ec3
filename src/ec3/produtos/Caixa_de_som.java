package ec3.produtos;

public class Caixa_de_som extends Produto 
{
	private String cor,marca;
	private double preco;
	private int qtd_de_caixas;
	private boolean pilha;
	
	public Caixa_de_som(String nome,String marca, String cor, String serial, double ID, double preco, int qtd_de_caixas, boolean pilha) 
	{
		super(nome, serial, ID);

		this.preco = preco;
		this.cor = cor;
		this.qtd_de_caixas = qtd_de_caixas;
		this.pilha = pilha;
		this.marca = marca;
	}
	
	public Double get_preco()
	{
		return this.preco;
	}
	
	public void set_preco(double preco)
	{
		 this.preco = preco;
	}
	
	public void print_dados()
	{
		System.out.println("Nome: "+this.nome+" Marca:"+this.marca+" Serial: "+this.ID+" preco: "+this.preco+" Quantidade de caixas: "+this.qtd_de_caixas+" Usa pilha: "+this.pilha);
	}

}