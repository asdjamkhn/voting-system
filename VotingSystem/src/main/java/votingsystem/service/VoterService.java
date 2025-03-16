package votingsystem.service;

import votingsystem.dao.VoterDao;
import votingsystem.model.Voter;

import java.util.List;
import java.util.Map;

public class VoterService {

    VoterDao voterDao = new VoterDao();

    public void addVoters(String name, int age, String email, String address, int phone_number, boolean hasvoted, String biography){

        voterDao.addVoters(name, age, email, address, phone_number, hasvoted, biography);

    }

    public void updateVoters(String name, int id){
        voterDao.updateVoters(name, id);

    }

    public void updateVoters(String name, int age, String email, String address, int phone_number, int id){

       voterDao.updateVoters(name, age, email, address, phone_number, id);
    }

    public void deleteVoter(int id){

        voterDao.deleteVoter(id);

    }
    public List<Voter> getVoters(){

        return voterDao.getVoters();

    }

    public List<Map<String,Object>> getVoterById(int id){

        return voterDao.getVoterById(id);

    }

}
