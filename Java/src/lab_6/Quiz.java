package lab_6;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class Quiz extends JFrame{
    File file = new File("C:\\Users\\User\\Documents\\Projects\\lab6.txt");
    static JButton b, del;
    static JTextField text;
    static JTextArea area;
    static String[] box1 = {"1","2","3","4","5","более"};
        String text1;
        int k;
        Object boxA, boxB, boxC;
        static JLabel l1, l2, l3, l4;
        JComboBox box_1;
        JRadioButton flag1, flag2;
        ButtonGroup bg;


        public Quiz(String str){
            super(str);
            setSize(500, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            b = new JButton("Внесение в базу");
            del = new JButton("Очистить");
            text = new JTextField(9);
            area = new JTextArea(9, 9);
            l1 = new JLabel("ФИО");
            l2 = new JLabel("Опишите Ваш художественных стиль");
            l3 = new JLabel("На скольких художественных выставках Вы были?");
            l4 = new JLabel("Нравится ли ам соверемнное искусство?");
            box_1 = new JComboBox(box1);

            flag1 = new JRadioButton("да");
            flag2 = new JRadioButton("нет");
            bg = new ButtonGroup();
            bg.add(flag1);
            bg.add(flag2);

            setLayout(null);
            b.setSize(200,30);
            b.setLocation(150, 400);
            del.setSize(100, 30);
            del.setLocation(10, 400);
            text.setSize(220,25);
            text.setLocation(250, 20);
            area.setSize(220,150);
            area.setLocation(250,60);
            l1.setSize(200,25);
            l1.setLocation(30, 20);
            l2.setSize(220, 25);
            l2.setLocation(30, 60);
            l3.setSize(200, 25);
            l3.setLocation(30, 250);
            l4.setSize(200, 25);
            l4.setLocation(30, 310);
            box_1.setSize(40,25);
            box_1.setLocation(250,250);
            flag1.setSize(40,25);
            flag1.setLocation(250, 310);
            flag2.setSize(50, 25);
            flag2.setLocation(300, 310);

            add(b);
            add(del);
            add(text);
            add(area);
            add(l1);
            add(l2);
            add(l3);
            add(l4);
            add(box_1);
            add(flag1);
            add(flag2);

            b.addActionListener(new ButtonActionListener());
            flag1.addActionListener(new FlagActionListener());
            flag2.addActionListener(new FlagActionListener());
            del.addActionListener(new DelActionListener());
            box_1.addActionListener(new BoxActionListener());
        }

        public class ButtonActionListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                try{
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    FileWriter out = new FileWriter(file, true);
                    try{
                        String text1 = text.getText();
                        String area2 = area.getText();
                        out.write(text1 + " - ");
                        out.write(area2 + "\n");
                        if(k == 1)
                            out.write("Нахожу его очень занимательным" + "\n");
                        else if(k == -1)
                            out.write("Неудовлетворен " + "\n");
                        out.write(" Был на :" + boxA + " выставках ");
                    } finally{
                        out.close();
                    }
                }catch(IOException e1){
                    throw new RuntimeException(e1);
                }
            }
        }

        public class FlagActionListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                k = 0;
                if(e.getSource() == flag1){
                    k++;
                }
                else if(e.getSource() == flag2){
                    k--;
                }
            }
        }
        public class DelActionListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == del){
                    text.setText(null);
                    area.setText(null);

                }
            }
        }
        public class BoxActionListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == box_1){
                    boxA = box_1.getSelectedItem();
                }
            }
        }
    }


