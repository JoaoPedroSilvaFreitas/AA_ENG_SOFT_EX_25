package padroescomportamentais.command;

public class BloqueioContaOperacao implements Operacao {

    private Conta conta;

    public BloqueioContaOperacao(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void executar() {
        this.conta.bloquearConta();
    }

    @Override
    public void cancelar() {
        this.conta.ativarConta();
    }
}