public class Questão3 {

  // Basta rodar a classe para exibir o resultado
  public static void main(String[] args) {
    double[] faturamentoDiario = {1000, 2000, 0, 0, 5000, 3000, 0, 7000, 0, 4000, 0, 0, 6000, 8000};

    calcularFaturamento(faturamentoDiario);
  }

  public static void calcularFaturamento(double[] faturamentoDiario) {
    double menorFaturamento = Double.MAX_VALUE;
    double maiorFaturamento = Double.MIN_VALUE;
    double somaFaturamento = 0;
    int diasComFaturamento = 0;
    int diasAcimaDaMedia = 0;


    for (double faturamento : faturamentoDiario) {
      if (faturamento > 0) { // Ignorando dias sem faturamento
        // Atualizando menor e maior faturamento
        menorFaturamento = Math.min(menorFaturamento, faturamento);
        maiorFaturamento = Math.max(maiorFaturamento, faturamento);

        // Somando o faturamento total
        somaFaturamento += faturamento;
        diasComFaturamento++;
      }
    }

    // Calculando a média apenas se houver dias com faturamento
    if (diasComFaturamento > 0) {
      double mediaFaturamento = somaFaturamento / diasComFaturamento;

      // Dias com faturamento acima da média
      for (double faturamento : faturamentoDiario) {
        if (faturamento > mediaFaturamento) {
          diasAcimaDaMedia++;
        }
      }

      // Exibindo os resultados
      System.out.println("Menor faturamento do ano: " + menorFaturamento);
      System.out.println("Maior faturamento do ano: " + maiorFaturamento);
      System.out.println("Número de dias com faturamento superior à média anual: " + diasAcimaDaMedia);
    }
  }
}