package es.usc.citius.hipster.algorithm;


public class NegativeCycleException extends RuntimeException {
    //Cuarta issue: cambiar el nombre de la constante para usar la convención de nomenclatura de constantes en Java.
    private static final String MESSAGE = "Existence of a negative cycle detected";

    public NegativeCycleException() {
        super(message);
    }
}
