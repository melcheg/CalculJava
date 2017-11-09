import javax.swing.*;
import java.awt.*;

public class Panes extends JFrame{
    GridBagLayout layout;
    TextField textOne;
    Button but1;
    Button but2;
    Button but3;
    Button but4;
    Button but5;
    Button but6;
    Button but7;
    Button but8;
    Button but9;
    Button but0;
    Button butPlus;
    Button butMinus;
    Button butDivide;
    Button butMultiply;
    Button butEgually;
    Button butLine;
    Button butMc;
    Button butMr;
    Button butMs;
    Button butMplus;
    Button butMminus;
    Button butC;
    Button butStrela;
    Button butCe;
    Button butPlusMinus;
    Button butSql;
    Button butPro;
    Button but1x;
    Button butMinusM;
    Button butT;

//    Button butStrela;
//    Button butStrela;
//    Button butStrela;
//    Button butStrela;


    JPanel panel;
    GridBagLayout gridLayout;

    public Panes() {
        super("knvklnv");
        gridLayout = new GridBagLayout();
        panel = new JPanel(new GridBagLayout());
        textOne = new TextField(50);

        but0 = new Button("0");
        but1 = new Button("1");
        but2 = new Button("2");
        but3 = new Button("3");
        but4 = new Button("4");
        but5 = new Button("5");
        but6 = new Button("6");
        but7 = new Button("7");
        but8 = new Button("8");
        but9 = new Button("9");
        butPlus = new Button("+");
        butMinus = new Button("-");
        butMultiply = new Button("*");
        butDivide = new Button("/");
        butEgually = new Button("=");
        butMc = new Button("MC");
        butMr = new Button("MR");
        butMs = new Button("MS");
        butMinusM = new Button("M-");
        butMplus = new Button("M+");
        butStrela = new Button("<-");
        butCe = new Button("CE");
        butC = new Button("C");
        butPlusMinus = new Button("+-");
        butSql = new Button("sgl");
        butPro = new Button("%");
        but1x = new Button("1/X");
        butT = new Button(".");
        layout = new GridBagLayout();

        panel.setPreferredSize(new Dimension(400, 500));
        add(panel);
        textOne.setFont(new Font("Dialog", Font.PLAIN, 25));

        but1.setFont(new Font("Dialog", Font.BOLD, 18));
        but2.setFont(new Font("Dialog", Font.BOLD, 18));
        but3.setFont(new Font("Dialog", Font.BOLD, 18));
        but4.setFont(new Font("Dialog", Font.BOLD, 18));
        but5.setFont(new Font("Dialog", Font.BOLD, 18));
        but6.setFont(new Font("Dialog", Font.BOLD, 18));
        but7.setFont(new Font("Dialog", Font.BOLD, 18));
        but8.setFont(new Font("Dialog", Font.BOLD, 18));
        but9.setFont(new Font("Dialog", Font.BOLD, 18));
        but0.setFont(new Font("Dialog", Font.BOLD, 18));
        butMs.setFont(new Font("Dialog", Font.BOLD, 18));
        butMr.setFont(new Font("Dialog", Font.BOLD, 18));
        butMc.setFont(new Font("Dialog", Font.BOLD, 18));
        butMinus.setFont(new Font("Dialog", Font.BOLD, 18));
        butMultiply.setFont(new Font("Dialog", Font.BOLD, 18));
        butPlusMinus.setFont(new Font("Dialog", Font.BOLD, 18));
        butSql.setFont(new Font("Dialog", Font.BOLD, 18));
        butStrela.setFont(new Font("Dialog", Font.BOLD, 18));
        but1x.setFont(new Font("Dialog", Font.BOLD, 18));
        butT.setFont(new Font("Dialog", Font.BOLD, 18));
        butC.setFont(new Font("Dialog", Font.BOLD, 18));
        butCe.setFont(new Font("Dialog", Font.BOLD, 18));
        butMinusM.setFont(new Font("Dialog", Font.BOLD, 18));
        butPlus.setFont(new Font("Dialog", Font.BOLD, 18));
        butEgually.setFont(new Font("Dialog", Font.BOLD, 18));
        butPro.setFont(new Font("Dialog", Font.BOLD, 18));
        butDivide.setFont(new Font("Dialog", Font.BOLD, 18));
        butMplus.setFont(new Font("Dialog", Font.BOLD, 18));



        butPro.setSize(100,100);
        butMs.setBounds(100, 100, 100, 100);



        panel.add(textOne, new GridBagConstraints( 0, 0, 5, 1, 0, 0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(10, 10, 10, 10), 0, 0 ));


        panel.add(butMc, new GridBagConstraints( 0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(10, 10, 10, 10), 0, 30 ));

        panel.add(butMr, new GridBagConstraints( 1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(10, 0, 10, 10), 0, 30 ));

        panel.add(butMs, new GridBagConstraints( 2, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(10, 0, 10, 10), 0, 30 ));

        panel.add(butMplus, new GridBagConstraints( 3, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(10, 0, 10, 10), 0, 30 ));

        panel.add(butMinusM, new GridBagConstraints( 4, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(10, 0, 10, 10), 0, 30 ));

        panel.add(butStrela, new GridBagConstraints( 0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 10, 10), 0, 30 ));

        panel.add(butCe, new GridBagConstraints( 1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(butC, new GridBagConstraints( 2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(butPlusMinus, new GridBagConstraints( 3, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(butSql, new GridBagConstraints( 4, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(but7, new GridBagConstraints( 0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 10, 10), 0, 30 ));

        panel.add(but8, new GridBagConstraints( 1, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(but9, new GridBagConstraints( 2, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(butDivide, new GridBagConstraints( 3, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(butPro, new GridBagConstraints( 4, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(but4, new GridBagConstraints( 0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 10, 10), 0, 30 ));

        panel.add(but5, new GridBagConstraints( 1, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(but6, new GridBagConstraints( 2, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(butMultiply, new GridBagConstraints( 3, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(but1x, new GridBagConstraints( 4, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(but1, new GridBagConstraints( 0, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 10, 10), 0, 30 ));

        panel.add(but2, new GridBagConstraints( 1, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(but3, new GridBagConstraints( 2, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(butMinus, new GridBagConstraints( 3, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(butEgually, new GridBagConstraints( 4, 5, 1, 2, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 93 ));



        panel.add(but0, new GridBagConstraints( 0, 6, 2, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 10, 10), 0, 30 ));

        panel.add(butT, new GridBagConstraints( 2, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));

        panel.add(butPlus, new GridBagConstraints( 3, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 10), 0, 30 ));











    }
}
