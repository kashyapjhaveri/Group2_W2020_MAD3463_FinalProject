package Group2_W2020_MAD3463_FinalProject;

public class Car extends Vehicle
{
    private String carType;
    private String colour;

    public Car(String vehicleIdentificationNumber, String vehicleDescription, String manufacturerName, boolean isSelfDrive, Driver driver, boolean isInsured, String insuranceProviderName, Byte noOfSeat, Fuel fuelType, Integer baseRate, Integer ratePerKm, String vehicleType, String carType, String colour) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName, noOfSeat, fuelType, baseRate, ratePerKm, vehicleType);
        this.carType = carType;
        this.colour = colour;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void print()
    {
        /*System.out.println(getVehicalIndentificationNumber()+" "+getVechicalDiscription()+" "+getManufacturerName()+" "+getSelfDrive()+" "+getInsured()+" "+getInsuranceProviderName()+" "+getNoOfSeat()+" "+getFuelType()+" "+getBaseRate()+" "+getRatePerKm()+" "+getCarType()+" "+getcolour());*/
        System.out.println("VIn:- "+getVehicleIdentificationNumber());
        System.out.println("Description:- "+getVehicleDescription());
        System.out.println("Manufacturer:- "+getManufacturerName());
        System.out.println("isSelfDrive:- "+getSelfDrive());
        System.out.println("isInsured:- "+getInsured());
        System.out.println("insuranceProviderName:- "+getInsuranceProviderName());
        System.out.println("NumberOfSeat:- "+getNoOfSeat());
        System.out.println("FuelType:- "+getFuelType());
        System.out.println("BaseRate:- "+getBaseRate());
        System.out.println("RatePerKm:- "+getRatePerKm());
        System.out.println("VehicleType:- "+getVehicleType());
        System.out.println("Colour:- "+getColour());

    }
}
