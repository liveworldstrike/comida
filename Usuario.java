
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

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String user)
    {
        this.user = user;
        this.proteinasUser = 0;
        this.gcarbohidratosUser = 0;
        this.ggrasasUser = 0;
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
        
    }
    
    /**
     *muestras todos los datos del usuario que ha comido
     * 
     */
    public void muestraDatos()
    {
        System.out.println("Nombre:"+user);
        System.out.println("Gramos totales de proteinas ingeridos:"+ proteinasUser);
        System.out.println("Gramos totales de carbohidratos ingeridos:"+ gcarbohidratosUser);
        System.out.println("Gramos totales de grasas ingeridos:"+ ggrasasUser);
        System.out.println("Calorias totales ingeridas:"+ caloriasUsertotales);
        
    }
}
