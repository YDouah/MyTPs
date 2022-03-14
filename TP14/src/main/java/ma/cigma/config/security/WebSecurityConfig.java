package ma.cigma.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private PasswordEncoder passwordEncoder;


    // Authentication
    @Override
    public void configure(AuthenticationManagerBuilder authentication) throws Exception {
        authentication.inMemoryAuthentication().passwordEncoder(passwordEncoder)
                .withUser("Student").password(passwordEncoder.encode("azerty")).roles ("USER")
                .and()
                .withUser("Teacher").password(passwordEncoder.encode("qwerty")).roles("ADMIN");
    }


    // Authorization



}
