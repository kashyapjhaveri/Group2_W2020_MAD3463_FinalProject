package Group2_W2020_MAD3463_FinalProject;

import java.time.LocalDate;

public class Customer extends Person
{
    private String houseNumber;
    private String streetName;
    private String city;
    private String province;

    public Customer(Integer id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber,String email,String userName, String password, String houseNumber,String streetName,String city,String province)
    {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, email, userName, password);
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
    }
    @Override
    public void print()
    {
        System.out.println(getId()+""+getFirstName()+""+getLastName()+""+getBirthDate()""+getMobileNumber()+""+getEmail()+""+getUserName()+""+getPassword()+""+this.houseNumber+""+this.streetName+""+this.city+""+this.province);
    }



}



