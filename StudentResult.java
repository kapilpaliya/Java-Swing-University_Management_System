
// Import Class & Packages.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class StudentResult extends JFrame implements ActionListener {
    // Variable Declaration.
    JLabel image, heading, heading1, name, father, course, branch, semester, sub, mx, min, mk, totalMaks;
    JTextField Name, Father, Course, Branch, Semester,
            sub1, sub2, sub3, sub4, sub5,      mx1, mx2, mx3, mx4, mx5,
            min1, min2, min3, min4, min5,             mk1, mk2, mk3, mk4, mk5,       TotalMaks;
    Font font  = new Font("Arial", Font.BOLD,16);
    Font font1  = new Font("Arial", Font.BOLD,20);
    JButton Cancel;
    ImageIcon IMAGE = new ImageIcon(ClassLoader.getSystemResource("icon/university.jpeg"));
    Image IMAGE2 = IMAGE.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT);
    StudentResult(String ROLL, String SEM){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Logo Image In Top Side Of Frame.
        image = new JLabel(new ImageIcon(IMAGE2));
        image.setBounds(10,5,80,80);
        add(image);


        // Add Heading In Top Of Frame.
        heading = new JLabel("VIKRANT INSTITUTIONS OF TECHNOLOGY & MANAGEMENT GWALIOR");
        heading.setFont(new Font("Arial",Font.BOLD,20));
        heading.setBounds(100,10,700,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);

        // Add Heading In Top Of Frame.
        heading1 = new JLabel("(UNIVERSITY OF TECHNOLOGY AND MANAGEMENT)");
        heading1.setFont(new Font("Arial",Font.BOLD,18));
        heading1.setBounds(200,40,500,30);
        heading1.setForeground(new Color(255,215,0));
        heading1.setBackground(Color.white);
        add(heading1);


        // Add Name Label And Input Field.
        name = new JLabel("Student Name :");
        name.setBounds(80,90,120,30);
        name.setForeground(Color.black);
        name.setBackground(Color.white);
        name.setFont(font);
        add(name);

        Name = new JTextField();
        Name.setBorder(BorderFactory.createLineBorder(Color.black));
        Name.setForeground(new Color(65,105,225));
        Name.setBounds(210,90,150,30);
        Name.setBackground(Color.white);
        Name.setEditable(false);
        Name.setFont(font);
        add(Name);


        // Add Father Name Label And Input Field.
        father = new JLabel("Father Name :");
        father.setBounds(440,90,120,30);
        father.setForeground(Color.black);
        father.setBackground(Color.white);
        father.setFont(font);
        add(father);

        Father = new JTextField();
        Father.setBorder(BorderFactory.createLineBorder(Color.black));
        Father.setForeground(new Color(65,105,225));
        Father.setBounds(570,90,150,30);
        Father.setBackground(Color.white);
        Father.setEditable(false);
        Father.setFont(font);
        add(Father);


        // Add Course Label And Input Field.
        course = new JLabel("Course :");
        course.setBounds(46,150,70,30);
        course.setForeground(Color.black);
        course.setBackground(Color.white);
        course.setFont(font);
        add(course);

        Course = new JTextField();
        Course.setBorder(BorderFactory.createLineBorder(Color.black));
        Course.setForeground(new Color(65,105,225));
        Course.setBounds(127,150,120,30);
        Course.setBackground(Color.white);
        Course.setEditable(false);
        Course.setFont(font);
        add(Course);


        // Add Branch Label And Input Field.
        branch = new JLabel("Branch :");
        branch.setBounds(292,150,70,30);
        branch.setForeground(Color.black);
        branch.setBackground(Color.white);
        branch.setFont(font);
        add(branch);

        Branch = new JTextField();
        Branch.setBorder(BorderFactory.createLineBorder(Color.black));
        Branch.setForeground(new Color(65,105,225));
        Branch.setBounds(373,150,120,30);
        Branch.setBackground(Color.white);
        Branch.setEditable(false);
        Branch.setFont(font);
        add(Branch);


        // Add Semester Label And Input Field.
        semester = new JLabel("Semester :");
        semester.setBounds(538,150,85,30);
        semester.setForeground(Color.black);
        semester.setBackground(Color.white);
        semester.setFont(font);
        add(semester);

        Semester = new JTextField(SEM);
        Semester.setBorder(BorderFactory.createLineBorder(Color.black));
        Semester.setForeground(new Color(65,105,225));
        Semester.setBounds(633,150,120,30);
        Semester.setBackground(Color.white);
        Semester.setEditable(false);
        Semester.setFont(font);
        add(Semester);


        // Add Subject Label And Input Field In Blow.
        sub = new JLabel("Subject");
        sub.setBounds(93,200,80,30);
        sub.setForeground(Color.black);
        sub.setBackground(Color.white);
        sub.setFont(font1);
        add(sub);

        // Add Maximum Maks Label And Input Field In Blow.
        mx = new JLabel("Max. Maks");
        mx.setBounds(266,200,105,30);
        mx.setForeground(Color.black);
        mx.setBackground(Color.white);
        mx.setFont(font1);
        add(mx);

        // Add Minimum Maks Label And Input Field In Blow.
        min = new JLabel("Min. Maks");
        min.setBounds(464,200,100,30);
        min.setForeground(Color.black);
        min.setBackground(Color.white);
        min.setFont(font1);
        add(min);

        // Add Maks Label And Input Field In Blow.
        mk = new JLabel("Maks");
        mk.setBounds(657,200,50,30);
        mk.setForeground(Color.black);
        mk.setBackground(Color.white);
        mk.setFont(font1);
        add(mk);


        // Maks & Subject Information Row-1
        sub1 = new JTextField();
        sub1.setBorder(BorderFactory.createLineBorder(Color.black));
        sub1.setForeground(new Color(65,105,225));
        sub1.setBounds(80,250,100,30);
        sub1.setBackground(Color.white);
        sub1.setBackground(Color.white);
        sub1.setEditable(false);
        sub1.setFont(font);
        add(sub1);

        mx1 = new JTextField("        100");
        mx1.setBorder(BorderFactory.createLineBorder(Color.black));
        mx1.setForeground(new Color(65,105,225));
        mx1.setBounds(260,250,100,30);
        mx1.setBackground(Color.white);
        mx1.setEditable(false);
        mx1.setFont(font);
        add(mx1);

        min1 = new JTextField("       33 ");
        min1.setBorder(BorderFactory.createLineBorder(Color.black));
        min1.setForeground(new Color(65,105,225));
        min1.setBounds(440,250,100,30);
        min1.setBackground(Color.white);
        min1.setEditable(false);
        min1.setFont(font);
        add(min1);

        mk1 = new JTextField();
        mk1.setBorder(BorderFactory.createLineBorder(Color.black));
        mk1.setForeground(new Color(65,105,225));
        mk1.setBounds(620,250,100,30);
        mk1.setBackground(Color.white);
        mk1.setEditable(false);
        mk1.setFont(font);
        add(mk1);


        // Maks & Subject Information Row-2.
        sub2 = new JTextField();
        sub2.setBorder(BorderFactory.createLineBorder(Color.black));
        sub2.setForeground(new Color(65,105,225));
        sub2.setBounds(80,285,100,30);
        sub2.setBackground(Color.white);
        sub2.setEditable(false);
        sub2.setFont(font);
        add(sub2);

        mx2 = new JTextField("        100");
        mx2.setBorder(BorderFactory.createLineBorder(Color.black));
        mx2.setForeground(new Color(65,105,225));
        mx2.setBounds(260,285,100,30);
        mx2.setBackground(Color.white);
        mx2.setEditable(false);
        mx2.setFont(font);
        add(mx2);

        min2 = new JTextField("       33 ");
        min2.setBorder(BorderFactory.createLineBorder(Color.black));
        min2.setForeground(new Color(65,105,225));
        min2.setBounds(440,285,100,30);
        min2.setBackground(Color.white);
        min2.setEditable(false);
        min2.setFont(font);
        add(min2);

        mk2 = new JTextField();
        mk2.setBorder(BorderFactory.createLineBorder(Color.black));
        mk2.setForeground(new Color(65,105,225));
        mk2.setBounds(620,285,100,30);
        mk2.setBackground(Color.white);
        mk2.setEditable(false);
        mk2.setFont(font);
        add(mk2);


        // Maks & Subject Information Row-3
        sub3 = new JTextField();
        sub3.setBorder(BorderFactory.createLineBorder(Color.black));
        sub3.setForeground(new Color(65,105,225));
        sub3.setBounds(80,320,100,30);
        sub3.setBackground(Color.white);
        sub3.setEditable(false);
        sub3.setFont(font);
        add(sub3);

        mx3 = new JTextField("        100");
        mx3.setBorder(BorderFactory.createLineBorder(Color.black));
        mx3.setForeground(new Color(65,105,225));
        mx3.setBounds(260,320,100,30);
        mx3.setBackground(Color.white);
        mx3.setEditable(false);
        mx3.setFont(font);
        add(mx3);

        min3 = new JTextField("       33 ");
        min3.setBorder(BorderFactory.createLineBorder(Color.black));
        min3.setForeground(new Color(65,105,225));
        min3.setBounds(440,320,100,30);
        min3.setBackground(Color.white);
        min3.setEditable(false);
        min3.setFont(font);
        add(min3);

        mk3 = new JTextField();
        mk3.setBorder(BorderFactory.createLineBorder(Color.black));
        mk3.setForeground(new Color(65,105,225));
        mk3.setBounds(620,320,100,30);
        mk3.setBackground(Color.white);
        mk3.setEditable(false);
        mk3.setFont(font);
        add(mk3);


        // Maks & Subject Information Row-4
        sub4 = new JTextField();
        sub4.setBorder(BorderFactory.createLineBorder(Color.black));
        sub4.setForeground(new Color(65,105,225));
        sub4.setBounds(80,355,100,30);
        sub4.setBackground(Color.white);
        sub4.setEditable(false);
        sub4.setFont(font);
        add(sub4);

        mx4 = new JTextField("        100");
        mx4.setBorder(BorderFactory.createLineBorder(Color.black));
        mx4.setForeground(new Color(65,105,225));
        mx4.setBounds(260,355,100,30);
        mx4.setBackground(Color.white);
        mx4.setEditable(false);
        mx4.setFont(font);
        add(mx4);

        min4 = new JTextField("       33 ");
        min4.setBorder(BorderFactory.createLineBorder(Color.black));
        min4.setForeground(new Color(65,105,225));
        min4.setBounds(440,355,100,30);
        min4.setBackground(Color.white);
        min4.setEditable(false);
        min4.setFont(font);
        add(min4);

        mk4 = new JTextField();
        mk4.setBorder(BorderFactory.createLineBorder(Color.black));
        mk4.setForeground(new Color(65,105,225));
        mk4.setBounds(620,355,100,30);
        mk4.setBackground(Color.white);
        mk4.setEditable(false);
        mk4.setFont(font);
        add(mk4);


        // Maks & Subject Information Row-5.
        sub5 = new JTextField();
        sub5.setBorder(BorderFactory.createLineBorder(Color.black));
        sub5.setForeground(new Color(65,105,225));
        sub5.setBounds(80,390,100,30);
        sub5.setBackground(Color.white);
        sub5.setEditable(false);
        sub5.setFont(font);
        add(sub5);

        mx5 = new JTextField("        100");
        mx5.setBorder(BorderFactory.createLineBorder(Color.black));
        mx5.setForeground(new Color(65,105,225));
        mx5.setBounds(260,390,100,30);
        mx5.setBackground(Color.white);
        mx5.setEditable(false);
        mx5.setFont(font);
        add(mx5);

        min5 = new JTextField("       33 ");
        min5.setBorder(BorderFactory.createLineBorder(Color.black));
        min5.setForeground(new Color(65,105,225));
        min5.setBounds(440,390,100,30);
        min5.setBackground(Color.white);
        min5.setEditable(false);
        min5.setFont(font);
        add(min5);

        mk5 = new JTextField();
        mk5.setBorder(BorderFactory.createLineBorder(Color.black));
        mk5.setForeground(new Color(65,105,225));
        mk5.setBounds(620,390,100,30);
        mk5.setBackground(Color.white);
        mk5.setEditable(false);
        mk5.setFont(font);
        add(mk5);


        // Add Total Maks Label And Input Field.
        totalMaks = new JLabel("Total Maks :");
        totalMaks.setBounds(500,440,120,30);
        totalMaks.setForeground(Color.black);
        totalMaks.setBackground(Color.white);
        totalMaks.setFont(font);
        add(totalMaks);

        TotalMaks = new JTextField();
        TotalMaks.setBorder(BorderFactory.createLineBorder(Color.black));
        TotalMaks.setForeground(new Color(65,105,225));
        TotalMaks.setBounds(600,440,120,30);
        TotalMaks.setBackground(Color.white);
        TotalMaks.setEditable(false);
        TotalMaks.setFont(font);
        add(TotalMaks);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(80,440,120,30);
        Cancel.addActionListener(this);
        Cancel.setForeground(Color.red);
        Cancel.setBackground(Color.white);
        Cancel.setFont(font);
        add(Cancel);


        // Set All Data In TextField By Using Roll Number And Semester.
        try{
            int x = 0;
            ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select * from student where roll = '"+ROLL+"'").executeQuery();
            if(rs.next()){
                Name.setText(rs.getString("name"));
                Father.setText(rs.getString("father"));
                Course.setText(rs.getString("course"));
                Branch.setText(rs.getString("branch"));
            }

            ResultSet rs1 = JDBC.jdbcgetConnection().prepareStatement("select * from subject where roll = '"+ROLL+"' and semester = '"+SEM+"'").executeQuery();
            if(rs1.next()){
                sub1.setText(rs1.getString("subject1"));
                sub2.setText(rs1.getString("subject2"));
                sub3.setText(rs1.getString("subject3"));
                sub4.setText(rs1.getString("subject4"));
                sub5.setText(rs1.getString("subject5"));
            }

            ResultSet rs2 = JDBC.jdbcgetConnection().prepareStatement("select * from maks where roll = '"+ROLL+"' and semester = '"+SEM+"'").executeQuery();
            if(rs2.next()){
                x += Integer.parseInt(rs2.getString("maks1"));
                x += Integer.parseInt(rs2.getString("maks2"));
                x += Integer.parseInt(rs2.getString("maks3"));
                x += Integer.parseInt(rs2.getString("maks4"));
                x += Integer.parseInt(rs2.getString("maks5"));
                mk1.setText(rs2.getString("maks1"));
                mk2.setText(rs2.getString("maks2"));
                mk3.setText(rs2.getString("maks3"));
                mk4.setText(rs2.getString("maks4"));
                mk5.setText(rs2.getString("maks5"));
            }

            TotalMaks.setText("      "+x+"/500");

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

    }

}
