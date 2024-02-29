package furniture.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ProductDisplay extends JFrame {
    private Map<String, ImageIcon> productImages;

    public ProductDisplay() {
        super("Furniture Products");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(600, 400);

        // Load product images from the Icons folder
        loadProductImages();

        // Add products to the display
        addProduct("Chair", "chair.jpg");
        addProduct("Table", "table.jpg");
        // Add more products here...

        setVisible(true);
    }

    private void loadProductImages() {
        productImages = new HashMap<>();
        productImages.put("Chair", new ImageIcon(getClass().getResource("/icons/chair.jpg")));
        productImages.put("Table", new ImageIcon(getClass().getResource("/icons/table.jpg")));
        // Load more images here...
    }

    private void addProduct(String name, String imageName) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel nameLabel = new JLabel(name);
        panel.add(nameLabel, BorderLayout.NORTH);

        JLabel imageLabel = new JLabel(productImages.get(name));
        panel.add(imageLabel, BorderLayout.CENTER);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ProductDisplay::new);
    }
}
