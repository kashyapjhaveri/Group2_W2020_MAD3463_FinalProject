package Group2_W2020_MAD3463_FinalProject;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;




public class Group2MainClass {
    public static void readOwnersToHashMap()
    {
        String line="";
        try{
            File file = new File(".\\InputFiles\\Owners.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                LocalDate tempDate = LocalDate.parse(content[4],dateFormate);

                for (int j=0;j<content.length;j++)
                {
                    /*System.out.println(content[j]);*/
                    Gender tempFuel;
                    if (content[3]=="Male")
                        tempFuel=Gender.male;
                    else if (content[3]=="Female")
                        tempFuel=Gender.female;
                    else
                        tempFuel=Gender.other;

                    Owner temp= new Owner(content[0],content[1],content[2],tempFuel,tempDate,content[5],content[6],content[7],content[8],content[9],content[10],content[11]);

                    owners.put(content[0],temp);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
    public static void readBusesToHashMap()

    {
        String line="";
        try{
            File file = new File(".\\InputFiles\\Buses.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                Driver tempDriver = null;

                for (int j=0;j<content.length;j++)
                {
                    Fuel tempFuel = null;

                    if (content[8].equalsIgnoreCase("Petrol"))
                        tempFuel=Fuel.petrol;
                    else if (content[8].equalsIgnoreCase("Diesel"))
                        tempFuel=Fuel.diesel;

                    if (content[3].equalsIgnoreCase("false"))
                    {
                        tempDriver=drivers.get(content[4]);
                    }

                    Bus tempObj = new Bus(content[0],content[1],content[2],Boolean.parseBoolean(content[3]),tempDriver,Boolean.parseBoolean(content[5]),content[6],Byte.parseByte(content[7]),tempFuel,Integer.parseInt(content[9]),Integer.parseInt(content[10]),content[11],Boolean.parseBoolean(content[12]),Boolean.parseBoolean(content[13]));
                    buses.put(content[0],tempObj);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void readMotorCyclesToHashMap()
    {
        String line="";
        try{
            File file = new File(".\\InputFiles\\MotorCycles.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                Driver tempDriver = null;

                for (int j=0;j<content.length;j++)
                {
                    Fuel tempFuel = null;

                    if (content[8].equalsIgnoreCase("Petrol"))
                        tempFuel=Fuel.petrol;
                    else if (content[8].equalsIgnoreCase("Diesel"))
                        tempFuel=Fuel.diesel;

                    if (content[3].equalsIgnoreCase("false"))
                    {
                        tempDriver=drivers.get(content[4]);
                    }

                    MotorCycle tempObj = new MotorCycle(content[0],content[1],content[2],Boolean.parseBoolean(content[3]),tempDriver,Boolean.parseBoolean(content[5]),content[6],Byte.parseByte(content[7]),tempFuel,Integer.parseInt(content[9]),Integer.parseInt(content[10]),Integer.parseInt(content[11]),Float.parseFloat(content[12]));
                    motorcycles.put(content[0],tempObj);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void readVehicleRented()
    {
        String line="";
        try{
            File file = new File(".\\InputFiles\\vehicleRent.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                Vehical tempVehicle=null;
                Customer tempCustomer = customers.get(content[0]);
                LocalDate tempStartDate = LocalDate.parse(content[1],dateFormate);
                LocalDate tempEndDate = LocalDate.parse(content[2],dateFormate);

                if (cars.get(content[4])!=null)
                {
                    tempVehicle=cars.get(content[4]);
                }
                else if(buses.get(content[4])!=null)
                {
                    tempVehicle=buses.get(content[4]);
                }
                else if(motorcycles.get(content[4])!=null)
                {
                    tempVehicle=motorcycles.get(content[4]);
                }

                VehicalRent tempObj = new VehicalRent(tempCustomer,tempStartDate,tempEndDate,Integer.parseInt(content[3]),Integer.parseInt(content[5]),tempVehicle);
                vehiclesRented.put(content[3],tempObj);
            }
            bufferedReader.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
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
                    System.out.println("===============");
                    owner.print();
                    System.out.println("===============");
                }
                break;
            }
            case "customer":
            {
                for (Customer customer:customers.values())
                {
                    System.out.println("===============");
                    customer.print();
                    System.out.println("===============");
                }
                break;
            }
            case "driver":
            {
                for (Driver driver:drivers.values())
                {
                    System.out.println("===============");
                    driver.print();
                    System.out.println("===============");
                }
                break;
            }
        }
    }
    public static void listVehicalRented()