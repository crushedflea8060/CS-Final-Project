import javax.swing.*;
import java.awt.*;

public class MyProgram extends JFrame implements Runnable{
    public MyProgram() {
        setTitle("My App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        DrawPanel drawpanel = new DrawPanel();
        drawpanel.setPreferredSize(new Dimension(800, 500));
        add(drawpanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(1, 4, 5, 0));
        bottomPanel.setPreferredSize(new Dimension(800, 150));

        JTextArea textArea = new JTextArea("Enter text...");
        bottomPanel.add(new JScrollPane(textArea));
        
        JTextArea textArea2 = new JTextArea("Enter text...");
        bottomPanel.add(new JScrollPane(textArea2));

        JPanel buttonPanelA = new JPanel(new GridLayout(3, 1, 0, 5));
        buttonPanelA.add(new JButton("Action 1"));
        buttonPanelA.add(new JButton("Action 2"));
        buttonPanelA.add(new JButton("Action 3"));
        bottomPanel.add(buttonPanelA);

        JPanel buttonPanelB = new JPanel(new GridLayout(3, 1, 0, 5));
        buttonPanelB.add(new JButton("Option A"));
        buttonPanelB.add(new JButton("Option B"));
        buttonPanelB.add(new JButton("Option C"));
        bottomPanel.add(buttonPanelB);

        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.add(new JLabel("Status: Ready", SwingConstants.CENTER), BorderLayout.CENTER);
        bottomPanel.add(rightPanel);

        add(bottomPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new MyProgram());
    }
}
