
// Import Classes And Packages.
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class FacultyLeaveView extends JFrame implements ActionListener {
    // Variable Declaration.
    JLabel heading, search; JButton Fiend, Print, Cancel;
    Font font = new Font("Arial", Font.BOLD,16);
    JComboBox<String> Search; JTable table; JScrollPane sp;
    FacultyLeaveView(){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Heading In Top Of Frame.
        heading = new JLabel("Show Faculty Leave Details!");
        heading.setFont(new Font("Arial",Font.BOLD,25));
        heading.setBounds(235,10,330,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);


        // Add Search Label And Input Field.
        search = new JLabel("Search By ID Number :");
        search.setBounds(190,50,200,30);
        search.setForeground(Color.black);
        search.setBackground(Color.white);
        search.setFont(font);
        add(search);

        Search = new JComboBox<>();
        Search.setBorder(BorderFactory.createLineBorder(Color.black));
        Search.setForeground(new Color(65,105,225));
        Search.setBounds(410,50,200,30);
        Search.setBackground(Color.white);
        Search.setFont(font);
        add(Search);


        // Add Fiend Button.
        Fiend = new JButton("Search");
        Fiend.setBorder(BorderFactory.createLineBorder(Color.black));
        Fiend.setBounds(170,100,120,30);
        Fiend.setBackground(Color.white);
        Fiend.setForeground(Color.red);
        Fiend.addActionListener(this);
        Fiend.setFont(font);
        add(Fiend);


        // Add Print Button.
        Print = new JButton("Print");
        Print.setBorder(BorderFactory.createLineBorder(Color.black));
        Print.setBounds(320,100,120,30);
        Print.setBackground(Color.white);
        Print.setForeground(Color.red);
        Print.addActionListener(this);
        Print.setFont(font);
        add(Print);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(470,100,120,30);
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
        table.setFont(new Font("Arial",Font.BOLD,16));
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
            ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select id from faculty").executeQuery();
            while(rs.next()){
                Search.addItem(rs.getString("id"));
            }

            ResultSet rs1 = JDBC.jdbcgetConnection().prepareStatement("select * from facultyLeave").executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs1));
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


        // Declaration Of Print Button.
        if(e.getSource()==Print){
            try{
                table.print();
            }
            catch(Exception E){
                E.printStackTrace();
            }
        }


        // Declaration Of Fiend Button.
        if(e.getSource()==Fiend){
            try{
                ResultSet rs = JDBC.jdbcgetConnection().prepareStatement("select * from facultyLeave where id = '"+Search.getSelectedItem()+"'").executeQuery();
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception E){
                E.printStackTrace();
            }
        }

    }

}
