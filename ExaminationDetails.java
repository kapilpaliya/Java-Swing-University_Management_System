

// Import Classes And Packages.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{
    // Variable Declaration.
    JLabel heading, search, semester; JButton Fiend, Cancel; JComboBox<String> Semester;
    Font font = new Font("Arial", Font.BOLD,16);
    JTextField Search; JTable table; JScrollPane sp;
    ExaminationDetails(){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Heading In Top Of Frame.
        heading = new JLabel("Show Examination Details!");
        heading.setFont(new Font("Arial",Font.BOLD,25));
        heading.setBounds(243,10,315,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);


        // Add Search Label And Input Field.
        search = new JLabel("Select Roll Number In Table :");
        search.setBounds(25,55,220,30);
        search.setForeground(Color.black);
        search.setBackground(Color.white);
        search.setFont(font);
        add(search);

        Search = new JTextField();
        Search.setBorder(BorderFactory.createLineBorder(Color.black));
        Search.setEnabled(false);
        Search.setForeground(new Color(65,105,225));
        Search.setBounds(255,55,200,30);
        Search.setBackground(Color.white);
        Search.setFont(font);
        add(Search);


        // Add Semester Label And Input Field.
        semester = new JLabel("Semester :");
        semester.setBounds(475,55,90,30);
        semester.setForeground(Color.black);
        semester.setBackground(Color.white);
        semester.setFont(font);
        add(semester);

        Semester = new JComboBox<>(new String[]{"semester1", "semester2", "semester3", "semester4", "semester5", "semester6", "semester7", "semester8"});
        Semester.setBorder(BorderFactory.createLineBorder(Color.black));
        Semester.setForeground(new Color(65,105,225));
        Semester.setBounds(570,55,200,30);
        Semester.setBackground(Color.white);
        Semester.setFont(font);
        add(Semester);


        // Add Fiend Button.
        Fiend = new JButton("Result");
        Fiend.setBorder(BorderFactory.createLineBorder(Color.black));
        Fiend.setBounds(265,105,120,30);
        Fiend.setBackground(Color.white);
        Fiend.setForeground(Color.green);
        Fiend.addActionListener(this);
        Fiend.setFont(font);
        add(Fiend);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(415,105,120,30);
        Cancel.setBackground(Color.white);
        Cancel.setForeground(Color.red);
        Cancel.addActionListener(this);
        Cancel.setFont(font);
        add(Cancel);


        // Add Table In Frame.
        table = new JTable();
        table.setBorder(BorderFactory.createLineBorder(Color.black));
        table.setBounds(0,150,800,300);
        table.setBackground(Color.white);
        table.setForeground(Color.blue);
        table.setFont(new Font("Arial",Font.BOLD,14));
        add(table);


        // Add ScrollPane To Store More Data In Table Button.
        sp = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setBorder(BorderFactory.createLineBorder(Color.black));
        sp.setBounds(0,150,800,350);
        sp.setBackground(Color.white);
        sp.setForeground(Color.red);
        sp.setFont(font);
        add(sp);


        // Set Value In Table And ComboBox.
        try{
            ResultSet rs1 = JDBC.jdbcgetConnection().prepareStatement("select * from student").executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs1));
        }
        catch(Exception e){
            e.printStackTrace();
        }


        // Set Roll Number In Search Text Field By Selecting Table Row.
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Search.setText(table.getModel().getValueAt(table.getSelectedRow(),2).toString());
            }
        });

        setVisible(true);

    }


    // Override The ActionListener Method.
    @Override
    public void actionPerformed(ActionEvent e){

        // Declaration Of Cancel Button.
        if(e.getSource()==Cancel){
            dispose();
        }


        // Declaration Of Fiend Button.
        if(e.getSource()==Fiend){
            new StudentResult(Search.getText(),(String)Semester.getSelectedItem());
            dispose();
        }

    }

}
