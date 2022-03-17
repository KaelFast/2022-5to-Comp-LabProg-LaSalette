/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.pkg1;

/**
 *
 * @author LABOA-PC14
 */
public class Ejercicio6 {
    int multiplo = 240;
System.out.print("Los multiplos de " + multiplo + " son");
for (int x=1;x<multiplo;x++){
	if (esMultiplo(multiplo,x)){
		System.out.print(" " + x);
	}
}
}
