public class MyTurtle extends BaseTurtle{

    public void draw() {
        this.retangle(8, 4);
        this.forward(4);
        this.pen.setStrokeWidth(150);
        this.pen.setColor(255, 255, 0);
        this.turn(27);
        this.forward(4.5);
        this.turn(127);
        this.forward(4.5);
        this.turn(54);
        this.forward(4.5);
        this.turn(127);
        this.forward(4.5);
        this.turn(117);
        this.forward(0.5);
        this.turn(90);
        this.pen.setStrokeWidth(150);
        this.pen.setColor(0, 0, 2);
        this.circle();
    }

    private void circle() {
        for (int i = 0; i < 90; i++) {
            this.setDelay(1);
            this.forward(0.1);
            this.turn(-4);
        }
    }


    private void retangle(double size, double size2) {
        this.pen.setStrokeWidth(150);
        this.pen.setColor(0, 255, 0);
        for (int i = 0; i < 2; i++) {
            this.forward(size);
            this.turn(90);
            this.forward(size2);
            this.turn(90);
        }
    }

    private void square(double size) {
        for (int i = 0; i < 4; i++) {
            this.forward(size);
            this.turn(90);
        }
    }

}
