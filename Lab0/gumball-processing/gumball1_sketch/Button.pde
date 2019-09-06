public class Button {
  int width;
  int height;
  int x;
  int y;
  String text;
  GumballMachine machine;
  int btnType;
  
  public Button(int x, int y, int w, int h, String text, int type, GumballMachine machine) {
    this.x = x;
    this.y = y;
    this.width = w;
    this.height = h;
    this.text = text;
    this.machine = machine;
    this.btnType = type;
  }
  
  public void render() {
    this.isHover();
    stroke(0);
    rect(this.x, this.y, this.width, this.height);
    fill(0);
    textSize(24);  
    textAlign(CENTER, CENTER);
    text(this.text, this.x + this.width / 2, this.y + this.height / 2);
  }   
  
  public boolean checkMouse() {
    return (mouseX > this.x) && (mouseX < this.x+this.width) &&
      (mouseY > this.y) && (mouseY < this.y+this.height);
  }

  public void isHover() {
    if (checkMouse()) {
      if(mousePressed == true)
        fill(0);
      else
        fill(120);
      } else {
        fill(255);
      }
  }
  
  public void onClick() {
    if (this.btnType == 0) 
      this.machine.insertQuarter();
    else
      this.machine.turnCrank();
  }
  

}
