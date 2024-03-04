package Classes;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;

public class TitleBar extends  JPanel {

    //constructor
    TitleBar(){
        this.setPreferredSize(new Dimension(400, 50));
      //  this.setBackground(Color.red);

        JLabel titleText = new JLabel("To DO List");
        titleText.setPreferredSize(new Dimension(200, 60));
        titleText.setFont(new Font("Sans-serif",Font.BOLD,20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);
    }
}
