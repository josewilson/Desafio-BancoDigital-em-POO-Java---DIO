public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String agencia, double limiteChequeEspecial) {
        super(titular, agencia);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double saldo = 0;
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public String getTipoConta() {
        return "Conta Corrente";
    }

    @Override
    public String getExtrato() {
        return super.getExtrato() + "\nLimite de Cheque Especial: R$" + limiteChequeEspecial;
    }
}
