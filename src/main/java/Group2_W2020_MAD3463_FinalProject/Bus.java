package Group2_W2020_MAD3463_FinalProject;

import Group2_W2020_MAD3463_FinalProject.Enum.Fuel;

public class Bus extends Vehicle
{
    private String typeOfBus;
    private boolean isAccessibilityAvailable;
    private boolean isWifiAvailable;

    public Bus(String vehicleIdentificationNumber, String vehicleDescription, String manufacturerName, boolean isSelfDrive, Driver driver, boolean isInsured, String insuranceProviderName, Byte noOfSeat, Fuel fuelType, Integer baseRate, Integer ratePerKm, String vehicleType, String typeOfBus, boolean isAccessibilityAvailable, boolean isWifiAvailable) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName, noOfSeat, fuelType, baseRate, ratePerKm, vehicleType);
        this.typeOfBus = typeOfBus;
        this.isAccessibilityAvailable = isAccessibilityAvailable;
        this.isWifiAvailable = isWifiAvailable;
    }

    public String getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(String typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    public boolean getAccessibilityAvailable() {
        return isAccessibilityAvailable;
    }

    public void setAccessibilityAvailable(boolean accessibilityAvailable) {
        isAccessibilityAvailable = accessibilityAvailable;
    }

    public boolean getWifiAvailable() {
        return isWifiAvailable;
    }

    public void setWifiAvailable(boolean wifiAvailable) {
        isWifiAvailable = wifiAvailable;
    }

    @Override
    public void print()
    {
        /*System.out.println(getVehicleIdentificationNumber()+" "+getVehicleDescription()+" "+getManufacturerName()+" "+getSelfDrive()+" "+getInsured()+" "+getInsuranceProviderName()+" "+getNoOfSeat()+" "+getFuelType()+" "+getBaseRate()+" "+getRatePerKm()+" "+getTypeOfBus()+" "+getAccessibilityAvailable()+" "+getWifiAvailable());*/
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
        System.out.println("TypeOfBus:- "+getTypeOfBus());
        System.out.println("isAccessibilityAvailable:- "+getAccessibilityAvailable());
        System.out.println("isWifiAvailable:- "+getWifiAvailable());

    }
}
