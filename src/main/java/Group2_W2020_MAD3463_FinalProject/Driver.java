package Group2_W2020_MAD3463_FinalProject;

public class Driver extends Person
{
    private String drivingLicenceNumber;
    private Boolean isHistoryCleared;
    private Double salary;

    public Driver()
    {
        super();
    }
    public String getDrivingLicenceNumber()
    {
        return drivingLicenceNumber;
    }

    public Boolean getIsHistoryCleared()
    {
        return isHistoryCleared;
    }
    public void setIsHistoryCleared(Boolean historyCleared)
    {
        isHistoryCleared = historyCleared;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double Salary)
    {
        this.salary=salary;
    }

    @Override
    public void print()
    {

    }
}
