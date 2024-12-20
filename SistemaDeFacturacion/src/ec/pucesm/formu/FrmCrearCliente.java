package ec.pucesm.formu;

import javax.swing.*;
import java.awt.*;

public class FrmCrearCliente extends JInternalFrame {
    public FrmCrearCliente() {
        setTitle("Crear Cliente");
        setBounds(100, 100, 300, 500); // Aumenté el tamaño para caber más campos
        setLayout(new GridLayout(8, 2, 10, 10)); // Añadí una fila extra para el teléfono

        // Campos de texto y etiquetas
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 14)); // Fuente cambiada
        lblNombre.setForeground(Color.BLUE);
        add(lblNombre);

        JTextField txtNombre = new JTextField();
        add(txtNombre);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblApellido.setForeground(Color.BLUE);
        add(lblApellido);

        JTextField txtApellido = new JTextField();
        add(txtApellido);

        JLabel lblCedula = new JLabel("Cédula:");
        lblCedula.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblCedula.setForeground(Color.BLUE);
        add(lblCedula);

        JTextField txtCedula = new JTextField();
        add(txtCedula);

        JLabel lblDireccion = new JLabel("Dirección:");
        lblDireccion.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblDireccion.setForeground(Color.BLUE);
        add(lblDireccion);

        JTextField txtDireccion = new JTextField();
        add(txtDireccion);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblTelefono.setForeground(Color.BLUE);
        add(lblTelefono);

        JTextField txtTelefono = new JTextField();
        add(txtTelefono);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblEmail.setForeground(Color.BLUE);
        add(lblEmail);

        JTextField txtEmail = new JTextField();
        add(txtEmail);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBackground(Color.GREEN);
        btnGuardar.setFont(new Font("Arial", Font.BOLD, 14));
        btnGuardar.addActionListener(e -> JOptionPane.showMessageDialog(null, "Cliente guardado exitosamente"));
        add(btnGuardar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBackground(Color.RED);
        btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
        btnCancelar.addActionListener(e -> dispose());
        add(btnCancelar);
    }
}
