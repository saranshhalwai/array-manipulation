import java.util.Arrays;
import java.util.Scanner;

public class intarray {
    int[] array;
    int length;
    int sum;
    public intarray(int length)
    {
        array=new int[length];
        this.length=array.length;
        this.sum();
    }
    public intarray(int length,boolean input)
    {
        super();
        array=new int[length];
        this.length=array.length;
        if(input)
            this.input();
    }

    public void input()
    {
        Scanner scan=new Scanner(System.in);
        for (int i=0;i<length;i++)
        {
            array[i]=scan.nextInt();
        }
        this.sum();
    }

    private void sum()
    {
        for (int i=0;i<length;i++)
        {
            sum+=array[i];
        }
    }

    public void print()
    {
        for (int i=0;i<length;i++)
        {
            System.out.println(array[i]);
        }
    }

    public void addElement(int element,int index)
    {
        array[index]=element;
        sum();
    }

    public int binarySearch(int key)
    {
        return Arrays.binarySearch(array,key);
    }

    public int getLength() {
        return length;
    }

    public int getSum() {
        return sum;
    }


}
