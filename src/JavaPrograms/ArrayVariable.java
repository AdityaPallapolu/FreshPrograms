package JavaPrograms;

public class ArrayVariable {



        public static void main (String[]args){
        int a[] = new int[5];// single dimension array
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        /*for (int i = 0; i <= 4; i++) //this is for loop
        {
            System.out.println(a[i]);*/

        System.out.println("a = " + a.length);
        System.out.println(a[2]);
        int sum = 0;

        for (int i : a)// this is for each loop
        {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);


    }
    }


