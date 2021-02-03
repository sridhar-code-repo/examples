Dependency: 

	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>

If Configurtion is not specified then, By default, username for Spring Security based application is “user” and password will be printed in your console log followed by “Using generated security password: <your-password>” text.

To change the default username and password, extends WebSecurityConfigurerAdapter class and override its userDetailsServiceBean() method.