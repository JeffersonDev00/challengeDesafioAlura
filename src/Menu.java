import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public  void MenuSelecao(){
            System.out.println("""
            ***************************************************************************************************                
            Olá seja-bem vindos ao conversor de moedas!
            1-Dólar para real.
            2-Euro para real.
            3-Franco Suíço para real. 
            4-Iene Japonês para real.
            5-Dirham dos Emirados Árabes Unidos para real. 
            6-Afegane afegão para real.
            7-Dram armênio para real. 
            8-Kwanza angolano para real. 
            9-Sair.
            ****************************************************************************************************
            Digite uma das opcoes. """);
        }
        public void MenuValor(){
            System.out.println("Qual e o valor quer voce deseja converter?");
        }
    public void MenuMensagensEncerramento(){
        System.out.println("Esperamos que você tenha tido uma ótima experiência. Seu feedback é muito importante para nós e nos ajuda a melhorar continuamente." +
                " Caso tenha alguma sugestão, dúvida ou queira compartilhar sua experiência, por favor, entre em contato conosco." +
                "Até a próxima!");
    }
    public void MenuMensagensOpcaoInvalidar(){
        System.out.println(" Ops!! parece que você selecionou uma opção inválida." +
                " Por favor, verifique as opções disponíveis e tente novamente." +
                " Se precisar de ajuda, sinta-se à vontade para entrar em contato com nosso suporte.");
    }
    }
