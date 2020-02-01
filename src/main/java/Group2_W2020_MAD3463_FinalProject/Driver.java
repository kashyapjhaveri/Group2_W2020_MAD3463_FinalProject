package Group2_W2020_MAD3463_FinalProject;

import java.time.LocalDate;

public class Driver extends Person
{
    private String drivingLicenceNumber;
    private Boolean isHistoryCleared;
    private Double salary;

    public Driver()
    {
    }

    public Driver(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String email, String userName, String password, String drivingLicenceNumber, Boolean isHistoryCleared, Double salary) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, email, userName, password);
        this.drivingLicenceNumber = drivingLicenceNumber;
        this.isHistoryCleared = isHistoryCleared;
        this.salary = salary;
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
        System.out.println(getId()+""+getFirstName()+""+getLastName()+""+getBirthDate()+""+getMobileNumber()+""+getEmail()+""+getUserName()+""+getPassword()+""+getDrivingLicenceNumber()+""+getIsHistoryCleared()+""+getSalary());

    }
}
