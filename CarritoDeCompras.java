import java.util.ArrayList;

public class CarritoDeCompras {
    protected  ArrayList<Producto> listaProductos;
    protected double total = 0;

    public CarritoDeCompras() {
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
            listaProductos.add(producto);
            total += producto.getPrecio();
    }

    public  ProductoIterator getIterator() {
        return new ProductoIterator(listaProductos);
    }

    public double getTotal() {
        return total;
    }

    
}
