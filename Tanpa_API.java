import java.util.Scanner;

public class Tanpa_API{

    //data awal
    static int data [] = {-80, -50, 0 , 40, 0, -30, 90,70, 89, 50, 55 };

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int input;
        boolean a = false;

        System.out.println("\t\tPratikum modul 5 pemograman lanjut");
        System.out.println("\t\t Oleh Muhammad Irfan Fachrulrozy H.\n\n");


        for (int i=data.length -1;i>0; i--){

            for (int j=0;j<i;j++){

                if (data [j] > data [j+1]){

                }
            }
        }

    System.out.print("Data :");

    for (int i=0; i<data.length; i++ ){
        System.out.print(data[i] + " ");
    }

    System.out.print("\n\nCari index elemen dari :");
        input = in.nextInt();

        for(int i=0;i<data.length;i++){

            if (input == data [i]){

                System.out.printf("%d ada pada index ke-%d", input,i);
                a = true;
            }
        }

        //jika data tidak sesuai yang dimaksukkan maka akan terjadi false
        if ( a == false){
            System.out.println("Nilai tidak ditemukan");
        }
    }
}

