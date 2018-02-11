package me.wonwoo.springprofilesdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloServiceConfig {

  @Configuration
  @Profile("default")
  static class DefaultHelloConfig {
    @Bean
    HelloService helloService() {
      return new DefaultHelloService();
    }
  }


  @Configuration
  @Profile({"dev", "prod"})
  static class DevHelloConfig {
    @Bean
    HelloService helloService() {
      return new WorldHelloService();
    }
  }
}
