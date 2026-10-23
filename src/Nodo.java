public class Nodo {
    Nodo siguiente;
    Object dato;

    public Nodo(Object dato){
        siguiente = null;
        this.dato = dato;

    }
    public Object getDato(){
        return dato;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setDato(Object dato){
        this.dato = dato;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }


}
