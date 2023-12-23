import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterSuhu extends JFrame{
    private JPanel mainPanel;
    private JButton button1;
    private JTextField txtcelciusTextField;
    private JTextField txtfahrenheitTextField;
    private JTextField txtreamurTextField;
    private JTextField txtkelvinTextField;
    float celcius,fahrenheit,reamur,kelvin;
    public ConverterSuhu(String tittle) {
        super(tittle);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                celcius = Float.parseFloat(txtcelciusTextField.getText());
                fahrenheit = (float) ((1.8 * celcius) + 32);
                reamur = (float) (0.8f * celcius);
                kelvin = (float) (celcius + 273.15);

                txtfahrenheitTextField.setText("" + fahrenheit);
                txtreamurTextField.setText("" + reamur);
                txtkelvinTextField.setText("" + kelvin);

            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new ConverterSuhu(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
