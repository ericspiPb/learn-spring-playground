package me.synology.eric88.learn.spring.playground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.synology.eric88.learn.spring.playground.di.BarKeeperService;

@SpringBootApplication
public class LearnSpringPlaygroundApplication {

	public static void main(String[] args) {
//		SpringApplication springApplication = new SpringApplication(LearnSpringPlaygroundApplication.class);
//		springApplication.setWebApplicationType(WebApplicationType.REACTIVE);
//		springApplication.run(args);
		SpringApplication.run(LearnSpringPlaygroundApplication.class, args);
	}
	
	@Autowired
    public void setBeerService(BarKeeperService beerService) {
        beerService.logBeerName();
    }

}
