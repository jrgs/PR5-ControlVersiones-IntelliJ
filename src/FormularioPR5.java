import javax.swing.*;

public class FormularioPR5 {

    private JPanel MyPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormularioPR5");
        frame.setContentPane(new FormularioPR5().MyPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
