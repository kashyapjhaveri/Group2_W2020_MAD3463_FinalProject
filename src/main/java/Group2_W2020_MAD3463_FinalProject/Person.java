package Group2_W2020_MAD3463_FinalProject;

import java.time.LocalDate;

abstract public class Person implements IDisplay
{
    private String id;
    private String firstName,lastName;
    private Gender gender;
    private LocalDate birthDate;
    private Integer age;
    private String mobileNumber;
    private String email;
    private String userName;
    private String password;

    final private Byte key=5;

    public Person() {

    }


    public Person(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String email, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.userName = userName;
        this.password = (password);
        calculateAge();
    }
    private void calculateAge()
    {
        this.age=LocalDate.now().getYear()-this.birthDate.getYear();
    }


    private String encryptPassword(String originalPassword)
    {
       char orinalPasswordArray[]=originalPassword.toCharArray();
       for(int i=0;i< originalPassword.length();i++)
       {
           int temp= orinalPasswordArray[i];
           temp+=key;
           orinalPasswordArray[i]=(char)temp;
       }
       return new String(orinalPasswordArray);
    }

    private String decryptPassword(String originalPassword)
    {
        char orinalPasswordArray[]=originalPassword.toCharArray();
        for(int i=0;i< originalPassword.length();i++)
        {
            int temp= orinalPasswordArray[i];
            temp-=key;
            orinalPasswordArray[i]=(char)temp;
        }
        return new String(orinalPasswordArray);
    }

    public String getId(){ return id;}

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getKey() {
        return key;
    }

}
