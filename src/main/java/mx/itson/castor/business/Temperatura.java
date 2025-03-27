/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.castor.business;

/**
 *
 * @author dag13
 */
public class Temperatura {
    /**
     * Convierte grados Centígrados a Fahrenheit.
     * @param centigrados Es la cantidad de grados Centígrados que se desea transformar a Fahrenheit.
     * @return Valor numérico de tipo double que representa el valor en grados Fahrenheit.
     */
    public static double convertirGrados(double centigrados){
        return 1.8 * centigrados + 32;
    }
    
    /**
     * Calcula la pendiente dados valores enteros para las coordenadas de dos puntos.
     * @param x1 Es el valor entero del componente en el eje x del punto 1.
     * @param y1 Es el valor entero del componente en el eje y del punto 1.
     * @param x2 Es el valor entero del componente en el eje x del punto 2.
     * @param y2 Es el valor entero del componente en el eje y del punto 2.
     * @return Valor de la pendiente de la recta que pasa por puntos dados.
     */
    public static int calcularPendiente(int x1, int y1, int x2, int y2){
        return (y2-y1)/(x2-x1);
    }
}
