import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("BIODATA");
        System.out.println("+===============INPUTAN============================+");

        System.out.print("Masukkan banyak data = ");

        int data = Integer.parseInt(reader.readLine());
        String[] nama = new String[data];
        int[] umur = new int[data];

        int number =1;
        for (int a = 0; a < data; a++) {
            System.out.println("------Data ke-" + number++ + "-------");
            System.out.print("Masukan Nama       = ");
            nama[a] = reader.readLine();
            System.out.print("Masukan umur       = ");
            umur[a] = Integer.parseInt(reader.readLine());

        }

        System.out.println("+==============HASIL OUTPUT========================+");
        System.out.println("Banyak data : " + data);
        System.out.println("| Nama | Umur |");

        for (int x = 0, y = 0; x < nama.length && y < umur.length; x++, y++){
            System.out.print("| " + nama[x] + " |");
            System.out.println(umur[y] + " |");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}



