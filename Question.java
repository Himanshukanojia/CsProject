package com.company;
import java.util.Scanner;
public class Question {
    public static void main(String[] args) {

//        Question =  1
//         float Num1 = 45;
//         float Num2 = 35;
//         float Num3 = 53;
//         float sum = Num1+Num2+Num3;
//         float per = (sum/3);
//        System.out.println(per);

//        Question = 2
        System.out.println("Enter your name : ");
        Scanner sc =new Scanner(System.in);
        String Name = sc.next();

        System.out.println("Hello " + Name + " Have a good day");
//        Scanner


    }
}
//package com.company;
//        import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        String Email_1 = sc.nextLine();
//        System.out.println("Your Entered String : " + Email_1);
//        char [] Email_array = Email_1.toCharArray();
//        int Value = Email_1.length();
//        System.out.println(Value);
////        for (int i = 0; i < Value ; i++)
////        {
////            System.out.printf("Array %d  %c ",i,Email_array[i]);
////        }
//        for(int i = 0; i < Value; i++)
//        {
//            if(i != Value)
//            {
//                if(Email_array[i] + Email_array[i+1] == '@' + '.')
//                {
//                    System.out.println("False");
//                }
//                else if(Email_array[i] == '@')
//                {
//                    System.out.println("True");
//                }
//            }
//
//        }
//
//
//    }
//
//}

//        package com.company;
//        import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//
//
//        int [] arr1 = new int[5];
//
//        for(int i = 0; i<5 ; i++)
//        {
//            System.out.printf("Enter   ");
//
//            arr1[i] = sc.nextInt();
//
//
//        }
//
//
//
//        for(int i = 4 ; i >= 0; i--) {
//            System.out.printf("%d", arr1[i]);
//        }
//
//    }
//}

//{
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter Number of Rows ");
//        int num  = sc.nextInt();
//        for(int j = num; j>= 0; j--)
//        {
//        for (int i = j; i >= 0; i--)
//        {
//        System.out.print("* ");
//        //System.out.println(" ");
//        for ( int k = 0; k <=j; k++)
//        {
//        System.out.print(" ");
//        }
//
//        }
//        System.out.println("     ");
//
//        }

//{
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter Number of Rows ");
//        int num  = sc.nextInt();
//        for(int j = num; j>= 1; j--)
//        {
//        for (int i = j; i < num ; i++)
//        {
//        System.out.print("  ");
//        //System.out.println(" ");
//        }
//        for ( int k = 1; k <=(2*j-1); k++)
//        {
//        System.out.print("* ");
//        }
//        System.out.println("     ");
//
//        }
