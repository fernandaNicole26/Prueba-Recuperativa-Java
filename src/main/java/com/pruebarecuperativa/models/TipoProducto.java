package com.pruebarecuperativa.models;

public class TipoProducto {
    public String nombreCategoria;
    public Integer cantidad;

    /************Constructores*****************/

    public TipoProducto() {
    }
    public TipoProducto(String nombreCategoria, Integer cantidad) {
        this.nombreCategoria = nombreCategoria;
        this.cantidad = cantidad;
    }

        /************Gettes and Settes*************/

    public String getNombreCategoria() {
        return nombreCategoria;
    }
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
   

    /************Funcionalidades***************/  
     
 @Override
    public String toString() {
        return "TipoProducto [nombreCategoria=" + nombreCategoria + ", cantidad=" + cantidad + "]";
    }
    
}
