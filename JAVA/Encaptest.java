public class Encaptest{
  private String name;
  private String idnum;
  private int salary;

  public String getName(){
    return name;
  }
  public String getIdNum(){
    return idnum;
  }
  public int getSalary(){
    return salary;
  }
  public void setName(String newName){
    name = newName;
  }
  public void setIdNum(String idNum){
    idnum = idNum;

  }
  public void setSalary(int Salary){
    salary = Salary;
  }
  public static void main(String[] args) {
    Encaptest encap = new Encaptest();
    encap.setName("Joy");
    encap.setIdNum("14-223232-2");
    encap.setSalary(2022202020);
    System.out.println("My name is ");
    System.out.println(encap.getName());
    System.out.println("My id number is ");
    System.out.println(encap.getIdNum());
    System.out.println("Salaary ");
    System.out.println(encap.getSalary());
  }
}
