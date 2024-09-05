package binaryoperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // sama dengan
        boolean hadilSamaDengan = (a == b);
        System.out.println("a == b : " + hadilSamaDengan);

        //tidak dengan sama dengan
        boolean hasilTidakSamaDengan = (a != b);
        System.out.println("a != b : " + hasilTidakSamaDengan);

        //Lebih besar dari
        boolean hasilLebihBesarDari = (a > b);
        System.out.println("a > b : " + hasilLebihBesarDari);

        //Lebih besar atau sama dengan
        boolean hasilLebihBesarSamaDengan = (a >= b);
        System.out.println("a >= b : " + hasilLebihBesarSamaDengan);

        //Lebih kecil atau sama dengan
        boolean hasilLebihKecilSamaDengan = (a <= b);
        System.out.println("a <= b : " + hasilLebihKecilSamaDengan);
    }
}
