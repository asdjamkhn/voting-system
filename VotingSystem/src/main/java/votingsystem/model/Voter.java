package votingsystem.model;

public class Voter {

    private int id;
    private String name;
    private int age;
    private String email;
    private String address;
    private int phone_number;
    private boolean hasvoted;
    private String biography;

    public Voter(){}

    public Voter(String address, int age, String biography, String email, boolean hasvoted, int id, String name, int phone_number) {
        this.address = address;
        this.age = age;
        this.biography = biography;
        this.email = email;
        this.hasvoted = hasvoted;
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getHasvoted() {
        return hasvoted;
    }

    public void setHasvoted(boolean hasvoted) {
        this.hasvoted = hasvoted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phone_number = phoneNumber;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phone_number +
                ", hasvoted=" + hasvoted +
                ", biography='" + biography + '\'' +
                '}';
    }
}
