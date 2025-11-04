package swing_project;
import javax.swing.*;
import java.awt.*;
public class frame {
    public static void main(String[] args){
        JFrame frame =new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(15,10,1400,800);
        frame.setTitle("REAL ESTATE PROPERTY MANAGEMENT SYSTEM");
        ImageIcon image =new ImageIcon("Users/deepak/Downloads/houseImage.jpg");
        frame.setIconImage(image.getImage());
        
        Container contain =frame.getContentPane();
        Color color =new Color(100, 200,10);
        contain.setBackground(color);
        frame.setResizable(false);
        contain.setLayout(null);

        JLabel label =new JLabel("Property-");
        label.setBounds(400,10,300,50);
        contain.add(label);
        label.setVisible(true);

        ImageIcon image2 =new ImageIcon("Users/deepak/Downloads/houseImage.jpg");
        JLabel label2 =new JLabel(image2);
        label2.setBounds(10,50,image2.getIconWidth(),image2.getIconHeight());
        contain.add(label2);

        JLabel label3 =new JLabel("Text",image2,JLabel.LEFT);;
        contain.add(label3);
        frame.setVisible(true);


    }
}
