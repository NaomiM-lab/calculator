import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App02 {
    public static void main(String[] args) throws Exception {
        final Font mainFont = new Font("Segoe print",Font.BOLD,18);
        JLabel lbwelcome;

        lbwelcome = new JLabel();
        lbwelcome.setFont(mainFont);
        final String[] currentText ={"0"};
        final boolean[] isNewInput = {false};
        final boolean[] isNewOutput = {false};
        final double[] firstNumber ={0};
        final double[] secondNumber ={0};
        final String[] calcText ={""};
        final String[] placeText ={""};


        JButton one = new JButton("1");
        one.setFont(mainFont);
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "1";
                    isNewInput[0] = false;   
                    
                }else{
                    currentText[0] = currentText[0] + "1";
                }
                lbwelcome.setText(currentText[0]);
            }
        });
        JButton two = new JButton("2");
        two.setFont(mainFont);
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "2";
                    isNewInput[0] = false;  
                     
                }else{
                    currentText[0] = currentText[0] + "2";
                }
                lbwelcome.setText(currentText[0]);
            }
        });
        JButton three = new JButton("3");
        three.setFont(mainFont);
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "3";
                    isNewInput[0] = false; 
                     
                }else{
                    currentText[0] = currentText[0] + "3";
                }
                lbwelcome.setText(currentText[0]);
            }
        });
        JButton four = new JButton("4");
        four.setFont(mainFont);
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "4";
                    isNewInput[0] = false; 
                     
                }else{
                    currentText[0] = currentText[0] + "4";
                }
                lbwelcome.setText(currentText[0]);
            }
        });
        JButton five = new JButton("5");
        five.setFont(mainFont);
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "5";
                    isNewInput[0] = false; 
                     
                }else{
                    currentText[0] = currentText[0] + "5";
                }
                lbwelcome.setText(currentText[0]);
            }
        });
        JButton six = new JButton("6");
        six.setFont(mainFont);
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "6";
                    isNewInput[0] = false;   
                    
                }else{
                    currentText[0] = currentText[0] + "6";
                }
                lbwelcome.setText(currentText[0]);
            }
        });
        JButton seven = new JButton("7");
        seven.setFont(mainFont);
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "7";
                    isNewInput[0] = false; 
                      
                }else{
                    currentText[0] = currentText[0] + "7";
                }
                lbwelcome.setText(currentText[0]);
            }
        });
        JButton eight = new JButton("8");
        eight.setFont(mainFont);
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "8";
                    isNewInput[0] = false;
                       
                }else{
                    currentText[0] = currentText[0] + "8";
                }
                lbwelcome.setText(currentText[0]);
            }
        });
        JButton nine = new JButton("9");
        nine.setFont(mainFont);
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "9";
                    isNewInput[0] = false; 
                  
                }else{
                    currentText[0] = currentText[0] + "9";
                }
                lbwelcome.setText(currentText[0]);
            }
        });
        JButton zero = new JButton("0");
        zero.setFont(mainFont);
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(isNewInput[0] == true){
                    currentText[0] = "0";
                    isNewInput[0] = false;  
                     
                }else{
                    currentText[0] = currentText[0] + "0";
                }
                lbwelcome.setText(currentText[0]);
            }
        });









        JButton plus = new JButton("+");
        plus.setFont(mainFont);
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int enteredNumber = Integer.parseInt(currentText[0]);
                if(calcText[0].equals("=")){
                    lbwelcome.setText("" + firstNumber[0] + "+");
                    calcText[0] = "+";
                    isNewInput[0] = true;
                    isNewOutput[0] = false;
                }else{
                    if(calcText[0].equals("-")){
                      firstNumber[0] = firstNumber[0] - enteredNumber;
                    }

                    if(calcText[0].equals("/") && isNewOutput[0] == true){
                      if(placeText[0].equals("+")){
                        firstNumber[0] = firstNumber[0] + (secondNumber[0] / enteredNumber);
                      }
                      if(placeText[0].equals("-")){
                        firstNumber[0] = firstNumber[0] - (secondNumber[0] / enteredNumber);
                      }
                    }else if (calcText[0].equals("/")) {
                        firstNumber[0] = firstNumber[0] / enteredNumber;
                    }

                    if(calcText[0].equals("%")){
                      firstNumber[0] = firstNumber[0] % enteredNumber;
                    }

                    if(calcText[0].equals("x") && isNewOutput[0] == true){
                      if(placeText[0].equals("+")){
                        firstNumber[0] = firstNumber[0] + (secondNumber[0] * enteredNumber);
                      }
                      if(placeText[0].equals("-")){
                        firstNumber[0] = firstNumber[0] - (secondNumber[0] * enteredNumber);
                      }
                    }else if (calcText[0].equals("x")) {
                        firstNumber[0] = firstNumber[0] * enteredNumber;
                    }
                
                    if(calcText[0].equals("")){
                      firstNumber[0] = enteredNumber;
                      
                    }
                    if(calcText[0].equals("+")){
                      firstNumber[0] = firstNumber[0] + enteredNumber;
                    }

                    lbwelcome.setText("" + firstNumber[0] + "+");
                    calcText[0] = "+";
                    isNewInput[0] = true;
                }
            }
        });
        JButton minus = new JButton("-");
        minus.setFont(mainFont);
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int enteredNumber = Integer.parseInt(currentText[0]);
                if(calcText[0].equals("=")){
                    lbwelcome.setText("" + firstNumber[0] + "-");
                    calcText[0] = "-";
                    isNewInput[0] = true;
                    isNewOutput[0] = false;
                }else{
                    if(calcText[0].equals("+")){
                      firstNumber[0] = firstNumber[0] + enteredNumber;
                    }
                    if(calcText[0].equals("x") && isNewOutput[0] == true){
                      if(placeText[0].equals("+")){
                        firstNumber[0] = firstNumber[0] + (secondNumber[0] * enteredNumber);
                      }
                      if(placeText[0].equals("-")){
                        firstNumber[0] = firstNumber[0] - (secondNumber[0] * enteredNumber);
                      }
                    }else if (calcText[0].equals("x")) {
                        firstNumber[0] = firstNumber[0] * enteredNumber;
                    }

                    if(calcText[0].equals("/") && isNewOutput[0] == true){
                      if(placeText[0].equals("+")){
                        firstNumber[0] = firstNumber[0] + (secondNumber[0] / enteredNumber);
                      }
                      if(placeText[0].equals("-")){
                        firstNumber[0] = firstNumber[0] - (secondNumber[0] / enteredNumber);
                      }
                    }else if (calcText[0].equals("/")) {
                        firstNumber[0] = firstNumber[0] / enteredNumber;
                    }

                    if(calcText[0].equals("%")){
                      firstNumber[0] = firstNumber[0] % enteredNumber;
                    }


                    if(calcText[0].equals("")){
                      firstNumber[0] = enteredNumber;
                    }else if(calcText[0].equals("-")){
                      firstNumber[0] = firstNumber[0] - enteredNumber;
                    }
    
                    lbwelcome.setText("" + firstNumber[0] + "-");
                    calcText[0] = "-";
                    isNewInput[0] = true;
                }
            }
        });
        JButton multiplied = new JButton("x");
        multiplied.setFont(mainFont);
        multiplied.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int enteredNumber = Integer.parseInt(currentText[0]);
                if(calcText[0].equals("=")){
                    lbwelcome.setText("" + firstNumber[0] + "x");
                    calcText[0] = "x";
                    isNewInput[0] = true;
                    isNewOutput[0] = false;
                }else{
                    if(calcText[0].equals("+")){
                      secondNumber[0] = enteredNumber;
                      isNewOutput[0] = true;
                      placeText[0] = "+";
                    }
                    
                    if(calcText[0].equals("-")){
                      secondNumber[0] = enteredNumber;
                      isNewOutput[0] = true;
                      placeText[0] = "-";
                    }
                    if(calcText[0].equals("/")){
                      firstNumber[0] = firstNumber[0] / enteredNumber;
                    }
                    if(calcText[0].equals("%")){
                      firstNumber[0] = firstNumber[0] % enteredNumber;
                    }
                
                    if(calcText[0].equals("")){
                      firstNumber[0] = enteredNumber;
                    }
                    if(calcText[0].equals("x") && isNewOutput[0] == true){
                        secondNumber[0] = secondNumber[0] * enteredNumber;
                    }else if (calcText[0].equals("x")) {
                        firstNumber[0] = firstNumber[0] * enteredNumber;
                    }
    

                    if(isNewOutput[0] == true){
                        lbwelcome.setText("" + secondNumber[0] + "x");
                    }else{
                        lbwelcome.setText("" + firstNumber[0] + "x");
                    }
                    calcText[0] = "x";
                    isNewInput[0] = true;
                }
            }
        });
        JButton divided = new JButton("/");
        divided.setFont(mainFont);
        divided.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int enteredNumber = Integer.parseInt(currentText[0]);
                if(calcText[0].equals("=")){
                    lbwelcome.setText("" + firstNumber[0] + "/");
                    calcText[0] = "/";
                    isNewInput[0] = true;
                    isNewOutput[0] = false;
                }else{
                    if(calcText[0].equals("+")){
                      secondNumber[0] = enteredNumber;
                      isNewOutput[0] = true;
                      placeText[0] = "+";
                    }
                    if(calcText[0].equals("-")){
                      secondNumber[0] = enteredNumber;
                      isNewOutput[0] = true;
                      placeText[0] = "-";
                    }
                    if(calcText[0].equals("x")){
                      firstNumber[0] = firstNumber[0] * enteredNumber;
                    }
                    if(calcText[0].equals("%")){
                      firstNumber[0] = firstNumber[0] % enteredNumber;
                    }

                    if(calcText[0].equals("")){
                      firstNumber[0] = enteredNumber;
                    }
                    if(calcText[0].equals("/") && isNewOutput[0] == true){
                        secondNumber[0] = secondNumber[0] / enteredNumber;
                    }else if (calcText[0].equals("/")) {
                        firstNumber[0] = firstNumber[0] / enteredNumber;
                    }
    

                    if(isNewOutput[0] == true){
                        lbwelcome.setText("" + secondNumber[0] + "/");
                    }else{
                        lbwelcome.setText("" + firstNumber[0] + "/");
                    }
                    calcText[0] = "/";
                    isNewInput[0] = true;

                }
                
            }
        });
        JButton extra = new JButton("%");
        extra.setFont(mainFont);
        extra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int enteredNumber = Integer.parseInt(currentText[0]);
                if(calcText[0].equals("=")){
                    lbwelcome.setText("" + firstNumber[0] + "%");
                    calcText[0] = "%";
                    isNewInput[0] = true;
                    isNewOutput[0] = false;
                }else{
                    if(calcText[0].equals("+")){
                      firstNumber[0] = firstNumber[0] + enteredNumber;
                    }
                    if(calcText[0].equals("-")){
                      firstNumber[0] = firstNumber[0] - enteredNumber;
                    }
                    if(calcText[0].equals("x")){
                      firstNumber[0] = firstNumber[0] * enteredNumber;
                    }
                    if(calcText[0].equals("/")){
                      firstNumber[0] = firstNumber[0] / enteredNumber;
                    }

                    if(calcText[0].equals("")){
                      firstNumber[0] = enteredNumber;
                    }else if(calcText[0].equals("%")){
                      firstNumber[0] = firstNumber[0] % enteredNumber;
                    }
    
                    lbwelcome.setText("" + firstNumber[0] + "%");
                    calcText[0] = "%";
                    isNewInput[0] = true;
                }
            }
        });
        JButton equal = new JButton("=");
        equal.setFont(mainFont);
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int enteredNumber = Integer.parseInt(currentText[0]);
                if(calcText[0].equals("+")){
                    firstNumber[0] = firstNumber[0] + enteredNumber;
                }
                if(calcText[0].equals("-")){
                    firstNumber[0] = firstNumber[0] - enteredNumber;
                }
                if(calcText[0].equals("x") && isNewOutput[0] == true){
                    if(placeText[0].equals("+")){
                        firstNumber[0] = firstNumber[0] + (secondNumber[0] * enteredNumber);
                    }
                    if(placeText[0].equals("-")){
                        firstNumber[0] = firstNumber[0] - (secondNumber[0] * enteredNumber);
                    }
                }else if(calcText[0].equals("x")) {
                    firstNumber[0] = firstNumber[0] * enteredNumber;
                }
                if(calcText[0].equals("/") && isNewOutput[0] == true){
                    if(placeText[0].equals("+")){
                        firstNumber[0] = firstNumber[0] + (secondNumber[0] / enteredNumber);
                    }
                    if(placeText[0].equals("-")){
                        firstNumber[0] = firstNumber[0] - (secondNumber[0] / enteredNumber);
                    }
                }else if (calcText[0].equals("/")) {
                    firstNumber[0] = firstNumber[0] / enteredNumber;
                }
                if(calcText[0].equals("%")){
                    firstNumber[0] = firstNumber[0] % enteredNumber;
                }
                lbwelcome.setText("" + firstNumber[0]);
                calcText[0] = "=";
            }
        });
        JButton clear = new JButton("0");
        clear.setFont(mainFont);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                currentText[0] = "0";
                isNewInput[0] = false;
                isNewOutput[0] = false;
                firstNumber[0] = 0;
                secondNumber[0] = 0;
                calcText[0] = "";
                placeText[0] = "";

                lbwelcome.setText("0");
            }
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(plus);
        buttonsPanel.add(minus);
        buttonsPanel.add(multiplied);
        buttonsPanel.add(divided);
        buttonsPanel.add(extra);
        buttonsPanel.add(equal);
        buttonsPanel.add(clear);

        JPanel buttonsPanel1 = new JPanel();
        buttonsPanel1.setLayout(new GridLayout(2,5,5,5));
        buttonsPanel1.add(one);
        buttonsPanel1.add(two);
        buttonsPanel1.add(three);
        buttonsPanel1.add(four);
        buttonsPanel1.add(five);

        buttonsPanel1.add(six);
        buttonsPanel1.add(seven);
        buttonsPanel1.add(eight);
        buttonsPanel1.add(nine);
        buttonsPanel1.add(zero);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(lbwelcome,BorderLayout.NORTH);
        mainPanel.add(buttonsPanel1,BorderLayout.CENTER);
        mainPanel.add(buttonsPanel,BorderLayout.SOUTH);

        JFrame frame = new JFrame("calcrate");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
