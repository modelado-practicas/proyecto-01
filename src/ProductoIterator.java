import java.util.ArrayList;

public class ProductoIterator implements Iterator{
    ArrayList<Producto> lista;
    int posicion = 0;

    /**
     * Constructor del ArrayListIterator
     * @param lista ArrayList  por iterar
     */
    public ProductoIterator(ArrayList<Producto> lista){
        this.lista = lista;
    }

    @Override
    public Producto next() {
        Producto producto = lista.get(posicion);
        posicion +=1;
        return producto;
    }

    @Override
    public boolean hasNext(){
        if(posicion >= lista.size()){
            return false;
        }else{
            return true;
        }
    }
}
