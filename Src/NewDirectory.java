import java.util.Random;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import javax.swing.JOptionPane;

class NewDirectory {
    public static void main(String[] args) {
    Random numeroRandom = new Random();

    int randomNumber = numeroRandom.nextInt((100)+1);
    int attempts = 1;
    System.out.println(randomNumber);
    int clientChoise = Integer.parseInt(showInputDialog(null, "Adivina el numero entre 1 y 100, Solamente tienes 8 intentos, buena suerte!", "Adivina adivinador", JOptionPane.QUESTION_MESSAGE));
    String attemptsMessage = "";

    while(clientChoise!=randomNumber){
        if(clientChoise < randomNumber){
            showMessageDialog(null, "Muy pequeño, intenta un numero mayor!");
        }
        else {
            showMessageDialog(null, "Muy grande, intenta un numero menor!");
        }
        attempts++;

        switch (attempts) {
            case 2 -> attemptsMessage = "Segundo";
            case 3 -> attemptsMessage = "Tercer";
            case 4 -> attemptsMessage = "Cuarto";
            case 5 -> attemptsMessage = "Quinto";
            case 6 -> attemptsMessage = "Sexto";
            case 7 -> attemptsMessage = "Septimo";
            case 8 -> attemptsMessage = "Octavo";
        }
        clientChoise = Integer.parseInt(showInputDialog(attemptsMessage + " intento"));
        if (attempts == 8){
        break;
        }
    }

    if (attempts == 8){
        showMessageDialog(null, "Perdiste, solo tenias 12 intentos!", "Mala suerte!", JOptionPane.ERROR_MESSAGE);
    } else {
    if (attempts == 1){
        showMessageDialog(null, "Correcto, adivinaste el numero en " + attempts + " intento", "Intentos", JOptionPane.INFORMATION_MESSAGE);
    } else
        showMessageDialog(null, "Correcto, adivinaste el numero en " + attempts + " intentos", "Intentos", JOptionPane.INFORMATION_MESSAGE);

    }
    }
}