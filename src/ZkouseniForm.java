import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZkouseniForm extends JFrame {
    private JButton button1;
    private JPanel panelMain;
    private JTextField textField;
    private JTextArea textArea;

    public ZkouseniForm(){
        setContentPane(panelMain);
        setTitle("Zkouseni_6.3_2024");
        setSize(300,300);

        button1.addActionListener(e ->{textArea.append(textField.getText()+"\n");});
    }
}
