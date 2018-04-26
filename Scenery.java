PVector[] clouds;

void setup() {
  size(664,350);
  
  clouds = new PVector[10];
  for (int i = 0; i < clouds.length; i++) {
    float x = random(0, width);
    float y = random(0, 117);
    clouds[i] = new PVector(x, y);
  }
}
void draw() {
  
noStroke();
  fill(#35FF69);
  rect(0, 0, 664, 350);

noStroke();
  fill(#1982C4);
  rect(0, 0, 664, 234);
  
noStroke();
  fill(#3B9158);
  ellipse(150, 200, 20, 20);

noStroke();
  fill(#3B9158);
  ellipse(170, 200, 20, 20);
  
noStroke();
  fill(#3B9158);
  ellipse(160, 200, 20, 20);
  
noStroke();
  fill(#3B9158);
  ellipse(160, 190, 20, 20);
  
for (int i = 0; i < clouds.length; i++) {
    // move each cloud
    clouds[i].add(1, 0);
    
    // reset if they go too far
    if (clouds[i].x - 75 > width) {
      clouds[i].x = -75;
      clouds[i].y = (int) random(50, 117);
    }
  
noStroke();
  fill(#684626);
  rect(155, 210, 10, 25);

noStroke();
  fill(255);
  ellipse(clouds[i].x, clouds[i].y, 40, 30);
  ellipse(clouds[i].x+10, clouds[i].y+15, 40, 30);
  ellipse(clouds[i].x-10, clouds[i].y+15, 40, 30);
  }
}
