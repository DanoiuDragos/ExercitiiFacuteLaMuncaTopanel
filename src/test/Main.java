package src.test;

public class Main {
    public static void main(String[] args) {

        //String Length ( Lungimea sirului)
        String lungimeText="ABJN";
        System.out.println("Lungimea textului este: " +lungimeText.length());

        //Mai multe metode cu șiruri
        String metodeString="Danoiu Dragos";
        System.out.println("Litere mari: "+metodeString.toUpperCase());
        System.out.println("Litere mici: "+metodeString.toLowerCase());

        //Găsirea unui caracter într-un șir
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("e", 5));
    }
}
