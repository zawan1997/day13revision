package sg.edu.nus.iss.day13revision;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class Day13revisionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Day13revisionApplication.class, args);

		//if just using server properties, can just use the above line of code
		SpringApplication app = new SpringApplication(Day13revisionApplication.class);
		String port = "8085";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);

		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0);
		}
			
		app.setDefaultProperties(Collections.singletonMap("server.port" ,port));
		app.run(args);
	}

	//ANY EXCEPTION OR BUG WILL BE TRACKED
	@Bean
	public CommonsRequestLoggingFilter log() {
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true);
		logger.setIncludeQueryString(true);
		return logger;
	}
}
