package Seminar2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    JButton btnStart = new JButton("Start");
    JButton btnStop = new JButton("Stop");
    JPanel grid = new JPanel();
    Server server;

    ChatWindow() {
        this.server = server;
        grid = new JPanel(new GridLayout(1,2));
        grid.add(btnStart);
        grid.add(btnStop);

        add(grid);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start button pressed");
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Stop button pressed");
            }
        });
    }
}
