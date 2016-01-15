
/**
 * Write a description of class Alimentos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimentos
{
    // almacena los gramos de proteinas 
    private int gproteinas;
    // almacena los gramos de carbohidratos 
    private int gcarbohidratos;
    // almacena los gramos de grasas 
    private int ggrasas;
    //almacena calorias
    private float calorias;
    //nombre alimento
    private String nombre;
    
    

    /**
     * Constructor for objects of class Alimentos
     */
    public Alimentos(String nombre,int gproteinas,int gcarbohidratos,int ggrasas)
    {
        this.nombre=nombre;
        this.gproteinas=gproteinas;
        this.gcarbohidratos=gcarbohidratos;
        this.ggrasas= ggrasas;
        
        calorias=(gproteinas*4)+(gcarbohidratos*4)+(ggrasas*9);

    }

    /**
     *muestras todos los datos de ese alimento 
     * 
     */
    public void muestraDatos()
    {
        System.out.println("Nombre:"+nombre);
        System.out.println("Proteinas por cada 100 gramos:"+ gproteinas);
        System.out.println("Carbohidratos por cada 100 gramos:"+ gcarbohidratos);
        System.out.println("Grasas por cada 100 gramos:"+ ggrasas);
        System.out.println("Grasas por cada 100 gramos:"+ calorias);
        componentesMasaltos();
    }

    /**
     * calculo de cual tiene mayor cantidad en gramos
     */
    public void componentesMasaltos()
    {
        if (gproteinas <gcarbohidratos){
            if (gcarbohidratos < ggrasas){
                System.out.println("Componente/s mayoritario/s :Grasas");
            }
        }
        else if (gcarbohidratos < ggrasas){
            if (ggrasas < gproteinas){
                System.out.println("Componente/s mayoritario/s :Proteinas");
            }
        }
        else if (ggrasas < gproteinas){
            if (gproteinas < gcarbohidratos){
                System.out.println("Componente/s mayoritario/s :Carbohidratos");
            }
        }
        else if((gproteinas ==gcarbohidratos)&&(gproteinas == ggrasas))
        {
            System.out.println("Componente/s mayoritario/s :Carbohidratos, grasas y proteinas");
        }
        else if (gproteinas == gcarbohidratos){
            System.out.println("Componente/s mayoritario/s :Carbohidratos y proteinas");
        }
        else if (gproteinas == ggrasas){
            System.out.println("Componente/s mayoritario/s :Proteinas y grasas");
        }
        else {
            System.out.println("Componente/s mayoritario/s :Carbohidratos y grasas");
        }
    }

    /**   
     * devuelve los gramos de proteinas
     */

    public float getProteinas()
    {
        return gproteinas;
    }

    /**   
     * devuelve los gramos de hidratos
     */

    public float getCarbohidratos()
    {
        return gcarbohidratos;
    }

    /**   
     * devuelve los gramos de grasas
     */
    public float getGrasas()
    {
        return ggrasas;
    }
    
     /**
     * devuelve las calorias 
     */
    public float getCalorias() 
    {
        return calorias;
    }
    
    /**
     * devuelve nombre del alimento
     */
    public String getNombre()
    {
        return nombre;
    }
    
    


}
