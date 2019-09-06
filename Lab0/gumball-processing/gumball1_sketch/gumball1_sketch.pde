Button[] buttons = new Button[2];
GumballMachine gumballMachine = new GumballMachine(5);

void setup() 
{
  size(800, 800) ;
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  
  // load font
  PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  textFont(font, 32);
  runTest() ;
  this.buttons[0] = new Button(80, height - 90, 200, 60, "Insert Quarter", 0, this.gumballMachine);
  this.buttons[1] = new Button(width - 300, height - 90, 200, 60, "Turn Crank", 1, this.gumballMachine);
  // Only draw once
  //noLoop();
}

public void mousePressed() {
  for (int count=0; count < this.buttons.length; count++) {
    if (this.buttons[count].checkMouse()) {
     this.buttons[count].onClick();
    }   
  }
}

void draw() {
  background(255) ;
  fill(0);  
  textSize(32);  
  textAlign(LEFT, CENTER);
  text("The Gumball Machine", 250, 60);
  textAlign(CENTER, CENTER);
  textSize(24);
  text("Status", width - 200, 400, 150, 50);
  text(this.gumballMachine.state.toString(), width - 200, 450, 150, 150);
  text("Total Gumballs Remaining", width - 200, 100, 150, 150);
  text(Integer.toString(this.gumballMachine.count), width - 200, 250, 150, 50);
  PImage image = loadImage("gumball.jpg");
  image(image, 0, (height-image.height)/2);  
 
  fill(255);
  
  for (int count=0; count < this.buttons.length; count++) {
    this.buttons[count].render();
  }
}

public void runTest() {
  System.out.println(gumballMachine);
  //gumballMachine.insertQuarter();
  //gumballMachine.turnCrank();
  //System.out.println(gumballMachine);
  //gumballMachine.insertQuarter();
  //gumballMachine.turnCrank();
  //gumballMachine.insertQuarter();
  //gumballMachine.turnCrank();
  //System.out.println(gumballMachine);
}
