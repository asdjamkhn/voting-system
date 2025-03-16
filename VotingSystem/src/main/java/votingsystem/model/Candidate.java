package votingsystem.model;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Candidate {

    private int cand_id;
    private String cand_name;
    private String cand_party;
    private String party_logo;

    public Candidate(){}

    public Candidate(int cand_id, String cand_name, String cand_party, String party_logo) {
        this.cand_id = cand_id;
        this.cand_name = cand_name;
        this.cand_party = cand_party;
        this.party_logo = party_logo;
    }

    public int getCand_id() {
        return cand_id;
    }

    public void setCand_id(int cand_id) {
        this.cand_id = cand_id;
    }

    public String getCand_name() {
        return cand_name;
    }

    public void setCand_name(String cand_name) {
        this.cand_name = cand_name;
    }

    public String getCand_party() {
        return cand_party;
    }

    public void setCand_party(String cand_party) {
        this.cand_party = cand_party;
    }

    public String getParty_logo() {
        return party_logo;
    }

    public void setParty_logo(String party_logo) {
        this.party_logo = party_logo;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "cand_id=" + cand_id +
                ", cand_name='" + cand_name + '\'' +
                ", cand_party='" + cand_party + '\'' +
                ", party_logo=" + party_logo +
                '}';
    }
}
