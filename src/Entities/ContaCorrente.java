package Entities;

public class ContaCorrente extends  Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
  ;;  }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
