import java.util.Scanner;
public class Siakad09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        System.out.print("Masukkan nilai akhir: ");
        nilaiAkhir = sc.nextDouble();
       
        nilaiAkhir = (nilaiKuis / 100 * 20) + (nilaiTugas / 100 * 15) + (nilaiUTS / 100 * 30) + (nilaiUAS / 100 * 35);
       
        System.out.printf("Output:\nNAma\t: %s\nNIM\t: %s\nKelas\t: %s\nAbsen\t: %s\nNilai Akhir\t: %s", nama, nim, kelas, absen, nilaiAkhir);
    }
}