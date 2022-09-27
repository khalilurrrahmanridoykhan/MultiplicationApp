import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class App extends JFrame{

    private Container c;
    private ImageIcon Icon,imageicon,input1,clear,chake;
    private JLabel image,topText;
    private JTextArea textarea;
    private JTextField textfield;
    private Font f;
    private JButton button,button1;
    private Cursor cursor;
    App(){

        myMethod();
    }
    public void myMethod(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        Icon = new ImageIcon(getClass().getResource("multiplication.png"));
        this.setIconImage(Icon.getImage());

        f = new Font("Popins",Font.BOLD,20);

        imageicon = new ImageIcon(getClass().getResource("img.png"));
        image = new JLabel(imageicon);
        image.setBounds(0,0,imageicon.getIconWidth(),imageicon.getIconHeight());
        c.add(image);
        
        input1 = new ImageIcon(getClass().getResource("num.png"));
        topText = new JLabel(input1);
        topText.setBounds(20,350,100,50);
        c.add(topText);

        textfield = new JTextField();
        textfield.setBounds(160,350,100,50);
        textfield.setOpaque(true);
        textfield.setBackground(Color.YELLOW);
        textfield.setForeground(Color.BLACK);
        textfield.setFont(f);
        textfield.setMargin(new Insets(2,2,2,2));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        c.add(textfield);

        textarea = new JTextArea();
        textarea.setBounds(65,420,300,275);
        textarea.setFont(f);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(Color.PINK);
        textarea.setMargin(new Insets(10,10,10,10));
        c.add(textarea);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        clear = new ImageIcon(getClass().getResource("Clear.png"));
        button = new JButton(clear);
        button.setBounds(160,720,100,50);
        button.setBackground(Color.GREEN);
        button.setCursor(cursor);
        c.add(button);

        button.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                textarea.setText("");
            }
        });

        textfield.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ea){
                String value = textfield.getText();
                if(value.isEmpty()){
                    JOptionPane.showMessageDialog(null, "You didn't put any number");
                }
                else{
                    textarea.setText("");
                int num = Integer.parseInt(textfield.getText());
                for(int i=1;i<=10;i++){

                    int result = num * i;

                    String re = String.valueOf(result);
                    String nu = String.valueOf(num);
                    String inti = String.valueOf(i);
                    textarea.append(nu+" X "+ inti + " = " + re +"\n" );
                }
                }
                
            }
        });

        chake = new ImageIcon(getClass().getResource("Chake.png"));
        button1 = new JButton(chake);
        button1.setBounds(310,350,100,50);
        button1.setBackground(Color.GREEN);
        button1.setCursor(cursor);
        c.add(button1);

        button1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ea){
                String value = textfield.getText();
                if(value.isEmpty()){
                    JOptionPane.showMessageDialog(null, "You didn't put any number");
                }
                else{
                    textarea.setText("");
                int num = Integer.parseInt(textfield.getText());
                for(int i=1;i<=10;i++){

                    int result = num * i;

                    String re = String.valueOf(result);
                    String nu = String.valueOf(num);
                    String inti = String.valueOf(i);
                    textarea.append(nu+" X "+ inti + " = " + re +"\n" );
                }
                }
                
            }
        });
    }
    public static void main(String[] args){

        App myObj = new App();
        myObj.setVisible(true);
        myObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myObj.setBounds(500,50,450,900);
        myObj.setTitle("Multipication");
        myObj.setResizable(false);
    }
}