package Classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel{
    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();
    //Constructor
    ButtonPanel(){
        this.setPreferredSize(new  Dimension(400, 60));
       // this.setBackground(Color.red); //REd Lable at the bottom

         //This the code of Add Task button at the below
        addTask = new JButton("Add Task");
        addTask.setBorder(getBorder());
        addTask.setFont(new Font("sans-serif",Font.PLAIN,20));

        this.add(addTask);

         this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Clear completed task");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif",Font.PLAIN,20));

        this.add(clear);
    }
    public JButton getAddTask(){
        return addTask;
    }
    public JButton getClear(){
        return clear;
    }

}
