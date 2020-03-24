import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener
{
    String msg="";
    int mouseX=0,mouseY=0;
    static Boolean val=true;

    public MouseEventsDemo()
    {
        setBackground(Color.BLACK);
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    public void mouseClicked(MouseEvent me)
    {
        this.setVisible(true);
        mouseX=50;
        mouseY=50;
        msg="Mouse Clicked!";
        repaint();
    }

    public void mouseEntered(MouseEvent me)
    {
        mouseX=50;
        mouseY=50;
        msg="Mouse entered!";
        repaint();
        this.setVisible(true);
    }

    public void mouseExited(MouseEvent me)
    {
        mouseX=50;
        mouseY=50;
        msg="Mouse exited!";
        repaint();
        //this.setVisible(false);
    }

    public void mousePressed(MouseEvent me)
    {
        mouseX = 50;
        mouseY = 50;
        msg = "Mouse p!";
        repaint();
        this.setVisible(true);
    }

    public void mouseReleased(MouseEvent me)
    {
        mouseX = 50;
        mouseY = 50;
        msg = "Mouse r!";
        repaint();
        this.setVisible(true);
    }

    public void mouseDragged(MouseEvent me)
    {
        mouseX = 50;
        mouseY = 50;
        msg = "Mouse d!";
        repaint();
        this.setVisible(true);
    }

    public void mouseMoved(MouseEvent me)
    {
        mouseX = 50;
        mouseY = 50;
        msg = "Mouse moved!";
        repaint();
        this.setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
    }
    public static void main(String[] args)
    {
        MouseEventsDemo appwin=new MouseEventsDemo();
        appwin.setSize(new Dimension(400,500));
        appwin.setTitle("MouseEventsDemo");
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