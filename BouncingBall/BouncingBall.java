/******************************************************************************
 *  Compilation:  javac-introcs BouncingBall.java
 *  Execution:    java-introcs BouncingBall
 *  Dependencies: StdDraw.java
 *
 *  Implementation of a 2-d bouncing ball in the box from (-1, -1) to (1, 1).
 *
 *  % java BouncingBall
 *
 ******************************************************************************/


//using gravity (edited)
public class BouncingBall {
    public static void main(String[] args) {

        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();

        // initial values
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.05;
        double acceleration = -9.8 / 1000;   // velocity
        double radius = 0.05;              // radius

        // main animation loop
        while (true)  {

            // bounce off wall according to law of elastic collision
            if (ry < -1) {ry = -1; vy = vy * -.9;}
            if (Math.abs(rx) > 1) {rx = Math.abs(rx) / rx; vx = vx * -1;}

            // update position
            rx = rx + vx;
            ry = ry + vy;
            vy += acceleration;

            // clear the background
            StdDraw.clear(StdDraw.LIGHT_GRAY);

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);

            // copy offscreen buffer to onscreen
            StdDraw.show();

            // pause for 20 ms
            StdDraw.pause(20);

        }
    }
}
