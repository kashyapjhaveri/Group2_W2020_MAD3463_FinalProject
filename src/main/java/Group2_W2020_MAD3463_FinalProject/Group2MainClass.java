package Group2_W2020_MAD3463_FinalProject;

import Group2_W2020_MAD3463_FinalProject.Enum.Fuel;
import Group2_W2020_MAD3463_FinalProject.Enum.Gender;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Group2MainClass {
    public static HashMap<String, Customer> customers = new HashMap<>();
    public static HashMap<String, Owner> owners = new HashMap<>();
    public static HashMap<String, Driver> drivers = new HashMap<>();
    public static HashMap<String, Bus> busses = new HashMap<>();
    public static HashMap<String, Car> cars = new HashMap<>();
    public static HashMap<String, MotorCycle> motorcycles = new HashMap<>();

    public static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void readCustomersToHashmap() //https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    {
        String line = "";
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
                    else if (Content[3] == "Female")
                        tempFuel = Gender.Female;
                    else
                        tempFuel = Gender.other;
                    Customer temp = new Customer(Content[0], Content[1], Content[2], tempFuel, tempDate, Content[5], Content[6], Content[7], Content[8], Content[9], Content[10]);
                    customers.put(Content[0], temp);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void readOwnersToHashmap() {
        String line = "";
        try {
            File file = new File(".\\InputFiles\\Owners.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while ((line = bufferedReader.readLine()) != null) {
                String content[] = line.split(",");
                LocalDate tempDate = LocalDate.parse(content[4], dateFormat);
                for (int j = 0; j < content.length; j++) {
                    Gender tempFuel;
                    if (content[3] == "Male")
                        tempFuel = Gender.male;
                    else if (content[3] == "Female")
                        tempFuel = Gender.female;
                    else
                        tempFuel = Gender.other;
                    Owner temp = new Owner(content[0], content[1], content[2], tempFuel, tempDate, content[5], content[6], content[7], content[8], content[9], content[10], content[11]);
                    owners.put(content[0], temp);
                }
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }


    public static void readDriversToHashMap()
    {
        String line="";
        try{
            File file=new File(".Drivers.csv");
            FileReader reader=new FileReader(file);
            BufferedReader bufferReader=new BufferedReader(reader);
            while
            ((line=bufferReader.readLine())!=null)
            {
                String content[]=line.split(",");
                LocalDate tempDate=LocalDate.parse(content[4],dateFormat);

                for(int j=0;j<content.length;j++)
                {
                    Gender tempFuel;
                    if (content[3] == "Male")
                        tempFuel = Gender.Male;
                    else if (content[3] == "Female")
                        tempFuel = Gender.Female;
                    else
                        tempFuel = Gender.other;
                    Driver temp=new
                    Driver(content[0],content[1],content[2],tempFuel,tempDate,content[5],content[6],content[7],content[8],content[9],Boolean.parseBoolean(content[10]),Double.parseDouble(content[11]));
                    drivers.put(content[0],temp);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void readCarsToHashMap()
    {
        String line="";
        try{
            File file=new File("Cars.csv");
            FileReader reader=new FileReader(file);
            BufferedReader bufferReader=new BufferedReader(reader);
            while
            ((line=bufferReader.readLine())!=null)
            {
                String content[]=line.split(",");
                Driver tempDriver = null;

                for (int j=0;j<content.length;j++)
                {
                    Fuel tempFuel = null;

                    if (content[8].equalsIgnoreCase("Petrol")
                    tempFuel=Fuel.Petrol;
                    else if (content[8].equalsIgnoreCase("Diesel")
                    tempFuel=Fuel.Diesel;
                    if (content[3].equalsIgnoreCase("false")) {
                        tempDriver = drivers.get(content[4]);
                    }
                    Car tempObj = new Car(content[0],content[1],content[2],Boolean.parseBoolean(content[3]),tempDriver,Boolean.parseBoolean(content[5]),content[6],Byte.parseByte(content[7]),tempFuel,Integer.parseInt(content[9]),Integer.parseInt(content[10]),content[11],content[12]);
                    cars.put(content[0],tempObj);
                }
                }
                }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public static void readOwnerVehicles()
    {
        String line="";
        try{
            File file=new File("OwnerVehicles");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                HashMap<String, Vehicle> tempOwnerVehicles = new HashMap<>();
                String content[]=line.split(",");
                Owner tempOwner=owners.get(content[0]);
                Vehicle tempVehicle=null;
                for (int j=1;j<content.length;j++)
                {
                    if (cars.get(content[j])!=null)
                    {
                        tempVehicle=cars.get(content[j]);
                    }
                    else if(busses.get(content[j])!=null)
                    {
                        tempVehicle=busses.get(content[j]);
                    }
                    else if(motorcycles.get(content[j])!=null)
                    {
                        tempVehicle=motorcycles.get(content[j]);
                    }
                    tempOwnerVehicles.put(tempVehicle.getVehicleIdentificationNumber(),tempVehicle);
                }
                tempOwner.setListOfVehcialOwned(tempOwnerVehicles);
            }
            bufferedReader.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

            }


        }
    public static void listAllPersons(String type)
    {
        switch (type)
        {
            case "owner":
            {
                for (Owner owner:owners.values())
                {
                    owner.print();
                }
                break;
            }
            case "customers":
            {
                for (Customer customer:customers.values())
                {
                    customer.print();
                }
                break;
            }
            case "drivers":
            {
                for (Driver driver:drivers.values())
                {
                    driver.print();
                }
                break;
            }
        }
    }

}











