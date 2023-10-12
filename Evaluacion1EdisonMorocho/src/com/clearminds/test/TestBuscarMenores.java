package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) 
	{
		Producto elementoProducto;
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));
        maquina.agregarCelda(new Celda("E"));
        maquina.agregarCelda(new Celda("F"));
        
        Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "A", 4);
		Producto producto2 = new Producto("PRTO", "Gatorade", 2.54);
		maquina.cargarProducto(producto2, "B", 5);
		Producto producto3 = new Producto("KAS1", "Tostitos", 0.62);
		maquina.cargarProducto(producto3, "C", 6);
		Producto producto4 = new Producto("QLT3", "Quintuples", 0.95);
		maquina.cargarProducto(producto4, "D", 2);
		Producto producto5 = new Producto("DTO2", "Doritos", 0.60);
		maquina.cargarProducto(producto5, "E", 11);
		Producto producto6 = new Producto("BHCS", "Banchis", 0.42);
		maquina.cargarProducto(producto6, "F", 1);
		
		ArrayList <Producto> productosMenores = new ArrayList<Producto>();
		productosMenores = maquina.buscarMenores(0.90);
		System.out.println("Productos menores: "+productosMenores.size());
		
		for(int i=0;i<productosMenores.size();i++)
		{
			elementoProducto = productosMenores.get(i);
			System.out.println("Nombre:"+elementoProducto.getNombre()+" Precio:"+elementoProducto.getPrecio());
		}
 
	}

}
