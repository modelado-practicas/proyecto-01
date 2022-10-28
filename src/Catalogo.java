import java.util.ArrayList;
import java.util.Iterator;

public class Catalogo{
	private ArrayList<Producto> productos = new ArrayList<>();

	public Catalogo(){
		Producto p1 = new Producto("000","Refrigerador","electrodomesticos",8000);
		Producto p2 = new Producto("001","Laptop","electronica",15000);
		Producto p3 = new Producto("002","Galletas","alimentos",70);
		Producto p4 = new Producto("003","Lavadora","electrodomesticos",9000);
		Producto p5 = new Producto("004","Whisky Buchanans","licores",1200);
		Producto p6 = new Producto("005","Desinfectante multiusos","electrodomesticos",193);

		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		productos.add(p6);
	}

	public Iterator getIterator(){
		return productos.iterator();
	}


}