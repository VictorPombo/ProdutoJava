package PRODUTOS;

public class Produtos {

	  private long qtdProdutos;
	    private String nomeProduto;
	    private String marca;
	    
	    public Produtos(String marca, String nomeProduto, long qtdProdutos) {
	        this.marca = marca;
	        this.nomeProduto = nomeProduto;
	        this.qtdProdutos = qtdProdutos;
	    }
	    
	    public long getQtdProdutos() {
	        return qtdProdutos;
	    }
	    
	    public void setQtdProdutos(long qtdProdutos) {
	        this.qtdProdutos = qtdProdutos;
	    }
	    
	    public String getNomeProduto() {
	        return nomeProduto;
	    }
	    
	    public void setNomeProduto(String nomeProduto) {
	        this.nomeProduto = nomeProduto;
	    }
	    
	    public String getMarca() {
	        return marca;
	    }
	    
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    
	    @Override
	    public String toString() {
	        return "Marca: " + marca + ", Nome do Produto: " + nomeProduto + ", Quantidade de Produtos: " + qtdProdutos;
	    }
	
	
}
