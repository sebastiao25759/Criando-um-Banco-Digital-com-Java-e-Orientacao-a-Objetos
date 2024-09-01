public class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 25759;
    private static int SEQUENCIAL = 0;

    public Conta (Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo-= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void mostrarDados() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println();
    }

    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}