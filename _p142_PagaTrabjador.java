import javax.swing.*;
import java.awt.event.*;

public class _p142_PagaTrabjador extends JFrame implements ActionListener {
    JLabel lblNombre, lblHoras, lblPaga, lblResultado;
    JTextField txtNombre, txtHoras, txtPaga;
    JButton btnCalcular, btnSalir;

    public _p142_PagaTrabjador() {
        super("Calcular la paga de un trabajador");
        setLayout(null);
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 20, 200, 30);
        add(lblNombre);
        txtNombre = new JTextField();
        txtNombre.setBounds(80, 20, 200, 30);
        add(txtNombre);
        lblHoras = new JLabel("Horas:");
        lblHoras.setBounds(10, 50, 200, 30);
        add(lblHoras);
        txtHoras = new JTextField();
        txtHoras.setBounds(80, 50, 200, 30);
        add(txtHoras);
        lblPaga = new JLabel("Paga por hora:");
        lblPaga.setBounds(10, 80, 200, 30);
        add(lblPaga);
        txtPaga = new JTextField();
        txtPaga.setBounds(100, 80, 180, 30);
        add(txtPaga);
        lblResultado = new JLabel("[Resultado Aquí]");
        lblResultado.setBounds(90, 110, 200, 30);
        add(lblResultado);
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 140, 100, 40);
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 140, 100, 40);
        add(btnSalir);
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public float calcularPaga(float horas, float paga) {
        float tasa = 0.3f;
        float pagabruta = horas * paga;
        float impuesto = pagabruta * tasa;
        return pagabruta - impuesto;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            String nombre = txtNombre.getText();
            float horas = Float.parseFloat(txtHoras.getText());
            float paga = Float.parseFloat(txtPaga.getText());
            float pagaNeta = calcularPaga(horas, paga);
            lblResultado.setText(String.format("Paga neta = %.2f", pagaNeta));
        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public static void main(String[] args) {
        _p142_PagaTrabjador app = new _p142_PagaTrabjador();
        app.setBounds(10, 10, 300, 250);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}