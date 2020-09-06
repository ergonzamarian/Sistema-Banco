package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Conta;

public class ControleDaConta {
	
	private ArrayList<Conta>clientesBanco;
	Conta conta;
	
	public ControleDaConta() {
		clientesBanco = new ArrayList<>();
	}
	
	// Cadastrando aluno
	public void Cadastro(Conta cliente) {
		clientesBanco.add(cliente);
	}
	
	// Remove de acordo com a posição informada
	public void Remocao(Conta clienteDoBanco) {
		clientesBanco.remove(clienteDoBanco);
		JOptionPane.showMessageDialog(null, "Cliente "+clienteDoBanco.getDono()+" Removido com sucesso");
		System.out.println("________________________________");
		System.out.println("     NOVA LISTA DE CLIENTES     ");
		ListarConta();
	}
	// Busca Conta
	public void BuscaConta(int numeroConta) {
		boolean exist = false;
		for(int i=0; i<clientesBanco.size();i++) {
			if(clientesBanco.get(i).getNumero() == numeroConta) {
				System.out.println("--- Conta Localizada ---");
				clientesBanco.get(i).ImprimeConta();
				exist = true;
			}
			else if(i+1 == clientesBanco.size() && exist == false) {
				System.out.println("--- Conta Não Localizada ---");
			}
		}
	}
	// Listar Contas
	public void ListarConta() {
		System.out.println("________________________________");
		System.out.println("             CONTAS             ");
		for(Conta Listagem: clientesBanco) {
			
			System.out.println("________________________________");
			Listagem.ImprimeConta();
		}
		System.out.println("________________________________");
	}
}
