package com.rev.taskmanager;

import com.rev.taskmanager.Model.User;
import com.rev.taskmanager.service.AuthenticationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class AuthControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private AuthenticationService authService;

    @Test
    void testLoginSuccess() throws Exception
    {
        User mockUser = new User();



        mockUser.setEmail("rev@cognizant.com");

        when(authService.authenticate(any())).thenReturn(mockUser);

        mockMvc.perform(post("/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"email\":\"rev@cognizant.com\", \"password\":\"rev@cog\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.token").exists());
    }


}
