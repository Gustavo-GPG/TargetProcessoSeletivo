public class Questão1 {

  // Representação em código do problema proposto
  public static void main(String[] args) {
    int indice = 12;
    int soma = 0;
    int k =1;

    while (k < indice) {
      k = k + 1;
      soma = soma + k;
    }
    System.out.println(soma);
  }

  // Durante o processo, k vai de 2 até 12 (pois k = k + 1 é executado antes da soma),
  // e todos esses valores de k são somados a soma.
  // Portanto, o acrecimo de K será: 2, 5, 9, 14, 20, 27, 35, 44, 54, 65, 77
  // E seu resultado final: 77
}
