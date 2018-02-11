package me.wonwoo.springprofilesdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringProfilesTests extends AbstractSpringProfilesTests {

  @Autowired
  private HelloService helloService;

  @Test
  public void profilesTest() {
    assertThat(helloService.hello("wonwoo")).isEqualTo("hello world wonwoo!");
  }
}
