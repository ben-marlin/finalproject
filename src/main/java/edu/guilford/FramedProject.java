package edu.guilford;

import javax.swing.JFrame;

public class FramedProject extends JFrame {

    public FramedProject() {
        setTitle("My Project");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FramedProject();
    }
}
