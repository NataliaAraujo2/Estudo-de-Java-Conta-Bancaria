public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumeroConta(1);
        contaCorrente.setChequeEspecial(200.00);
        contaCorrente.setNomeCliente("Natália");
        contaCorrente.setSaldo(100.00);

        contaCorrente.depositar(50.00);
        contaCorrente.sacar(350.00);

        System.out.println("******");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumeroContaPoupanca(1);
        contaPoupanca.setNomeClientePoupanca("Natália");
        contaPoupanca.setSaldoPoupanca(100.00);

        contaPoupanca.depositar(50.00);
        contaPoupanca.sacar(150.00);
        System.out.println("O seu saldo é" + contaPoupanca.getSaldoPoupanca());
    }
}
