package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class GerenciadorOperacoesTest {

    GerenciadorOperacoes gerenciador;
    Conta conta;

    @BeforeEach
    void setUp() {
        gerenciador = new GerenciadorOperacoes();
        conta = new Conta(1234, 56789);
    }

    @Test
    void deveAtivarConta() {
        Operacao ativacaoConta = new AtivacaoContaOperacao(conta);
        gerenciador.executarOperacao(ativacaoConta);

        assertEquals("Conta ativa", conta.getStatus());
    }

    @Test
    void deveBloquearConta() {
        Operacao bloqueioConta = new BloqueioContaOperacao(conta);
        gerenciador.executarOperacao(bloqueioConta);

        assertEquals("Conta bloqueada", conta.getStatus());
    }

    @Test
    void deveCancelarBloqueioConta() {
        Operacao ativacaoConta = new AtivacaoContaOperacao(conta);
        Operacao bloqueioConta = new BloqueioContaOperacao(conta);

        gerenciador.executarOperacao(ativacaoConta);
        gerenciador.executarOperacao(bloqueioConta);

        gerenciador.cancelarUltimaOperacao();

        assertEquals("Conta ativa", conta.getStatus());
    }

    @Test
    void naoDeveAlterarStatusAoCancelarSemOperacoes() {
        gerenciador.cancelarUltimaOperacao();

        assertNull(conta.getStatus());
    }
}