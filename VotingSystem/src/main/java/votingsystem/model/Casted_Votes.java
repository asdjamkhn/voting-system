package votingsystem.model;

public class Casted_Votes {

    private int id;
    private int cast_candidate_id;


    public Casted_Votes(){}

    public Casted_Votes(int cast_candidate_id, int id) {
        this.cast_candidate_id = cast_candidate_id;
        this.id = id;
    }

    public int getCast_candidate_id() {
        return cast_candidate_id;
    }

    public void setCast_candidate_id(int cast_candidate_id) {
        this.cast_candidate_id = cast_candidate_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Casted_Votes{" +
                "cast_candidate_id=" + cast_candidate_id +
                ", id=" + id +
                '}';
    }
}
