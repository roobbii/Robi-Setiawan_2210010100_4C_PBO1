
package uas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input data karyawan
        try (Scanner scanner = new Scanner(System.in)) {
            // Input data karyawan
            System.out.print("Masukkan jumlah karyawan: ");
            int jumlahKaryawan = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            Karyawan[] karyawans = new Karyawan[jumlahKaryawan];
            
            for (int i = 0; i < jumlahKaryawan; i++) {
                try {
                    System.out.print("Masukkan nama karyawan: ");
                    String nama = scanner.nextLine();
                    
                    System.out.print("Masukkan ID karyawan: ");
                    String id = scanner.nextLine();
                    
                    System.out.print("Masukkan tipe karyawan (1: Pegawai Tetap, 2: Pegawai Kontrak):");
                    int tipe = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    
                    if (tipe == 1) {
                        System.out.print("Masukkan gaji pokok: ");
                        double gajiPokok = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline
                        karyawans[i] = new PegawaiTetap(nama, id, gajiPokok);
                    } else if (tipe == 2) {
                        System.out.print("Masukkan upah per jam: ");
                        double upahPerJam = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline
                        
                        System.out.print("Masukkan jumlah jam kerja: ");
                        int jumlahJamKerja = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        karyawans[i] = new PegawaiKontrak(nama, id, upahPerJam, jumlahJamKerja);
                    } else {
                        System.out.println("Tipe karyawan tidak valid!");
                        i--;  // ulangi input untuk karyawan ini
                    }
                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan input: " + e.getMessage());
                    scanner.nextLine();  // Consume newline untuk menghindari loop tak berujung
                    i--;  // ulangi input untuk karyawan ini
                }
            }
            
            // Output data karyawan
            System.out.println("\nData Karyawan:");
            for (Karyawan karyawan : karyawans) {
                System.out.println(karyawan.getInfo());
                System.out.println("Gaji: " + karyawan.hitungGaji());
                System.out.println("---------------------------");
            }
            
            // Contoh seleksi switch
            System.out.println("Pilih opsi tampilan (1: Ringkas, 2: Lengkap):");
            int opsi = scanner.nextInt();
            
            switch (opsi) {
                case 1:
                    for (Karyawan karyawan : karyawans) {
                        System.out.println(karyawan.getNama() + " - " + karyawan.getId());
                    }
                    break;
                case 2:
                    for (Karyawan karyawan : karyawans) {
                        System.out.println(karyawan.getInfo());
                        System.out.println("Gaji: " + karyawan.hitungGaji());
                        System.out.println("---------------------------");
                    }
                    break;
                default:
                    System.out.println("Opsi tidak valid!");
            }
        }
    }
}
