package bosch;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar = "sim";

        while (continuar.equals("sim")){ //While para colocar o menu em loop
            while (true){  //while caso a pessoa digite uma opção no menu que não existe
                System.out.println("\nMenu: \n" +
                        "[1] Calcular informações de figuras planas\n" +
                        "[2] Calcular informações de figuras espaciais\n" +
                        "Digite o número da opção que deseja executar:");
                int resp = entrada.nextInt();

                if (resp == 1){
                    System.out.println("\nFiguras planas:\n" +
                            "[1] Quadrado\n" +
                            "[2] Círculo\n" +
                            "[3] Triângulo equilátero\n" +
                            "[4] Retângulo\n" +
                            "[5] Hexágono regular\n" +
                            "Digite o número da figura que deseja calcular o perímetro e área:");
                    int opcaoPlana = entrada.nextInt();

                    switch (opcaoPlana) {
                        case (1) -> { //quadrado
                            System.out.println("Digite a medida do lado do quadrado:");
                            double lado = entrada.nextDouble();
                            Quadrado quadrado = new Quadrado(lado);
                            System.out.printf("O perímetro do quadrado é: %.2f\n", quadrado.calcularPerimetro());
                            System.out.printf("A área do quadrado é: %.2f\n", quadrado.calcularArea());
                        }
                        case (2) -> { //circulo
                            System.out.println("Digite a medida do raio do círculo:");
                            double raio = entrada.nextDouble();
                            Circulo circulo = new Circulo(raio);
                            System.out.printf("O perímetro do círculo é: %.2f\n", circulo.calcularPerimetro());
                            System.out.printf("A área do círculo é: %.2f\n", circulo.calcularArea());
                        }
                        case (3) -> { //triangulo
                            System.out.println("Digite o lado do triângulo equilátero:");
                            double aresta = entrada.nextDouble();
                            Triangulo triangulo = new Triangulo(aresta);
                            System.out.printf("O perímetro do triângulo equilátero é: %.2f\n", triangulo.calcularPerimetro());
                            System.out.printf("A área do triângulo equilátero é: %.2f\n", triangulo.calcularArea());
                        }
                        case (4) -> { //retangulo
                            System.out.println("Digite a medida do comprimento do retângulo:");
                            double comprimento = entrada.nextDouble();
                            System.out.println("Digite a medida da altura do retângulo:");
                            double altura = entrada.nextDouble();
                            Retangulo retangulo = new Retangulo(comprimento, altura);
                            System.out.printf("O perímetro do retângulo é: %.2f\n", retangulo.calcularPerimetro());
                            System.out.printf("A área do retângulo é: %.2f\n", retangulo.calcularArea());
                        }
                        case (5) -> { //hexagono regular
                            System.out.println("Digite a medida do lado do hexágono regular:");
                            double ladoHexa = entrada.nextDouble();
                            Hexagono hexagono = new Hexagono(ladoHexa);
                            System.out.printf("O perímetro do hexágono regular é: %.2f", hexagono.calcularPerimetro());
                            System.out.printf("A área do hexágono regular é: %.2f", hexagono.calcularArea());
                        }
                    }

                    break; //quebra depois que a ação foi realizada
                }
                else if (resp == 2){
                    System.out.println("\nFiguras espaciais:\n" +
                            "[1] Cubo\n" +
                            "[2] Paralelepipedo\n" +
                            "[3] Pirâmide de base quadrada\n" +
                            "[4] Esfera\n" +
                            "[5] Cilindro\n" +
                            "[6] Cone\n" +
                            "Digite o número da figura que deseja calcular o perímetro e área:");
                    int opcaoEspacial = entrada.nextInt();
                    switch (opcaoEspacial) {
                        case 1 -> { //cubo
                            System.out.println("Digite a medida da aresta do cubo:");
                            double aresta = entrada.nextDouble();
                            Cubo cubo = new Cubo(aresta);
                            System.out.printf("A área do cubo é: %.2f\n", cubo.calcularArea());
                            System.out.printf("O volume do cubo é: %.2f\n", cubo.calcularVolume());
                        }
                        case 2 -> { //paralelepipedo
                            System.out.println("Digite a medida do comprimento do paralelepipedo:");
                            double comprimento = entrada.nextDouble();
                            System.out.println("Digite a medida da altura do paralelepipedo:");
                            double altura = entrada.nextDouble();
                            System.out.println("Digite a medida da largura do paralelepipedo:");
                            double largura = entrada.nextDouble();
                            Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento, altura, largura);
                            System.out.printf("A área do paralelepipedo é: %.2f\n", paralelepipedo.calcularArea());
                            System.out.printf("O volume do paralelepipedo é: %.2f\n", paralelepipedo.calcularVolume());
                        }
                        case 3 -> { //piramide
                            System.out.println("Digite a medida do lado do triângulo da pirâmide de base quadrada:");
                            double ladoTriangulo = entrada.nextDouble();
                            System.out.println("Digite a medida do lado do quadrado da pirâmide de base quadrada:");
                            double ladoQuadrado = entrada.nextDouble();
                            Piramide piramide = new Piramide(ladoTriangulo, ladoQuadrado);
                            System.out.printf("A área da pirâmide de base quadrada é: %.2f\n", piramide.calcularArea());
                            System.out.printf("O volume da pirâmide de base quadrada é: %.2f\n", piramide.calcularVolume());
                        }
                        case 4 -> { //esfera
                            System.out.println("Digite medida do raio da esfera:");
                            double raioEsfera = entrada.nextDouble();
                            Esfera esfera = new Esfera(raioEsfera);
                            System.out.printf("A área da esfera é: %.2f\n", esfera.calcularArea());
                            System.out.printf("O volume da esfera é: %.2f\n", esfera.calcularVolume());
                        }
                        case 5 -> { //cilindro
                            System.out.println("Digite a medida do raio da base do cilindro:");
                            double raioCilindro = entrada.nextDouble();
                            System.out.println("Digite a medida da altura do cilindro:");
                            double altCilindro = entrada.nextDouble();
                            Cilindro cilindro = new Cilindro(raioCilindro, altCilindro);
                            System.out.printf("A área do cilindro é: %.2f\n", cilindro.calcularArea());
                            System.out.printf("O volume do cilindro é: %.2f\n", cilindro.calcularVolume());
                        }
                        case 6 -> { //cone
                            System.out.println("Digite a medida do raio da base do cone:");
                            double raioCone = entrada.nextDouble();
                            System.out.println("Digite a medida da altura do cone:");
                            double altCone = entrada.nextDouble();
                            Cone cone = new Cone(raioCone, altCone);
                            System.out.printf("A área do cone é: %.2f\n", cone.calcularArea());
                            System.out.printf("O volume do cone é: %.2f\n", cone.calcularVolume());
                        }
                    }

                    break; //quebra depois que a ação foi realizada
                }
                else {
                    System.out.println("Opção inválida, tente novamente...");
                }
            }
            System.out.println("\nDigite 'sim' para continuar exucutando ou 'não' para encerrar:");
            continuar = entrada.next();
        }
    }
}
