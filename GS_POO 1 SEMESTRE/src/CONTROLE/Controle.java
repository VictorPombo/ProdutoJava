package CONTROLE;

import PRODUTOS.Produtos;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import FEEDBACK.Feedback;

public class Controle {
	
	private ArrayList<Produtos> lista = new ArrayList<Produtos>();
	private ArrayList<Feedback> feedbacks = new ArrayList<>();
	
	public void inserir(Produtos produtos) {
		lista.add(produtos);
		
	}
	
	public void inserirFeedback(Feedback feedback) {
		feedbacks.add(feedback);
		
	}
	public void excluirProduto(Produtos produto) {
        lista.remove(produto);
    }
	
	public Produtos pesquisar(String nomeProduto) {
	    Produtos aux = null;
	    for (Produtos e : lista) {
	        if (e.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
	            aux = e;
	            break;
	        }
	    }
	    return aux;
	}

	
	public void imprimirProdutos() {
	    StringBuilder mensagem = new StringBuilder("Produtos:\n");
	    for (Produtos produto : lista) {
	        mensagem.append(produto).append("\n");
	    }
	    JOptionPane.showMessageDialog(null, mensagem.toString());
	}

	
	public void listarFeedback() {
	    StringBuilder mensagem = new StringBuilder("Feedbacks:\n");
	    for (Feedback feedback : feedbacks) {
	        mensagem.append(feedback).append("\n");
	    }
	    JOptionPane.showMessageDialog(null, mensagem.toString());
	}
	
	
	public void alterarProduto(Produtos produto, String novoNome, String novaMarca, long novaQuantidade) {
	    produto.setNomeProduto(novoNome);
	    produto.setMarca(novaMarca);
	    produto.setQtdProdutos(novaQuantidade);
	}

}



	
	





