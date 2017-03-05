import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @author Sonal Sharma
 */
public class stockAnalyzer extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    stockAnalyzer frame = new stockAnalyzer();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public stockAnalyzer() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBackground(Color.ORANGE);
        contentPane.add(dateChooser, BorderLayout.CENTER);
        dateChooser.setLayout(null);

        JDateChooser dateChooser_1 = new JDateChooser();
        dateChooser_1.setBounds(112, 45, 91, 20);
        dateChooser.add(dateChooser_1);

        JLabel lblStartDate = DefaultComponentFactory.getInstance().createLabel("Start Date :");
        lblStartDate.setBounds(10, 51, 92, 14);
        dateChooser.add(lblStartDate);

        JLabel lblSelectNumberOf = new JLabel("Select number of days");
        lblSelectNumberOf.setBounds(24, 103, 153, 14);
        dateChooser.add(lblSelectNumberOf);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("20");
        rdbtnNewRadioButton.setBounds(34, 124, 109, 23);
        dateChooser.add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("100");
        rdbtnNewRadioButton_1.setBounds(34, 176, 109, 23);
        dateChooser.add(rdbtnNewRadioButton_1);

        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("50");
        rdbtnNewRadioButton_2.setBounds(34, 150, 109, 23);
        dateChooser.add(rdbtnNewRadioButton_2);

        JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("200");
        rdbtnNewRadioButton_3.setBounds(34, 202, 109, 23);
        dateChooser.add(rdbtnNewRadioButton_3);

        JButton btnNewButton = new JButton("Display Chart");
        btnNewButton.setBounds(192, 202, 115, 23);
        dateChooser.add(btnNewButton);

        JLabel lblProfitRus = new JLabel("Profit Rus");
        lblProfitRus.setBounds(149, 11, 91, 14);
        dateChooser.add(lblProfitRus);
    }
}
