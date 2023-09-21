
// Import Class & Packages.
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import com.toedter.calendar.JDateChooser;

public class FacultyLeave extends JFrame implements ActionListener {
    // Variable Declaration.
    JLabel heading, search, leaveDate, image, timeDuration, leaveDateEnd; JButton Submit, Cancel;
    Font font = new Font("Arial", Font.BOLD,16); JDateChooser LeaveDate, LeaveDateEnd;
    ImageIcon IMAGE = new ImageIcon(ClassLoader.getSystemResource("icon/Logo.gif"));
    Image IMAGE2 = IMAGE.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
    JComboBox<String> Search, TimeDuration;

    FacultyLeave(){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Heading In Top Of Frame.
        heading = new JLabel("Faculty Leave Form!");
        heading.setFont(new Font("Arial",Font.BOLD,25));
        heading.setBounds(275,10,250,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);


        // Add Logo Image In Right Side Of Frame.
        image = new JLabel(new ImageIcon(IMAGE2));
        image.setBounds(400,50,400,400);
        add(image);


        // Add Search Label And Input Field.
        search = new JLabel("Select Employee ID :");
        search.setBounds(20,115,200,30);
        search.setForeground(Color.black);
        search.setBackground(Color.white);
        search.setFont(font);
        add(search);

        Search = new JComboBox<>();
        Search.setBorder(BorderFactory.createLineBorder(Color.black));
        Search.setForeground(new Color(65,105,225));
        Search.setBounds(200,115,200,30);
        Search.setBackground(Color.white);
        Search.setFont(font);
        add(Search);


        // Add Leave Start Date Label And Input Field.
        leaveDate = new JLabel("Leave Starting Date :");
        leaveDate.setBounds(20,175,160,30);
        leaveDate.setForeground(Color.black);
        leaveDate.setBackground(Color.white);
        leaveDate.setFont(font);
        add(leaveDate);

        LeaveDate = new JDateChooser();
        LeaveDate.setBorder(BorderFactory.createLineBorder(Color.black));
        LeaveDate.setForeground(new Color(65,105,225));
        LeaveDate.setBounds(200,175,200,30);
        LeaveDate.setBackground(Color.white);
        LeaveDate.setFont(font);
        add(LeaveDate);


        // Add Leave End Date Label And Input Field.
        leaveDateEnd = new JLabel("Leave Ending Date :");
        leaveDateEnd.setBounds(20,235,160,30);
        leaveDateEnd.setForeground(Color.black);
        leaveDateEnd.setBackground(Color.white);
        leaveDateEnd.setFont(font);
        add(leaveDateEnd);

        LeaveDateEnd = new JDateChooser();
        LeaveDateEnd.setBorder(BorderFactory.createLineBorder(Color.black));
        LeaveDateEnd.setForeground(new Color(65,105,225));
        LeaveDateEnd.setBounds(200,235,200,30);
        LeaveDateEnd.setBackground(Color.white);
        LeaveDateEnd.setFont(font);
        add(LeaveDateEnd);


        // Add Time Duration Label And Input Field.
        timeDuration = new JLabel("Time Duration :");
        timeDuration.setBounds(20,295,200,30);
        timeDuration.setForeground(Color.black);
        timeDuration.setBackground(Color.white);
        timeDuration.setFont(font);
        add(timeDuration);

        TimeDuration = new JComboBox<>(new String[]{"Full Day", "Half Day"});
        TimeDuration.setBorder(BorderFactory.createLineBorder(Color.black));
        TimeDuration.setForeground(new Color(65,105,225));
        TimeDuration.setBounds(200,295,200,30);
        TimeDuration.setBackground(Color.white);
        TimeDuration.setFont(font);
        add(TimeDuration);


        // Add Submit Button.
        Submit = new JButton("Leave");
        Submit.setBorder(BorderFactory.createLineBorder(Color.black));
        Submit.setBounds(65,355,120,30);
        Submit.addActionListener(this);
        Submit.setForeground(Color.blue);
        Submit.setBackground(Color.white);
        Submit.setFont(font);
        add(Submit);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(215,355,120,30);
        Cancel.addActionListener(this);
        Cancel.setForeground(Color.red);
        Cancel.setBackground(Color.white);
        Cancel.setFont(font);
        add(Cancel);


        // Set Student Roll Number Value In ComboBox.
        try{
            ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select id from faculty").executeQuery();
            while(rs.next()){
                Search.addItem(rs.getString("id"));
            }
        }
        catch(Exception e){
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
            if(((JTextField)LeaveDate.getDateEditor().getUiComponent()).getText().equals("")||
                    ((JTextField)LeaveDateEnd.getDateEditor().getUiComponent()).getText().equals("")){
                JOptionPane.showMessageDialog(this,"Data Field Is Empty!","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    int x = JDBC.jdbcgetConnection().prepareStatement("insert into facultyLeave values('"+Search.getSelectedItem()+"', '"+((JTextField)LeaveDate.getDateEditor().getUiComponent()).getText()+"', '"+((JTextField)LeaveDateEnd.getDateEditor().getUiComponent()).getText()+"', '"+TimeDuration.getSelectedItem()+"')").executeUpdate();
                    if(x>0){
                        dispose();
                    }
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        }

    }

}
