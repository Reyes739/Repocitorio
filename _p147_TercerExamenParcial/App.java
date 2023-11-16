package _p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {
    ArrayList<Jugador> jugadores;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblDescripcion, lblSalario;
    JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;

    public App() {
        super("Control de Jugadores");
        jugadores = new ArrayList<>(); // Inicialización de la lista
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        smnAbrir = new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);
        smnSalir = new JMenuItem("Salir");
        smnSalir.addActionListener(this);
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        smnAcercade = new JMenuItem("Acerca de ..");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);
        jdlAcercaDe = new JDialog(this, "Acerca de ..");
        jdlAcercaDe.setSize(300, 250);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Control de Jugadores<br>Tu Nombre y Apellido</html>", JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);
        setLayout(new GridLayout(3, 1));
        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(
                new String[] { "Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario" });
        table.setModel(modelo);
        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });
        pnlDatos = new JPanel();
        add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(6, 2, 0, 0));
        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblSexo = new JLabel("Sexo");
        lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);
        lblEstadoCivil = new JLabel("Estado Civil");
        lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEstadoCivil = new JTextField();
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);
        lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        lblSalario = new JLabel("Salario:");
        lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);
        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    }

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        while (dm.getRowCount() > 0)
            dm.removeRow(0);
        Object[] obj = new Object[6];
        for (int i = 0; i < jugadores.size(); i++) {
            obj[0] = jugadores.get(i).getNombre();
            obj[1] = jugadores.get(i).getEdad();
            obj[2] = jugadores.get(i).getSexo();
            obj[3] = jugadores.get(i).getEstadoCivil();
            obj[4] = jugadores.get(i).getDescripcion();
            obj[5] = jugadores.get(i).getSalario();
            modelo.addRow(obj);
        }
    }

    public void mostrarDatos(int ren) {
        txtNombre.setText(jugadores.get(ren).getNombre());
        txtEdad.setText(Integer.toString(jugadores.get(ren).getEdad()));
        txtSexo.setText(String.valueOf(jugadores.get(ren).getSexo()));
        txtEstadoCivil.setText(jugadores.get(ren).getEstadoCivil());
        txtDescripcion.setText(jugadores.get(ren).getDescripcion());
        txtSalario.setText(Double.toString(jugadores.get(ren).getSalario()));
    }

    public void activarCampos(boolean actdes) {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)
                cp.setEnabled(actdes);
    }

    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)
                ((JTextField) cp).setText("");
    }

    public void guardarCampos() {
        Jugador jugador = new Jugador();
        jugador.setNombre(txtNombre.getText());
        jugador.setEdad(Integer.parseInt(txtEdad.getText()));
        jugador.setSexo(txtSexo.getText().charAt(0));
        jugador.setEstadoCivil(txtEstadoCivil.getText());
        jugador.setDescripcion(txtDescripcion.getText());
        jugador.setSalario(Double.parseDouble(txtSalario.getText()));
        jugadores.add(jugador);
        cargarDatos();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[] { "dat" }));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                try {
                    jugadores = Util.desSerializarDatos();
                    cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[] { "dat" }));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            if (res == JFileChooser.APPROVE_OPTION) {
                File archivo = fchArchivo.getSelectedFile();
                if (!archivo.getName().endsWith(".dat")) {
                    JOptionPane.showMessageDialog(this, "Seleccione un archivo con extensión .dat", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        Util.serializarDatos(jugadores);
                        JOptionPane.showMessageDialog(this, "Datos Grabados en: " + archivo.getName(), "Correcto",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e2) {
                        JOptionPane.showMessageDialog(this,
                                "Error de entrada/salida al procesar el archivo: " + e2.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                        e2.printStackTrace();
                    } catch (Exception e2) {
                        JOptionPane.showMessageDialog(this, "Error al procesar el archivo: " + e2.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                        e2.printStackTrace();
                    }
                }
            }
        } else if (e.getSource() == btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if (e.getSource() == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            App app = new App();
            app.setBounds(10, 10, 800, 400);
            app.setLocationRelativeTo(null);
            app.setDefaultCloseOperation(EXIT_ON_CLOSE);


            app.cargarDatos();
            app.activarCampos(false);
            app.setVisible(true);
        });
    }
}
