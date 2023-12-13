package bosch;

public class Hexagono {
    double lado;

    Hexagono(double lado){
        this.lado = lado;
    }

    double calcularPerimetro(){
        return lado*6;
    }

    double calcularArea(){
        return (6*(Math.pow(lado, 2))*Math.sqrt(3))/4;
    }
}
