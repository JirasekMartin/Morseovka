import java.util.Scanner;
public class Morseovka {
    public static void main(String[] args) {
        // Řetězec, který chceme dekódovat
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Zadejte zprávu k zakódování: ");
        String puvodniZprava = scanner.nextLine().toLowerCase();
        String zasifrovanaZprava = "";
        // vzorová pole
        String abeceda = "abcdefghijklmnopqrstuvwxyz";
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        // Přeložení jednotlivých znaků
        for (int i = 0; i < puvodniZprava.length(); i++) {
            int pozice = abeceda.indexOf(puvodniZprava.charAt(i));
            if (pozice >= 0) {
                zasifrovanaZprava += morseovyZnaky[pozice] + " ";
            }
        }
        // Výpis
        System.out.println("Zakódovaná zpráva: " + zasifrovanaZprava);
    }
}
