package Group2_W2020_MAD3463_FinalProject;

import java.time.LocalDate;

abstract public class Person implements IDisplay
{
    private Integer id;
    private String firstName,lastName;
    private Gender gender;
    private LocalDate birthDate;
    private Integer age;
    private String mobileNumber;
    private String email;
    private String userName;
    private String password;

    final private Byte key=5;

    public Person(Integer id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String email, String userName, String password) {
    }

    public Person(Integer id, String firstName, String lastName, Gender gender, LocalDate birthDate, Integer age, String mobileNumber, String email, String userName, String password) {
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

    public Person() {

    }

    private void calculateAge() {
    }
}
