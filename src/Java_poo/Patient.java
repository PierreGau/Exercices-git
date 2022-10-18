package Java_poo;

public class Patient
{
    private String firstName;
    private String lastName;

    private int age;
    private double height;//en mètres
    private double weight;//en kg

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Patient(String firstName, String lastName,int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public double calculateImc()
    {
        return weight/(Math.pow(height,2));
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()
    {
        return String.format(("Prenom : %s\nNom : %s\nAge : %d\nTaille : %.2f\nPoid : %.2f"),firstName, lastName, age, height,weight);
    }
}
