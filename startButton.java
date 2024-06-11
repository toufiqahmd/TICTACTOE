import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

    public class startButton extends JFrame implements ActionListener 
    {
        JButton btnstart = new JButton("Start");
        JFrame frame = new JFrame("Tic-Tac-Toe");
        JLabel textLabel = new JLabel();
        JPanel textPanel = new JPanel();
        
        
       

        public startButton()
        {
            setLayout(new FlowLayout());
            add(btnstart);
            btnstart.addActionListener(this);
            setTitle("TIC_TAC_TOE");
            setSize(600,650);
            btnstart.setBackground(Color.black);
            btnstart.setForeground(Color.cyan);
            btnstart.setSize(500,500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
    
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()== btnstart)
            {
                TicTacToe TicTacToePage = new TicTacToe();
                setDefaultCloseOperation(startButton.HIDE_ON_CLOSE);
                TicTacToePage.show();
            }
        }
        public static void main(String[] args)
        {
            new startButton();
        }
}
