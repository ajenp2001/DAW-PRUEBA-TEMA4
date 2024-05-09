/**
 * Clase que representa a un tiburón en el zoológico.
 * Los tiburones son animales marinos cartilaginosos que pueden ser peligrosos dependiendo de su especie.
 * Esta clase extiende de la clase Pez.
 */
package zoo;

public class Tiburon extends Pez {
    
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /**
     * Constructor por defecto que inicializa un tiburón con valores predeterminados.
     */
    public Tiburon() {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones++;
    }
    
    /**
     * Constructor que permite especificar la especie, peligrosidad, velocidad máxima de natación y tipo del tiburón.
     * 
     * @param especie La especie del tiburón.
     * @param peligroso Indica si el tiburón es peligroso o no.
     * @param velocidadMaxNatacion La velocidad máxima de natación del tiburón.
     * @param tipo El tipo del tiburón.
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones++;
    }

    /**
     * Constructor que permite especificar todos los atributos del tiburón.
     * 
     * @param especie La especie del tiburón.
     * @param peligroso Indica si el tiburón es peligroso o no.
     * @param velocidadMaxNatacion La velocidad máxima de natación del tiburón.
     * @param tipo El tipo del tiburón.
     * @param habitat El hábitat del tiburón.
     * @param comida El tipo de comida del tiburón.
     * @param longevidad La longevidad del tiburón.
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones++;
    }
    
    /**
     * Método para desplazar al tiburón.
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     * Método para que el tiburón coma.
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     * Método para decrementar el contador de tiburones cuando el objeto es eliminado.
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}