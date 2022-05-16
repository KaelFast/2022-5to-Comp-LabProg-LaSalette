/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class DeitelClaseRectangulo882Evaluacion {
    public static void main(String[] args) {
        // TODO code application logic here
        DeitelClasePrueba rectangulo = new  DeitelClasePrueba(2.0, 3.0 );
        System.out.printf("%d", rectangulo );
        //System.out.printf("%d", rectangulo );
        //rectangulo.obtenerLongitud();
        //rectangulo.obtenerAnchura();
    } // main
    class DeitelClasePrueba
    {
        private double longitud;
        private double anchura;
        public DeitelClasePrueba()
        {
            longitud = 1;
            anchura = 1;
        }
        // constructor con valor predeterminado de 1 
        public DeitelClasePrueba( double longitudPrueba, double anchuraPrueba ) 
        {
            longitud = longitudPrueba;
            anchura = anchuraPrueba;
        }
        public double calculaPerimetro() 
        {

            return 2 *( anchura + longitud );
        }
        public double calcularArea()
        {
            return anchura * longitud;
        }
        // metodo establecer debe verificar que longitud sea numero flotante
        // mayores de 0.0 y menores de 20.0
        public void establecerLongitud()
        {
            if ( longitud >= 0.0 && longitud < 20.0 )
                longitud = longitudPrueba;
            else
                throw new IllegalArgumentException(
                    "la longitud debe debe de ser > 0 < 20.0");
        } // establecerLongitud
        public void establecerAnchura()
        {
            if ( anchura >= 0.0 && anchura < 20.0 )
                anchura = anchuraPrueba;
            else 
                throw new IllegalArgumentException(
                    "el ancho debe de ser > 0 < 20 ");  
        }
        public double obtenerLongitud()
        {
            return longitud;
        }

        public double obtenerAnchura()
        {
            return anchura;
        }
    }
}