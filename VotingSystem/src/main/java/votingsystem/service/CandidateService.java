package votingsystem.service;

import votingsystem.dao.CandidateDao;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class CandidateService {

    private CandidateDao candidateDao = new CandidateDao();

    public void addCandidate(String cand_name, String cand_party, JPEGImageReadParam party_logo){

        candidateDao.addCandidate(cand_name,cand_party,party_logo);

    }
}
