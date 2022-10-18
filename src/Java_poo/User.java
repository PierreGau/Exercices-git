package Java_poo;

public class User
{
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private boolean isMaried;

    public User()
    {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.password = "";
        this.isMaried = false;
        this.age = 0;
        this.weight = 0;
    }

    public User(String firstName, String lastName, String email, String password, boolean isMaried, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isMaried = isMaried;
        this.age = age;
        this.weight = weight;
    }

    public boolean isMaried() {
        return isMaried;
    }

    public void setMaried(boolean maried) {
        isMaried = maried;
    }

    private int age;

    private double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
