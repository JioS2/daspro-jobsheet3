import java.util.Scanner;
public class Siakad09 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.print("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan Kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan Nomor Absen: ");
        absen = sc.nextByte();

        System.out.print("Masukan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
