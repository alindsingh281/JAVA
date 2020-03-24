import java.awt.*;
import java.awt.event.*;

class BColour extends Frame
{
    int X=10,Y=10;
    public BColour()
    {
        Font f=new Font("SansSerif",Font.PLAIN,12);
        setFont(f);

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
        FontMetrics fm=g.getFontMetrics();

        nextLine("Sample Text.     by: Alind Singh",g);
    }

    void nextLine(String s, Graphics g)
    {
        FontMetrics fm=g.getFontMetrics();
        Y+=fm.getHeight();
        X=20;
        g.drawString(s,X,Y);
        X+=fm.stringWidth(s);
    }

    public static void main(String[] args)
    {
        BColour appwin = new BColour();
        appwin.setSize(new Dimension(300,300));
        appwin.setTitle("Pink Color");
        appwin.setBackground(Color.pink);
        appwin.setVisible(true);
    }
}

class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}