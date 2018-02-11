package me.wonwoo.springprofilesdemo;

public class DefaultHelloService implements HelloService {

  @Override
  public String hello(String name) {
    return "hello " + name;
  }
}
