package bosch;

public class Quadrado {
    double lado;

    Quadrado(double lado){
        this.lado = lado;
    }

    double calcularPerimetro(){
        return lado*4;
    }

    double calcularArea(){
        return Math.pow(lado, 2);
    }
}
