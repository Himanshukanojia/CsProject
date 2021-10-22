package com.company;
import java.util.Random;
public class Selection_short
{
    public static void main(String[] args)
    {
        // SELECTION SORT

        long start = System.currentTimeMillis();
        Random rand = new Random();
        int [] Num = new int[100];
        int temp ;
        for ( int i = 0;i<100 ;i++)
        {
            Num[i] = rand.nextInt(100);
        }

        for (int i = 0; i<100; i++ )
        {
            int min = i;
            int j= i + 1;
            for (int J ; j < 100; j++) {
                if (Num[j] < Num[i]) {
                    min = j;
                }
                temp = Num[i];
                Num[i] = Num[min];
                Num[min] = temp;
            }
        }
        for (int i =0; i<100;i++)
        {
            System.out.print(Num[i]+", ");
        }
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println(elapsedTime);

    }
}
