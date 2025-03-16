package votingsystem.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import votingsystem.databaseconfig.DatabaseConfig;

public class Casted_votesDao {

    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();
}
