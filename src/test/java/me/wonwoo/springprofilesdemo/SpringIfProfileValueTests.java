package me.wonwoo.springprofilesdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@IfProfileValue(name="test-groups", values={"unit", "integration"})
//@IfProfileValue(name = "java.vendor", value = "Oracle Corporation")
public class SpringIfProfileValueTests {

  @Test
  public void ifTest() {
    assertThat(1).isEqualTo(2);
  }
}
