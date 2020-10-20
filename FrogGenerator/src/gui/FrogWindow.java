package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrogWindow {
    private int width;
    private int height;

    private JFrame frame;
    private Container pane;
    private JLabel title;
    private JButton generateButton;
    private JTextArea frogArea;

    private String frogAscii;

    public FrogWindow(int width, int height) {
        this.width = width;
        this.height = height;

        frogAscii = "\n" +
                "    _    _\n" +
                "   (o)--(o)\n" +
                "  /.______.\\\n" +
                "  \\________/\n" +
                " ./        \\.\n" +
                "( .        , )\n" +
                " \\ \\_\\\\//_/ /\n" +
                "  ~~  ~~  ~~";

        // Setup the JFrame and JPanel
        frame = new JFrame("FrogGenerator");
        frame.setSize(this.width, this.height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane = frame.getContentPane();

        pane.setLayout(null);
        pane.setBackground(Color.DARK_GRAY);

        // Add content
        title = new JLabel("Frog Generator");
        title.setFont(new Font("Verdana", Font.ITALIC, 18));
        title.setBounds((width/2) - 150/2, 5, 150, 30);
        title.setForeground(new Color(21, 117, 1));
        pane.add(title);

        frogArea = new JTextArea("");
        frogArea.setFont(new Font("MONOSPACED", Font.PLAIN, 18));
        frogArea.setBounds(15, 45, 470, 355);
        pane.add(frogArea);

        generateButton = new JButton("Generate Frog");
        generateButton.setBounds((width/2 - 200/2), (height - 25*3), 200, 25);
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                genFrog();
            }
        });
        pane.add(generateButton);

        frame.setVisible(true);
    }

    private void genFrog() {
        this.frogArea.setText(this.frogAscii);
    }
}
