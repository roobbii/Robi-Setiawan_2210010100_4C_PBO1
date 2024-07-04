
package uas;

// Kelas dasar Karyawan
class Karyawan {
    // Atribut dan enkapsulasi
    private String nama;
    private String id;

    // Konstruktor
    public Karyawan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Akses (getter)
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    // Polimorfisme (overloading)
    public String getInfo() {
        return "Nama: " + getNama() + "\nID: " + getId();
    }

    public String getInfo(String tambahan) {
        return getInfo() + "\n" + tambahan;
    }

    // Overriding
    public double hitungGaji() {
        return 0;
    }
}
