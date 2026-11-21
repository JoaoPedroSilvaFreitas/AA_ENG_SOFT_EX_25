package padroescomportamentais.command;

public class Conta {

    private int agencia;
    private int numero;
    private String status;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void ativarConta() {
        this.status = "Conta ativa";
    }

    public void bloquearConta() {
        this.status = "Conta bloqueada";
    }
}