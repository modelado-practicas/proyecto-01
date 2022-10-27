public interface Iterator{
    /**
     * metodo para regresar el siguiente elemento
     * @return El siguente Producto
     */
    Producto next();
    /**
     * metodo para saber si existe un siguiente elemento
     * @return True si Hay un siguiente elemento
     */
    boolean hasNext();
}
