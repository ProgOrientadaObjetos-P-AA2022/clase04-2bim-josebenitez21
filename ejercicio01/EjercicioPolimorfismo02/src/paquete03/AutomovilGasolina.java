/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina {

private int galoMax;
    private double costoGal;
    private int iva;

    public AutomovilGasolina(String np, String p, double vp,int a, double b, int c) {
        super(np,p,vp);
        galoMax = a;
        costoGal = b;
        iva = c;
    }

    public void establecerGaloMax(int a) {
        galoMax = a;
    }

    public void establecerCostoGal(double a) {
        costoGal = a;
    }

    public void establecerIva(int a) {
        iva = a;
    }

    public int obtenerGaloMax() {
        return galoMax;
    }

    public double obtenerCostoGal() {
        return costoGal;
    }

    public int obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        
    }

    @Override
    public void calcularValorApagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
