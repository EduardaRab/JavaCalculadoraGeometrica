package bosch;

public class Cubo {
    double lado;

    Cubo(double lado){
        this.lado = lado;
    }

    double calcularArea(){
        return (lado*2)*6;
    }

    double calcularVolume(){
        return Math.pow(lado, 3);
    }
}
