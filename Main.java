
// Import Class & Packages.
import javax.swing.JWindow;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Image;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JWindow{
    // Variable Declaration.
    ImageIcon IMAGE = new ImageIcon(ClassLoader.getSystemResource("icon/StartingFrameBackground.png"));
    Image IMAGE2 = IMAGE.getImage().getScaledInstance(800,500, Image.SCALE_DEFAULT);
    JLabel image; JProgressBar progressBar; Timer timer;
    Main(){
        // Create JWindow.
        setBounds(400,150,800,500);
        setLayout(new BorderLayout());
        revalidate();


        // Add Background Image In JWindow.
        image = new JLabel(new ImageIcon(IMAGE2));
        image.setBounds(0,0,800,500);
        image.setBorder(null);
        image.setForeground(Color.BLUE);
        image.setBackground(Color.white);
        add(image);


        // Add ProgressBar In JWindow Bottom Of JWindow.
        progressBar = new JProgressBar(0,100);
        progressBar.setForeground(Color.black);
        progressBar.setBackground(Color.white);
        progressBar.setBorder(null);
        add(progressBar,"South");


        // Set Progress Bar Timer Of 100s.
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = progressBar.getValue();
                if(x==100){
                    new Login();
                    dispose();
                    timer.stop();
                }
                else{
                    progressBar.setValue(x+4);
                }
            }
        });
        timer.start();

        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}