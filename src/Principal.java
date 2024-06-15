import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import static java.util.Scanner.*;
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException{
        String moeda;
        double valor = 0;
        int opcao=0;

        Scanner dados = new Scanner(System.in);
        Menu menu = new Menu();
        ConsultaDeMoeda consulta = new ConsultaDeMoeda();

        Map<Integer, String[]>moedas = new  HashMap<>();
        moedas.put(1, new String[]{"USD","Dólar"});
        moedas.put(2,new String[]{"EUR","Euro"});
        moedas.put(3,new String[]{"CHF","Franco Suíço"});
        moedas.put(4,new String[]{"JPY","Iene Japonês"});
        moedas.put(5,new String[]{"AED","Dirham dos Emirados Árabes Unidos"});
        moedas.put(6,new String[]{"AFN","Afegane afegão"});
        moedas.put(7,new String[]{"AMD","Dram armênio"});
        moedas.put(8,new String[]{"ANG","Florim das Antilhas Holandesas"});

        while (opcao!=9) {
            menu.MenuSelecao();
            try {
                opcao = dados.nextInt();
                if (moedas.containsKey(opcao)){
                    menu.MenuValor();
                    valor = dados.nextDouble();
                    String[]moedasInfo = moedas.get(opcao);
                    moeda=moedasInfo[0];
                    String descricao = moedasInfo[1];
                    double taxaDeConvesao = consulta.buscaTaxaDeConversao(moeda);
                    System.out.println("Taxa de conversão  " +moeda+ " para Reais(Brasil): " + taxaDeConvesao);
                    System.out.println("R$ " + taxaDeConvesao * valor);
                } else if (opcao == 9) {
                    menu.MenuMensagensEncerramento();

                } else {
                    menu.MenuMensagensOpcaoInvalidar();
                } }catch(InputMismatchException e){
                System.out.println("Opção inválida. Por favor, verifique se todos os caracteres inseridos estão corretos e tente novamente.");
                dados.nextLine();
            }
        }dados.close();
    }
}

