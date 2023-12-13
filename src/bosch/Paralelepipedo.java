package bosch;

public class Paralelepipedo {
    double alt, larg, comp;

    Paralelepipedo(double alt, double larg, double comp){
        this.comp = comp;
        this.alt = alt;
        this.larg = larg;
    }

    double calcularArea(){
        return (2*(alt*larg))+ (2*(alt*comp)) + (2*(larg*comp));
    }

    double calcularVolume(){
        return alt*larg*comp;
    }
}
