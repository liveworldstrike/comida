import java.util.ArrayList;
public class Usuario
{
    //nombre del usuario
    private String nombreCompleto;
    //proteinas  ingeridas por el usuario
    private float proteinasIngeridas;
    //carbohidratos   ingeridas por el usuario
    private float carbohidratosIngeridos;
    //grasas ingeridas por el usuario
    private float grasasIngeridas;
    //calorias totales ingeridas por el usuario
    private float caloriasIngeridas;
    //alimento de mas calorias cosumidas por el usuario 
    private String nombreMayorCaloria;
    //mayores calorias del alimento hasta ahora
    private float  numeroDeCaloriasMasAlimento;
    // An ArrayList guarda la posicion de los alimentos
    private ArrayList<Alimentos> alimentos;

    /**
     *Constructor de la clase usuario
     */
    public Usuario (String nombreCompleto)
    {
        this.nombreCompleto = nombreCompleto;   
        proteinasIngeridas = 0;
        carbohidratosIngeridos = 0;
        grasasIngeridas = 0;
        caloriasIngeridas = 0;
        nombreMayorCaloria = null;
        numeroDeCaloriasMasAlimento =0;
        alimentos = new ArrayList<Alimentos>();
    }

    /**
     * Metodo utilizado para dar de comer al usuario
     */
    public void comer(Alimentos alimentoQueCome, float gramosDelAlimento)
    {
        proteinasIngeridas = proteinasIngeridas + (alimentoQueCome.getProteinas() / 100 * gramosDelAlimento);
        carbohidratosIngeridos = carbohidratosIngeridos + (alimentoQueCome.getCarbohidratos() / 100 * gramosDelAlimento);
        grasasIngeridas = grasasIngeridas + (alimentoQueCome.getGrasas() / 100 * gramosDelAlimento);
        caloriasIngeridas = caloriasIngeridas + (alimentoQueCome.getCalorias() / 100 * gramosDelAlimento);
        if (numeroDeCaloriasMasAlimento <= alimentoQueCome.getCalorias()){
            numeroDeCaloriasMasAlimento = alimentoQueCome.getCalorias();
            nombreMayorCaloria = alimentoQueCome.getNombre();
        }
        alimentos.add(alimentoQueCome);
    }

    /**
     * Metodo que muestra la informacion de lo ingerido por el usuario.
     */
    public void muestraDatos()
    {
        float totalNutrientes = (proteinasIngeridas + grasasIngeridas + carbohidratosIngeridos) / 100;
        String datosProteinas = "Gramos totales de proteinas ingeridos:     " + proteinasIngeridas;
        String datosCarbohidratos = "Gramos totales de carbohidratos ingeridos: " +             carbohidratosIngeridos;
        String datosGrasas = "Gramos totales de grasas ingeridos:        " + grasasIngeridas;
        if (proteinasIngeridas > 0) {
            datosProteinas = datosProteinas + " (" + proteinasIngeridas / totalNutrientes + "%)";
        }
        if (carbohidratosIngeridos > 0) {
            datosCarbohidratos = datosCarbohidratos + " (" + carbohidratosIngeridos / totalNutrientes + "%      )";
        }
        if (grasasIngeridas > 0) {
            datosGrasas = datosGrasas + " (" + grasasIngeridas / totalNutrientes + "%)";
        }
        System.out.println("Nombre:                                    " + nombreCompleto);
        System.out.println(datosProteinas);    
        System.out.println(datosCarbohidratos);
        System.out.println(datosGrasas);
        System.out.println("Calorias totales ingeridas:                " + caloriasIngeridas);  
    }

    /**
     * Devuelve los gramos de calorias ingeridas
     */public float getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }

    /**
     * devuelve el nombre completo de usuario
     */

    public String getNombreCompleto()
    {
        return nombreCompleto;
    }

    /**
     * metodo que compara las calorias ingeridas por cada usuario y ns da a conocer las diferrencas
     */
    public void comparar (Usuario usuario2)
    {
        if (caloriasIngeridas > usuario2.getCaloriasIngeridas()){
            System.out.println(nombreCompleto + " ha consumido mas calorias que "+usuario2.getNombreCompleto()+"("+caloriasIngeridas + "frete a" + usuario2.getCaloriasIngeridas()+")");

        }

        else if (caloriasIngeridas < usuario2.getCaloriasIngeridas()){
            System.out.println(usuario2.getNombreCompleto()+ " ha consumido mas calorias que "+ nombreCompleto+"("+ caloriasIngeridas + "frete a" + usuario2.getCaloriasIngeridas()+")");

        }

        else {
            System.out.println(nombreCompleto + " ha consumido iguales calorias que " +usuario2.getNombreCompleto()+"("+caloriasIngeridas + "frete a" + usuario2.getCaloriasIngeridas()+")");

        }
    }

    /**
     * metodo para mostrar por pantalla el alimento mas calorico por 100g consumido por el usuario 
     *
     */
    public void mayorescaloriascoonsumidas()
    {

        if (nombreMayorCaloria== null){
            System.out.println("No has consumido ningun alimento");
        }
        else{
            System.out.println("Alimento más calórico ingerido por este usuario hasta el momento:"+nombreMayorCaloria+"("+numeroDeCaloriasMasAlimento+" calorias por cada 100 gramos"+")" );
        }
    }

    /**
     * metodo que muestra los datos de un alimento segun la posicion de la lista en la que se encuentra
     */
    
    public void muestraDatosAlimentosConsumidosSegunPosicion(int numeroDeLaLista)
    {
        numeroDeLaLista = numeroDeLaLista -1;
        if(numeroDeLaLista >= 0 && numeroDeLaLista < alimentos.size()) {
            System.out.println("alimento consumido en posicion"+(numeroDeLaLista+1));
            Alimentos alimentoQueCome = alimentos.get(numeroDeLaLista);
            alimentoQueCome.muestraDatos();
        }
        else{
            System.out.println("El indice introducido no es correcto ");
        }
    }
}