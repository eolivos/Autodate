package autodate;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ventana_Usuario extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu menu1, menu2;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5;
    private JTextField textfield_usuario, textfield_contraseña;
    private JLabel label_bienvenida, label_usuario, label_contraseña, label_imagen;
    private JButton boton_verificación;
    String usuario="1", contraseña="2";
    
    public Ventana_Usuario(){
        
        setLayout(null);
        setTitle("Autodate");
        getContentPane().setBackground(new Color(174,214,241));
        setIconImage(new ImageIcon(getClass().getResource("images/carro.png")).getImage());
        
        label_imagen = new JLabel();
        label_imagen.setIcon(new ImageIcon(getClass().getResource("images/logo.png")));
        label_imagen.setBounds(150,0,420,200);
        add(label_imagen);        
        
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);

        menuitem1 = new JMenuItem("Blanco");
        menuitem1.addActionListener(this);
        menu1.add(menuitem1);

        menuitem2 = new JMenuItem("Azul");
        menuitem2.addActionListener(this);
        menu1.add(menuitem2);

        menuitem3 = new JMenuItem("Gris");
        menuitem3.addActionListener(this);
        menu1.add(menuitem3);
        
        menuitem4 = new JMenuItem("Volver al inicio");
        menuitem4.addActionListener(this);
        menu1.add(menuitem4);
        
        menuitem5 = new JMenuItem("Salir");
        menuitem5.addActionListener(this);
        menu1.add(menuitem5);
        
        label_bienvenida = new JLabel("Buen dia operador. " + "\n\n" + "Por favor ingrese su usuario y contraseña.");
        label_bienvenida.setBounds(200,140,500,200);
        add(label_bienvenida);
        label_usuario = new JLabel("Usuario:");
        label_usuario.setBounds(250,280,100,30);
        add(label_usuario);
        label_contraseña = new JLabel("Contraseña:");
        label_contraseña.setBounds(250,310,100,30);
        add(label_contraseña);
        
        textfield_usuario = new JTextField();
        textfield_usuario.setBounds(370,287,150,20);
        add(textfield_usuario);
        textfield_contraseña = new JTextField();
        textfield_contraseña.setBounds(370,317,150,20);
        add(textfield_contraseña);
        
        boton_verificación = new JButton("Verificar credenciales");
        boton_verificación.setBounds(250,390,150,30);
        add(boton_verificación);
        boton_verificación.addActionListener(this);
 }

// Accion de los objetos
 public void actionPerformed(ActionEvent e){
     
    Container fondo = this.getContentPane();
//barra de herramientas
    if(e.getSource() == menuitem1){
       fondo.setBackground(new Color(254,254,254));
    }
    if(e.getSource() == menuitem2){
       fondo.setBackground(new Color(174,214,241));
    }
    if(e.getSource() == menuitem3){
       fondo.setBackground(new Color(214,219,223));
    }
    if(e.getSource() == menuitem4){
        Ventana_Usuario Ventana0 = new Ventana_Usuario();
        Ventana0.setBounds(0,0,800,500);
        Ventana0.setVisible(true);
        Ventana0.setResizable(false);
        Ventana0.setLocationRelativeTo(null);
        this.setVisible(false);
    }
    if(e.getSource() == menuitem5){
        System.exit(0);
    }
    //boton de verificación
    if(e.getSource() == boton_verificación){
        String u_in = textfield_usuario.getText();
        String c_in = textfield_contraseña.getText();
        if (u_in == usuario && c_in == contraseña){        
        Ventana_Registro2 VentanaRegistro2 = new Ventana_Registro2();
        VentanaRegistro2.setBounds(0,0,800,500);
        VentanaRegistro2.setVisible(true);
        VentanaRegistro2.setResizable(false);
        VentanaRegistro2.setLocationRelativeTo(null);
        this.setVisible(false);
        } else {
        Ventana_MenuPrincipal VentanaMenuPrincipal = new Ventana_MenuPrincipal();
        VentanaMenuPrincipal.setBounds(0,0,800,500);
        VentanaMenuPrincipal.setVisible(true);
        VentanaMenuPrincipal.setResizable(false);
        VentanaMenuPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
        }
    }
 } 
 

 public static void main(String args[]){
    
    Ventana_Usuario VentanaUsuario = new Ventana_Usuario();
    VentanaUsuario.setBounds(0,0,800,500);
    VentanaUsuario.setVisible(true);
    VentanaUsuario.setResizable(false);
    VentanaUsuario.setLocationRelativeTo(null);
    }
}