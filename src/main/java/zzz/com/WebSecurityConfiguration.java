package zzz.com;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {

		// HTTP Basic authentication
		http.httpBasic().and().
		authorizeRequests().
		antMatchers(HttpMethod.GET, "/").
		hasRole("").
		antMatchers(HttpMethod.POST, "/").
		hasRole("ADMIN").and().
		csrf().disable().formLogin().disable();

	}
}
