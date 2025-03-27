import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Estacionamiento{
    int max = 30;
    int min = 1;
    int idEsta = 0;

   Random random = new Random();
   List<Estacionamiento> lsEstacionamiento = new ArrayList<>();

    public Estacionamiento() {
    }

    public Estacionamiento(int idEsta, int max, int min, Random random) {
        this.idEsta = idEsta;
        this.max = max;
        this.min = min;
        this.random = random;

    }

    public int getIdEsta() {
        return idEsta;
    }

    public void setIdEsta(int idEsta) {
        this.idEsta = idEsta;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }



    public  void RegistrarEstacionamiento(){

        Estacionamiento espacio = new Estacionamiento();

        idEsta = random.nextInt(max - min +1)+min;

        System.out.println("Estacionamiento Registrado el id es " + idEsta);
        lsEstacionamiento.add(espacio);



    }
}
