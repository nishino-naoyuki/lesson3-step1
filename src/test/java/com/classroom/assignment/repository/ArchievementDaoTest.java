package com.classroom.assignment.repository;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class ArchievementDaoTest {

  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public ArchievementDaoTest(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Test
  public void ngshouldReturnMorningMessage() throws Exception {
    try {
      // select test
      List<Map<String, Object>> resultList =
          jdbcTemplate.queryForList("SELECT id, name, memo FROM ARCHIEVEMENT");
      assertNotEquals(0, resultList.size());
      // insert test
      jdbcTemplate.update("INSERT INTO ARCHIEVEMENT (name, memo) VALUES('test', 'test')");

    } catch (Exception e) {
      fail();
    }
  }
}
