/**
 * Kelas untuk menghitung volume balok.
 */
public class VolumeBalok {

    /**
     * Metode untuk menghitung volume balok.
     *
     * @param panjang Panjang balok.
     * @param lebar Lebar balok.
     * @param tinggi Tinggi balok.
     * @return Volume balok.
     */
    public static double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    /**
     * Metode utama untuk menguji perhitungan volume balok.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam kasus ini).
     */
    public static void main(String[] args) {
        double panjang = 5; // Contoh: Panjang balok
        double lebar = 3;   // Contoh: Lebar balok
        double tinggi = 2;  // Contoh: Tinggi balok

        double volume = hitungVolume(panjang, lebar, tinggi);

        System.out.println("Volume balok dengan panjang " + panjang + ", lebar " + lebar + " dan tinggi " + tinggi + " adalah " + volume);
    }
}
