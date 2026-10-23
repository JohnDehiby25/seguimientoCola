public class PilaPropia {
    private Nodo cima;
    private int tamanio;

    public boolean estaVacia(){
        return cima == null;
    }

    public void apilar(Object o){
        Nodo nuevo = new Nodo(o);
        nuevo.setSiguiente(cima);   // el nuevo apunta a la cima actual
        cima = nuevo;               // ahora la cima es el nuevo
        tamanio++;
    }

    public Object desapilar(){
        if(estaVacia()){
            return null;
        }
        Object dato = cima.getDato();
        cima = cima.getSiguiente();
        tamanio--;
        return dato;
    }

    public Object verCima(){
        if(estaVacia()){
            return null;
        }
        return cima.getDato();
    }

    public int tamanio(){
        return tamanio;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Nodo actual = cima;
        while(actual != null){
            sb.append(actual.getDato());
            if(actual.getSiguiente() != null){
                sb.append(", ");
            }
            actual = actual.getSiguiente();
        }
        return sb.append("]").toString();
    }
}
