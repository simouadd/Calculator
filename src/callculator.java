import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import static java.lang.Math.sqrt;
import static java.lang.Math.log;
import static java.lang.Math.exp;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.E;
import static java.lang.Math.log10;







public class callculator implements ActionListener {

    private final JButton addButton;
    private final JButton subButton;
    private final JButton mulButton;
    private final JButton divButton;
    private final JButton decButton;
    private final JButton equButton;
    private final JButton delButton;
    private final JButton clrButton;
    private final JButton cosButton;
    private final JButton sinButton;
    private final JButton tanButton;
    private final JButton sqrtButton;
    private final JButton lnButton;
    private final JButton expButton;
    private final JButton piButton;
    private final JButton powButton;
    private final JButton negButton;
    private final JTextField textfield = new JTextField();
    private final JButton[] numberButtons = new JButton[10];
    static double num;
    static double num2;

    static double result;
    static String operator;



    callculator() {


        JButton[] functionButtons = new JButton[17];
        JPanel panel;
        double num = 0, num2 = 0, result = 0;
        char operator;

        Font myfont = new Font("oussama",Font.PLAIN,20);
        Font myfont2 = new Font("oussama",Font.PLAIN,30);

        JFrame frame = new JFrame("calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 550);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x2B166C));


        textfield.setBounds(50, 25, 500, 50);
        textfield.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        cosButton = new JButton("cos");
        sinButton = new JButton("sin");
        tanButton = new JButton("tan");
        sqrtButton = new JButton("sqrt");
        lnButton = new JButton("ln");
        expButton = new JButton("exp");
        piButton = new JButton("pi");
        powButton = new JButton("pow");
        negButton = new JButton("(-)");







        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;

        functionButtons[14] = delButton;
        functionButtons[15] = clrButton;
        functionButtons[16] = negButton;

        functionButtons[8] = cosButton;
        functionButtons[9] = sinButton;
        functionButtons[10] = tanButton;
        functionButtons[11] = sqrtButton;
        functionButtons[12] = lnButton;
        functionButtons[13] = expButton;
        functionButtons[6] = piButton;
        functionButtons[7] = powButton;




        for (int i = 0; i < 14; i++) {
            functionButtons[i].addActionListener((ActionListener) this);
            functionButtons[i].setFont(myfont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(new Color(0x6D6DE7));
                            }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myfont);
            numberButtons[i].addActionListener((ActionListener) this);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(new Color(0x00026E));
            numberButtons[i].setForeground(Color.WHITE);

        }
        delButton.setBounds(222, 430, 145, 50);
        clrButton.setBounds(377, 430, 145, 50);
        negButton.setBounds(67,430,145,50);

        frame.add(negButton);
        panel = new JPanel();
        panel.setBounds(50,100,500,300);
        panel.setLayout(new GridLayout(4,6,10,10));
        panel.setBackground(new Color(0x2A2A7B));
        clrButton.setBackground(new Color(0x4D00D0));
        delButton.setBackground(new Color(0x4D00D0));
        negButton.setBackground(new Color(0x4D00D0));


        negButton.setFont(myfont);

        clrButton.setForeground(Color.WHITE);
        delButton.setForeground(Color.WHITE);
        negButton.setForeground(Color.WHITE);

        addButton.setFont(myfont2);
        subButton.setFont(myfont2);
        mulButton.setFont(myfont2);
        divButton.setFont(myfont2);
        decButton.setFont(myfont2);
        equButton.setFont(myfont2);



        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);


        panel.add(equButton);




        panel.add(decButton);

        panel.add(divButton);
        panel.add(numberButtons[7]);

        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);

        panel.add(cosButton);
        panel.add(sinButton);
        panel.add(tanButton);
        panel.add(sqrtButton);
        panel.add(numberButtons[0]);
        panel.add(lnButton);
        panel.add(expButton);
        panel.add(piButton);
        panel.add(powButton);




        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<10;i++){
                if (e.getSource() == numberButtons[i]) {
                    if (textfield.getText() != null) {
                        textfield.setText(textfield.getText().concat(String.valueOf(i)));
                    }
                }
            }

        if(e.getSource()==decButton){
            textfield.setText(textfield.getText().concat("."));
        }
        if(e.getSource()==addButton){
            double num = Double.parseDouble(textfield.getText());
            char operator = '+';
            textfield.setText("");
        }
        if(e.getSource()==subButton){
            double num = Double.parseDouble(textfield.getText());
            char operator = '-';
            textfield.setText("");
        }
        if(e.getSource()==mulButton){
            double num = Double.parseDouble(textfield.getText());
            char operator = '*';
            textfield.setText("");
        }
        if(e.getSource()==divButton){
            double num = Double.parseDouble(textfield.getText());
            char operator = '/';
            textfield.setText("");
        }
        if(e.getSource()==equButton){
            double num2 = Double.parseDouble(textfield.getText());
            switch(operator){
                case"+":
                    result = num + num2;
                    break;
                case"-":
                    result = num - num2;
                    break;
                case"*":
                    result = num * num2;
                    break;
                case"/":
                    result = num / num2;
                    break;
            }

            textfield.setText(String.valueOf(result));
            num = result;
        }
        if(e.getSource()==clrButton){
            textfield.setText("");
        }
        if(e.getSource()==delButton){
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++){
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
        if(e.getSource()==cosButton){
            double num = Double.parseDouble(textfield.getText());
            double result = cos(num);
            textfield.setText(String.valueOf(result));
        }
        if(e.getSource()==sinButton){
            double num = Double.parseDouble(textfield.getText());
            double result = sin(num);
            textfield.setText(String.valueOf(result));
        }
        if(e.getSource()==tanButton){
            double num = Double.parseDouble(textfield.getText());
            double result = tan(num);
            textfield.setText(String.valueOf(result));
        }
        if(e.getSource()==sqrtButton){
            double num = Double.parseDouble(textfield.getText());
            double result = sqrt(num);
            textfield.setText(String.valueOf(result));
        }
        if(e.getSource()==lnButton){
            double num = Double.parseDouble(textfield.getText());
            double result = log(num);
            textfield.setText(String.valueOf(result));
        }
        if(e.getSource()==expButton){
            double num = Double.parseDouble(textfield.getText());
            double result = exp(num);
            textfield.setText(String.valueOf(result));
        }
        if(e.getSource()==piButton){
            double num = Double.parseDouble(textfield.getText());
            double result;
            result = PI;
            textfield.setText(String.valueOf(result));
        }
        if(e.getSource()==powButton){
            double num = Double.parseDouble(textfield.getText());
            double result = pow(num,2);
            textfield.setText(String.valueOf(result));
        }
        if(e.getSource()==negButton){
            double num = Double.parseDouble(textfield.getText());
            double result = num * (-1);
            textfield.setText(String.valueOf(result));
        }


    }

}

