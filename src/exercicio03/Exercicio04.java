package exercicio03;

/**
 *
 * @author Matias
 */
public class Exercicio04
{
    public static void main(String[] args)
    {
        int fatorial = 1;
        System.out.println("O fatorial de 0 é " + fatorial);
        for(int i = 1; i <= 10; i++)
        {
            fatorial *= i;
            System.out.println("O fatorial de "+i+" é ("+(i-1)+"!) * "+i+" = "+fatorial);
        }
    }
}