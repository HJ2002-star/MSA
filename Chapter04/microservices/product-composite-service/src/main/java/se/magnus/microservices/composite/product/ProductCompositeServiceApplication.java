package se.magnus.microservices.composite.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.json.JacksonJsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.json.JsonMapper;

@SpringBootApplication
@ComponentScan("se.magnus")
public class ProductCompositeServiceApplication {

  // [Boot4] RestTemplate uses Boot's Jackson 3 mapper (settings from application.yml)
  @Bean
  RestTemplate restTemplate(JsonMapper mapper) {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.getMessageConverters().removeIf(c -> c instanceof JacksonJsonHttpMessageConverter);
    restTemplate.getMessageConverters().add(0, new JacksonJsonHttpMessageConverter(mapper));
    return restTemplate;
  }

  public static void main(String[] args) {
    SpringApplication.run(ProductCompositeServiceApplication.class, args);
  }
}
