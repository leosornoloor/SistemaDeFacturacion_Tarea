package ec.pucesm.formu;

import ec.pucesm.l.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class FrmListaCliente extends JInternalFrame {
    private JTable tblCliente;
    private DefaultTableModel modelo;

    public FrmListaCliente() {
        setTitle("Lista de Clientes");
        setBounds(100, 100, 500, 400);
        setLayout(new BorderLayout());

        modelo = new DefaultTableModel(new Object[][] {}, new String[] {
            "Cédula", "Nombre", "Apellido", "Dirección", "Teléfono", "Email"
        });

        tblCliente = new JTable(modelo);
        tblCliente.setFont(new Font("Arial", Font.PLAIN, 12));
        tblCliente.setBackground(Color.LIGHT_GRAY);

        JScrollPane scrollPane = new JScrollPane(tblCliente);
        add(scrollPane, BorderLayout.CENTER);

        JButton btnAgregar = new JButton("Agregar Cliente");
        btnAgregar.setBackground(Color.CYAN);
        btnAgregar.setFont(new Font("Arial", Font.BOLD, 14));
        btnAgregar.addActionListener(e -> {
            FrmNuevoCliente nuevoCliente = new FrmNuevoCliente(this);
            nuevoCliente.setVisible(true);
        });

        JPanel panel = new JPanel();
        panel.add(btnAgregar);
        add(panel, BorderLayout.SOUTH);
    }

    public void cargarDatosEnTabla(Cliente cliente) {
        modelo.addRow(new Object[] {
            cliente.getCedula(),
            cliente.getNombre(),
            cliente.getApellido(),
            cliente.getDireccion(),
            cliente.getTelefono(),
            cliente.getEmail()
        });
    }
}