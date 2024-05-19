package UTIL;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

import CONTROLE.Controle;
import FEEDBACK.Feedback;
import PRODUTOS.Produtos;

public class Util {

	private Controle controle = new Controle();
	public void menu() {
		int opcao = 0;
		
		do {
			try {
				opcao = parseInt(showInputDialog(gerarMenu()));
				if(opcao < 1 || opcao > 8) {
					showMessageDialog(null, "Opcao invalida");
				} else {
					switch(opcao) {
						case 1:
							cadastrarfeedback();
							break;
						case 2:
							cadastrar(opcao);
							break;
						case 3:
							pesquisar();
							break;
						case 4:
							listarProdutos();
							break;
						case 5:
						    alterarProduto();
						    break;
						case 6:
							excluirProduto();
							break;
						
						case 7:
							listarFeedbacks();
							break;
						case 8:
							finalizar();
							break;
					}
				}
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "Voce deve digitar um numero");
			}
		} while(opcao != 8);
		
	}
	


	private void alterarProduto() {
		String qtdProdutos = JOptionPane.showInputDialog("Digite o nome do produto que sera alterado:");
	    Produtos produto = controle.pesquisar(qtdProdutos);

	    if (produto != null) {
	        String novoNome = JOptionPane.showInputDialog("Digite o novo nome do produto:");
	        String novaMarca = JOptionPane.showInputDialog("Digite a nova marca do produto:");
	        long novaQuantidade = Long.parseLong(JOptionPane.showInputDialog("Digite a nova quantidade de produtos:"));

	        controle.alterarProduto(produto, novoNome, novaMarca, novaQuantidade);
	        JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
	    } else {
	        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
	    }
	}




	private void cadastrarfeedback() {
		String idString = JOptionPane.showInputDialog("Digite o ID:");
        int id = Integer.parseInt(idString);

        String nomeConsumidor = JOptionPane.showInputDialog("Digite o nome do consumidor:");

        String idadeString = JOptionPane.showInputDialog("Digite a idade:");
        int idade = Integer.parseInt(idadeString);

        String seuFeedback = JOptionPane.showInputDialog("Digite seu feedback:");

        
        controle.inserirFeedback(new Feedback(id, nomeConsumidor, idade, seuFeedback));
		
	}
	
	private void cadastrar(int opcao) {
	    String nomeProduto;
	    String marca;
	    long qtdProdutos = 0;
	    nomeProduto = showInputDialog("Nome do Produto: ");
	    marca = showInputDialog("Marca: ");
	    qtdProdutos = parseInt(showInputDialog("Quantidade de Produtos: "));
	    controle.inserir(new Produtos(marca, nomeProduto, qtdProdutos));
	}

	
	private void pesquisar() {
	    String nomeProduto = showInputDialog("Digite o nome do produto: ");
	    Produtos produto = controle.pesquisar(nomeProduto);
	    if (produto != null) {
	        showMessageDialog(null, produto);
	    } else {
	        showMessageDialog(null, "Produto nao encontrado.");
	    }
	}

	
	public void listarProdutos() {
	  controle.imprimirProdutos();
	    }
	



	private void excluirProduto() {
        String nomeProduto = showInputDialog("Digite o nome do produto a ser excluido: ");
        Produtos produto = controle.pesquisar(nomeProduto);
        if (produto != null) {
            controle.excluirProduto(produto);
            showMessageDialog(null, "Produto excluido com sucesso!");
        } else {
            showMessageDialog(null, "Produto nao encontrado.");
        }
    }
	
	private void listarFeedbacks() {
	    controle.listarFeedback();
	}

	
	
	private void finalizar() {
		showMessageDialog(null, "Programa finalizado.");
        System.exit(0);
		
	}




	

	private String gerarMenu() {
		String aux = "";
		aux += "1. Cadastrar Feedback \n";
		aux += "2. Cadastrar Produto \n";
		aux += "3. PesquisarProdutos\n";
		aux += "4. ListarProdutos\n";
		aux += "5. AlterarProdutos\n";
		aux += "6. ExcluirProdutos\n";
		aux += "7. ListarFeedback\n";
		aux += "8. Finalizar\n";
		return aux;
	}
}
