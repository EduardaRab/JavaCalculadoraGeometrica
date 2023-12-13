package bosch;

public class Circulo {
    double raio;

    Circulo(double raio){
        this.raio = raio; //para usar em todo o programa
    }

    double calcularArea(){
        return Math.PI*Math.pow(raio, 2);
    }

    double calcularPerimetro(){
        return 2*Math.PI*raio;
    }
}
