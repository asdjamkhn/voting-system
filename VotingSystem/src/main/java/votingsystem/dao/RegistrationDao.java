package votingsystem.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import votingsystem.databaseconfig.DatabaseConfig;

public class RegistrationDao {

    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();




}
