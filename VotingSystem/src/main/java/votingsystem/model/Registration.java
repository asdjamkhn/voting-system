package votingsystem.model;

public class Registration {

    private int id;
    private String registration_date;
    private int registered_voter_id;

    public Registration(){}

    public Registration(int id, int registered_voter_id, String registration_date) {
        this.id = id;
        this.registered_voter_id = registered_voter_id;
        this.registration_date = registration_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegistered_voter_id() {
        return registered_voter_id;
    }

    public void setRegistered_voter_id(int registered_voter_id) {
        this.registered_voter_id = registered_voter_id;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", registration_date='" + registration_date + '\'' +
                ", registered_voter_id=" + registered_voter_id +
                '}';
    }
}
