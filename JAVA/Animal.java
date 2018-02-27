public class Animal{
  // using encapsulation
  private String Name;
  private String color;
  private int legs;

  public Animal(String Name,String color,int legs){
    this.Name = Name;
    this.color = color;
    this.legs = legs;
  }
  public void setName(String Name){
    this.Name = Name;
  }
  public void isRun(){

  }
  public void isSleep (){

  }
  public void sound(){

  }
  public boolean isTalk(){
    return true;
  }

  public String getName(){
    return Name;
  }
  public String getColor(){
    return color;
  }
  public int getLegs(){
    return legs;
  }
  // inheritance
  class Horse extends Animal{
    private String name;
    private String color;
    private int legs;

    public Horse(String name,String color,int legs){
      super(name,color,legs); // super keyword implicitly called base class constructor
      this.name = name;
      this.color = color;
      this.legs = legs;
    }



    public void sound(){
      System.out.println("Huur!!");
    }
    public void isRun(){
      System.out.println("Running fast!!");
    }
  }

  public static void main(String[] args) {
    Animal cow = new Animal("IndianRed","Red",4);
    Animal bird = new Animal("Moyna","black",2);
    Animal horse = new Animal("j","s",2); // can't access base class constructor
    horse.setName("jalal");
    System.out.println(cow.getLegs());
    System.out.println(cow.getName());
    System.out.println(cow.getColor());
    System.out.println(horse.getLegs());
    System.out.println(horse.getName());
    System.out.println(horse.getColor());
    horse.sound();
    horse.isRun();

  }

}
