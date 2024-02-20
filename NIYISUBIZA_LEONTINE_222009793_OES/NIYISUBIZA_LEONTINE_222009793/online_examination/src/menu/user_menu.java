package menu;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import myform.gradeform;
import myform.submissionform;
import myform.userform;

public class user_menu extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JMenuBar menuBar;
    private JMenu userMenu;
    private JMenu submissionMenu;
    private JMenu gradeMenu;
    private JMenuItem revenueItem;
    private JMenuItem transactionItem;
    private JMenuItem userItem;
    private String loggedInUser;

    public user_menu(String username) {
        this.loggedInUser = username;
        setTitle("Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuBar = new JMenuBar();

        userMenu = new JMenu("Revenue");
        submissionMenu = new JMenu("Transaction");
        gradeMenu = new JMenu("User");

        revenueItem = new JMenuItem("Revenue Form");
        transactionItem = new JMenuItem("Transaction Form");
        userItem = new JMenuItem("User Form");

        revenueItem.addActionListener(this);
        transactionItem.addActionListener(this);
        userItem.addActionListener(this);

        userMenu.add(revenueItem);
        submissionMenu.add(transactionItem);
        gradeMenu.add(userItem);

        menuBar.add(userMenu);
        menuBar.add(submissionMenu);
        menuBar.add(gradeMenu);

        setJMenuBar(menuBar);

        JPanel dashboardPanel = new JPanel();
        dashboardPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("WELCOME " + loggedInUser + " DASHBOARD");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        dashboardPanel.add(titleLabel, BorderLayout.CENTER);

        add(dashboardPanel);

        setVisible(true);
    }

    
    public void actionPerformed1(ActionEvent e) {
        Object gradeItem = null;
		Object submissionItem = null;
		if (e.getSource() == userItem) {
            new userform();
        } else if (e.getSource() == submissionItem) {
            new submissionform();
        } else if (e.getSource() == gradeItem) {
            new gradeform();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new user_menu("TO GOVERNMENT_REVENUE_MANAGEMENT_SYSTEM"));
    }}

	
