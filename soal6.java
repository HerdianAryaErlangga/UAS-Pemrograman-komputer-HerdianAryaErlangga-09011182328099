import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrom(input)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Bukan Palindrom");
        }

        scanner.close();
    }

    private static boolean isPalindrom(String input) {
        // Menghapus spasi dan mengubah ke huruf kecil
        String cleanInput = input.replaceAll("\\s", "").toLowerCase();

        int length = cleanInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

