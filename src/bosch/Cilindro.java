package bosch;

public class Cilindro {
    double raio, alt;

    Cilindro(double raio, double alt){
        this.raio = raio;
        this.alt = alt;
    }

    double calcularArea(){
        return 2 * Math.PI * raio * (raio + alt);
    }

    double calcularVolume(){
        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(alt, 2));
        return Math.PI * Math.pow(raio, 2) * alt;
    }
}
