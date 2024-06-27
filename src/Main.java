public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("João Silva", "001", 500.0);
        ContaPoupanca cp1 = new ContaPoupanca("Maria Santos", "001", 0.02);

        cc1.depositar(1000.0);
        cp1.depositar(500.0);

        cc1.sacar(300.0);
        cp1.sacar(100.0);

        cc1.transferir(cp1, 200.0);

        System.out.println(cc1.getExtrato());
        System.out.println(cp1.getExtrato());

        ContaCorrente cc2 = new ContaCorrente("Carlos Oliveira", "001", 1000.0);
        ContaPoupanca cp2 = new ContaPoupanca("Ana Souza", "001", 0.03);

        cc2.depositar(1500.0);
        cp2.depositar(800.0);

        cc2.sacar(200.0);
        cp2.sacar(150.0);

        cc2.transferir(cp2, 300.0);

        System.out.println(cc2.getExtrato());
        System.out.println(cp2.getExtrato());
    }
}
