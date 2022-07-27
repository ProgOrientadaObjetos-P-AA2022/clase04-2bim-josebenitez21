/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private int litrosMax;
    private double costoLitro;
    private double descuento;
    private double numLiDes;

    public AutomovilDiesel(int a, double b, double c) {
        litrosMax = a;
        costoLitro = b;
        descuento = c;
    }

    public void establecerLitrosMax(int a) {
        litrosMax = a;
    }

    public void establecerCostoLitro(double a) {
        costoLitro = a;
    }

    public void establecerDescuento() {
        descuento = ((litrosMax*numLiDes)/100);
    }

    public int obtenerLitrosMax() {
        return litrosMax;
    }

    public double obtenerCostoLitro() {
        return costoLitro;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public void calcularValorApagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
