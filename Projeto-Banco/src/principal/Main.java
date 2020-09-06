package principal;

import controller.ControleDaConta;
import model.Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Variável de controle da Conta
		ControleDaConta controlarConta = new ControleDaConta();
		
		Conta contaErgon = new Conta(1122, "Ergon Zamarian Lima", 15000, 100);
		Conta contaAlex = new Conta(3344, "Alexsandro", 10000, 100);
		
		controlarConta.Cadastro(contaErgon);
		controlarConta.Cadastro(contaAlex);
		
		// EXEMPLO LISTAR
		//controlarConta.ListarConta();
		
		// EXEMPLO BUSCA
		//controlarConta.BuscaConta(55361);
		
		// EXEMPLO REMOÇÃO
		//controlarConta.Remocao(contaErgon);
		
		// EXEMPLO SAQUE UTILIZANDO DO LIMITE
		//contaErgon.saca(15005);
		
		// EXEMPLO DEPÓSITO
		//contaErgon.deposita(7);
		
		// EXEMPLO TRANSFERÊNCIA UTILIZANDO LIMITE
		//contaErgon.transfere(contaAlex, 15050);
	}

}
