package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() throws Exception {
		return "Hello Openshift World. " + InetAddress.getLocalHost().getHostName();
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
