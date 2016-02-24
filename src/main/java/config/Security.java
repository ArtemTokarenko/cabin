package email.sender.config;

import email.sender.auth.AuthUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
public class Security extends WebSecurityConfigurerAdapter {

    @Autowired
    AuthUserDetailsService authUserDetailsService;

    @Override
    public void configure(WebSecurity web) throws Exception {
        String[] resources = new String[5];
        resources[0] = "/admin/js/**";
        resources[1] = "/admin/css/**";
        resources[2] = "/admin/img/**";
        resources[3] = "/admin/fonts/**";
        resources[4] = "/admin/less/**";
        web.ignoring().antMatchers(resources);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/login").hasRole("ADMIN")
                .antMatchers("/").hasRole("ADMIN")
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login.action")
                .usernameParameter("login")
                .passwordParameter("password")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authUserDetailsService);
    }
}

