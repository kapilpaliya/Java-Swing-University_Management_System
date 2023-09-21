

// Import Classes & Packages.
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame implements ActionListener {
    JMenuBar menuBar; Font font = new Font("Arial", Font.BOLD,16);
    JMenu newInformation, viewInformation, applyLeave, viewLeave, updateDetails, examination,
            feeDetails, utility, profile;
    JMenuItem newFaculty, newStudent, viewFaculty,viewStudent, facultyLeave, studentLeave, viewStudentLeave,
            viewFacultyLeave,updateFaculty, updateStudent, examResult, examMarks, studentFeeForm, studentFeeStructure, studentFeeDetails, calculatorUtility,
            notepadUtility, exitExit;
    ImageIcon IMAGE = new ImageIcon(ClassLoader.getSystemResource("icon/Background.gif"));
    Image IMAGE2 = IMAGE.getImage().getScaledInstance(900,600, Image.SCALE_DEFAULT);
    JLabel image;
    Home(){
        // Add Frame To Store Component.
        setBounds(350, 100, 900, 600);
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);
        setUndecorated(true);


        // Add Logo Image In Right Side Of Frame.
        image = new JLabel(new ImageIcon(IMAGE2));
        image.setBounds(0,0,900,600);
        add(image);


        // Add ManuBar In Frame.
        menuBar = new JMenuBar();
        menuBar.setForeground(Color.black);
        menuBar.setBackground(Color.white);


        // New Information Menu & Menu Items.
        newInformation = new JMenu("New Information");
        newInformation.setForeground(new Color(0,1,0));
        newInformation.setBackground(Color.white);
        newInformation.setFont(font);

        newFaculty = new JMenuItem("New Faculty");
        newFaculty.setForeground(new Color(123,104,238));
        newFaculty.setBackground(Color.white);
        newFaculty.addActionListener(this);
        newFaculty.setFont(font);

        newStudent = new JMenuItem("New Student");
        newStudent.setForeground(new Color(123,104,238));
        newStudent.setBackground(Color.white);
        newStudent.addActionListener(this);
        newStudent.setFont(font);

        newInformation.add(newFaculty);
        newInformation.add(newStudent);
        menuBar.add(newInformation);



        // New View Information Menu & Menu Items.
        viewInformation = new JMenu("View Details");
        viewInformation.setForeground(new Color(0,1,0));
        viewInformation.setBackground(Color.white);
        viewInformation.setFont(font);

        viewFaculty = new JMenuItem("Faculty Details");
        viewFaculty.setForeground(new Color(123,104,238));
        viewFaculty.setBackground(Color.white);
        viewFaculty.addActionListener(this);
        viewFaculty.setFont(font);

        viewStudent = new JMenuItem("Student Details");
        viewStudent.setForeground(new Color(123,104,238));
        viewStudent.setBackground(Color.white);
        viewStudent.addActionListener(this);
        viewStudent.setFont(font);

        viewInformation.add(viewFaculty);
        viewInformation.add(viewStudent);
        menuBar.add(viewInformation);



        // New Apply Leave Menu & Menu Items.
        applyLeave = new JMenu("Apply Leave");
        applyLeave.setForeground(new Color(0,1,0));
        applyLeave.setBackground(Color.white);
        applyLeave.setFont(font);

        facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setForeground(new Color(123,104,238));
        facultyLeave.setBackground(Color.white);
        facultyLeave.addActionListener(this);
        facultyLeave.setFont(font);

        studentLeave = new JMenuItem("Student Leave");
        studentLeave.setForeground(new Color(123,104,238));
        studentLeave.setBackground(Color.white);
        studentLeave.addActionListener(this);
        studentLeave.setFont(font);

        applyLeave.add(facultyLeave);
        applyLeave.add(studentLeave);
        menuBar.add(applyLeave);



        // New View Leave Menu & Menu Items.
        viewLeave = new JMenu("Leave Details");
        viewLeave.setForeground(new Color(0,1,0));
        viewLeave.setBackground(Color.white);
        viewLeave.setFont(font);

        viewFacultyLeave = new JMenuItem("Faculty Leave Details");
        viewFacultyLeave.setForeground(new Color(123,104,238));
        viewFacultyLeave.setBackground(Color.white);
        viewFacultyLeave.addActionListener(this);
        viewFacultyLeave.setFont(font);

        viewStudentLeave = new JMenuItem("Student Leave Details");
        viewStudentLeave.setForeground(new Color(123,104,238));
        viewStudentLeave.setBackground(Color.white);
        viewStudentLeave.addActionListener(this);
        viewStudentLeave.setFont(font);

        viewLeave.add(viewFacultyLeave);
        viewLeave.add(viewStudentLeave);
        menuBar.add(viewLeave);



        // New Update Details Menu & Menu Items.
        updateDetails = new JMenu("Update Details");
        updateDetails.setForeground(new Color(0,1,0));
        updateDetails.setBackground(Color.white);
        updateDetails.setFont(font);

        updateFaculty = new JMenuItem("Update Faculty Details");
        updateFaculty.setForeground(new Color(123,104,238));
        updateFaculty.setBackground(Color.white);
        updateFaculty.addActionListener(this);
        updateFaculty.setFont(font);

        updateStudent = new JMenuItem("Update Student Details");
        updateStudent.setForeground(new Color(123,104,238));
        updateStudent.setBackground(Color.white);
        updateStudent.addActionListener(this);
        updateStudent.setFont(font);

        updateDetails.add(updateFaculty);
        updateDetails.add(updateStudent);
        menuBar.add(updateDetails);



        // New Examination Info Menu & Menu Items.
        examination = new JMenu("Examination");
        examination.setForeground(new Color(0,1,0));
        examination.setBackground(Color.white);
        examination.setFont(font);

        examResult = new JMenuItem("Exam Results");
        examResult.setForeground(new Color(123,104,238));
        examResult.setBackground(Color.white);
        examResult.addActionListener(this);
        examResult.setFont(font);

        examMarks = new JMenuItem("Exam Marks");
        examMarks.setForeground(new Color(123,104,238));
        examMarks.setBackground(Color.white);
        examMarks.addActionListener(this);
        examMarks.setFont(font);

        examination.add(examResult);
        examination.add(examMarks);
        menuBar.add(examination);



        // New Fee Details Menu & Menu Items.
        feeDetails = new JMenu("Fee Details");
        feeDetails.setForeground(new Color(0,1,0));
        feeDetails.setBackground(Color.white);
        feeDetails.setFont(font);

        studentFeeStructure = new JMenuItem("Student Fee Structure");
        studentFeeStructure.setForeground(new Color(123,104,238));
        studentFeeStructure.setBackground(Color.white);
        studentFeeStructure.addActionListener(this);
        studentFeeStructure.setFont(font);

        studentFeeDetails = new JMenuItem("Student Fee Details");
        studentFeeDetails.setForeground(new Color(123,104,238));
        studentFeeDetails.setBackground(Color.white);
        studentFeeDetails.addActionListener(this);
        studentFeeDetails.setFont(font);

        studentFeeForm = new JMenuItem("Student Fee Form");
        studentFeeForm.setForeground(new Color(123,104,238));
        studentFeeForm.setBackground(Color.white);
        studentFeeForm.addActionListener(this);
        studentFeeForm.setFont(font);

        feeDetails.add(studentFeeStructure);
        feeDetails.add(studentFeeDetails);
        feeDetails.add(studentFeeForm);
        menuBar.add(feeDetails);



        // New Utility Menu & Menu Items.
        utility = new JMenu("Utility");
        utility.setForeground(new Color(0,1,0));
        utility.setBackground(Color.white);
        utility.setFont(font);

        notepadUtility = new JMenuItem("Notepad");
        notepadUtility.setForeground(new Color(123,104,238));
        notepadUtility.setBackground(Color.white);
        notepadUtility.addActionListener(this);
        notepadUtility.setFont(font);

        calculatorUtility = new JMenuItem("Calculator");
        calculatorUtility.setForeground(new Color(123,104,238));
        calculatorUtility.setBackground(Color.white);
        calculatorUtility.addActionListener(this);
        calculatorUtility.setFont(font);

        utility.add(notepadUtility);
        utility.add(calculatorUtility);
        menuBar.add(utility);



        // New Exit Menu & Menu Items.
        profile = new JMenu("Exit");
        profile.setForeground(new Color(0,1,0));
        profile.setBackground(Color.white);
        profile.setFont(font);

        exitExit = new JMenuItem("exit");
        exitExit.setForeground(new Color(123,104,238));
        exitExit.setBackground(Color.white);
        exitExit.addActionListener(this);
        exitExit.setFont(font);

        profile.add(exitExit);
        menuBar.add(profile);



        setJMenuBar(menuBar);
        setVisible(true);
    }

    // Override The ActionListener Methods.
    @Override
    public void actionPerformed(ActionEvent e){

        // New Information Manu Declaration.
        if(e.getSource() == newFaculty){
            new NewFaculty();
        }
        else if(e.getSource() == newStudent){
            new NewStudent();

        }


        // View Information Manu Declaration.
        else if(e.getSource() == viewFaculty){
            new ViewFaculty();
        }
        else if(e.getSource() == viewStudent){
            new ViewStudent();
        }


        // Apply Leave Manu Declaration.
        else if(e.getSource() == facultyLeave){
            new FacultyLeave();
        }
        else if(e.getSource() == studentLeave){
            new StudentLeave();
        }


        // View Leave Manu Declaration.
        else if(e.getSource() == viewFacultyLeave){
            new FacultyLeaveView();
        }
        else if(e.getSource() == viewStudentLeave){
            new StudentLeaveView();
        }


        // Update Details Manu Declaration.
        else if(e.getSource() == updateFaculty){
            new UpdateFaculty();
        }
        else if(e.getSource() == updateStudent){
            new UpdateStudent();
        }


        // Examination Manu Declaration.
        else if(e.getSource() == examResult){
            new ExaminationDetails();
        }
        else if(e.getSource() == examMarks){
            new ExamMaks();
        }


        // Fee Details Manu Declaration.
        else if(e.getSource()==studentFeeStructure){
            new FeeStructure();
        }
        else if(e.getSource() == studentFeeDetails){
            new StudentFeeDetails();
        }
        else if(e.getSource() == studentFeeForm){
            new StudentFeeForm();
        }


        // Utility Manu Declaration.
        else if(e.getSource() == notepadUtility){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch (Exception E){
                E.printStackTrace();
            }
        }
        else if(e.getSource() == calculatorUtility){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch (Exception E){
                E.printStackTrace();
            }
        }


        // Profile Manu Declaration.
        else if(e.getSource() == exitExit){
            dispose();
        }

    }

}