import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class AlturaIdeal {
    public static void main(String[] args){
  int altura = Integer.parseInt(showInputDialog("Cual es tu altura en centimetros? "));
  String genero = "";
  do{
      genero = showInputDialog("Cual es tu genero? (H/M)");
  } while(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));

  double pesoHombre = ((altura - 100) - (double) (altura - 150) /4);
  double pesoMujer = ((altura - 100)- (double) (altura-150)/2.5);


if(genero.equalsIgnoreCase("H")){
    showMessageDialog(null, "Tu peso ideal es de " + ((int)pesoHombre + "kg"));
} else {
    showMessageDialog(null, "Tu peso ideal es de " + ((int)pesoMujer + "kg"));
}
    }
}
