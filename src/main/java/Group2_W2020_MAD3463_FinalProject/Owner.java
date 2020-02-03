package Group2_W2020_MAD3463_FinalProject;

import Group2_W2020_MAD3463_FinalProject.Enum.Gender;

import java.time.LocalDate;
import java.util.HashMap;

public class Owner extends Person {
    private String companyTitle;
    private String businessNumber;
    private String website;
    private HashMap<String, Vehicle> listOfVehcialOwned;

    public Owner(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String email, String userName, String password, String companyTitle, String businessNumber, String website) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, email, userName, password);
        this.companyTitle = companyTitle;
        this.businessNumber = businessNumber;
        this.website = website;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    public HashMap<String, Vehicle> getListOfVehcialOwned() {
        return listOfVehcialOwned;
    }

    public void setListOfVehcialOwned(HashMap<String, Vehicle> listOfVehcialOwned) {
        this.listOfVehcialOwned = listOfVehcialOwned;
    }

    public void print()
    {
        System.out.println(getId()+" "+getFirstName()+" "+getLastName()+" "+getBirthDate()+" "+getMobileNumber()+" "+getEmail()+" "+getUserName()+" "+getPassword()+" "+getCompanyTitle()+" "+getBusinessNumber()+" "+getWebsite());

    }
}
