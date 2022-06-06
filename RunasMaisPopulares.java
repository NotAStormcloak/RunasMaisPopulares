import javax.swing.JOptionPane;

public class RunasMaisPopulares {

    public static void main(String[] args) {

        int playerNumber = 3;
        int i = 1;
        int runaFogo = 0;
        int runaGelo = 0;

        while (i <= playerNumber) {
            String[] runas = { "Runa de Fogo", "Runa de Gelo" };
            String runa = (String) JOptionPane.showInputDialog(
                    null,
                    "Selecione sua Runa:",
                    "Jogador " + i,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    runas,
                    runas[0]);
            switch (runa) {
                case "Runa de Fogo":
                    System.out.println("Runa do Fogo escolhida" + playerNumber);
                    runaFogo++;
                    break;
                case "Runa de Gelo":
                    System.out.println("Runa do Gelo escolhida" + playerNumber);
                    runaGelo++;
                    break;
            }
            i++;

        }
        if (runaFogo > runaGelo) {
            JOptionPane.showMessageDialog(null, " A Runa de Fogo é mais popular para este Campeão");
        } else {
            JOptionPane.showMessageDialog(null, " A Runa de Gelo é mais popular para este Campeão");
        }
    }
}