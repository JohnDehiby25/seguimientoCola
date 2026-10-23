public class ColaPropia {
    Nodo inicio;
    Nodo fin;
    private int tamanio;

    public ColaPropia(){
        inicio = null;
        fin = null;
    }

    public void encolar(Object o){
        Nodo nuevo = new Nodo(o);
        if(estaVacia()){
           inicio = nuevo;
           fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tamanio++;
    }
    public Object desencolar(){
        if(estaVacia()){
            return null;
        }
        Object dato = inicio.getDato();
        inicio = inicio.getSiguiente();
        if(inicio == null){
            fin = null;
        }
        tamanio--;
        return dato;
    }
    public boolean estaVacia(){
        return inicio == null;
    }

    public Object verFrente(){
        if(estaVacia()){
            return null;
        }
        return inicio.getDato();
    }
    public ColaPropia clonar(){
        ColaPropia clon = new ColaPropia();
        ColaPropia aux = new ColaPropia();

        while(!this.estaVacia()){
            Object dato = this.desencolar();
            clon.encolar(dato);
            aux.encolar(dato);
        }
        while(!aux.estaVacia()){
            this.encolar(aux.desencolar());
        }
        return clon;
    }

    public boolean esIdentica(ColaPropia otra){
        ColaPropia c1 = this.clonar();
        ColaPropia c2 = otra.clonar();

        while(!c1.estaVacia() && !c2.estaVacia()){
            if(!java.util.Objects.equals(c1.desencolar(), c2.desencolar())){
                return false;
            }
        }
        return c1.estaVacia() && c2.estaVacia();
    }
    public void invertir(){
        PilaPropia pila = new PilaPropia();
        invertirRec(pila);
    }

    private void invertirRec(PilaPropia pila){
        if(!estaVacia()){
            pila.apilar(desencolar());
            invertirRec(pila);
        } else {
            while(!pila.estaVacia()){
                encolar(pila.desapilar());
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Nodo actual = inicio;
        while(actual != null){
            sb.append(actual.getDato());
            if(actual.getSiguiente() != null){
                sb.append(", ");
            }
            actual = actual.getSiguiente();
        }
        return sb.append("]").toString();
    }
    /*
    public void invertirRecursivo(){
        if(estaVacia()) return;
        Object dato = desencolar();
        invertirRecursivo();
        encolar(dato);
    }
     */


}
