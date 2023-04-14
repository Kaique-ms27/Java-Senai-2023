 //Tipos de Variáveis em Java
 /*Nome do Aluno: Kaique Magalhães Santos
     * 
     * String -> Armazena Texto
     * char -> Armazena uma única letra
     * int -> Armazena número interios
     * float-> Armazena números racionais 
     * double-> Armazena números racionais extremamente grandes. Maior precisão
     * boolean-> Portas lógicas (0 e 1)
     */

     /* Regras para criar Variáveis:
      * Toda variável DEVE começar com letra minúscula;
      * Não pode haver espaço no nome da variável;
      * Não pode conter caracteres especiais;
      *Exemplos: nomeAluno, enderecoCliente, produtoAdquirido
      */
 
 public class Teste01 {
    public static void main(String[] args) {
        String nome = "Kaique Magalhães";
        int idade = 15;
        boolean chuva = true; //Em variavéis booleanas utilizar "true" ou "false".
        char letra = 'K'; //Para a variável char, utilizar aspás simples (''). Para a variável String, utilizar aspás duplas ("").
        double salario = 24370.99;
        float altura = (float) 1.80; //Converter double em float.

        System.out.println("Meu Nome: " +nome);
        System.out.println("Minha Idade: " +idade);
        System.out.println("Está Chovendo?: " + chuva);
        System.out.println("Inicial do meu nome: " +letra);
        System.out.println("Salário que eu gostaria de ganhar futuramente: " + salario);
        System.out.println("Eu tenho: " +altura + " metros");
    }     
    }