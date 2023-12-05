import java.util.*;
public class soal2 {
    private static String usernameValid = "HerdianA17";
    private static String passwordValid = "A17";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        if (autentikasi(usernameInput, passwordInput)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        scanner.close();
    }

    private static boolean autentikasi(String usernameInput, String passwordInput) {
        return usernameInput.equals(usernameValid) && passwordInput.equals(passwordValid);
    }
}
