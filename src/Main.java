
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Panes www = new Panes();
        www.setLocationRelativeTo(null);
        www.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        www.setSize(new Dimension(400, 500));
        AddTable add = new AddTable();
        add.add();
        www.but1.addActionListener(e ->  www.textOne.setText(www.textOne.getText() + 1) );
        www.butPlus.addActionListener(e ->  www.textOne.setText(www.textOne.getText() + "+") );
        www.but5.addActionListener(e ->  www.textOne.setText(www.textOne.getText() + 5) );



        www.setVisible(true);


    }

}