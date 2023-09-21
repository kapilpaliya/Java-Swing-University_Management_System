
// Import Class & Packages.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
    // Variable Declaration.
    JLabel name,password, image, heading; JButton Login, Cancel; JTextField Name; JPasswordField Password;
    ImageIcon IMAGE = new ImageIcon(ClassLoader.getSystemResource("icon/Logo.gif"));
    Image IMAGE2 = IMAGE.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
    Font font = new Font("Arial",Font.BOLD,25);
    Login(){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Heading In Top Of Frame.
        heading = new JLabel("Admin Login Authentication!");
        heading.setFont(new Font("Arial",Font.BOLD,25));
        heading.setBounds(230,50,340,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);


        // Add Logo Image In Right Side Of Frame.
        image = new JLabel(new ImageIcon(IMAGE2));
        image.setBounds(400,50,400,400);
        add(image);


        // Add Name Label & Input Field.
        name = new JLabel("Username :");
        name.setBounds(25,155,140,30);
        name.setForeground(Color.black);
        name.setFont(font);
        add(name);

        Name = new JTextField();
        Name.setBorder(BorderFactory.createLineBorder(Color.black));
        Name.setBounds(175,155,200,30);
        Name.setForeground(new Color(255,215,0));
        Name.setFont(font);
        add(Name);


        // Add Password Label & Input Field.
        password = new JLabel("Password :");
        password.setBounds(25,235,140,30);
        password.setForeground(Color.black);
        password.setFont(font);
        add(password);

        Password = new JPasswordField();
        Password.setBorder(BorderFactory.createLineBorder(Color.black));
        Password.setBounds(175,235,200,30);
        Password.setForeground(new Color(255,215,0));
        Password.setFont(font);
        add(Password);


        // Add Login Button.
        Login = new JButton("Login");
        Login.setBorder(BorderFactory.createLineBorder(Color.black));
        Login.setBounds(65,315,120,30);
        Login.addActionListener(this);
        Login.setForeground(Color.blue);
        Login.setBackground(Color.white);
        Login.setFont(font);
        add(Login);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(215,315,120,30);
        Cancel.addActionListener(this);
        Cancel.setForeground(Color.red);
        Cancel.setBackground(Color.white);
        Cancel.setFont(font);
        add(Cancel);


        setVisible(true);
    }


    // Override The ActionListener Method.
    public void actionPerformed(ActionEvent e){
        // Declaration Of Cancel Button.
        if(e.getSource() == Cancel){
            dispose();
        }


        // Declaration Of Login Button.
        if(e.getSource() == Login){
            if(Name.getText().equals("")||Password.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Data Field Is Empty!","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select * from login where name='"+Name.getText()+"' and password='"+Password.getText()+"'").executeQuery();
                    if(rs.next()){
                        new Home();
                        dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Username & Password Not Match!","Error",JOptionPane.WARNING_MESSAGE);
                    }
                }catch(Exception z){
                    z.printStackTrace();
                }
            }
        }
    }

}
