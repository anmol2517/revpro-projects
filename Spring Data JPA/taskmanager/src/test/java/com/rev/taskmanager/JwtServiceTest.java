package com.rev.taskmanager;

import com.rev.taskmanager.service.JwtService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@SpringBootTest
class JwtServiceTest {
    @Autowired
    private JwtService jwtService;

    @Test
    void testJwtFlow() {
        UserDetails user = User.withUsername("rev@cognizant.com").password("rev@cog").authorities("user").build();
        final String token = jwtService.generateToken(user);
        assertNotNull(token);



        assertEquals("rev@cognizant.com", jwtService.extractUsername(token));
        assertTrue(jwtService.isTokenValid(token, user));
    }
}

