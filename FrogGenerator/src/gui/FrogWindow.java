package gui;

import javax.swing.JFrame;

public class FrogWindow {
    private int width;
    private int height;

    public FrogWindow(int width, int height) {
        this.width = width;
        this.height = height;
        setupWindow();
    }

    private void setupWindow() {
        JFrame f = new JFrame("FrogGenerator");
        f.setSize(this.width, this.height);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
