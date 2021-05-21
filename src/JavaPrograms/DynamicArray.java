package JavaPrograms;

public class DynamicArray {
    public static void main(String[] args) {
        int a[] = {100, 200, 300, 400, 500};// dynamic array we can store any number of (single dimension array)
        int sum =0;
        for (int i : a)
        {
            System.out.println(i);
             sum= sum+i;
            {
                System.out.println(sum);
            }
        }
    }
}