package com.pruebarecuperativa.generation;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import com.pruebarecuperativa.models.TipoProducto;
import com.pruebarecuperativa.models.FlujoCaja;
import com.pruebarecuperativa.models.Producto;


@SpringBootApplication
public class GenerationApplication {
	
	public static void main(String[] args) {
		

/*1) Crear una función que permita a don Jose obtener las ganancias sobre una
venta (ocupar hashmap)*/
HashMap<String, Integer> gananciaHashMap = new HashMap<String, Integer>();
gananciaHashMap.put("13/03/2023",1000 );
gananciaHashMap.put("14/03/2023",1500 );
gananciaHashMap.put("15/03/2023",2000 );
gananciaHashMap.put("16/03/2023",2500 );
gananciaHashMap.put("17/03/2023",3000 );
System.out.println(gananciaHashMap);

Integer gananciaVenta= 0;
for(String i : gananciaHashMap.keySet()){
	gananciaVenta= gananciaVenta + gananciaHashMap.get(i);
	System.out.print("\n Key: "+ i + " Valor: "+ gananciaHashMap.get(i));
}

System.out.println("\n Valor total ganancia: "  + gananciaVenta);


/*2)Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
productos y que luego los muestre.
 */

 ArrayList <String> productosArrayString = new ArrayList<String>();
productosArrayString.add("galleta");
productosArrayString.add("jabon popeye");
productosArrayString.add("belmont azul");
productosArrayString.add("fideos vitorio");
productosArrayString.add("limones");

System.out.println(productosArrayString);


/*3) Se debe crear una función que dado un diccionario de productos con sus respectivos
precios se obtenga, la ganancia total, el producto más caro y el producto más barato.
*/
HashMap<String, Integer> productoHashMap = new HashMap<String, Integer>();
productoHashMap.put("galletas",1000 );
productoHashMap.put("jabon popeye",1500 );
productoHashMap.put("belmont azul",2000 );
productoHashMap.put("limones",25000 );
productoHashMap.put("pan",3000 );
System.out.println(productoHashMap);
	
	Integer totalGanancia= 0;
	Integer valorMinimo = 1000;
	Integer valorMaximo =0;
	for(String i : productoHashMap.keySet()){
		totalGanancia= totalGanancia + productoHashMap.get(i);
		System.out.print("\n Key: "+ i + " Valor: "+ productoHashMap.get(i));
		if ( productoHashMap.get(i) > valorMaximo){
			valorMaximo = productoHashMap.get(i);
		}
	if (productoHashMap.get(i) < valorMinimo){
		valorMinimo=  productoHashMap.get(i);
	}
		}

	
	System.out.println("\n el valor maximo es:" + valorMaximo);
	System.out.println("\n el valor minimo es:" + valorMinimo);
	System.out.println("\n Valor total ganancia: "  + totalGanancia);

}
	}