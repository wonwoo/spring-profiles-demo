package me.wonwoo.springprofilesdemo;

import org.springframework.test.context.ActiveProfilesResolver;

public class SimpleActiveProfilesResolver implements ActiveProfilesResolver {

  @Override
  public String[] resolve(Class<?> testClass) {
    return new String[] {"test"};
  }
}
