/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mymath0924;

/**
 *
 * @author kms080
 */
import javax.swing.JOptionPane;
public class MyMath0924 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, myMath.fToC(212));
        JOptionPane.showMessageDialog(null, myMath.fToC(98.6));
        JOptionPane.showMessageDialog(null, myMath.fToC(10));
        JOptionPane.showMessageDialog(null, myMath.cToF(-15));
        JOptionPane.showMessageDialog(null, myMath.cToF(0));
        JOptionPane.showMessageDialog(null, myMath.cToF(70));
        JOptionPane.showMessageDialog(null, myMath.radVolSphere(1.0));
        JOptionPane.showMessageDialog(null, myMath.radVolSphere(2.25));
        JOptionPane.showMessageDialog(null, myMath.radVolSphere(7.50));
        JOptionPane.showMessageDialog(null, myMath.hypotenuseSides(3.0, 4.0));
        JOptionPane.showMessageDialog(null, myMath.hypotenuseSides(6.75, 12.31));
        JOptionPane.showMessageDialog(null, myMath.coeffQuadratic(1, -1, -6));
        JOptionPane.showMessageDialog(null, myMath.coeffQuadratic(1, (1/8), (-1/32)));
        JOptionPane.showMessageDialog(null, myMath.coeffQuadratic(-2, 5, 17));
    }
}

class myMath {
    public static double fToC(double temp) {
        double newCelsiusTemp = temp - 32;
        newCelsiusTemp = newCelsiusTemp * (5/9);
        return newCelsiusTemp;
    }
    public static double cToF(double temp) {
        double newFahrenheitTemp = temp / (5/9);
        newFahrenheitTemp = newFahrenheitTemp + 32;
        return newFahrenheitTemp;
    }
    public static double radVolSphere(double radius) {
        double newVolume = Math.pow(radius,3);
        newVolume = newVolume * ((4/3) * Math.PI);
        return newVolume;
    }
    public static double hypotenuseSides(double a2, double b2) {
        double c2 = a2+b2;
        return c2;
    }
    public static double coeffQuadratic(double coeffA, double coeffB, double coeffC) {
        double x = (-coeffB) + Math.sqrt(Math.pow(coeffB,2) - (4*coeffA*coeffC));
        x = x / (2* coeffA);
        return x;
    }
}
