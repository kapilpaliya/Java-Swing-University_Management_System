

// Import Class & Packages.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateFaculty extends JFrame implements ActionListener {
    // Variable Declaration.
    JLabel heading, allID, name, employeeID, address, email, qualification, class12, fatherName,dateOfBirth, phone, class10, aadhaarNumber, department ;
    JTextField Name, EmployeeId, DateOfBirth, Address, Email, Class12, FatherName, Phone, Class10, AadhaarNumber;
    JComboBox<String> AllID, Qualification, Department; JButton Search, Submit, Cancel;
    Font font = new Font("Arial",Font.BOLD,18);
    UpdateFaculty(){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Heading In Top Of Frame.
        heading = new JLabel("Update Faculty Details!");
        heading.setFont(new Font("Arial",Font.BOLD,25));
        heading.setBounds(265,10,270,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);


        // Add All Employee ID Label And Input Field.
        allID = new JLabel("Select Employee ID :");
        allID.setBounds(105,75,180,30);
        allID.setForeground(Color.black);
        allID.setBackground(Color.white);
        allID.setFont(font);
        add(allID);

        AllID = new JComboBox<>();
        AllID.setBorder(BorderFactory.createLineBorder(Color.black));
        AllID.setForeground(new Color(65,105,225));
        AllID.setBounds(315,75,200,30);
        AllID.setBackground(Color.white);
        AllID.setFont(font);
        add(AllID);


        // Add Search Button.
        Search = new JButton("Search");
        Search.setBorder(BorderFactory.createLineBorder(Color.black));
        Search.setBounds(545,75,120,30);
        Search.setBackground(Color.white);
        Search.setForeground(Color.blue);
        Search.addActionListener(this);
        Search.setFont(font);
        add(Search);


        // Add Name Label And Input Field.
        name = new JLabel("Faculty Name :");
        name.setBounds(20,140,160,30);
        name.setForeground(Color.black);
        name.setBackground(Color.white);
        name.setFont(font);
        add(name);

        Name = new JTextField();
        Name.setBorder(BorderFactory.createLineBorder(Color.black));
        Name.setForeground(new Color(65,105,225));
        Name.setBounds(180,140,200,30);
        Name.setBackground(Color.white);
        Name.setEnabled(false);
        Name.setFont(font);
        add(Name);


        // Add Father Name Label And Input Field.
        fatherName = new JLabel("Father Name :");
        fatherName.setBounds(420,140,160,30);
        fatherName.setForeground(Color.black);
        fatherName.setBackground(Color.white);
        fatherName.setFont(font);
        add(fatherName);

        FatherName = new JTextField();
        FatherName.setBorder(BorderFactory.createLineBorder(Color.black));
        FatherName.setForeground(new Color(65,105,225));
        FatherName.setBounds(580,140,200,30);
        FatherName.setBackground(Color.white);
        FatherName.setEnabled(false);
        FatherName.setFont(font);
        add(FatherName);


        // Add Employee ID Label And Input Field.
        employeeID = new JLabel("Employee ID :");
        employeeID.setBounds(20,190,160,30);
        employeeID.setForeground(Color.black);
        employeeID.setBackground(Color.white);
        employeeID.setFont(font);
        add(employeeID);

        EmployeeId = new JTextField();
        EmployeeId.setBorder(BorderFactory.createLineBorder(Color.black));
        EmployeeId.setForeground(new Color(65,105,225));
        EmployeeId.setBounds(180,190,200,30);
        EmployeeId.setBackground(Color.white);
        EmployeeId.setEnabled(false);
        EmployeeId.setFont(font);
        add(EmployeeId);


        // Add Date Of Birth Label And Input Field.
        dateOfBirth = new JLabel("Date Of Birth :");
        dateOfBirth.setBounds(420,190,160,30);
        dateOfBirth.setForeground(Color.black);
        dateOfBirth.setBackground(Color.white);
        dateOfBirth.setFont(font);
        add(dateOfBirth);

        DateOfBirth = new JTextField();
        DateOfBirth.setBorder(BorderFactory.createLineBorder(Color.black));
        DateOfBirth.setForeground(new Color(65,105,225));
        DateOfBirth.setBounds(580,190,200,30);
        DateOfBirth.setBackground(Color.white);
        DateOfBirth.setEnabled(false);
        DateOfBirth.setFont(font);
        add(DateOfBirth);


        // Add Address Label And Input Field.
        address = new JLabel("Address :");
        address.setBounds(20,240,160,30);
        address.setForeground(Color.black);
        address.setBackground(Color.white);
        address.setFont(font);
        add(address);

        Address = new JTextField();
        Address.setBorder(BorderFactory.createLineBorder(Color.black));
        Address.setForeground(new Color(65,105,225));
        Address.setBounds(180,240,200,30);
        Address.setBackground(Color.white);
        Address.setFont(font);
        add(Address);


        // Add Phone Label And Input Field.
        phone = new JLabel("Phone No. :");
        phone.setBounds(420,240,160,30);
        phone.setForeground(Color.black);
        phone.setBackground(Color.white);
        phone.setFont(font);
        add(phone);

        Phone = new JTextField();
        Phone.setBorder(BorderFactory.createLineBorder(Color.black));
        Phone.setForeground(new Color(65,105,225));
        Phone.setBounds(580,240,200,30);
        Phone.setBackground(Color.white);
        Phone.setFont(font);
        add(Phone);


        // Add Email Label And Input Field.
        email = new JLabel("Email ID :");
        email.setBounds(20,290,160,30);
        email.setForeground(Color.black);
        email.setBackground(Color.white);
        email.setFont(font);
        add(email);

        Email = new JTextField();
        Email.setBorder(BorderFactory.createLineBorder(Color.black));
        Email.setForeground(new Color(65,105,225));
        Email.setBounds(180,290,200,30);
        Email.setBackground(Color.white);
        Email.setFont(font);
        add(Email);


        // Add Aadhaar Number Label And Input Field.
        aadhaarNumber = new JLabel("Aadhaar Number :");
        aadhaarNumber.setBounds(420,290,160,30);
        aadhaarNumber.setForeground(Color.black);
        aadhaarNumber.setBackground(Color.white);
        aadhaarNumber.setFont(font);
        add(aadhaarNumber);

        AadhaarNumber = new JTextField();
        AadhaarNumber.setBorder(BorderFactory.createLineBorder(Color.black));
        AadhaarNumber.setForeground(new Color(65,105,225));
        AadhaarNumber.setBounds(580,290,200,30);
        AadhaarNumber.setBackground(Color.white);
        AadhaarNumber.setEnabled(false);
        AadhaarNumber.setFont(font);
        add(AadhaarNumber);


        // Add Class-10 Label And Input Field.
        class10 = new JLabel("Class X(%) :");
        class10.setBounds(20,340,160,30);
        class10.setForeground(Color.black);
        class10.setBackground(Color.white);
        class10.setFont(font);
        add(class10);

        Class10 = new JTextField();
        Class10.setBorder(BorderFactory.createLineBorder(Color.black));
        Class10.setForeground(new Color(65,105,225));
        Class10.setBounds(180,340,200,30);
        Class10.setBackground(Color.white);
        Class10.setEnabled(false);
        Class10.setFont(font);
        add(Class10);


        // Add Class-12 Label And Input Field.
        class12 = new JLabel("Class XII(%) :");
        class12.setBounds(420,340,160,30);
        class12.setForeground(Color.black);
        class12.setBackground(Color.white);
        class12.setFont(font);
        add(class12);

        Class12 = new JTextField();
        Class12.setBorder(BorderFactory.createLineBorder(Color.black));
        Class12.setForeground(new Color(65,105,225));
        Class12.setBounds(580,340,200,30);
        Class12.setBackground(Color.white);
        Class12.setEnabled(false);
        Class12.setFont(font);
        add(Class12);


        // Add Qualification Label And Input Field.
        qualification = new JLabel("Qualification :");
        qualification.setBounds(20,390,160,30);
        qualification.setForeground(Color.black);
        qualification.setBackground(Color.white);
        qualification.setFont(font);
        add(qualification);

        Qualification = new JComboBox<>(new String[]{"B.Tech", "BCA", "BBA", "BSC", "MSC", "MCA", "MCom","MA","BA"});
        Qualification.setBorder(BorderFactory.createLineBorder(Color.black));
        Qualification.setForeground(new Color(65,105,225));
        Qualification.setBounds(180,390,200,30);
        Qualification.setBackground(Color.white);
        Qualification.setFont(font);
        add(Qualification);


        // Add Department Label And Input Field.
        department = new JLabel("Department :");
        department.setBounds(420,390,160,30);
        department.setForeground(Color.black);
        department.setBackground(Color.white);
        department.setFont(font);
        add(department);

        Department = new JComboBox<>(new String[]{"none...","Computer Science", "Electronics","Mechanical","Civil","IT"});
        Department.setBorder(BorderFactory.createLineBorder(Color.black));
        Department.setForeground(new Color(65,105,225));
        Department.setBounds(580,390,200,30);
        Department.setBackground(Color.white);
        Department.setFont(font);
        add(Department);


        // Add Submit Button.
        Submit = new JButton("Update");
        Submit.setBorder(BorderFactory.createLineBorder(Color.black));
        Submit.setBounds(265,450,120,30);
        Submit.setForeground(Color.green);
        Submit.setBackground(Color.white);
        Submit.addActionListener(this);
        Submit.setFont(font);
        add(Submit);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(415,450,120,30);
        Cancel.setBackground(Color.white);
        Cancel.setForeground(Color.red);
        Cancel.addActionListener(this);
        Cancel.setFont(font);
        add(Cancel);


        // Used To Store All Employee ID In AllID ComboBox.
        try{
            ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select id from faculty").executeQuery();
            while(rs.next()){
                AllID.addItem(rs.getString("id"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }


        setVisible(true);
    }


    // Override The ActionListener Methods.
    public void actionPerformed(ActionEvent e){

        // Declaration Of Cancel Button.
        if(e.getSource()==Cancel){
            dispose();
        }


        // Declaration Of Search Button.
        if(e.getSource()==Search){
            try{
                ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select * from faculty where id = '"+AllID.getSelectedItem()+"'").executeQuery();
                if(rs.next()){
                    Name.setText(rs.getString("nam"));
                    FatherName.setText(rs.getString("father"));
                    EmployeeId.setText(rs.getString("id"));
                    DateOfBirth.setText(rs.getString("dob"));
                    Address.setText(rs.getString("address"));
                    Phone.setText(rs.getString("phone"));
                    Email.setText(rs.getString("email"));
                    AadhaarNumber.setText(rs.getString("aadhaar"));
                    Class10.setText(rs.getString("x"));
                    Class12.setText(rs.getString("xii"));
                    Qualification.setSelectedItem(rs.getString("qualification"));
                    Department.setSelectedItem(rs.getString("department"));
                }
            }catch (Exception E){
                E.printStackTrace();
            }
        }


        // Declaration Of Submit Button.
        if(e.getSource()==Submit){
            if(EmployeeId.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Data Field Is Empty! Confirm To Select " +
                        "Employee ID Than Search.","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    String s = "update faculty set address = '"+Address.getText()+"', phone = '"+Phone.getText()+"', email = '"+Email.getText()+"', qualification = '"+Qualification.getSelectedItem()+"', department = '"+Department.getSelectedItem()+"' where id = '"+EmployeeId.getText()+"'";
                    int x = JDBC.jdbcgetConnection().prepareStatement(s).executeUpdate();
                    if(x>0){
                        JOptionPane.showMessageDialog(this,"Data Successfully Updated!");
                        dispose();
                    }
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        }

    }

}
