import java.util.ArrayList;
import java.util.Iterator;

public class Catalogo implements InterfazCatalogo{
	private ArrayList<Producto> productos = new ArrayList<>();

	public Catalogo(){
		Producto p1 = new Producto("000","Horno inteligente","electrodomesticos",2500);
		Producto p2 = new Producto("001","Licuadora 6 velocidades","electrodomesticos",2190);
		Producto p3 = new Producto("002","Refrigerador","electrodomesticos",8000);
		Producto p4 = new Producto("003","Laptop","electronica",15000);
		Producto p5 = new Producto("004","Camara digital","electronica",3800);
		Producto p6 = new Producto("005","Xbox Series X1","electronica",14000);
		Producto p7 = new Producto("006","Cafe 1Kg","alimentos",228);
		Producto p8 = new Producto("007","Galletas de chocolate","alimentos",80);
		Producto p9 = new Producto("008","Sopa instantanea","alimentos",14);
		Producto p10 = new Producto("009","Whisky Buchanans","licores",1200);
		Producto p11 = new Producto("010","Bacardi frambuesa","licores",256);
		Producto p12 = new Producto("011","Vodka","licores",950);
		Producto p13 = new Producto("012","Limpiador multiusos","limpieza",193);
		Producto p14 = new Producto("013","Desinfectante Antibacterial","limpieza",260);
		Producto p15 = new Producto("014","Eliminador de olores","limpieza",385);

		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		productos.add(p6);
		productos.add(p7);
		productos.add(p8);
		productos.add(p9);
		productos.add(p10);
		productos.add(p11);
		productos.add(p12);
		productos.add(p13);
		productos.add(p14);
		productos.add(p15);

	}

	public Iterator getIterator(){
		return productos.iterator();
	}


}
