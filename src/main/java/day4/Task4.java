package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] array=new int[100];
        for (int i=0;i< array.length;i++)
            array[i]= random.nextInt(10000);

        int max3=array[0]+array[1]+array[2];
        int ind=0;
        for (int i=1;i<array.length-2;i++){
            int sum=0;
            for (int j=i;j<i+3;j++)
                sum+=array[j];

                if (sum>max3){
                    max3=sum;
                    ind=i;
                }
        }
        System.out.println(max3);
        System.out.println(ind);
    }
}
