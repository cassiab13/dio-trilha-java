public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = (1+1+1)+"1";
        System.out.println(concatenacao);

        String nomeUm = "NOME1";
        String nomeDois = new String("NOME1");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
    }
}
