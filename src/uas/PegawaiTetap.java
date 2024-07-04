
package uas;

// Kelas Turunan PegawaiTetap
class PegawaiTetap extends Karyawan {
    private double gajiPokok;

    public PegawaiTetap(String nama, String id, double gajiPokok) {
        super(nama, id);
        this.gajiPokok = gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    @Override
    public double hitungGaji() {
        return getGajiPokok();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nGaji Pokok: " + getGajiPokok();
    }
}