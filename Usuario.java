
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // nombre completo del usuario 
    private String user;
    // almacena los gramos de proteinas del usuario
    private float proteinasUser;
    // almacena los gramos de carbohidratos del usuario
    private float gcarbohidratosUser;
    // almacena los gramos de grasas del usuario
    private float ggrasasUser;
    //almacena calorias del usuario
    private float caloriasUsertotales;
    // porciento de los gramos de proteinas del usuario
    private float porcientoproteinasUser;
    // porciento de los gramos de carbohidratos del usuario
    private float porcientogcarbohidratosUser;
    // porciento de los gramos de grasas del usuario
    private float porcientoggrasasUser;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String user)
    {
        this.user = user;
        this.proteinasUser = 0;
        this.gcarbohidratosUser = 0;
        this.ggrasasUser = 0;
        this.caloriasUsertotales = 0;
        this.porcientoproteinasUser = 0;
        this.porcientogcarbohidratosUser = 0;
        this.porcientoggrasasUser = 0;
    }

    /**
     * metodo para dar de comer al usuario la cantidad de alimentos
     */
    public void comida(Alimentos comida,float cantidad)
    {
        proteinasUser = proteinasUser +((comida.getGproteinas()/100)*cantidad);
        gcarbohidratosUser = gcarbohidratosUser +((comida.getGcarbohidratos()/100)*cantidad);
        ggrasasUser = ggrasasUser +((comida.getGgrasas()/100)*cantidad);
        caloriasUsertotales=(proteinasUser*4)+(gcarbohidratosUser*4)+(ggrasasUser*9);

        float totalgramos = proteinasUser + gcarbohidratosUser +  ggrasasUser;
        porcientoproteinasUser = (proteinasUser*totalgramos)/100;
        porcientogcarbohidratosUser = (gcarbohidratosUser*totalgramos)/100;
        porcientoggrasasUser = (ggrasasUser*totalgramos)/100;

    }

    /**
     *muestras todos los datos del usuario que ha comido
     * 
     */
    public void muestraDatos()
    {
        System.out.println("Nombre:"+user);
        System.out.println("Gramos totales de proteinas ingeridos:"+ proteinasUser +"( "+ porcientoproteinasUser +"%)");
        System.out.println("Gramos totales de carbohidratos ingeridos:"+ gcarbohidratosUser + "( " +porcientogcarbohidratosUser +"%)");
        System.out.println("Gramos totales de grasas ingeridos:"+ ggrasasUser+"( "+porcientoggrasasUser +"%)");
        System.out.println("Calorias totales ingeridas:"+ caloriasUsertotales);

    }
}
