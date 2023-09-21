

// Import Class & Package.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.sql.ResultSet;
import com.toedter.calendar.JDateChooser;

public class NewStudent extends JFrame implements ActionListener {
    // Variable Declaration.
    JLabel heading, name, employeeID, address, email, qualification, class12, fatherName,dateOfBirth, phone, class10, aadhaarNumber, department ;
    JTextField Name, EmployeeId, Address, Email, Class12, FatherName, Phone, Class10, AadhaarNumber;
    JComboBox<String> Qualification, Department; JDateChooser DateOfBirth; JButton Submit, Cancel;
    Font font = new Font("Arial",Font.BOLD,18);

    NewStudent(){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Heading In Top Of Frame.
        heading = new JLabel("Add New Student Details!");
        heading.setFont(new Font("Arial",Font.BOLD,25));
        heading.setBounds(250,10,300,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);


        // Add Name Label And Input Field.
        name = new JLabel("Student Name :");
        name.setBounds(20,70,160,30);
        name.setForeground(Color.black);
        name.setBackground(Color.white);
        name.setFont(font);
        add(name);

        Name = new JTextField();
        Name.setBorder(BorderFactory.createLineBorder(Color.black));
        Name.setForeground(new Color(65,105,225));
        Name.setBounds(180,70,200,30);
        Name.setBackground(Color.white);
        Name.setFont(font);
        add(Name);


        // Add Father Name Label And Input Field.
        fatherName = new JLabel("Father Name :");
        fatherName.setBounds(420,70,160,30);
        fatherName.setForeground(Color.black);
        fatherName.setBackground(Color.white);
        fatherName.setFont(font);
        add(fatherName);

        FatherName = new JTextField();
        FatherName.setBorder(BorderFactory.createLineBorder(Color.black));
        FatherName.setForeground(new Color(65,105,225));
        FatherName.setBounds(580,70,200,30);
        FatherName.setBackground(Color.white);
        FatherName.setFont(font);
        add(FatherName);


        // Add Employee ID Label And Input Field.
        employeeID = new JLabel("Roll No. :");
        employeeID.setBounds(20,120,160,30);
        employeeID.setForeground(Color.black);
        employeeID.setBackground(Color.white);
        employeeID.setFont(font);
        add(employeeID);

        EmployeeId = new JTextField(getRandom());
        EmployeeId.setBorder(BorderFactory.createLineBorder(Color.black));
        EmployeeId.setForeground(new Color(65,105,225));
        EmployeeId.setBounds(180,120,200,30);
        EmployeeId.setBackground(Color.white);
        EmployeeId.setEditable(false);
        EmployeeId.setFont(font);
        add(EmployeeId);


        // Add Date Of Birth Label And Input Field.
        dateOfBirth = new JLabel("Date Of Birth :");
        dateOfBirth.setBounds(420,120,160,30);
        dateOfBirth.setForeground(Color.black);
        dateOfBirth.setBackground(Color.white);
        dateOfBirth.setFont(font);
        add(dateOfBirth);

        DateOfBirth = new JDateChooser();
        DateOfBirth.setBorder(BorderFactory.createLineBorder(Color.black));
        DateOfBirth.setForeground(new Color(65,105,225));
        DateOfBirth.setBounds(580,120,200,30);
        DateOfBirth.setBackground(Color.white);
        DateOfBirth.setFont(font);
        add(DateOfBirth);


        // Add Address Label And Input Field.
        address = new JLabel("Address :");
        address.setBounds(20,170,160,30);
        address.setForeground(Color.black);
        address.setBackground(Color.white);
        address.setFont(font);
        add(address);

        Address = new JTextField();
        Address.setBorder(BorderFactory.createLineBorder(Color.black));
        Address.setForeground(new Color(65,105,225));
        Address.setBounds(180,170,200,30);
        Address.setBackground(Color.white);
        Address.setFont(font);
        add(Address);


        // Add Phone Label And Input Field.
        phone = new JLabel("Phone No. :");
        phone.setBounds(420,170,160,30);
        phone.setForeground(Color.black);
        phone.setBackground(Color.white);
        phone.setFont(font);
        add(phone);

        Phone = new JTextField();
        Phone.setBorder(BorderFactory.createLineBorder(Color.black));
        Phone.setForeground(new Color(65,105,225));
        Phone.setBounds(580,170,200,30);
        Phone.setBackground(Color.white);
        Phone.setFont(font);
        add(Phone);


        // Add Email Label And Input Field.
        email = new JLabel("Email ID :");
        email.setBounds(20,220,160,30);
        email.setForeground(Color.black);
        email.setBackground(Color.white);
        email.setFont(font);
        add(email);

        Email = new JTextField();
        Email.setBorder(BorderFactory.createLineBorder(Color.black));
        Email.setForeground(new Color(65,105,225));
        Email.setBounds(180,220,200,30);
        Email.setBackground(Color.white);
        Email.setFont(font);
        add(Email);


        // Add Aadhaar Number Label And Input Field.
        aadhaarNumber = new JLabel("Aadhaar Number :");
        aadhaarNumber.setBounds(420,220,160,30);
        aadhaarNumber.setForeground(Color.black);
        aadhaarNumber.setBackground(Color.white);
        aadhaarNumber.setFont(font);
        add(aadhaarNumber);

        AadhaarNumber = new JTextField();
        AadhaarNumber.setBorder(BorderFactory.createLineBorder(Color.black));
        AadhaarNumber.setForeground(new Color(65,105,225));
        AadhaarNumber.setBounds(580,220,200,30);
        AadhaarNumber.setBackground(Color.white);
        AadhaarNumber.setFont(font);
        add(AadhaarNumber);


        // Add Class-10 Label And Input Field.
        class10 = new JLabel("Class X(%) :");
        class10.setBounds(20,270,160,30);
        class10.setForeground(Color.black);
        class10.setBackground(Color.white);
        class10.setFont(font);
        add(class10);

        Class10 = new JTextField();
        Class10.setBorder(BorderFactory.createLineBorder(Color.black));
        Class10.setForeground(new Color(65,105,225));
        Class10.setBounds(180,270,200,30);
        Class10.setBackground(Color.white);
        Class10.setFont(font);
        add(Class10);


        // Add Class-12 Label And Input Field.
        class12 = new JLabel("Class XII(%) :");
        class12.setBounds(420,270,160,30);
        class12.setForeground(Color.black);
        class12.setBackground(Color.white);
        class12.setFont(font);
        add(class12);

        Class12 = new JTextField();
        Class12.setBorder(BorderFactory.createLineBorder(Color.black));
        Class12.setForeground(new Color(65,105,225));
        Class12.setBounds(580,270,200,30);
        Class12.setBackground(Color.white);
        Class12.setFont(font);
        add(Class12);


        // Add Qualification Label And Input Field.
        qualification = new JLabel("Course :");
        qualification.setBounds(20,320,160,30);
        qualification.setForeground(Color.black);
        qualification.setBackground(Color.white);
        qualification.setFont(font);
        add(qualification);

        Qualification = new JComboBox<>(new String[]{"B.Tech", "BCA", "BBA", "BSC", "MSC", "MCA", "MCom","MA","BA"});
        Qualification.setBorder(BorderFactory.createLineBorder(Color.black));
        Qualification.setForeground(new Color(65,105,225));
        Qualification.setBounds(180,320,200,30);
        Qualification.setBackground(Color.white);
        Qualification.setFont(font);
        add(Qualification);


        // Add Department Label And Input Field.
        department = new JLabel("Branch :");
        department.setBounds(420,320,160,30);
        department.setForeground(Color.black);
        department.setBackground(Color.white);
        department.setFont(font);
        add(department);

        Department = new JComboBox<>(new String[]{"none...","Computer Science", "Electronics","Mechanical","Civil","IT"});
        Department.setBorder(BorderFactory.createLineBorder(Color.black));
        Department.setForeground(new Color(65,105,225));
        Department.setBounds(580,320,200,30);
        Department.setBackground(Color.white);
        Department.setFont(font);
        add(Department);


        // Add Submit Button.
        Submit = new JButton("Submit");
        Submit.setBorder(BorderFactory.createLineBorder(Color.black));
        Submit.setBounds(265,380,120,30);
        Submit.setForeground(Color.green);
        Submit.setBackground(Color.white);
        Submit.addActionListener(this);
        Submit.setFont(font);
        add(Submit);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(415,380,120,30);
        Cancel.setBackground(Color.white);
        Cancel.setForeground(Color.red);
        Cancel.addActionListener(this);
        Cancel.setFont(font);
        add(Cancel);


        setVisible(true);
    }


    // Override The ActionListener Methods.
    public void actionPerformed(ActionEvent e){

        // Declaration Of Cancel Button.
        if(e.getSource()==Cancel){
            dispose();
        }


        // Declaration Of Submit Button.
        if(e.getSource()==Submit){
            String query = "insert into student values('"+Name.getText()+"',  '"+FatherName.getText()+"',  " +
                    "'"+EmployeeId.getText()+"',  " +
                    "'"+((JTextField) DateOfBirth.getDateEditor().getUiComponent()).getText()+"',  " +
                    "'"+Address.getText()+"',  '"+Phone.getText()+"',  '"+Email.getText()+"',  '"+AadhaarNumber.getText()+"',  " +
                    "'"+Class10.getText()+"',  '"+Class12.getText()+"',  '"+Qualification.getSelectedItem()+"'," +
                    "'"+Department.getSelectedItem()+"')";

            if(Name.getText().equals("")|| FatherName.getText().equals("")|| EmployeeId.getText().equals("")||
                    ((JTextField) DateOfBirth.getDateEditor().getUiComponent()).getText().equals("")||
                    Address.getText().equals("")|| Phone.getText().equals("")|| Email.getText().equals("")||
                    AadhaarNumber.getText().equals("")|| Class10.getText().equals("")|| Class12.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Data Field Is Empty!","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    int y = JDBC.jdbcgetConnection().prepareStatement(query).executeUpdate();
                    if(y>0){
                        JOptionPane.showMessageDialog(this,"Data Successfully Uploaded!");
                        dispose();
                    }
                }
                catch(Exception z){
                    z.printStackTrace();
                }
            }
        }

    }


    // Add Function To Return The Employee ID.
    public String getRandom(){
        Random r = new Random();
        int x = r.nextInt(100000,999999);
        String s  = String.valueOf(x); String ok = "";
        try{
            ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select roll from student where roll = '"+s+"'").executeQuery();
            if(rs.next()){
                ok = getRandom();
            }
            else{
                ok = s;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return  ok;
    }

}
