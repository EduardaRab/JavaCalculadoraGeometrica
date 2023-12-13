package bosch;

public class Cone {
    double raio, altura;

    Cone (double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    double calcularArea(){
        return Math.PI * raio * (raio + (Math.sqrt((Math.pow(raio, 2.0)) + (Math.pow(altura, 2.0)))));
    }

    double calcularVolume(){
        return (Math.PI * Math.pow(raio, 2.0) * altura)/3.0;
    }
}
