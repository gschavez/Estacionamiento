import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Vehiculo {

    int max = 30;
    int min = 1;
    protected String tipo;


    protected int idVehi ;
    protected int Tiempo;
    protected boolean uso;

    Scanner scanner = new Scanner(System.in);
    List<Vehiculo> lsVehiculos = new ArrayList<>();
    Random random = new Random();

    public Vehiculo() {
    }

    public Vehiculo(int idVehi, int tiempo, boolean uso, String tipo) {
        this.idVehi = idVehi;
        Tiempo = tiempo;
        this.uso = uso;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int idVehi() {
        return idVehi;
    }

    public void setIdVehi(int idVehi) {
        this.idVehi = idVehi;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int tiempo) {
        Tiempo = tiempo;
    }

    public boolean isUso() {
        return uso;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + idVehi +
                ", Tiempo=" + Tiempo +
                ", uso=" + uso +
                '}';
    }
    /*CalcularTarifa(){
    }*/
    public void RegistrarVehiculos(){
        System.out.println("""
                Espesifique el tipo de vehiculo que desea ingresar...
                
                1) Automovil. 
                2) Motocicleta.  
                3) Camion.
                
                ...
                """);
        int pregunta= scanner.nextInt();
        boolean ok = true ;

        switch (pregunta){
case (1) -> {

    Automovil automovil= new Automovil();
    System.out.println("Ingrese el tiempo (horas) que va a tener su vehiculo en el estacionamiento");
    automovil.setTiempo(scanner.nextInt());
    idVehi = random.nextInt(max - min +1)+min;
    System.out.println("Se registro su entrada con el siguiente id... " + idVehi);
    automovil.setIdVehi(idVehi);
    automovil.setTipo("Automovil");
    setUso(true);
    lsVehiculos.add(automovil);
    System.out.println("Se registro con exito su vehiculo de tipo " + tipo + " con el numero de id " + idVehi);

}
case (2) ->{
    Motocicleta motocicleta = new Motocicleta();

    System.out.println("Ingrese el tiempo (horas) que va a tener su vehiculo en el estacionamiento");
    motocicleta.setTiempo(scanner.nextInt());
    idVehi = random.nextInt(max - min +1)+min;
    System.out.println("Se registro su entrada con el siguiente id... " + idVehi);
    motocicleta.setIdVehi(idVehi);
    motocicleta.setTipo("Motocicleta");
    setUso(true);
    lsVehiculos.add(motocicleta);
    System.out.println("Se registro con exito su vehiculo de tipo " + tipo + " con el numero de id " + idVehi);


}
case 3->{
    Camion camion = new Camion();

    System.out.println("Ingrese el tiempo (horas) que va a tener su vehiculo en el estacionamiento");
    camion.setTiempo(scanner.nextInt());
    idVehi = random.nextInt(max - min +1)+min;
    System.out.println("Se le genero el siguiente id... " + idVehi);
    camion.setIdVehi(idVehi);
    camion.setTipo("Camion");
    setUso(true);
    lsVehiculos.add(camion);
    System.out.println("Se registro con exito su vehiculo de tipo " + camion.getTipo() + " con el numero de id " + idVehi);


}
        }

    }
}
