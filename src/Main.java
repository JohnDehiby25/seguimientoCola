//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.public class Main {
public class Main{
    public static void main(String[] args){
            ColaPropia a = new ColaPropia();
            a.encolar(1);
            a.encolar(2);
            a.encolar(3);

            // CLONAR
            ColaPropia b = a.clonar();
            System.out.println("Original: " + a);
            System.out.println("Clon:     " + b);

            // IDENTICAS
            System.out.println("¿Idénticas? " + a.esIdentica(b));

            b.encolar(4);
            System.out.println("Clon con un 4 extra: " + b);
            System.out.println("¿Idénticas? " + a.esIdentica(b));

            // INVERTIR
            a.invertir();
            System.out.println("Invertida: " + a);
        }
}