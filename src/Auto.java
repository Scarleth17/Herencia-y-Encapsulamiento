
public class Auto extends VehiculoPasajeros {
    
    private String tipocombustible;
    private double costo=0;
    private  double costokm;
    private double kmrecorridos;
    
    
    
    //Constructor
    public Auto (String marca, String modelo , int año, int kilometraje, int numpasajeros, String tipocombustible){
        super (marca,modelo,año,kilometraje,numpasajeros);
        this.tipocombustible=tipocombustible;
        
    }
    //Getters and Setters
    public String gettipocombustible(){
        return tipocombustible;
    }
    public void settipocombustible(String tipocombustible){
        this.tipocombustible= tipocombustible;
    }
  
    //Sobreescribir 
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo combustible:  "+tipocombustible);
       

    
    }

    public double CostoMantenimiento (int costokm, int kmrecorridos){

        this.costokm=costokm;
        this.kmrecorridos=kmrecorridos;
        costo = costokm * kmrecorridos;
        return costo ;
       
 } 
     
      public double getCostokm(){
        return costokm;
     }
     public void setCostokm(double costokm){
        this.costokm=costokm;
     }
     public double getkmrecorridos(){
        return kmrecorridos;
     }
     public void setkmrecorridos(double kmrecorridos){
        this.kmrecorridos=kmrecorridos;
     }

      public void realizarManteniiento(){

        System.out.println("Realizando el costo total:");
        System.out.println("Costo por kilometros: " +costokm );
        System.out.println("Kilometros recorridos :" +kmrecorridos);
        System.out.println("Costo total: " +costo);
      }

    @Override
    public void Mantenimiento(){
        super.Mantenimiento();
        System.out.println("Cambiando frenos");
        
    }
     
 }
        


    



