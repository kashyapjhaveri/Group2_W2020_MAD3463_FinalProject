package Group2_W2020_MAD3463_FinalProject;

import Group2_W2020_MAD3463_FinalProject.Enum.Fuel;

abstract public class Vehicle implements IDisplay
{
    private String vehicleIdentificationNumber;
    private String vehicleDescription;
    private String manufacturerName;
    private boolean isSelfDrive;
    private Driver driver;//object pof driver assigned to thr vehicle
    private boolean isInsured;
    private String insuranceProviderName;
    private Byte noOfSeat;
    private Fuel fuelType;
    private Integer baseRate;
    private Integer ratePerKm;
    private String vehicleType;

    public Vehicle() {
    }

    public Vehicle(String vehicleIdentificationNumber, String vehicleDescription, String manufacturerName, boolean isSelfDrive, Driver driver, boolean isInsured, String insuranceProviderName, Byte noOfSeat, Fuel fuelType, Integer baseRate, Integer ratePerKm,String vehicleType) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.vehicleDescription = vehicleDescription;
        this.manufacturerName = manufacturerName;
        this.isSelfDrive = isSelfDrive;
        this.driver = driver;
        this.isInsured = isInsured;
        this.insuranceProviderName = insuranceProviderName;
        this.noOfSeat = noOfSeat;
        this.fuelType = fuelType;
        this.baseRate = baseRate;
        this.ratePerKm = ratePerKm;
        this.vehicleType=vehicleType;
    }

    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public boolean getSelfDrive() {
        return isSelfDrive;
    }

    public void setSelfDrive(boolean selfDrive) {
        isSelfDrive = selfDrive;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public boolean getInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }

    public String getInsuranceProviderName() {
        return insuranceProviderName;
    }

    public void setInsuranceProviderName(String insuranceProviderName) {
        this.insuranceProviderName = insuranceProviderName;
    }

    public Byte getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(Byte noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Integer baseRate) {
        this.baseRate = baseRate;
    }

    public Integer getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(Integer ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
