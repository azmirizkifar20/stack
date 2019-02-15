import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// program tebak angka menggunakan stack
        Function fungsi = new Function();
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            int count = 5;
            for (int i = 0; i < 5; i++) {
                int random = (int)(Math.random()*5);
                System.out.println("Kesempatan : " + count);
                System.out.print("Tebak angka : "); int tebak = input.nextInt();
                count--;

                if (tebak == random) {
                    System.out.println("Benar!");
                    System.out.println();
                    fungsi.pushRight(random);
                    fungsi.pushPoint(random);
                } else {
                    fungsi.pushMiss(tebak);
                    System.out.println();
                }
            }

            System.out.println("angka yang berhasil di tebak : " + fungsi.size);
            System.out.println("angka yang gagal ditebak : " + fungsi.size2);
            System.out.println("Point anda : " + (fungsi.size3 * 10));
            System.out.println();
            fungsi.pop();

            System.out.print("Lanjut ? (y/t) => "); String lanjut = input.next();
            System.out.println();
            switch (lanjut) {
                case "y":
                    jalan = true;
                    break;

                case "t":
                    jalan = false;
                    break;

                default:
                    jalan = false;
                    break;
            }
        }
    }
}
