package Group2_W2020_MAD3463_FinalProject;

import Group2_W2020_MAD3463_FinalProject.Fuel;
import Group2_W2020_MAD3463_FinalProject.Gender;
import Group2_W2020_MAD3463_FinalProject.Customer;
import Group2_W2020_MAD3463_FinalProject.Driver;
import Group2_W2020_MAD3463_FinalProject.Owner;
import Group2_W2020_MAD3463_FinalProject.Bus;
import Group2_W2020_MAD3463_FinalProject.Car;
import Group2_W2020_MAD3463_FinalProject.MotorCycle;
import Group2_W2020_MAD3463_FinalProject.Vehicle;
import com.sun.tools.javah.Gen;

import javax.swing.text.AbstractDocument;
import javax.swing.text.StringContent;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Group2MainClass {
    public static HashMap<String,Customer> customers=new HashMap<>();
    public static HashMap<String,Owner>owners = new HashMap<>();
    public static HashMap<String,Driver>drivers=new HashMap<>();
    public static HashMap<String,Bus>busses=new HashMap<>();
    public static HashMap<String, Car>cars=new HashMap<>();
    public static HashMap<String, MotorCycle>motorcycles=new HashMap<>();

    public static DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void readCustomersToHashmap() //https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    {
        String line="";
        try {
            File file = new File(".customers.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while ((line = BufferedReader.readLine()) != null) {
                String Content[] = line.split(",");
                LocalDate tempDate = LocalDate.parse(Content[4], dateFormat);

                for (int j = 0; j < Content.length; j++) {
                    Gender tempFuel;
                    if (Content[3] == "Male")
                        tempFuel = Gender.Male;
                    else if (Content[3] = "Female")
                        tempFuel = Gender.Female;
                    else
                        tempFuel = Gender.other;
                    Customer temp = new Customer(Content[0], Content[1], Content[2], tempFuel, tempDate, Content[5], Content[6], Content[7], Content[8], Content[9], Content[10]);
                    customers.put(Content[0], temp);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    



}










