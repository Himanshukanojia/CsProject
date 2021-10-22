package com.company;

import java.util.*;

public class practiceProblems
{
    public static void main(String[] args) {
        // practice question 1
//        System.out.println("Hello ");
//        System.out.println("Keshav Basodiya");

        // practice question 2
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        int Num_1 = input.nextInt();
//        System.out.println("Enter Second Number");
//        int Num_2 = input.nextInt();
//        int sum = Num_1  +  Num_2 ;
//        System.out.println("Output");
//        System.out.println(sum);

        // practice question 3
////        Write a java program to calculate the median of a given unsorted array of integers
//       int [] Array = { 19,244,4832,9,84,22,28492,48,20,0,45,84}    ;
//       int n = Array.length;
//        Arrays.sort(Array);
//        System.out.println(Arrays.toString(Array));
//        if (n/2 != 0)
//        {
//            int  median = Array[(n+1)/2] ;
//            System.out.println(median);
//        }
//        else {
//            int median = (Array[n/2] + Array[n/2 + 1])/2;
//            System.out.println(median);
//        }

//package stack;
//
//import java.util.Stack;
//
//        class StackImpl {
//
//            public String infixToPostfix(String s) {
//                Stack<Character> st = new Stack<Character>();
//                String postfix = "";
//                char ch[] = s.toCharArray();
//
//                for(char c: ch) {
//                    if(c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')') {
//                        postfix = postfix + c;
//                    } else if (c == '(') {
//                        st.push(c);
//                    } else if (c == ')') {
//                        while(!st.isEmpty()) {
//                            char t = st.pop();
//                            if(t != '(') {
//                                postfix = postfix + t;
//                            } else {
//                                break;
//                            }
//                        }
//                    } else if(c == '+' ||c == '-' ||c == '*' ||c == '/') {
//                        if(st.isEmpty()) {
//                            st.push(c);
//                        } else {
//                            while(!st.isEmpty()) {
//                                char t = st.pop();
//                                if(t == '(') {
//                                    st.push(t);
//                                    break;
//                                } else if(t == '+' || t == '-' || t == '*' || t == '/') {
//                                    if(getPriority(t) <  getPriority(c)) {
//                                        st.push(t);
//                                        break;
//                                    } else {
//                                        postfix = postfix + t;
//                                    }
//                                }
//                            }
//                            st.push(c);
//                        }
//                    }
//                }
//                while(!st.isEmpty()) {
//                    postfix = postfix + st.pop();
//                }
//                return postfix;
//            }
//
//            public int getPriority(char c) {
//                if(c == '+' || c == '-') {
//                    return 1;
//                } else {
//                    return 2;
//                }
//            }
//
//        }
//
//        public class StackApp {
//
//            public static void main(String[] args) {
//                StackImpl a = new StackImpl();
//                String s1 = a.infixToPostfix("2+3-1");
//                System.out.println(s1);
//
//                String s2 = a.infixToPostfix("2+3*4");
//                System.out.println(s2);
//
//                String s3 = a.infixToPostfix("3*(4+5)-6/(1+2)");
//                System.out.println(s3);
//            }
//
//        }

//        practice problem 53
//        Write a java program to find the number of integers within the range of two specified number
//        that are divisble by another number
//        Scanner input = new Scanner(System.in);
//        System.out.println("inter starting point of Range");
//        int x = input.nextInt();
//        System.out.println("inter end point of Range");
//        int y = input.nextInt();
//        System.out.println("inter dividend integer ");
//        int p = input.nextInt();
//
//            if (x%p == 0)
//            {
//               int k = ( y/p - x/p + 1);
//                System.out.println(k);
//            }
//            else {
//                int j = (y/p - x/p);
//                System.out.println(j);
//            }

////        one dimentional Array
//        Scanner input = new Scanner(System.in);
//        int [] Array = {2,23,45,35,75};
//        for (int i = 0 ; i < Array.length ; i++)
//        {
//            System.out.println(Array[i]);
//        }
//        int [] Array1 = new int [10];
//        for (int i = 0 ; i < 10 ; i++)
//        {
//            Array1[i] = input.nextInt();
//        }
//        for (int i = 0 ; i < Array1.length ; i++)
//        {
//            System.out.print(Array1[i] + "  ");
//        }

//          two dimentional Array
//             int [] [] Array2 = { {1,2,4} , {4,5,6}};
//             for (int i = 0 ; i < 3 ; i++)
//             {
//                 for (int j = 0 ; j < 3 ; j++)
//                 {
//                     System.out.println("Array2[" + i + "][" + j + "] = "
//                             + Array2[i][j]);
//                 }
//                 System.out.println( "  ");
//             }
//        for(int i = 0 ; i < 3 ; i++)
//        {
//            for (int j = 0 ; j < 3 ; j++)
//            {
//                System.out.print(Array2[i][j] + " ");
//            }
//            System.out.println( );
//        }

//import java.io.*;
//
//// Java program to implement
//// a Singly Linked List
//        public class LinkedList
//        {
//
//            Node head; // head of list
//
//            // Linked list Node.
//            // This inner class is made static
//            // so that main() can access it
//            static class Node
//            {
//
//                int data;
//                Node next;
//
//                // Constructor
//                Node(int d)
//                {
//                    data = d;
//                    next = null;
//                }
//            }
//
//            // Method to insert a new node
//            public static LinkedList insert(LinkedList list, int data)
//            {
//                // Create a new node with given data
//                Node new_node = new Node(data);
//                new_node.next = null;
//
//                // If the Linked List is empty,
//                // then make the new node as head
//                if (list.head == null) {
//                    list.head = new_node;
//                }
//                else {
//                    // Else traverse till the last node
//                    // and insert the new_node there
//                    Node last = list.head;
//                    while (last.next != null) {
//                        last = last.next;
//                    }
//
//                    // Insert the new_node at last node
//                    last.next = new_node;
//                }
//
//                // Return the list by head
//                return list;
//            }
//
//            // Method to print the LinkedList.
//            public static void printList(LinkedList list)
//            {
//                Node currNode = list.head;
//
//                System.out.print("LinkedList: ");
//
//                // Traverse through the LinkedList
//                while (currNode != null) {
//                    // Print the data at current node
//                    System.out.print(currNode.data + " ");
//
//                    // Go to next node
//                    currNode = currNode.next;
//                }
//            }
//
//            // Driver code
//            public static void main(String[] args)
//            {
//                /* Start with the empty list. */
//                LinkedList list = new LinkedList();
//
//                //
//                // ******INSERTION******
//                //
//
//                // Insert the values
//                list = insert(list, 1);
//                list = insert(list, 2);
//                list = insert(list, 3);
//                list = insert(list, 4);
//                list = insert(list, 5);
//                list = insert(list, 6);
//                list = insert(list, 7);
//                list = insert(list, 8);
//
//                // Print the LinkedList
//                printList(list);
//            }
//        }
//
//
//


    }
}

class integertoBinary {
    static void decimalToBinary(int num)
    {
        // Function to print integer to binary using
        // inbuilt toBinaryString method
        System.out.println(Integer.toBinaryString(num));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        decimalToBinary(num);
    }
}


 class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = in.nextInt();
        if (n>0)
        {
            System.out.print("Is "+n+" sum of two square numbers? "+sum_of_square_numbers(n));
        }
    }

    public static boolean sum_of_square_numbers(int n) {
        int left_num = 0, right_num = (int) Math.sqrt(n);
        while (left_num <= right_num) {
            if (left_num * left_num + right_num * right_num == n) {
                return true;
            } else if (left_num * left_num + right_num * right_num < n) {
                left_num++;
            } else {
                right_num--;
            }
        }
        return false;
//        System.out.println(left_num);
//        System.out.println(right_num);
    }
}

class Exercise84 {
    public static void main(String[] args)
    {
        String string1 = "kaishav";
        int slength = 2;
//        if (slength > string1.length()) {
//            slength = string1.length();
//        }

        String subpart = string1.substring(string1.length()-2);
        System.out.println(subpart + string1 + subpart);
    }
}

     class Exercise17 {
    public static void main(String[] args)
    {
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input seco         nd binary number: ");
        binary2 = in.nextLong();

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}

