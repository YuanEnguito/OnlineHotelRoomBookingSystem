package roomreservation;


public class RRusers {


    private String fname, mname, lname, address, gender, email, bmonth, nationality, username, password;
    private int age, byear, bdate, contact;
   
    RRusers(String fname, String mname, String lname, String address, String gender, int age, String email, String birthmonth, int birthdate, int birthyear, int contact, String nationality, String username, String password)
    {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.bmonth = birthmonth;
        this.bdate = birthdate;
        this.byear = birthyear;
        this.contact = contact;
        this.nationality = nationality;
        this.username = username;
        this.password = password;
    }
   
    public String getusern()
    {
        return username;
    }
   
    public String getpassw()
    {
        return password;
    }
   
    public String getfname()
    {
        return fname;
    }
   
    public String getmname()
    {
        return mname;
    }
   
    public String getlname()
    {
        return lname;
    }
   
    public String getaddress()
    {
        return address;
    }
   
    public String getgender()
    {
        return gender;
    }
   
    public int getage()
    {
        return age;
    }
   
    public String getemail()
    {
        return email;
    }
   
    public String getbmonth()
    {
        return bmonth;
    }
   
    public int getbdate()
    {
        return bdate;
    }
   
    public int getbyear()
    {
        return byear;
    }
   
    public int getcontact()
    {
        return contact;
    }
   
    public String getnationality()
    {
        return nationality;
    }
}
