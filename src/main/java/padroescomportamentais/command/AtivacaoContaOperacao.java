package padroescomportamentais.command;

public class AtivacaoContaOperacao implements Operacao {

    private Conta conta;

    public AtivacaoContaOperacao(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void executar() {
        this.conta.ativarConta();
    }

    @Override
    public void cancelar() {
        this.conta.bloquearConta();
    }
}