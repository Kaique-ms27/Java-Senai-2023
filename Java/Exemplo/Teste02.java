/*Constante -> Variável em Java em que não posso alteraro valor
* Usamos a palavra chace FINAL
 */

 public class Teste02 {
    public static final int TAXA = 10;
    public static final double PI = 3.14;
    //public -> Mantém a constante ou qualquer outra coisa pública, ou seja pode ser acessado em qualquer parte do código;
    // static -> Compartilha a constante ou qualquer outra coisa entre todas as classes do programa;
    // final -> Indica que o valor não pode ser alterado;

    public static void main(String[] args) {
        System.out.println("A taxa da loja é de: " +TAXA+"%");
        System.out.println("PI vale:" +PI);
    }
 }