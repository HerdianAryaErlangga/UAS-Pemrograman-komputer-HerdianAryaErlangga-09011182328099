import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        if (bilangan <= 0) {
            System.out.println("Masukkan bilangan bulat positif yang valid.");
        } else {
            faktorisasiDanTampilkan(bilangan);
        }

        scanner.close();
    }

    private static void faktorisasiDanTampilkan(int bilangan) {
        System.out.print("Faktorisasi " + bilangan + ": ");

        for (int faktor = 2; faktor <= bilangan; faktor++) {
            while (bilangan % faktor == 0) {
                System.out.print(faktor);
                bilangan /= faktor;

                if (bilangan > 1) {
                    System.out.print(" * ");
                }
            }
        }

        System.out.println();
    }
}

