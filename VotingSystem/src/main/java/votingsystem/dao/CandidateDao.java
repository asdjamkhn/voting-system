package votingsystem.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import votingsystem.databaseconfig.DatabaseConfig;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class CandidateDao {

    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();

    public void addCandidate(String cand_name, String cand_party, JPEGImageReadParam party_logo) {

        String sql = "insert into candidate (id, cand_name, cand_party, party_logo) values (?,?,?,?)";

        int result = jdbcTemplate.update(sql, cand_name, cand_party, party_logo);

        if (result > 0) {

            System.out.println("Candidate added successfully");
        } else {
            System.out.println("Candidate not added successfully");
        }

    }
}
