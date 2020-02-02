package Group2_W2020_MAD3463_FinalProject;

 abstract public class  Vehical implements IDisplay {
     private String vehicalIndentificationNumber;
     private String vechicalDiscription;
     private String manufacturerName;
     private Boolean isSelfDrive;
     private Driver driver;  //Object of driver assigned to the vehical
     private Boolean isInsured;
     private String insuranceProviderName;
     private Byte noOfSeat;
     private Fuel fuelType;
     private Integer baseRate;
     private Integer ratePerKm;


     public String getVehicalIndentificationNumber() {
         return vehicalIndentificationNumber;
     }

     public String getVechicalDiscription() {
         return vechicalDiscription;
     }

     public void setVechicalDiscription(String vechicalDiscription) {
         this.vechicalDiscription = vechicalDiscription;
     }

     public String getManufacturerName() {
         return manufacturerName;
     }

     public void setManufacturerName(String manufacturerName) {
         this.manufacturerName = manufacturerName;
     }

     public Boolean getSelfDrive() {
         return isSelfDrive;
     }

     public void setSelfDrive(Boolean selfDrive) {
         isSelfDrive = selfDrive;
     }

     public Driver getDriver() {
         return driver;
     }

     public void setDriver(Driver driver) {
         this.driver = driver;
     }

     public Boolean getInsured() {
         return isInsured;
     }

     public void setInsured(Boolean insured) {
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
 }

