abstract class Bike{
  Bike(){
    System.out.println("Bike is running");
  }
  abstract void run();
  abstract void color();
}

class Honda extends Bike{
  void run(){
    System.out.println("Honda is running");
  }
  void color(){
    System.out.println("red");
  }
}
class TestAbstraction{
public static void main(String[] args) {
  // Bike b = new Bike()  // abstract class can not be initiated throw a error.
  Bike h = new Honda();
  h.run();
  h.color();

}}
