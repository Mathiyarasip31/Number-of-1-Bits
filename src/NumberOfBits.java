import java.util.Scanner;

public class NumberOfBits {
    public static int Calculate(int number)
    {
        String result="";
        int count=0;

        while(number>0)
        {
            if(number>=2)
            {
                result+=number%2;
            }
            else {
                result+=number;
            }
            number=number/2;
        }
        for(int i=0;i<result.length();i++)
        {
            if(result.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        System.out.println(Calculate(number));
    }
}