package padroescomportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorOperacoes {

    private List<Operacao> operacoes = new ArrayList<>();

    public void executarOperacao(Operacao operacao) {
        this.operacoes.add(operacao);
        operacao.executar();
    }

    public void cancelarUltimaOperacao() {
        if (!operacoes.isEmpty()) {
            Operacao operacao = this.operacoes.get(this.operacoes.size() - 1);
            operacao.cancelar();
            this.operacoes.remove(this.operacoes.size() - 1);
        }
    }
}