

// Import Class & Packages.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class StudentFeeForm extends JFrame implements ActionListener {
    // Variable Declaration.
    JLabel search, name, father, course, branch, semester, fee, image, heading;
    JComboBox<String> Search, Semester; JTextField Name, Father, Fee, Course, Branch;
    JButton Update, Pay, Cancel;  Font font = new Font("Arial",Font.BOLD,16);
    ImageIcon IMAGE = new ImageIcon(ClassLoader.getSystemResource("icon/Logo.gif"));
    Image IMAGE2 = IMAGE.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
    StudentFeeForm(){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Heading In Top Of Frame.
        heading = new JLabel("Student Fee Form!");
        heading.setFont(new Font("Arial",Font.BOLD,25));
        heading.setBounds(290,10,220,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);


        // Add Logo Image In Right Side Of Frame.
        image = new JLabel(new ImageIcon(IMAGE2));
        image.setBounds(400,50,400,400);
        add(image);


        // Add Search Label And Input Field.
        search = new JLabel("Select Roll Number :");
        search.setBounds(20,60,180,30);
        search.setForeground(Color.black);
        search.setBackground(Color.white);
        search.setFont(font);
        add(search);

        Search = new JComboBox<>();
        Search.setBorder(BorderFactory.createLineBorder(Color.black));
        Search.setForeground(new Color(65,105,225));
        Search.setBounds(200,60,200,30);
        Search.setBackground(Color.white);
        Search.setFont(font);
        add(Search);


        // Add Name Label & Input Field.
        name = new JLabel("Username :");
        name.setBounds(20,110,180,30);
        name.setForeground(Color.black);
        name.setFont(font);
        add(name);

        Name = new JTextField();
        Name.setBorder(BorderFactory.createLineBorder(Color.black));
        Name.setBounds(200,110,200,30);
        Name.setForeground(new Color(255,215,0));
        Name.setEnabled(false);
        Name.setFont(font);
        add(Name);


        // Add Father Name Label & Input Field.
        father = new JLabel("Father Name :");
        father.setBounds(20,160,180,30);
        father.setForeground(Color.black);
        father.setFont(font);
        add(father);

        Father = new JTextField();
        Father.setBorder(BorderFactory.createLineBorder(Color.black));
        Father.setBounds(200,160,200,30);
        Father.setForeground(new Color(255,215,0));
        Father.setEnabled(false);
        Father.setFont(font);
        add(Father);


        // Add Course Label And Input Field.
        course = new JLabel("Course :");
        course.setBounds(20,210,180,30);
        course.setForeground(Color.black);
        course.setBackground(Color.white);
        course.setFont(font);
        add(course);

        Course = new JTextField();
        Course.setBorder(BorderFactory.createLineBorder(Color.black));
        Course.setForeground(new Color(65,105,225));
        Course.setBounds(200,210,200,30);
        Course.setBackground(Color.white);
        Course.setEnabled(false);
        Course.setFont(font);
        add(Course);


        // Add Branch Label And Input Field.
        branch = new JLabel("Branch :");
        branch.setBounds(20,260,180,30);
        branch.setForeground(Color.black);
        branch.setBackground(Color.white);
        branch.setFont(font);
        add(branch);

        Branch = new JTextField();
        Branch.setBorder(BorderFactory.createLineBorder(Color.black));
        Branch.setForeground(new Color(65,105,225));
        Branch.setBounds(200,260,200,30);
        Branch.setBackground(Color.white);
        Branch.setEnabled(false);
        Branch.setFont(font);
        add(Branch);


        // Add Semester Label And Input Field.
        semester = new JLabel("Semester :");
        semester.setBounds(20,310,180,30);
        semester.setForeground(Color.black);
        semester.setBackground(Color.white);
        semester.setFont(font);
        add(semester);

        Semester = new JComboBox<>(new String[]{"semester1", "semester2", "semester3", "semester4", "semester5", "semester6", "semester7", "semester8"});
        Semester.setBorder(BorderFactory.createLineBorder(Color.black));
        Semester.setForeground(new Color(65,105,225));
        Semester.setBounds(200,310,200,30);
        Semester.setBackground(Color.white);
        Semester.setFont(font);
        add(Semester);


        // Add Fee Label & Input Field.
        fee = new JLabel("Total Fee :");
        fee.setBounds(20,360,180,30);
        fee.setForeground(Color.black);
        fee.setFont(font);
        add(fee);

        Fee = new JTextField();
        Fee.setBorder(BorderFactory.createLineBorder(Color.black));
        Fee.setBounds(200,360,200,30);
        Fee.setForeground(new Color(255,215,0));
        Fee.setEnabled(false);
        Fee.setFont(font);
        add(Fee);


        // Add Update Button.
        Update = new JButton("Search");
        Update.setBorder(BorderFactory.createLineBorder(Color.black));
        Update.setBounds(30,410,100,30);
        Update.addActionListener(this);
        Update.setForeground(Color.blue);
        Update.setBackground(Color.white);
        Update.setFont(font);
        add(Update);


        // Add Pay Button.
        Pay = new JButton("Pay");
        Pay.setBorder(BorderFactory.createLineBorder(Color.black));
        Pay.setBounds(150,410,100,30);
        Pay.addActionListener(this);
        Pay.setForeground(Color.green);
        Pay.setBackground(Color.white);
        Pay.setFont(font);
        add(Pay);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(270,410,100,30);
        Cancel.addActionListener(this);
        Cancel.setForeground(Color.red);
        Cancel.setBackground(Color.white);
        Cancel.setFont(font);
        add(Cancel);


        // Add All Roll Number In Search ComboBox.
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
    public void actionPerformed(ActionEvent e){

        // Declaration Of Cancel Button.
        if(e.getSource() == Cancel){
            dispose();
        }


        // Declaration Of Update Button.
        if(e.getSource()==Update){
            try {
                ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select name,father,course,branch from student where roll = '"+Search.getSelectedItem()+"'").executeQuery();
                if(rs.next()){
                    Name.setText(rs.getString("name"));
                    Father.setText(rs.getString("father"));
                    Course.setText(rs.getString("course"));
                    Branch.setText(rs.getString("branch"));
                }

                ResultSet rs1 = JDBC.jdbcgetConnection().prepareStatement("select * from fee where course = '"+Course.getText()+"'").executeQuery();
                while(rs1.next()){
                    if(Semester.getSelectedItem().equals("semester1")){
                        Fee.setText(rs1.getString("semester1"));
                    }
                    if(Semester.getSelectedItem().equals("semester2")){
                        Fee.setText(rs1.getString("semester2"));
                    }
                    if(Semester.getSelectedItem().equals("semester3")){
                        Fee.setText(rs1.getString("semester3"));
                    }
                    if(Semester.getSelectedItem().equals("semester4")){
                        Fee.setText(rs1.getString("semester4"));
                    }
                    if(Semester.getSelectedItem().equals("semester5")){
                        Fee.setText(rs1.getString("semester5"));
                    }
                    if(Semester.getSelectedItem().equals("semester6")){
                        Fee.setText(rs1.getString("semester6"));
                    }
                    if(Semester.getSelectedItem().equals("semester7")){
                        Fee.setText(rs1.getString("semester7"));
                    }
                    if(Semester.getSelectedItem().equals("semester8")){
                        Fee.setText(rs1.getString("semester8"));
                    }
                }

                Semester.setEnabled(false);
            }catch (Exception E){
                E.printStackTrace();
            }
        }


        // Declaration Of Pay Button.
        if(e.getSource()==Pay){
            if(Fee.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Data Field Empty!","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    String s = "insert into studentFee values('"+Search.getSelectedItem()+"', '"+Course.getText()+"', '"+Branch.getText()+"', '"+Semester.getSelectedItem()+"', '"+Fee.getText()+"')";
                    int x = JDBC.jdbcgetConnection().prepareStatement(s).executeUpdate();
                    if(x>0){
                        JOptionPane.showMessageDialog(this,"Pay Successfully!");
                        dispose();
                    }
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        }

    }

}
