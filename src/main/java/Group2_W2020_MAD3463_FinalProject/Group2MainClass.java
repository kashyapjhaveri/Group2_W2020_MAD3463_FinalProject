package Group2_W2020_MAD3463_FinalProject;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class Group2MainClass {
    public static void main(String[] args)
    {
        System.out.println("Enter Your Choice:--");
       try
       {
           Scanner input = new Scanner(System.in);
           int choice=0;
           do {
               System.out.println("=========================");
               System.out.println("--------CREATE-----------");
               System.out.println("1.Person");
               System.out.println("2.Vehicle");
               System.out.println("-------------------------");
               System.out.println("0.Exit");
               System.out.println("==========================");
               choice=input.nextInt();

               switch(choice)
               {
                   case 1: {
                       int nextChoice = 0;
                       System.out.println("Enter Your Choice:--");
                       do {
                           System.out.println("++++++++++++++++++++++++");
                           nextChoice = input.nextInt();
                           switch (choice) {
                               case 1: {

                               }
                               case 2: {

                               }
                               case 3: {

                               }
                               case 0: {
                                   break;
                               }
                           }

                       }
                       while (nextChoice != 0);
                   }
                   case 0:
                   {
                       input.close();
                       break;
                   }
               }




           }

       }

    }
}
