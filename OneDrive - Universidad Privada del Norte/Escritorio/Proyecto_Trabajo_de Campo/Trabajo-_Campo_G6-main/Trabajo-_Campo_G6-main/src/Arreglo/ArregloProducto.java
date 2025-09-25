package Arreglo;

import java.util.ArrayList;

import Clases.Producto;

public class ArregloProducto {
private ArrayList<Producto>produ;

public ArregloProducto() {
	produ=new ArrayList<Producto>();
	Adicionar(new Producto(1011,"Leche",8.50,10));
	Adicionar(new Producto(1101,"Arroz",6.60,8));
	Adicionar(new Producto(1012,"Yogurt",5.50,15));
	Adicionar(new Producto(1578,"Chocolate",2.50,15));
	Adicionar(new Producto(2010,"Agua",2.00,20));
}
public void Adicionar(Producto x) {
	produ.add(x);	
}
public int Tamaño() {
	return produ.size();
}
public Producto Obtener(int x) {
	return produ.get(x);
}

public Producto Buscar(int cod) {
	for (int i=0;i<Tamaño();i++) {
		if(Obtener(i).getCodigo()==cod)return Obtener(i);
	}
	return null;
}
//Sobrecarga que busque el producto por su nombre
public Producto Buscar(String nombre) {
	for (Producto p : produ) {
		if(p.getProducto().equalsIgnoreCase(nombre)) return p;
	}
	return null;
}
public void Eliminar(Producto x) {
	produ.remove(x);
}
//Sobrecarga que elimine por codigo
public void Eliminar(int codigo) {
	Producto p = Buscar(codigo);
	if(p!= null) {
		produ.remove(p);
	}
}
public void ActualizarStock(int codigo, int cantidad) {
	Producto p = Buscar(codigo);
	if(p != null) {
		p.setStock(p.getStock()+ cantidad);
	}
}

}
