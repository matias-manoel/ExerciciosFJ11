package exercicio03;

/**
 *
 * @author Matias
 */
public class Exercicio06
{
    public static void main(String[] args)
    {
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int soma = 0;
        for(int i = 1; i <= 11; i++)
        {
            if(i == 1)
            {
                System.out.println(primeiroTermo);
                System.out.println(segundoTermo);
            }
            soma = primeiroTermo + segundoTermo;
            System.out.println(soma);
            primeiroTermo = segundoTermo;
            segundoTermo = soma;
        }
    }
}