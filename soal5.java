import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Masukkan angka pertama:");
        int angka1 = keyboard.nextInt();
        System.out.println("Masukkan operasi (+, -, *, /):");
        char operator = keyboard.next().charAt(0);
        System.out.println("Masukkan angka kedua:");
        int angka2 = keyboard.nextInt();

        double hasil = hitung(angka1, angka2, operator);

        System.out.println("Hasil: " + hasil);
    }

    private static double hitung(int angka1, int angka2, char operator) {
        double hasil = 0.0;
        switch (operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                break;
            default:
                break;
        }
        return hasil;
    }

    private static double tambah(int angka1, int angka2) {
        return angka1 + angka2;
    }

    private static double kurang(int angka1, int angka2) {
        return angka1 - angka2;
    }

    private static double kali(int angka1, int angka2) {
        return angka1 * angka2;
    }

    private static double bagi(int angka1, int angka2) {
        if (angka2 != 0) {
            return (double) angka1 / angka2;
        } else {
            System.out.println("Angka tidak dapat dibagi dengan 0");
            return 0;
        }
    }

    
    }

