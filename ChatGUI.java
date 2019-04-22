
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatGUI extends JFrame {
    JTextArea txtarea;
    JTextField txtfield;

    public ChatGUI() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Чат");
        setSize(500, 500);
        JButton send = new JButton("Отправить");
        txtarea = new JTextArea();
        txtfield = new JTextField(20);
        JPanel panel = new JPanel();
        panel.add(txtfield);
        panel.add(send);
        getContentPane().add(BorderLayout.CENTER, txtarea);
        getContentPane().add(BorderLayout.SOUTH, panel);
        setVisible(true);
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action();
            }
        });
        txtfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action();
            }
        });

    }

    private void action() {
        txtarea.append(txtfield.getText());
        txtarea.append("\r\n");
        txtfield.setText("");
    }
}

