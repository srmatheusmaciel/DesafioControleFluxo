import java.util.Locale;
import java.util.Scanner;



public class Contador {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int parametroUm;
    int parametroDois;

   

        try{

          System.out.println("Digite o primeiro numero como parametro: ");
          parametroUm = scanner.nextInt();
  
          System.out.println("Digite o segundo numero como parametro: ");
          parametroDois = scanner.nextInt();

          // Chamar o método para executar a contagem
          contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
          // Exceção personalizada
          System.out.println(e.getMessage());
        }
        catch (Exception e) {
          // Qualquer outra exceção
          System.out.println("Ocorreu um erro inesperado.");
      }

    


}

   // Método para realizar a contagem e tratar a exceção
   public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois) {
        // Lançar exceção se o primeiro parâmetro for maior que o segundo
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

          // Calcular a quantidade de iterações
          int quantidade = parametroDois - parametroUm;

          // Executar o loop para imprimir os números
          for (int i = 1; i <= quantidade; i++) {
              System.out.println("Imprimindo o número " + i);
          }
      }

}
