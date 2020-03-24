import java.awt.*;
import java.awt.event.*;

class TwoButtons extends Frame implements ActionListener
{
    String msg="";
    Button Red,Blue;

    public TwoButtons()
    {
        setLayout(new FlowLayout());
        Red = new Button("Red");
        Blue = new Button("Blue");
        Red.setForeground(Color.RED);
        Blue.setForeground(Color.BLUE);

        add(Red);
        add(Blue);

        Red.addActionListener(this);
        Blue.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    
    public void paint(Graphics g)
    {
        g.drawString("", 50, 50);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        if(str.equals("Red"))
        {
            setBackground(Color.red);
        }
        if(str.equals("Blue"))
        {
            setBackground(Color.blue);
        }
        repaint();
    }

    public static void main(String[] args)
    {
        TwoButtons appwin=new TwoButtons();
        appwin.setSize(new Dimension(350,350));
        appwin.setTitle("ButtonDemo");
        appwin.setVisible(true);
    }
}