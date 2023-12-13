package bosch;

public class Triangulo {
    double lado;

    Triangulo(double lado){
        this.lado = lado;
    }

    double calcularPerimetro(){
        return lado*3;
    }

    double calcularArea(){
        return (Math.pow(lado, 2) * Math.sqrt(3))/4;
    }
}
