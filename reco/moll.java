import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 * This class represents a custom view with font settings.
 * Font information flows down the view hierarchy.
 */
public class CustomView extends JPanel {
    
    private Font font;

    public CustomView(Font font) {
        this.font = font;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the font for this view
        g.setFont(font);
        
        // Draw some text using the font
        g.drawString("Hello, Custom View!", 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom View Example");
        Font customFont = new Font("Serif", Font.BOLD, 20);
        CustomView customView = new CustomView(customFont);

        frame.add(customView);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
