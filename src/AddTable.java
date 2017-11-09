import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddTable {
    String text;

//    public void reader() throws FileNotFoundException {
//        BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"));
//        Scanner scan = new Scanner(br);
//            text = scan.nextLine();
//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(text.split(" ")));
//        System.out.println(arrayList.get(1));
//
//        scan.close();
//
//    }
    public void add(){
        Panes pp = new Panes();
        pp.but0.addActionListener(e -> pp.textOne.setText("0"));


    }

}



