

// Import Classes And Packages.
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
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

public class FeeStructure extends JFrame implements ActionListener {
    // Variable Declaration.
    JLabel heading; JButton Print, Cancel;
    Font font = new Font("Arial", Font.BOLD,16);
    JTable table; JScrollPane sp;
    FeeStructure(){
        // Add Frame To Store Component.
        setBounds(400, 150, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setUndecorated(true);


        // Add Heading In Top Of Frame.
        heading = new JLabel("Show Fee Structure!");
        heading.setFont(new Font("Arial",Font.BOLD,25));
        heading.setBounds(275,10,250,30);
        heading.setForeground(new Color(255,215,0));
        heading.setBackground(Color.white);
        add(heading);


        // Add Table In Frame.
        table = new JTable();
        table.setBorder(BorderFactory.createLineBorder(Color.black));
        table.setBounds(0,70,800,300);
        table.setBackground(Color.white);
        table.setForeground(Color.blue);
        table.setFont(new Font("Arial",Font.PLAIN,14));
        add(table);


        // Add ScrollPane To Store More Data In Table Button.
        sp = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBorder(BorderFactory.createLineBorder(Color.black));
        sp.setBounds(0,70,800,350);
        sp.setBackground(Color.white);
        sp.setForeground(Color.red);
        sp.setFont(font);
        add(sp);


        // Add Print Button.
        Print = new JButton("Print");
        Print.setBorder(BorderFactory.createLineBorder(Color.black));
        Print.setBounds(265,450,120,30);
        Print.setBackground(Color.white);
        Print.setForeground(Color.red);
        Print.addActionListener(this);
        Print.setFont(font);
        add(Print);


        // Add Cancel Button.
        Cancel = new JButton("Cancel");
        Cancel.setBorder(BorderFactory.createLineBorder(Color.black));
        Cancel.setBounds(415,450,120,30);
        Cancel.setBackground(Color.white);
        Cancel.setForeground(Color.red);
        Cancel.addActionListener(this);
        Cancel.setFont(font);
        add(Cancel);


        // Set Value In Table And ComboBox.
        try{
            ResultSet rs1 = JDBC.jdbcgetConnection().prepareStatement("select * from fee").executeQuery();
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

    }

}
