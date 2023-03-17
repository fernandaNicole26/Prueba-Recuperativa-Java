package com.pruebarecuperativa.models;

public class Producto {
  public Integer precio;
  public String nombre;
  public String categoria;
  public Integer sku;

  
 /************Constructores**************/

 public Producto() {
}
public Producto(Integer precio, String nombre, String categoria, Integer sku) {
    this.precio = precio;
    this.nombre = nombre;
    this.categoria = categoria;
    this.sku = sku;
}
/******************Gettes and Settes**********/
public Integer getPrecio() {
    return precio;
}
public void setPrecio(Integer precio) {
    this.precio = precio;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getCategoria() {
    return categoria;
}
public void setCategoria(String categoria) {
    this.categoria = categoria;
}
public Integer getSku() {
    return sku;
}
public void setSku(Integer sku) {
    this.sku = sku;
}


/******************Funcionalidades**********/

@Override
public String toString() {
    return "Producto [precio=" + precio + ", nombre=" + nombre + ", categoria=" + categoria + ", sku=" + sku + "]";
}
}
