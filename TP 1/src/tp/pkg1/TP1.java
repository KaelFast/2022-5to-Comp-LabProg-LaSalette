package tp.pkg1;

import java.io.*;
 
class divisores
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
 
        System.out.println ("Introduzca un Numero: ");
        String nu = br.readLine ();
        int n = Integer.parseInt (nu);
 
        System.out.println();
 
        int contador=0;
        for (int i = 1 ; i <= n ; i++)
        {
            if (n % i == 0)
            {
                System.out.println (i);
                contador++;
            }
        }
        System.out.println("Hay un total de "+contador+" numeros divisisores");
    }
}