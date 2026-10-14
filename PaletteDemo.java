import javax.swing.*;
import java.awt.*;

public class PaletteDemo extends JFrame {
    public PaletteDemo() {
        setTitle("Color Palette Window");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        add(createColorPanel(Color.RED));
        add(createColorPanel(Color.GREEN));
        add(createColorPanel(Color.BLUE));
        add(createColorPanel(Color.YELLOW));
    }

    private JPanel createColorPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    public static void main(String[] args) {
        new PaletteDemo().setVisible(true);
    }
}