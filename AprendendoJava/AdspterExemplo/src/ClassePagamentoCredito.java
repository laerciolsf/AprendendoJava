import java.math.BigDecimal;

public class ClassePagamentoCredito {

    // Classe fechada! você não tem acesso!
    public void autorizar(BigDecimal valor) {
        // autoriza
        System.out.println("Autorizado:" + valor);
    }

    public void capturar(BigDecimal valor) {
        // captura
        System.out.println("Capturado:" + valor);
    }

    public void creditar(BigDecimal valor) {
        // credita
        System.out.println("Creditado:" + valor);
    }
}
