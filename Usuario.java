
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
}

