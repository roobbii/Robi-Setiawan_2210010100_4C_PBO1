
package uas;


// Kelas Turunan PegawaiKontrak
class PegawaiKontrak extends Karyawan {
    private double upahPerJam;
    private int jumlahJamKerja;

    public PegawaiKontrak(String nama, String id, double upahPerJam, int jumlahJamKerja) {
        super(nama, id);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setJumlahJamKerja(int jumlahJamKerja) {
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getJumlahJamKerja() {
        return jumlahJamKerja;
    }

    @Override
    public double hitungGaji() {
        return getUpahPerJam() * getJumlahJamKerja();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nUpah Per Jam: " + getUpahPerJam() + "\nJumlah Jam Kerja: " + getJumlahJamKerja();
    }
}

