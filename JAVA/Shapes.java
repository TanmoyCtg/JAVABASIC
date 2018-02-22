class Shape{
  void draw(){

  }

}
class Circle extends Shape{
  private int x,y,r;
  Circle (int x, int y, int r){
    this.x = x;
    this.y = y;
    this.r = r;
  }
  @Override
  void draw(){
    System.out.println("Drawing Circle(" + x + ", "+ y + ", " + r + ")");
  }
}
class Rectangle extends Shape{
  private int x, y, w, h;
  Rectangle (int x, int y, int w, int h){
    this.x =x;
    this.y = y;
    this.w = w;
    this.h = h;
  }
  @Override
  void draw(){
    System.out.println("Drawing Rectangle(" + x + ", "+ y + ", " + w + "," +
                         h + ")");
  }
}

class Shapes {
  public static void main(String[] args) {
      Shape[] shapes = { new Circle (10,20,30),new Rectangle(20,30,40,50)};
      for (int i = 0; i < shapes.length; i++){
        shapes[i].draw();
      }
  }
}
