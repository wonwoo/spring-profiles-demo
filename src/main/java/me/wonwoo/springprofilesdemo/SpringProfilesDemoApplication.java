package me.wonwoo.springprofilesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringProfilesDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringProfilesDemoApplication.class, args);
  }
}
