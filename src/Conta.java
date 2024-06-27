public abstract class Conta {
    private static int contadorNumerosContas = 1;

    private String titular;
    private String agencia;
    private String numero;
    private double saldo;

    public Conta(String titular, String agencia) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = String.format("%04d", contadorNumerosContas++);
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor);

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    public abstract String getTipoConta(); // Método abstrato para obter o tipo de conta

    public String getExtrato() {
        return "=== Extrato ===\n" +
                "Titular: " + titular + "\n" +
                "Agência: " + agencia + "\n" +
                "Número da Conta: " + numero + "\n" +
                "Tipo de Conta: " + getTipoConta() + "\n" +
                "Saldo: R$" + saldo;
    }
}
