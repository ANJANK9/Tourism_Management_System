package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tms extends JFrame {

    public tms() {
        setTitle("Tourism Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBounds(800,400,200,200);
        panel.setLayout(new BorderLayout());

        ImageIcon imageIcon = new ImageIcon("E:\\New folder\\Travel-and-Toursim-Management-System-master\\travel.management.system\\src\\travel\\management\\system\\icons\\tourism_image.jpg");
        Image image = imageIcon.getImage();
        int desiredWidth = 1920;
        int desiredHeight = 1080;
        Image newImg = image.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImg);
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel, BorderLayout.CENTER);

        JButton signUpButton = createStyledButton("SignUp");
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the SignUp window
                new Signup().setVisible(true);
            }
        });

        JButton loginButton = createStyledButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the Login window
                new Login().setVisible(true);
            }
        });

        JButton homeButton = createStyledButton("Home");
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to navigate to the home page
                // You can update the JLabel content or perform any other actions
                new tms().setVisible(true);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); // Adjust spacing
        buttonPanel.add(signUpButton);
        buttonPanel.add(loginButton);
        buttonPanel.add(homeButton);

        add(buttonPanel, BorderLayout.NORTH); // Move the buttons to the top
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBackground(new Color(51, 153, 255)); // Custom background color
        button.setForeground(Color.WHITE); // Text color
        button.setFocusPainted(false); // Remove the default border
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new tms());
    }
}
