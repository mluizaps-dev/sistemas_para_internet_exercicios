package aulas.string;

public class stringEstudo {
    public static void main(String[] args) {

        String nome = "Maria";
        String nome2 = "Maria";
        String nome3 = "   Maria   ";
        String frase = "Eu estou estudando Java";
        String resposta = "SIM";
        String arquivo = "foto.jpg";
        String frase2 = "Eu gosto de Java";
        int idade = 18;
        String nome4 = "banana";
        char[] letras = { 'a', 'b', 'c', 'd', 'e' };

        System.out.println(nome.length()); // Quantos caracteres existem nessa String?"

        System.out.println(nome.toUpperCase()); // Transforma tudo em maiúsculo.

        System.out.println(nome.toLowerCase()); // Transforma tudo em minúsculo.

        System.out.println(nome.substring(0, 3)); // Ela serve para pegar uma parte da String. 0 → M, 1 → a, 2 → r

        System.out.println(frase.contains("Java")); // Pergunta se uma String contém determinado texto.

        if (nome.equals(nome2)) { // Serve para comparar Strings.
            System.out.println("Os nomes são iguais!");
        }

        if (resposta.equalsIgnoreCase("sim")) { // É parecido com .equals(), mas ignora maiúsculas e minúsculas.
            System.out.println("Você respondeu sim!");
        }

        System.out.println(nome.startsWith("Mar")); // Verifica se a String começa com determinado texto.

        System.out.println(arquivo.endsWith(".jpg")); // Verifica se termina com determinado texto.

        System.out.println(nome.indexOf("r")); // Descobre em qual posição determinado caractere ou texto aparece.

        String novaFrase = frase2.replace("Java", "Programação"); // Troca uma coisa por outra, trocou Java por
                                                                  // Programação.
        System.out.println(novaFrase);

        System.out.println(nome3.trim()); // Remove espaços no começo e no final.

        String texto = String.valueOf(idade); // Converter outros tipos para String
        System.out.println(texto);

        int quantidade = 0;
        for (int i = 0; i < nome4.length(); i++) {
            if (nome4.charAt(i) == 'a') { // Com String texto.charAt(i)
                quantidade++;
                System.out.println("Achei a letra A na posição: " + i);
            }
        }
        System.out.println(quantidade);

        for (int i = 0; i < letras.length; i++) { // Você trabalha com o índice.
            System.out.print(i + " ");
            if (letras[i] == 'a') { // Com vetor de chat letras[i]
                System.out.println("Achei A na posição: " + i);
            }
        }
        for (char letra : letras) { // ; Você trabalha diretamente com o elemento.
            System.out.println(letra);
        }

        String expressao = ")(";

        int contador = 0;

        boolean erro = false;

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);
            if (caractere == '(') {
                contador++;
            } else if (caractere == ')') {
                contador--;
            }
            if (contador < 0) {
                System.out.println("ERRO");
                erro = true;
            }
        }
        if (contador == 0 && erro == false) {
            System.out.println("CORRETO");
            System.out.println(contador);
        } else {
            System.out.println("ERRO");
        }
    }

}
