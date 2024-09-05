package binaryoperator;

public class Assignment {
    public static void main(String[] args) {
        //1. Operator assignment dasar
        int angka = 10;
        String nama = "Alice";

        System.out.println("Nilai angka : " + angka);
        System.out.println("Nilai nama : " + nama);

        //2. Operator assignment aritmatika
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("Nilai x setelah : " + x);

        int y = 10;
        y -= 2; // y = y - 2
        System.out.println("Nilai y setelah : " + y);

        int z = 4;
        z *= 4; // z = z * 4
        System.out.println("Nilai z setelah : " + z);

        int a = 20;
        a /= 4; // a = a / 4
        System.out.println("Nilai a setelah : " + a);

        int b = 13;
        b %= 5; // b = b % 5
        System.out.println("Nilai b setelah : " +b );


    }
}
