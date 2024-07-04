# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Karyawan`, `PegawaiTetap`, `PegawaiKontrak`, dan `Main` adalah contoh dari class.

```bash
public class Karyawan {
    ...
}

public class PegawaiTetap extends Karyawan {
    ...
}

public class PegawaiKontrak extends Karyawan {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Karyawan[] karyawans = new Karyawan[jumlahKaryawan];` adalah contoh pembuatan object.

```bash
Karyawan[] karyawans = new Karyawan[jumlahKaryawan];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` `id`, `upahPerJam`, `jumlahJamKerja`, dan `gajiPokok` adalah contoh atribut.

```bash
String nama;
String id;
double upahPerJam;
int jumlahJamKerja;
double gajiPokok;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Karyawan` `PegawaiTetap`, dan`PegawaiKontrak`.

```bash
public Karyawan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

public PegawaiTetap(String nama, String id, double gajiPokok) {
        super(nama, id);
        this.gajiPokok = gajiPokok;
    }

public PegawaiKontrak(String nama, String id, double upahPerJam, int jumlahJamKerja) {
        super(nama, id);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` `setId`, `setUpahPerJam`, `setJumlahJamKerja`, dan `setGajiPokok` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

public void setId(String id) {
        this.id = id;
    }

public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

public void setJumlahJamKerja(int jumlahJamKerja) {
        this.jumlahJamKerja = jumlahJamKerja;
    }

public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getId`, `getUpahPerJam`, `getJumlahJamKerja`, dan `getGajiPokok`, adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

public String getId() {
        return id;
    }

public double getUpahPerJam() {
        return upahPerJam;
    }

public int getJumlahJamKerja() {
        return jumlahJamKerja;
    }

public double getGajiPokok() {
        return gajiPokok;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `npm`, `upahPerJam`, `jumlahJamKerja`, dan `gajiPokok` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String id;
private double upahPerJam;
private int jumlahJamKerja;
private double gajiPokok;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PegawaiTetap` mewarisi `Karyawan`, dan `PegawaiKontrak` mewarisi `Karyawan` dengan sintaks `extends`.

```bash
class PegawaiTetap extends Karyawan  {
    ...
}

class PegawaiKontrak extends Karyawan  {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `getInfo(String)` di `Karyawan` merupakan overloading method `getInfo` dan `getInfo` di `PegawaiTetap`, dan `PegawaiKontrak` merupakan override dari method `getInfo` di `Karyawan`.

```bash
public String getInfo(String tambahan) {
        return getInfo() + "\n" + tambahan;
    }

@Override
public double hitungGaji() {
        return 0;
    }

@Override
    public String getInfo() {
        return super.getInfo() + "\nGaji Pokok: " + getGajiPokok();
    }

@Override
    public double hitungGaji() {
        return getGajiPokok();
    }

@Override
    public String getInfo() {
        return super.getInfo() + "\nUpah Per Jam: " + getUpahPerJam() + "\nJumlah Jam Kerja: " + getJumlahJamKerja();
    }

@Override
    public double hitungGaji() {
        return getUpahPerJam() * getJumlahJamKerja();
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam class `Main` dan seleksi `switch` dalam class `Main`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahKaryawan; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in)) 
System.out.print("Masukkan jumlah karyawan: ");
int jumlahKaryawan = scanner.nextInt();

System.out.println("\nData Karyawan:");
for (Karyawan karyawan : karyawans) {
System.out.println(karyawan.getInfo());
System.out.println("Gaji: " + karyawan.hitungGaji());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Karyawan[] karyawans = new Karyawan[jumlahKaryawan];` adalah contoh penggunaan array.

```bash
Karyawan[] karyawans = new Karyawan[jumlahKaryawan];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
System.out.print("Masukkan nama karyawan: ");
String nama = scanner.nextLine();
                    
System.out.print("Masukkan ID karyawan: ");
String id = scanner.nextLine();
                    
System.out.print("Masukkan tipe karyawan (1: Pegawai Tetap, 2: Pegawai Kontrak):");
int tipe = scanner.nextInt();
scanner.nextLine(); }

catch (Exception e) {
System.out.println("Terjadi kesalahan input: " + e.getMessage());
scanner.nextLine();  // Consume newline untuk menghindari loop tak berujung
i--;  // ulangi input untuk karyawan ini
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Robi Setiawan
NPM: 2210010100
