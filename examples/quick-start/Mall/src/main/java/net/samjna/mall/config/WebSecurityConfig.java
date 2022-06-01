package net.samjna.mall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 配置用户登录的方法
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("*").permitAll()   // 允许所有用户直接访问所有路径
				.and()
				.csrf().disable();
	}
	
	// 设置访问静态文件时无需权限
	@Override
	public void configure(WebSecurity web) throws Exception {
	  web
	    .debug(false)
	    .ignoring()
	    .antMatchers("/images/**", "/js/**", "/css/**");
	}
}
