import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField fullNameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JTextField phoneField;
    private JTextField addressField;
    private JTextField idProofField;
    private JTextField emergencyContactField;
    private JButton submitButton;
    
    public RegistrationForm() {
        // Set up the frame
        setTitle("Hotel Booking App - Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create the panel and layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2));
        
        // Create the fields and labels
        JLabel fullNameLabel = new JLabel("Full Name:");
        fullNameField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email Address:");
        emailField = new JTextField();
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneField = new JTextField();
        
        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        
        JLabel idProofLabel = new JLabel("ID Proof:");
        idProofField = new JTextField();
        
        JLabel emergencyContactLabel = new JLabel("Emergency Contact:");
        emergencyContactField = new JTextField();
        
        // Create the submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        
        // Add fields and labels to the panel
        panel.add(fullNameLabel);
        panel.add(fullNameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(idProofLabel);
        panel.add(idProofField);
        panel.add(emergencyContactLabel);
        panel.add(emergencyContactField);
        panel.add(new JLabel()); // Empty cell
        panel.add(submitButton);
        
        // Add the panel to the frame
        add(panel);
    }
    
    // Listener for the submit button
    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fullName = fullNameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());
            String phone = phoneField.getText();
            String address = addressField.getText();
            String idProof = idProofField.getText();
            String emergencyContact = emergencyContactField.getText();
            
            // Basic validation (more complex validation can be added)
            if (fullName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || phone.isEmpty() || address.isEmpty() || idProof.isEmpty() || emergencyContact.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Success message (you can replace this with actual registration logic)
            JOptionPane.showMessageDialog(null, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        // Create and display the registration form
        SwingUtilities.invokeLater(() -> {
            RegistrationForm form = new RegistrationForm();
            form.setVisible(true);
        });
    }
}
