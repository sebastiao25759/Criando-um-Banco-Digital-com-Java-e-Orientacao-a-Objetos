import java.util.List;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco");

        Cliente sebastiao = new Cliente("Sebastiao");

        Conta cc = new ContaCorrente(sebastiao);
        Conta cp = new ContaPoupanca(sebastiao);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(100);
        cc.mostrarDados();
        cp.mostrarDados();

        cc.transferir(10, cp);
        System.out.println("Dados Após a transferencia");
        System.out.println("");
        cp.mostrarDados();
        cc.mostrarDados();

        List<Cliente> clientes = banco.getClientes();
        System.out.println("Número de clientes: " + clientes.size());
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
