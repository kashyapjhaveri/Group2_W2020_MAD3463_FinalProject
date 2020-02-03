package Group2_W2020_MAD3463_FinalProject;

public class MotorCycle extends Vehicle
{
    private Integer maxTopSpeed;
    private Float milage;

    public MotorCycle(String vehicleIdentificationNumber, String vehicleDescription, String manufacturerName, boolean isSelfDrive, Driver driver, boolean isInsured, String insuranceProviderName, Byte noOfSeat, Fuel fuelType, Integer baseRate, Integer ratePerKm, String vehicleType, Integer maxTopSpeed, Float milage) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName, noOfSeat, fuelType, baseRate, ratePerKm, vehicleType);
        this.maxTopSpeed = maxTopSpeed;
        this.milage = milage;
    }

    public Integer getMaxTopSpeed() {
        return maxTopSpeed;
    }

    public void setMaxTopSpeed(Integer maxTopSpeed) {
        this.maxTopSpeed = maxTopSpeed;
    }

    public Float getMilage() {
        return milage;
    }

    public void setMilage(Float milage) {
        this.milage = milage;

    }


    @Override
    public void print() {
        /*System.out.println(getVehicalIndentificationNumber()+" "+getVechicalDiscription()+" "+getManufacturerName()+" "+getSelfDrive()+" "+getInsured()+" "+getInsuranceProviderName()+" "+getNoOfSeat()+" "+getFuelType()+" "+getBaseRate()+" "+getRatePerKm()+" "+getMaxTopSpeed()+" "+getMaxTopSpeed());*/
        System.out.println("VIn :-" + getVehicleIdentificationNumber());
        System.out.println("Description :-" + getVehicleDescription());
        System.out.println("Manufacturer :-" + getManufacturerName());
        System.out.println("isSelfDrive:- " + getSelfDrive());
        System.out.println("isInsured: +" +  getInsured());
        System.out.println("insuranceProviderName :-" + getInsuranceProviderName());
        System.out.println("numberOfSeat" + getNoOfSeat());
        System.out.println("FuelType:-" + getFuelType());
        System.out.println("BaseRate:-" + getBaseRate());
        System.out.println("RatePerKm:-" + getRatePerKm());
        System.out.println("VehicleType:-" + getVehicleType());
        System.out.println("MaxTopSpeed:-" + getMaxTopSpeed());
        System.out.println("Milege:-" + getMilage());
    }

}
