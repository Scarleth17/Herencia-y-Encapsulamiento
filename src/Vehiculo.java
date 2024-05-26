
public class Vehiculo {
  
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    
    //Constructor
    public Vehiculo (String marca, String modelo , int año, int kilometraje){

        this.marca = marca;
        this.modelo = modelo ;
        this.año = año;
        this.kilometraje =kilometraje;
    }
    //getters y Setters

 public String getMarca(){
    return marca;

 }
   public void setMarca (String marca){
     this.marca= marca;
 
   }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;

    }
    public int getAño(){
       return año;
    }
    public void setAño(int año){
        this.año=año;
    } 
    public int getKilometraje(){
        return kilometraje;
     }
     public void setKilometraje(int kilometraje){
         this.kilometraje = kilometraje;
     } 
     
  public void mostrarInfo(){
   
    System.out.println("Marca: "+marca);
    System.out.println("Modelo:  "+modelo);
    System.out.println("Año: " +año);
    System.out.println("Kilometraje:  "+kilometraje);

  }
  private String Mantenimiento;
  private String Auto;
  private String Camion;
   
  public String getMantenimiento(){
    return Mantenimiento;
  }
  public void setMantenimiento(String Mantenimiento){
    this.Mantenimiento = Mantenimiento;
  }
 
  
  public void Mantenimiento (){
    System.out.println("El vehiculo necesita un manteniento: ");
    if (Mantenimiento == Auto && Mantenimiento == Camion){
      System.out.println("El vehiculo necesita un cambio de aceite....." ); 
} 
  }
  }




  




