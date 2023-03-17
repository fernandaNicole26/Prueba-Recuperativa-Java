package com.pruebarecuperativa.models;

public class FlujoCaja {

public Integer ventaDia;
public Integer gananciaDia;
public Integer gastos;
public Integer pagoProveedor;


    /************Constructores*****************/

    public FlujoCaja() {
    }
    public FlujoCaja(Integer ventaDia, Integer gananciaDia, Integer gastos, Integer pagoProveedor) {
        this.ventaDia = ventaDia;
        this.gananciaDia = gananciaDia;
        this.gastos = gastos;
        this.pagoProveedor = pagoProveedor;
    } 
    /************Gettes and Settes*************/
    public Integer getVentaDia() {
        return ventaDia;
    }
    public void setVentaDia(Integer ventaDia) {
        this.ventaDia = ventaDia;
    }
    public Integer getGananciaDia() {
        return gananciaDia;
    }
    public void setGananciaDia(Integer gananciaDia) {
        this.gananciaDia = gananciaDia;
    }
    public Integer getGastos() {
        return gastos;
    }
    public void setGastos(Integer gastos) {
        this.gastos = gastos;
    }
    public Integer getPagoProveedor() {
        return pagoProveedor;
    }
    public void setPagoProveedor(Integer pagoProveedor) {
        this.pagoProveedor = pagoProveedor;
    }
    
    /************Funcionalidades***************/ 

    @Override
    public String toString() {
        return "FlujoCaja [ventaDia=" + ventaDia + ", gananciaDia=" + gananciaDia + ", gastos=" + gastos
                + ", pagoProveedor=" + pagoProveedor + "]";
    }

    
}
