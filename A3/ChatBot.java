package com.mycompany.chatbot;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // fORMATA PARA O HORÁRIO BRASILEIRO //
        DateTimeFormatter Data = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 

        // MENSAGENS DE APRESENTAÇÃO E DESPEDIDA //
        String BemVindo = "\u001B[36m" +
                "╭──────────────────────────────────────────────────╮\n" +
                "│                                                  │\n" +
                "│            Bem-Vindo ao ChatBot Vader            │\n" +
                "│              Seu assistente Virtual              │\n" +
                "│                                                  │\n" +
                "╰──────────────────────────────────────────────────╯\u001B[0m";
            
        String AteMais ="\u001B[36m" +
                "╭──────────────────────────────────────────────────╮\n" +
                "│                                                  │\n" +
                "│             Obrigado por utilizar o              │\n" +
                "│                  ChatBot Vader                   │\n" +
                "│                                                  │\n" +
                "╰──────────────────────────────────────────────────╯\u001B[0m";
                
        String Perguntas = "\u001B[36m" +
                "╭────────────────────────────────────────────────────────────────────────────────────────╮\n" +
                "│                                Perguntas Frequentes                                    │\n" +
                "│                                                                                        |\n" +
                "│  Tempo                                 |  Quem escreveu dom quixote                    │\n" +
                "│  Quem eh voce                          |  Oceano mais profundo                         │\n" +
                "│  Capital do brasil                     |  Teoria da relatividade                       │\n" +
                "│  Maior planeta do sistema solar        |  O pais mais populoso do mundo                │\n" +
                "│  Quantos anos tem o universo           |  Membros                                      │\n" +
                "│  Animal mais veloz do mundo            |  Data                                         │\n" +
                "│  Lingua mais falada no mundo           |  Oi                                           │\n" +
                "│  Somar                                 |  Subtrair                                     │\n" +
                "│  Multiplicar                           |  Dividir                                      │\n" +
                "│  Potencia                              |  Qual o maior animal terrestre do mundo       │\n" +
                "│                                                                                        │\n" +
                "│                                    ChatBot Vader                                       │\n" +
                "│                                                                                        │\n" +
                "╰────────────────────────────────────────────────────────────────────────────────────────╯\u001B[0m";

        System.out.println(BemVindo);
        System.out.println();


        // '\u001B[35m' Este código de escape ANSI é uma maneira de controlar as cores do texto e outras formatações em terminais //
        // Neste caso o texto está em rosa. Para mudar a cor é só mudar o número ( [35 ) para o da cor correspõndente //
        // 30: Preto, 31: Vermelho, 32: Verde, 33: Amarelo, 34: Azul, 35: Magenta (Rosa), 36: Ciano, 37: Branco //

        System.out.print("\u001B[35mQual é o seu nome? \u001B[0m");
        String nome = sc.nextLine().trim();

        System.out.println("\u001B[35mÉ um prazer te conhecer, \u001B[36m" + nome + "\u001B[35m" +"! Como posso te ajudar hoje?\u001B[0m\n" + Perguntas);
        System.out.println("\u001B[35mDigite \u001B[31m'sair'\u001B[35m para encerrar a conversa.\u001B[0m");

        // Cria um HashMap chamado 'respostas' que mapeia perguntas para respostas //
        // O tipo 'String, String' especifica que tanto as chaves quanto os valores no HashMap são do tipo String //
        // 'respostas' é o nome da variável que você pode usar para se referir a esse mapa posteriormente //
        // 'new HashMap<>()' cria um objeto de HashMap e inicializa o mapa como vazio //
        // O método 'put' é usado para adicionar um novo par chave-valor ao HashMap //
        Map<String, String> respostas = new HashMap<>();

        // Respostas pré-definidas para perguntas comuns
        respostas.put("oi", "Olá, \u001B[36m" + nome + "\u001B[32m! Como posso te ajudar?");
        respostas.put("muito obrigado", "Eu que agradeço, \u001B[36m" + nome + "\u001B[0m!");
        respostas.put("tempo", "Em São Paulo, a temperatura é 25°C e a umidade é 69%");
        respostas.put("sair", "Poxa vida, nossa conversa estava tão boa. Até mais, \u001B[36m" + nome + "!\u001B[0m");
        respostas.put("quem eh voce", "Eu sou Vader, seu assistente virtual.");
        respostas.put("capital do brasil", "A capital do Brasil é Brasília.");
        respostas.put("maior planeta do sistema solar", "O maior planeta do sistema solar é Júpiter.");
        respostas.put("quantos anos tem o universo", "O universo tem cerca de 13,8 bilhões de anos.");
        respostas.put("quem pintou a mona lisa", "A Mona Lisa foi pintada por Leonardo da Vinci.");
        respostas.put("animal mais veloz do mundo", "O animal mais rápido do mundo é o falcão-peregrino.");
        respostas.put("lingua mais falada no mundo", "A língua mais falada no mundo é o mandarim.");
        respostas.put("quem escreveu dom quixote", "Dom Quixote foi escrito por Miguel de Cervantes.");
        respostas.put("oceano mais profundo", "O oceano mais profundo é o Oceano Pacífico.");
        respostas.put("teoria da relatividade", "A teoria da relatividade foi desenvolvida por Albert Einstein e explica a relação entre espaço e tempo.");
        respostas.put("o pais mais populoso do mundo", "O país mais populoso do mundo é a China.");
        respostas.put("qual o maior animal terrestre do mundo", "O maior animal terrestre do mundo é o elefante africano.");
        respostas.put("membros", "Os membros do grupo são: \u001B[36m Guilherme.O.Santos, Nathalia Novais, Kaiky Henrique, Emelly Siqueira e Matheus Mendes\u001B[0m");

        // Respostas para perguntas sobre data e operações matemáticas
        respostas.put("data", "Hoje é: \u001B[36m" + LocalDateTime.now().format(Data) + "\u001B[0m");
        respostas.put("somar", "Digite dois números separados por espaço para somar");
        respostas.put("subtrair", "Digite dois números separados por espaço para subtrair");
        respostas.put("multiplicar", "Digite dois números separados por espaço para multiplicar");
        respostas.put("dividir", "Digite dois números separados por espaço para dividir");
        respostas.put("potencia", "Digite a base e o expoente separados por espaço para calcular a potência");


        // LOOPING DA CONVERSA //
        while (true) {
            System.out.print("\u001B[33m" + nome + ": \u001B[0m");

            // .toLowerCase(): converte todos os caracteres da string para minúsculas. //
            // .trim(): Este método remove todos os espaços em branco no início e no final da string. //
            // UserInput é a entrada do usuário //
            String UserInput = sc.nextLine().trim().toLowerCase();

            if (UserInput.equals("sair")) {

                // 'respostas.get(UserInput)' recupera a resposta correspondente à pergunta digitada pelo usuário //
                System.out.println("\u001B[32m" + respostas.get(UserInput) + "\u001B[0m");
                break;
            }


            // 'respostas.containsKey(UserInput)' Verifica se a pergunta digitada pelo usuário (armazenado em UserInput) está armazenada em 'respostas'//
            if (respostas.containsKey(UserInput)) {
                System.out.println("\u001B[32m" + respostas.get(UserInput) + "\u001B[0m");

                if (UserInput.equals("somar") || UserInput.equals("subtrair") || UserInput.equals("multiplicar") || UserInput.equals("dividir") || UserInput.equals("potencia")) {
                    System.out.print("\u001B[33m" + nome + ": \u001B[0m");
                    String[] numeros = sc.nextLine().split(" ");
                //.SPLIT(" ") Este método divide a linha de entrada em substrings com base em um delimitador, neste caso, um espaço em branco //

                    // "numeros.length == 2" Verifica se a array 'numeros' tenha exatamente dois números //
                    // "isNumeric" Verifica se os elementos da array 'numeros' são numéricos //
                    if (numeros.length == 2 && isNumeric(numeros[0]) && isNumeric(numeros[1])) {

                        // CONVERTE OS NÚMEROS DE STRING PARA DOUBLE //
                        double numero1 = Double.parseDouble(numeros[0]);
                        double numero2 = Double.parseDouble(numeros[1]);
                        double resultado = 0;

                        switch (UserInput) {
                            case "somar":
                                resultado = numero1 + numero2;
                                break;
                            case "subtrair":
                                resultado = numero1 - numero2;
                                break;
                            case "multiplicar":
                                resultado = numero1 * numero2;
                                break;
                            case "dividir":
                                resultado = numero1 / numero2;
                                break;
                            case "potencia":
                                resultado = Math.pow(numero1, numero2);
                                break;
                        }
                        System.out.println("\u001B[32mO resultado é: " + resultado + "\u001B[0m");
                    } else {
                        System.out.println("\u001B[31mEntrada inválida. Por favor, insira dois números separados por espaço.\u001B[0m");
                    }
                }
            } else {
                System.out.println("\u001B[31mDesculpe, não entendi. Por favor, repita ou pergunte de outra forma.\u001B[0m \n" + Perguntas);
                System.out.println("\u001B[35mDigite \u001B[31m'sair'\u001B[35m para encerrar a conversa.\u001B[0m");
            }
        }

        System.out.println(AteMais);
        System.out.println("\u001B[36mVersão beta 106.1, feito por grupo\u001B[0m");
        sc.close();
    }


// private static boolean: Este método é privado e estático (pertence à classe, não a um objeto específica da classe). Ele retorna um valor booleano indicando se a string é numérica ou não.
// isNumeric: Este é o nome do método.
// (String str): Este método recebe uma string como argumento, que é o valor que queremos verificar se é numérico.
private static boolean isNumeric(String str) {
    try {
        // try { ... } catch (NumberFormatException e) { ... }: Este bloco try-catch tenta converter a string para um valor numérico. Se a conversão for bem-sucedida, nenhum erro será lançado e o método retornará true, indicando que a string é numérica. Se ocorrer uma exceção do tipo NumberFormatException, isso significa que a string não pode ser convertida em um número, então o bloco catch será executado, e o método retornará false, indicando que a string não é numérica.
        Double.parseDouble(str);
        // Double.parseDouble(str): Este trecho tenta converter a string para um valor numérico do tipo double. Se a conversão for bem-sucedida, o método parseDouble() não lança exceção e o método isNumeric() retorna true.
        return true;
    } catch (NumberFormatException e) {
        // return true;: Se a conversão for bem-sucedida, retornamos true.
        // return false;: Se ocorrer uma exceção NumberFormatException, retornamos false, indicando que a string não é numérica.
        return false;
    }
}

}