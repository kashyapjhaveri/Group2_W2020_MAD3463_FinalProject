package Group2_W2020_MAD3463_FinalProject;

import java.time.LocalDate;

public class VehicleRent implements IDisplay
{
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer noOfDays;
    private Integer noOfKmDriven;
    private Float totalBill;
    /*private vehicle vehicleRented;*/


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    public Integer getNoOfKmDriven() {
        return noOfKmDriven;
    }

    public void setNoOfKmDriven(Integer noOfKmDriven) {
        this.noOfKmDriven = noOfKmDriven;
    }

    public Float getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Float totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public void print() {

    }



}
