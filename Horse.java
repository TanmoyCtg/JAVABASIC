class Horse extends Animal{
  @Override
  public void sound(){
    System.out.println("Neigh");
  }
  public static void main(String[] args){
    Animal horse = new Horse();
    horse.sound();
  }

}
