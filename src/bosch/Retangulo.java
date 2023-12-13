package bosch;

public class Retangulo {
    double comp, alt;

    Retangulo(double comp, double alt){
        this.comp = comp;
        this.alt = alt;
    }

    double calcularPerimetro(){
        return (comp*2)+(alt*2);
    }

    double calcularArea(){
        return comp*alt;
    }
}
