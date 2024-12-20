package ec.pucesm.formu;

import ec.pucesm.l.Cliente;
import javax.swing.*;
import java.awt.*;

public class FrmNuevoCliente extends JDialog {
    public FrmNuevoCliente(FrmListaCliente listaClientes) {
        setTitle("Nuevo Cliente");
        setBounds(100, 100, 300, 500); // Aumenté el tamaño para caber más campos
        setLayout(new GridLayout(7, 2, 10, 10)); // Añadí una fila extra para el teléfono

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNombre.setForeground(Color.BLUE);
        add(lblNombre);

        JTextField txtNombre = new JTextField();
        add(txtNombre);

        JLabel lblCedula = new JLabel("Cédula:");
        lblCedula.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblCedula.setForeground(Color.BLUE);
        add(lblCedula);

        JTextField txtCedula = new JTextField();
        add(txtCedula);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblApellido.setForeground(Color.BLUE);
        add(lblApellido);

        JTextField txtApellido = new JTextField();
        add(txtApellido);

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
        btnGuardar.addActionListener(e -> {
            Cliente cliente = new Cliente(txtCedula.getText(), txtNombre.getText(), txtApellido.getText(), 
                txtDireccion.getText(), txtTelefono.getText(), txtEmail.getText());
            listaClientes.cargarDatosEnTabla(cliente);
            dispose();
        });
        add(btnGuardar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBackground(Color.RED);
        btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
        btnCancelar.addActionListener(e -> dispose());
        add(btnCancelar);
    }
}
