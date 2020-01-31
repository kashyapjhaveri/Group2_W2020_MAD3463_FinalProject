package Group2_W2020_MAD3463_FinalProject;



import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Group2MainClass {
    public static void main(String[] args) {
        System.out.println("Enter Your Choice:--");
        try {
            Scanner input = new Scanner(System.in);
            int choice = 0;
            do {
                System.out.println("=========================");
                System.out.println("--------CREATE-----------");
                System.out.println("1.Person");
                System.out.println("2.Vehicle");
                System.out.println("-------------------------");
                System.out.println("0.Exit");
                System.out.println("==========================");

                choice=input.nextInt();
                switch (choice)
                {
                    case 1:
                    {
                        int nextChoice=0;
                        System.out.println("ENter your choice : -");

                        do{
                            System.out.println("++++++++++++++++");
                            System.out.println("1.Customer");
                            System.out.println("2.Owner");
                            System.out.println("3.Driver");
                            System.out.println("0.Priveous menu");
                            System.out.println("+++++++++++++++++");
                            System.out.println(" ");

                            nextChoice=input.nextInt();

                            switch (choice)
                            {

                                case 1:
                                {

                                }
                                case 2:
                                {

                                }
                                case 3:
                                {

                                }
                                case 0:
                                {
                                    break;
                                }
                            }
                        }
                        while (nextChoice!=0);

                        Customer Shree = new Customer(1,"shree","Marella",Gender.Male, LocalDate.of(1996,10,15),"8199210696","mvsrikanth96@gmail.com","ShreeMarella","123456","7 Crescent 2906","7 Crescent place","Toronto","Ontario");
                        Shree.print();
                    }

                    case 0:
                    {
                        input.close();
                        break;
                    }
                }
            }

            while (choice!=0);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}





