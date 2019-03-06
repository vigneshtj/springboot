package io.vignesh.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* Spring boot runs as standalone application
 * it does not need to mention server or servlet
 */

//annotate to tell this is a spring boot application
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}

}
