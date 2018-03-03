interface Bicycle{
  void changeCadence(int newValue);
  void speedUp(int increment);
  void applyBrakes(int decrement);
  void changeGear(int newValue);
}

class ACMEBicycle implements Bicycle{
  private int cadence = 0;
  private int speed = 0;
  private int gear = 1;

  public void changeCadence(int newValue){ cadence = newValue;}
  public void changeGear(int newValue){gear = newValue;}
  public void speedUp(int increment){speed = speed + increment;}
  public void applyBrakes(int decrement){speed = speed - decrement;}

  void printStates(){
    System.out.println("cadence: "+cadence+" speed: "+speed+" gear: "+gear);
  }

  public static void main(String[] args) {
    ACMEBicycle a = new ACMEBicycle();
    a.changeGear(3);
    a.changeCadence(2);
    a.speedUp(222);
    a.applyBrakes(33);
    a.printStates();
  }
}
