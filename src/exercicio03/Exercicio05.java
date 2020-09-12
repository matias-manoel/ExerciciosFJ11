package exercicio03;

/**
 *
 * @author Matias
 */
public class Exercicio05
{
    public static void main(String[] args)
    {
        long fatorial = 1;
        System.out.println("O fatorial de 0 é " + fatorial);
        for(int i = 1; i <= 20; i++)
        {
            fatorial *= i;
            System.out.println("O fatorial de "+i+" é ("+(i-1)+"!) * "+i+" = "+fatorial);
        }
    }
}