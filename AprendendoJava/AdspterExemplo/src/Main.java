import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        MeuPagamentoCredito credito = new MeuPagamentoCredito();
        credito.debitar(new BigDecimal("100"));
        //credito.creditar(new BigDecimal("100"));
        }
}
