public class Animal{
  private String Name;
  private String color;
  private int legs;

  public Animal(String Name,String color,int legs){
    this.Name = Name;
    this.color = color;
    this.legs = legs;
  }
  public void isRun(){

  }
  public void isSleep (){

  }
  public void sound(){

  }
  public void setName(String Name){
    this.Name = Name;
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setLegs(int legs){
    this.legs = legs;
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

  public static void main(String[] args) {
    Animal cow = new Animal("IndianRed","Red",4);
    System.out.println(cow.getLegs());
    System.out.println(cow.getName());
    System.out.println(cow.getColor());
  }

}
