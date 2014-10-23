/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Pratica32 {
    public static double densidade(double x, double media, double desvio) {
        double d = 1/(Math.sqrt(2*Math.PI)*desvio)*Math.exp(-0.5*Math.pow((x-media)/desvio, 2));
        return d;        
    }
    public static void main(String[] args) {
        System.out.println(densidade(-1, 67, 3));
    }
}
