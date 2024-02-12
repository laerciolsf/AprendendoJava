import java.math.BigDecimal;

public class MeuPagamentoCredito {

    ClassePagamentoCredito classePagamentoCredito = new ClassePagamentoCredito();

    public void debitar(BigDecimal valor) {
        classePagamentoCredito.autorizar(valor);
        classePagamentoCredito.capturar(valor);
    }

    public void creditar(BigDecimal valor) {
        classePagamentoCredito.creditar(valor);
    }

}



