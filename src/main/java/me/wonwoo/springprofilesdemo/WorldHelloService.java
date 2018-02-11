package me.wonwoo.springprofilesdemo;

public class WorldHelloService implements HelloService {
  @Override
  public String hello(String name) {
    return "hello world " + name + "!";
  }
}
