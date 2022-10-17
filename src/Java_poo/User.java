package Java_poo;

public class User
{
    private String firstName;
    private String lasttName;
    private String eMail;
    private String password;

    public static User init(String _firstName, String _lastName, String _eMail, String _password)
    {
        User u = new User();
        u.firstName = _firstName;
        u.lasttName = _lastName;
        u.eMail = _eMail;
        u.password = _password;

        return u;
    }

    public String getFirstName()
    {
        return firstName;
    }
}
