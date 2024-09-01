import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Cliente> getClientes() {
        List<Cliente> clientes = new ArrayList<>();
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            if (!clientes.contains(cliente)) {
                clientes.add(cliente);
            }
        }
        return clientes;
    }
}