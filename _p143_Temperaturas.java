import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p143_Temperaturas extends JFrame implements ActionListener {
    JPanel panelTitulo, panelTemperatura, panelOpciones;
    JLabel labelTitulo, labelResultado, labelInput;
    JTextField inputTemperatura;
    JButton btnConvertir;
    JRadioButton radioCelsius, radioFahrenheit;

    public _p143_Temperaturas() {
        super("Convertidor de Temperatura");
        setLayout(new GridLayout(3, 1));

        panelTitulo = new JPanel();
        panelOpciones = new JPanel();
        panelTemperatura = new JPanel();

        labelTitulo = new JLabel("Conversor de Temperatura", JLabel.CENTER);
        panelTitulo.add(labelTitulo);

        ButtonGroup grupoOpciones = new ButtonGroup();
        radioCelsius = new JRadioButton("Celsius");
        radioFahrenheit = new JRadioButton("Fahrenheit");

        grupoOpciones.add(radioCelsius);
        grupoOpciones.add(radioFahrenheit);

        panelOpciones.add(radioCelsius);
        panelOpciones.add(radioFahrenheit);

        inputTemperatura = new JTextField(10);
        labelInput = new JLabel("Temperatura:");
        btnConvertir = new JButton("Convertir");
        labelResultado = new JLabel("", JLabel.CENTER);

        panelTemperatura.add(labelInput);
        panelTemperatura.add(inputTemperatura);
        panelTemperatura.add(btnConvertir);
        panelTemperatura.add(labelResultado);

        btnConvertir.addActionListener(this);

        add(panelTitulo);
        add(panelOpciones);
        add(panelTemperatura);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double temperatura = Double.parseDouble(inputTemperatura.getText());
            if (e.getSource() == btnConvertir) {
                if (radioCelsius.isSelected()) {
                    double resultado = (temperatura - 32) * 5 / 9;
                    labelResultado.setText(temperatura + " grados Fahrenheit son " + String.format("%.2f", resultado) + " grados Celsius.");
                } else if (radioFahrenheit.isSelected()) {
                    double resultado = (temperatura * 9 / 5) + 32;
                    labelResultado.setText(temperatura + " grados Celsius son " + String.format("%.2f", resultado) + " grados Fahrenheit.");
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, elija una escala de temperatura.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException ex) {
            labelResultado.setText("Por favor, ingrese una temperatura válida.");
        }
    }

    public static void main(String[] args) {
        _p143_Temperaturas app = new _p143_Temperaturas();
        app.setBounds(10, 10, 400, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}