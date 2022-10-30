import java.util.Iterator;

public class CatalogoProxy implements InterfazCatalogo{

    private Catalogo catalogoReal;

    public CatalogoProxy(Catalogo catalogoReal) {
        this.catalogoReal = catalogoReal;
    }

    @Override
    public Iterator getIterator() {
        return catalogoReal.getIterator();
    }
    
}
