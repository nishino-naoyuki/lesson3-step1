package com.classroom.assignment.controller.view;

import com.classroom.assignment.controller.PortalController;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class PortalControllerTest {

  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private PortalController controller;

  @Test
  void contextLoads() {
    // given
    // when
    // then
    assertThat(controller).isNotNull();
  }

  @Test
  public void shouldReturnStatusOk() throws Exception {
    // given
    // when
    // then
    this.mockMvc.perform(get("/")).andDo(print())
        .andExpect(status().isOk());
  }
}
