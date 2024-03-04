package Classes;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame{
    private TitleBar titleBar;
    private List list;
    private Footer footer;

    private JButton newTask;
    private JButton clear;

    //Constructor
    AppFrame()
    {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        titleBar = new TitleBar();
        list = new List();
        footer= new Footer();
        this.add(titleBar,BorderLayout.NORTH);
        this.add(footer,BorderLayout.SOUTH);

        this.add(list,BorderLayout.CENTER);

        newTask = footer.getNewTask();
        clear = footer.getClear();

        addListeners();

    }
    public void addListeners(){
        newTask.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.updateNumber();

                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e){
                        task.changeState();
                        list.updateNumber();
                        revalidate();
                    }
                });

            }

        });
        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                list.removeCompletedTasks();
                repaint();
            }
        });
    }

}
