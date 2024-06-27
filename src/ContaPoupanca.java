public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, String agencia, double taxaRendimento) {
        super(titular, agencia);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double valor) {
        double saldo = 0;
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public String getTipoConta() {
        return "Conta Poupança";
    }

    @Override
    public String getExtrato() {
        return super.getExtrato() + "\nTaxa de Rendimento: " + (taxaRendimento * 100) + "%";
    }
}
