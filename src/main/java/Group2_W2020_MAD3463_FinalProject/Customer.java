package Group2_W2020_MAD3463_FinalProject;

import java.time.LocalDate;

public class Customer extends Person
{
    private String address;
    private String city;


    public Customer(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber,String email,String userName, String password, String address,String city)
    {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, email, userName, password);
        this.address=address;
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void print()
    {
        System.out.println(getId()+""+getFirstName()+""+getLastName()+""+getBirthDate()+""+getMobileNumber()+""+getEmail()+""+getUserName()+""+getPassword()+""+getAddress()+""+getCity());
    }

}



