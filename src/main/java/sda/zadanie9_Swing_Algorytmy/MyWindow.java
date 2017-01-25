package sda.zadanie9_Swing_Algorytmy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class MyWindow extends JFrame {
    int[] data;
    JTextField jTextField;
    JTextArea textArea;


    public MyWindow() throws HeadlessException {
        setVisible(true);
        setLayout(null);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel();
        jLabel.setText("Wejscie:");
        jLabel.setLocation(0, 0);
        jLabel.setSize(100, 20);
        add(jLabel);

        jTextField = new JTextField();
        jTextField.setLocation(0, 30);
        jTextField.setSize(300, 30);
        add(jTextField);

        JLabel jLabel1 = new JLabel();
        jLabel1.setText("Wyjscie:");
        jLabel1.setLocation(0, 70);
        jLabel1.setSize(100, 20);
        add(jLabel1);

        textArea = new JTextArea();
        textArea.setLocation(0, 100);
        textArea.setSize(300, 50);
        textArea.setText("");
        add(textArea);

        JButton button = new JButton("Sortuj");
        button.setLocation(30, 160);
        button.setSize(100, 20);
        add(button);

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sort();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        MyPanel myPanel = new MyPanel(this);
        myPanel.setSize(100, 100);
        myPanel.setLocation(0, 200);
        myPanel.setBackground(Color.orange);
        add(myPanel);

        repaint();
    }

    void sort(){
        try {
            String inputText = jTextField.getText();
            String[] split = inputText.split(",");
            data = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                data[i] = Integer.parseInt(split[i].trim());
            }
            Arrays.sort(data);

            StringBuilder outputString = new StringBuilder();

            for (int i : data) {
                outputString.append(i + ", ");
            }

            textArea.setText(outputString.toString());
        } catch (Exception e1) {
            textArea.setText("Brak danych do sortowania.");
        }

    }
}
