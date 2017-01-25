package sda.zadanie13_sortowanie_kolekcji_klasa_anonimowa_swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class PersonWindow extends JFrame {

    public PersonWindow() throws HeadlessException {
        setVisible(true);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton button = new JButton("Kliknij mnie");
        add(button);

        JTextField jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(200, 50));
        add(jTextField);

        JList<Person> jList = new JList<>();
        add(jList);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jan", "Kowalski", 1980));
        personList.add(new Person("Adam", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Adamski", 1970));
        personList.add(new Person("Lukasz", "Mickiewicz", 1990));
        personList.add(new Person("Piotr", "Mickiewicz", 1975));

        JTextArea jTextArea = new JTextArea();
        add(jTextArea);

        Person[] persons = new Person[personList.size()];
        jList.setListData(personList.toArray(persons));
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    Person person = jList.getSelectedValue();
                    jTextArea.setText(person.toComplexString());
                }
            }
        });

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jTextField.getText().isEmpty()) {
                    jTextField.setText("Cześć");
                } else {
                    jTextField.setText("");
                }
                repaint();
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
        repaint();
    }

    public static void main(String[] args) {
        new PersonWindow();
    }
}
