import java.util.Scanner;

public class ArvoreDecisaoBar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntar ao usuário sobre o tipo de bebida (alcoólica ou não alcoólica)
        System.out.println("Escolha o tipo de bebida: ");
        System.out.println("0 - Alcoólica");
        System.out.println("1 - Não alcoólica");
        int tipoBebida = scanner.nextInt();

        // Nível 1: Bebida Alcoólica
        if (tipoBebida == 0) {
            // Perguntar sobre a preferência de sabor (amargo ou doce)
            System.out.println("Escolha sua preferência de sabor:");
            System.out.println("0 - Amargo");
            System.out.println("1 - Doce");
            int preferenciaSabor = scanner.nextInt();

            // Nível 2: Preferência por Sabor Amargo
            if (preferenciaSabor == 0) {
                System.out.println("Recomendação: Cerveja. Opte por estilos como IPA, Stout ou Porter para um sabor mais intenso.");
                return;
            } else if (preferenciaSabor == 1) {
                System.out.println("Recomendação: Licor. Opte por sabores como Campari, Fernet ou Jägermeister para um sabor digestivo.");
                return;
            }
        }

        // Nível 3: Bebida Não Alcoólica
        else if (tipoBebida == 1) {
            // Perguntar sobre a preferência de temperatura (fria ou quente)
            System.out.println("Escolha sua preferência de temperatura:");
            System.out.println("0 - Fria");
            System.out.println("1 - Quente");
            int preferenciaTemperatura = scanner.nextInt();

            // Nível 4: Preferência por Bebida Fria
            if (preferenciaTemperatura == 0) {
                System.out.println("Escolha sua bebida:");
                System.out.println("0 - Suco");
                System.out.println("1 - Refrigerante");
                int tipoBebidaFria = scanner.nextInt();

                if (tipoBebidaFria == 0) {
                    System.out.println("Recomendação: Suco de frutas. Escolha entre sabores como laranja, abacaxi, ou morango.");
                    return;
                } else if (tipoBebidaFria == 1) {
                    System.out.println("Recomendação: Refrigerante. Escolha entre sabores tradicionais como cola, guaraná ou laranja.");
                    return;
                }
            }
            // Nível 5: Preferência por Bebida Quente
            else if (preferenciaTemperatura == 1) {
                System.out.println("Escolha sua bebida:");
                System.out.println("0 - Café");
                System.out.println("1 - Chá");
                int tipoBebidaQuente = scanner.nextInt();

                if (tipoBebidaQuente == 0) {
                    System.out.println("Recomendação: Café. Opte por um espresso para um sabor intenso ou um cappuccino para uma bebida cremosa.");
                    return;
                } else if (tipoBebidaQuente == 1) {
                    System.out.println("Recomendação: Chá. Escolha entre sabores como verde, preto, camomila ou hortelã para um efeito relaxante.");
                    return;
                }
            }
        }
        scanner.close();
    }
}
