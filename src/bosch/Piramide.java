package bosch;

public class Piramide {
    double ladoTriangulo, ladoQuadrado;

    Piramide(double ladoTriangulo, double ladoQuadrado){
        this.ladoTriangulo = ladoTriangulo;
        this.ladoQuadrado = ladoQuadrado;
    }

    double calcularArea(){
        return (4*((Math.pow(ladoTriangulo, 2) * Math.sqrt(3))/4)) + (Math.pow(ladoQuadrado, 2));
    }

    double calcularVolume(){
        return (1.0/3.0) * Math.pow(ladoQuadrado, 2.0) * ((ladoTriangulo * Math.sqrt(3))/2);
    }
}
