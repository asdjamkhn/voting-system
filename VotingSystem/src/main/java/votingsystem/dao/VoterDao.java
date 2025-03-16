package votingsystem.dao;


import org.springframework.data.jdbc.repository.query.StringBasedJdbcQuery;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import votingsystem.databaseconfig.DatabaseConfig;
import votingsystem.model.Voter;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class VoterDao {

    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();

    public void addVoters(String name, int age, String email, String address, int phone_number, boolean hasvoted, String biography) {

        String sql = "insert into Voter(name, age, email, address, phone_number, hasvoted, biography) values\n" +
                "(?,?,?,?,?,?,?)";

        int result = jdbcTemplate.update(sql, name, age, email, address, phone_number, hasvoted, biography);


        if (result > 0) {
            System.out.println("Voters added successfully");
        } else {
            System.out.println("Voters not added");
        }

    }

    public void updateVoters(String name, int id) {

        String sql = "update voter set name = ? where id = ?";

        int result = jdbcTemplate.update(sql, name, id);

        if (result > 0) {
            System.out.println("Voters updated successfully");
        } else {
            System.out.println("Voters not updated");
        }
    }

    public void updateVoters(String name, int age, String email, String address,
                             int phone_number, int id){

        String sql = "update Voter set name = ?, age = ?, email = ?, address = ?, phone_number = ? where id = ?";

      int result = jdbcTemplate.update(sql,name,age,email,address,phone_number, id);

      if (result>0){
          System.out.println("Voter updated successfull");

      }else {
          System.out.println("Voter not updated");
      }

    }

    public void deleteVoter(int id){

        String sql = "delete from voter where id = ?";

       int result = jdbcTemplate.update(sql,id);

       if(result>0){
           System.out.println("Voter deleted successfully");
       }else{
           System.out.println("Voter not deleted");
       }

    }

    public List<Voter> getVoters(){

        String sql = "select * from voter";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Voter.class));
    }

    public List<Map<String,Object>> getVoterById(int id){

        String sql = "select * from voter where id = ?";

        return jdbcTemplate.queryForList(sql,id);

    }




}
