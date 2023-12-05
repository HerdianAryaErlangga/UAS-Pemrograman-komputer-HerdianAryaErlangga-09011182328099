import java.util.*;
public class soal1 {
    public static void main(String[]args){
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Masukkan harga barang: ");
                double hargaBarang = scanner.nextDouble();
        
                System.out.print("Masukkan jumlah pembelian: ");
                int jumlahPembelian = scanner.nextInt();
        
                double[] result = hitungTotalHargaDanDiskon(hargaBarang, jumlahPembelian);
        
                double totalHarga = result[0];
                double diskon = result[1];
                double persentaseDiskon = result[2];
        
                System.out.println("Total harga setelah diskon: " + totalHarga);
                System.out.println("Diskon yang diterima: " + diskon);
                System.out.println("Persentase diskon: " + persentaseDiskon + "%");
        
                scanner.close();
            }
        
            private static double[] hitungTotalHargaDanDiskon(double hargaBarang, int jumlahPembelian) {
                double totalHarga;
                double diskon = 0;
                double persentaseDiskon = 0;
        
                if (jumlahPembelian < 5) {
                    // Tidak ada diskon
                    totalHarga = hargaBarang * jumlahPembelian;
                } else if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
                    // Diskon 5%
                    persentaseDiskon = 5;
                    diskon = hargaBarang * jumlahPembelian * 0.05;
                    totalHarga = hargaBarang * jumlahPembelian * 0.95;
                } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
                    // Diskon 10%
                    persentaseDiskon = 10;
                    diskon = hargaBarang * jumlahPembelian * 0.1;
                    totalHarga = hargaBarang * jumlahPembelian * 0.9;
                } else {
                    // Diskon 20%
                    persentaseDiskon = 20;
                    diskon = hargaBarang * jumlahPembelian * 0.2;
                    totalHarga = hargaBarang * jumlahPembelian * 0.8;
                }
        
                return new double[]{totalHarga, diskon, persentaseDiskon};
            }
        }
        

