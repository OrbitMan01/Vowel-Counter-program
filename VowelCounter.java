package ThirdProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VowelCounter extends JFrame {
    protected Container c;
    protected  JLabel promptLabel,vowellabel,alabel,elabel,ilabel,olabel,ulabel;
    protected  JTextArea inputArea;
    protected  JScrollPane scroll;


    int totalVowel = 0;
    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_u = 0;
    int letter_o = 0;

    VowelCounter(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Counting Vowel App");


        c =getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);


        promptLabel = new JLabel("Enter your Text");
        promptLabel.setBounds(10,20,100,30);
        c.add(promptLabel);

        inputArea = new JTextArea();
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);

        scroll = new JScrollPane(inputArea);
        scroll.setBounds(110,20,450,100);
        c.add(scroll);

        vowellabel = new JLabel();
        vowellabel.setBounds(110,150,150,30);
        c.add(vowellabel);


         alabel = new JLabel();
        alabel.setBounds(110,190,150,30);
        c.add(alabel);

         elabel = new JLabel();
        elabel.setBounds(110,230,150,30);
        c.add(elabel);

        ilabel = new JLabel();
        ilabel.setBounds(110,270,150,30);
        c.add(ilabel);

        olabel = new JLabel();
        olabel.setBounds(110,310,150,30);
        c.add(olabel);

        ulabel = new JLabel();
        ulabel.setBounds(110,350,150,30);
        c.add(ulabel);


        inputArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getSource() == inputArea){

                    if(e.VK_A==e.getKeyCode()){
                        letter_a++;
                        totalVowel++;
                    }
                    if(e.VK_O==e.getKeyCode()){
                        letter_o++;
                        totalVowel++;
                    }
                    if(e.VK_E==e.getKeyCode()){
                        letter_e++;
                        totalVowel++;
                    }
                    if(e.VK_U==e.getKeyCode()){
                        letter_u++;
                        totalVowel++;
                    }
                    if(e.VK_I==e.getKeyCode()){
                        letter_i++;
                        totalVowel++;
                    }

                }
                vowellabel.setText("Total number of Vowels : "+totalVowel);
                alabel.setText("Total number of a : "+letter_a);
                elabel.setText("Total number of e : "+letter_e);
                ilabel.setText("Total number of i : "+letter_i);
                olabel.setText("Total number of o : "+letter_o);
                ulabel.setText("Total number of u : "+letter_u);

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    static void main() {
        VowelCounter frame = new VowelCounter();
        frame.setVisible(true);

    }
}
