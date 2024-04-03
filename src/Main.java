//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ////////////////////////////////////////////
        ////Pirma uzduotis

        System.out.println();
        System.out.println("Pirma uzduotis");
        System.out.println();

        Random random = new Random();
        byte[] masyvas8 = new byte[8];

        for(int i = 0; i< masyvas8.length;i++){
            masyvas8[i] = (byte) random.nextInt(1,10);
        }

        for(int i = 0; i < masyvas8.length;i++){
           System.out.println("Verte prie indekso " + i +" yra: " +masyvas8[i]);
       }

        ////////////////////////////////////////////
        ////Antra uzduotis

        System.out.println();
        System.out.println("Antra uzduotis");
        System.out.println();


        System.out.println("Vertes didesnės uz 4 yra");
        for (byte b:masyvas8){
            if(b>4) System.out.println(b);
        }


        byte[] naujasMasyvas = new byte[8];
        for(int j = 0, i = 0; i < masyvas8.length;i++){
            if(masyvas8[i]<=4) {
                naujasMasyvas[j] = masyvas8[i];
                j++;
            }
        }
        System.out.println("Vertes mazesnes arba lygios 4 yra");
        for (byte b:naujasMasyvas){
            System.out.println(b);
        }


        int suma = 0;
        for(int i = 0; i< masyvas8.length;i++)        {
           suma+=masyvas8[i];
        }

        System.out.println("Suma yra: "+ suma);

        ////////////////////////////////////////////
        ////Trecia uzduotis

        System.out.println();
        System.out.println("Trecia uzduotis");
        System.out.println();

        List<Integer> randomVertes = new ArrayList<Integer>();

        for(int i = 0; i<8;i++){
            randomVertes.add(random.nextInt(0,10));
        }
        System.out.println(randomVertes);



        List<Integer> randomDaUz4 = new ArrayList<Integer>();
        for(Integer i:randomVertes){
            if(i>4) randomDaUz4.add(i);

        }
        System.out.println(randomDaUz4);



        List<Integer> randomMaUz4 = new ArrayList<Integer>();
        for(Integer i:randomVertes){
            if(i<=4) randomMaUz4.add(i);
        }
        System.out.println(randomMaUz4);


        suma = 0;
        for(Integer i:randomVertes){
            suma+=i;
        }

        System.out.println("Suma yra: " + suma);
        System.out.println("Vidurkis yra: " + (float) suma/randomVertes.size());

        System.out.println("suma yra: " + randomVertes.stream().mapToInt(i -> i).sum());
        System.out.println("vidurkis yra: " + randomVertes.stream().mapToInt(i -> i).average().getAsDouble());


        ////////////////////////////////////////////
        ////Ketvirta uzduotis

        System.out.println();
        System.out.println("Ketvirta uzduotis");
        System.out.println();

        ///Ketvirta uzduotis neikelta, tik atsakymas ikeltas i rar.



    }
}