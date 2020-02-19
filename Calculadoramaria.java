package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    
    
    public static void main(String[] args) {
        
        String resp=
            JOptionPane.showInputDialog("Digite 1 caso queira adição, 2 caso subtração, 3 caso  multiplicação e 4 para divisão:");
             int respi = Integer.parseInt(resp); 
             
        String number1=
            JOptionPane.showInputDialog("Digite um número:");
            int number11 = Integer.parseInt(number1); 
            
        String number2=
            JOptionPane.showInputDialog("Digite mais um número:");
            int number22 = Integer.parseInt(number2);
                  
            if(respi == 1){
                int som = number11 + number22;
                JOptionPane.showMessageDialog(null,"A soma é"+som,"Som of two Integers", JOptionPane.PLAIN_MESSAGE);
            }else{
                if(respi == 2) {
                   int sub = number11 - number22;
                   JOptionPane.showMessageDialog(null,"A subtração é"+sub,"Som of two Integers", JOptionPane.PLAIN_MESSAGE);
                }else{
                    if(respi == 3){
                        int mult = number11 * number22;
                        JOptionPane.showMessageDialog(null,"A multiplicação é"+mult,"Som of two Integers", JOptionPane.PLAIN_MESSAGE);
                    }else{
                        if(respi == 4){
                            int divi = number11 / number22;
                            JOptionPane.showMessageDialog(null,"A divisão é"+divi,"Som of two Integers", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
                
            }
        
        
    }
    
}
