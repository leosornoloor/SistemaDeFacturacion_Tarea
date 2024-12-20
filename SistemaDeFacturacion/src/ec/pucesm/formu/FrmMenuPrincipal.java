package ec.pucesm.formu;

import javax.swing.*;
import java.awt.*;

public class FrmMenuPrincipal extends JFrame {
    private JDesktopPane desktopPane;

    public FrmMenuPrincipal() {
        setTitle("Sistema Personalizado");
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuCliente = new JMenu("Cliente");
        menuCliente.setFont(new Font("Arial", Font.BOLD, 14));
        menuBar.add(menuCliente);

        JMenuItem itemCrearCliente = new JMenuItem("Crear Cliente");
        itemCrearCliente.addActionListener(e -> {
            FrmCrearCliente crearCliente = new FrmCrearCliente();
            desktopPane.add(crearCliente);
            crearCliente.setVisible(true);
        });
        menuCliente.add(itemCrearCliente);

        JMenuItem itemListaClientes = new JMenuItem("Lista de Clientes");
        itemListaClientes.addActionListener(e -> {
            FrmListaCliente listaClientes = new FrmListaCliente();
            desktopPane.add(listaClientes);
            listaClientes.setVisible(true);
        });
        menuCliente.add(itemListaClientes);

        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.DARK_GRAY);
        add(desktopPane);
    }
}
