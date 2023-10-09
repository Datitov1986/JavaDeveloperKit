package Lecture2.circles;

import Lecture2.common.Intreractable;
import Lecture2.common.MainCanvas;

import java.awt.*;

public class Background implements Intreractable {
    private float time;
    private static final float AMPLITUDE = 255f / 2f;
    private Color color;


    @Override
    public void update (MainCanvas canvas, float deltaTime) {
        time += deltaTime;
        int red = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 2f));
        int green = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 3f));
        int blue = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time));
        color = new Color(red,green,blue);
    }

    @Override
    public void render(MainCanvas canvas, Graphics g) {
        canvas.setBackground(color);
    }

}
