package votingsystem.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import votingsystem.databaseconfig.DatabaseConfig;

public class Login_LogoutDao {

    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();
}
