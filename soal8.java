import java.util.*;
class AkunPengguna {
    private String username;
    private String password;
    private boolean isAktif;

    public AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.isAktif = true;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAktif() {
        return isAktif;
    }

    public void aktifkanAkun() {
        if (!isAktif) {
            isAktif = true;
            System.out.println("Akun " + username + " berhasil diaktifkan.");
        } else {
            System.out.println("Akun " + username + " sudah aktif.");
        }
    }

    public void nonaktifkanAkun() {
        if (isAktif) {
            isAktif = false;
            System.out.println("Akun " + username + " berhasil dinonaktifkan.");
        } else {
            System.out.println("Akun " + username + " sudah nonaktif.");
        }
    }
}

public class soal8 {
    public static void main(String[] args) {
        AkunPengguna akun1 = new AkunPengguna("user1", "password1");
        AkunPengguna akun2 = new AkunPengguna("user2", "password2");

        System.out.println("Status akun user1: " + (akun1.isAktif() ? "Aktif" : "Nonaktif"));
        System.out.println("Status akun user2: " + (akun2.isAktif() ? "Aktif" : "Nonaktif"));
Scanner keyboard = new Scanner(System.in);
        System.out.println("1.mengaktifkan akun");
        System.out.println("2.menonaktifkan akun");
        System.out.println("pilih berdasarkan angka : ");
        int pilihan=keyboard.nextInt();
        
        switch (pilihan) {
            case 1:
        System.out.println("\nMengaktifkan akun:");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username akun yang ingin diaktifkan: ");
        String usernameAkun = input.nextLine();

        if (usernameAkun.equalsIgnoreCase(akun1.getUsername())) {
            akun1.aktifkanAkun();
        } else if (usernameAkun.equalsIgnoreCase(akun2.getUsername())) {
            akun2.aktifkanAkun();
        } else {
            System.out.println("Akun " + usernameAkun + " tidak ditemukan.");
        }
        break;

        case 2:
        System.out.println("\nMenonaktifkan akun:");
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukkan username akun yang ingin dinonaktifkan: ");
        String usernameAkun2 = input2.nextLine();

        if (usernameAkun2.equalsIgnoreCase(akun1.getUsername())) {
            akun1.nonaktifkanAkun();
        } else if (usernameAkun2.equalsIgnoreCase(akun2.getUsername())) {
            akun2.nonaktifkanAkun();
        } else {
            System.out.println("Akun " + usernameAkun2 + " tidak ditemukan.");
        }
        break;
            default:
                break;
        }
       
        System.out.println("\nStatus akun setelah dinonaktifkan:");
        System.out.println("Status akun user1: " + (akun1.isAktif() ? "Aktif" : "Nonaktif"));
        System.out.println("Status akun user2: " + (akun2.isAktif() ? "Aktif" : "Nonaktif"));
    }
}
