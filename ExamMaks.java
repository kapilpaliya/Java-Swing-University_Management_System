

// Import Class & Packages.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class ExamMaks extends JFrame implements ActionListener {
    // Variable Declaration.
    JLabel heading, search, semester, image, maks, subj; JButton Submit, Cancel;
    JTextField S1,S2,S3,S4,S5, M1,M2,M3,M4,M5;
    JComboBox<String> Search, Semester;
    ImageIcon IMAGE = new ImageIcon(ClassLoader.getSystemResource("icon/Logo.gif"));
    Image IMAGE2 = IMAGE.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
    Font font = new Font("Arial", Font.BOLD,18);
    Font font1 = new Font("Arial", Font.BOLD,16);
    ExamMaks(){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Heading In Top Of Frame.
        heading = new JLabel("Enter Student Maks!");
        heading.setFont(new Font("Arial",Font.BOLD,25));
        heading.setBounds(270,10,260,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);


        // Add Logo Image In Right Side Of Frame.
        image = new JLabel(new ImageIcon(IMAGE2));
        image.setBounds(400,50,400,400);
        add(image);


        // Add Search Label And Input Field.
        search = new JLabel("Select Roll Number :");
        search.setBounds(20,62,200,30);
        search.setForeground(Color.black);
        search.setBackground(Color.white);
        search.setFont(font1);
        add(search);

        Search = new JComboBox<>();
        Search.setBorder(BorderFactory.createLineBorder(Color.black));
        Search.setForeground(new Color(65,105,225));
        Search.setBounds(200,62,200,30);
        Search.setBackground(Color.white);
        Search.setFont(font1);
        add(Search);


        // Add Semester Label And Input Field.
        semester = new JLabel("Semester :");
        semester.setBounds(20,113,200,30);
        semester.setForeground(Color.black);
        semester.setBackground(Color.white);
        semester.setFont(font1);
        add(semester);

        Semester = new JComboBox<>(new String[]{"semester1", "semester2", "semester3", "semester4", "semester5", "semester6", "semester7", "semester8"});
        Semester.setBorder(BorderFactory.createLineBorder(Color.black));
        Semester.setForeground(new Color(65,105,225));
        Semester.setBounds(200,113,200,30);
        Semester.setBackground(Color.white);
        Semester.setFont(font1);
        add(Semester);


        // Add Subject Label.
        subj = new JLabel("Subject");
        subj.setBounds(60,155,80,30);
        subj.setForeground(Color.black);
        subj.setFont(new Font("Arial",Font.BOLD,20));
        add(subj);


        // Add Maks Label.
        maks = new JLabel("Maks");
        maks.setBounds(275,155,50,30);
        maks.setForeground(Color.black);
        maks.setFont(new Font("Arial",Font.BOLD,20));
        add(maks);


        // Add Subject1 And Maks1 Input Fields.
        S1 = new JTextField();
        S1.setBorder(BorderFactory.createLineBorder(Color.black));
        S1.setBounds(10,205,180,30);
        S1.setForeground(new Color(65,105,225));
        S1.setFont(font);
        add(S1);

        M1 = new JTextField();
        M1.setBorder(BorderFactory.createLineBorder(Color.black));
        M1.setBounds(210,205,180,30);
        M1.setForeground(new Color(65,105,225));
        M1.setFont(font);
        add(M1);


        // Add Subject2 And Maks2 Input Fields.
        S2 = new JTextField();
        S2.setBorder(BorderFactory.createLineBorder(Color.black));
        S2.setBounds(10,255,180,30);
        S2.setForeground(new Color(65,105,225));
        S2.setFont(font);
        add(S2);

        M2 = new JTextField();
        M2.setBorder(BorderFactory.createLineBorder(Color.black));
        M2.setBounds(210,255,180,30);
        M2.setForeground(new Color(65,105,225));
        M2.setFont(font);
        add(M2);


        // Add Subject3 And Maks3 Input Fields.
        S3 = new JTextField();
        S3.setBorder(BorderFactory.createLineBorder(Color.black));
        S3.setBounds(10,305,180,30);
        S3.setForeground(new Color(65,105,225));
        S3.setFont(font);
        add(S3);

        M3 = new JTextField();
        M3.setBorder(BorderFactory.createLineBorder(Color.black));
        M3.setBounds(210,305,180,30);
        M3.setForeground(new Color(65,105,225));
        M3.setFont(font);
        add(M3);


        // Add Subject4 And Maks4 Input Fields.
        S4 = new JTextField();
        S4.setBorder(BorderFactory.createLineBorder(Color.black));
        S4.setBounds(10,355,180,30);
        S4.setForeground(new Color(65,105,225));
        S4.setFont(font);
        add(S4);

        M4 = new JTextField();
        M4.setBorder(BorderFactory.createLineBorder(Color.black));
        M4.setBounds(210,355,180,30);
        M4.setForeground(new Color(65,105,225));
        M4.setFont(font);
        add(M4);


        // Add Subject5 And Maks5 Input Fields.
        S5 = new JTextField();
        S5.setBorder(BorderFactory.createLineBorder(Color.black));
        S5.setBounds(10,405,180,30);
        S5.setForeground(new Color(65,105,225));
        S5.setFont(font);
        add(S5);

        M5 = new JTextField();
        M5.setBorder(BorderFactory.createLineBorder(Color.black));
        M5.setBounds(210,405,180,30);
        M5.setForeground(new Color(65,105,225));
        M5.setFont(font);
        add(M5);


        // Add Submit Button.
        Submit = new JButton("Submit");
        Submit.setBorder(BorderFactory.createLineBorder(Color.black));
        Submit.setBounds(80,455,120,30);
        Submit.addActionListener(this);
        Submit.setForeground(Color.green);
        Submit.setBackground(Color.white);
        Submit.setFont(font);
        add(Submit);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(230,455,120,30);
        Cancel.addActionListener(this);
        Cancel.setForeground(Color.red);
        Cancel.setBackground(Color.white);
        Cancel.setFont(font);
        add(Cancel);


        // Add Roll Numbers In Search ComboBox.
        try{
            ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select roll from student").executeQuery();
            while(rs.next()){
                Search.addItem(rs.getString("roll"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        setVisible(true);
    }


    // Override The ActionListener Method.
    @Override
    public void actionPerformed(ActionEvent e){

        // Declaration Of Cancel Button.
        if(e.getSource()==Cancel){
            dispose();
        }


        // Declaration Of Submit Button.
        if(e.getSource()==Submit){
            if(Search.getSelectedItem().equals("")|| S1.getText().equals("")||  S2.getText().equals("")||
                    S3.getText().equals("")||  S4.getText().equals("")|| S5.getText().equals("")||
                    M1.getText().equals("")|| M2.getText().equals("")|| M3.getText().equals("")||
                    M4.getText().equals("")|| M5.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Data Field Is Empty!","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    String s = "insert into subject values('"+Search.getSelectedItem()+"', '"+Semester.getSelectedItem()+"', " +
                            "'"+S1.getText()+"','"+S2.getText()+"','"+S3.getText()+"', '"+S4.getText()+"','"+S5.getText()+"')";

                    String m = "insert into maks values('"+Search.getSelectedItem()+"', '"+Semester.getSelectedItem()+"', " +
                            "'"+M1.getText()+"','"+M2.getText()+"','"+M3.getText()+"', '"+M4.getText()+"','"+M5.getText()+"')";

                    int x = JDBC.jdbcgetConnection().prepareStatement(s).executeUpdate();
                    int y = JDBC.jdbcgetConnection().prepareStatement(m).executeUpdate();
                    if(x>0 && y>0){
                        JOptionPane.showMessageDialog(this,"Data Successfully Uploaded!");
                        dispose();
                    }
                }
                catch (Exception E){
                    E.printStackTrace();
                }
            }
        }

    }

}
