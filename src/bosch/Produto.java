package bosch;

public class Produto {

    int somar(int par1, int par2){
        return par1+par2; //o tipo da função é o único tipo que você consegue retornar
    }

    void printarHelloNaTela(){ //funções void não tem retorno, são usadas só para fazer alguma coisa
        System.out.println("Hello");
    }

    int somar(int par1, int par2, int par3){ //só se a quantidade ou tipo de parâmetros forem os mesmos, com o mesmo nome
        return par1+par2+par3;
    }

    double somar(double par1, double par2, double par3){ //só se a quantidade ou tipo de parâmetros forem os mesmos, com o mesmo nome
        return par1+par2+par3;
    }

    int somar(double par1, double par2){
        return (int) (par1+par2); //fazendo uma conversão explicita, para retornar um inteiro
    }
}
