import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockFrame extends JFrame {
    JLabel myimage = new JLabel();
    Calendar calendar ;
    SimpleDateFormat time_F ;  // time format .
    SimpleDateFormat date_F ;  // date format .
    SimpleDateFormat day_F ;  // day format .
    JLabel time_L ;          //  time label .
    JLabel date_L ;          //  date label .
    JLabel day_L ;          //  day label .
    String time ;
    String date ;
    String day ;
    public ClockFrame()
    {
        setBounds(550,220,350,200);
        //setSize(350,200);
        setTitle("khaled");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setIconImage("clock.png");
        setResizable(false);
        time_F = new SimpleDateFormat("hh:mm:ss a");
        day_F = new SimpleDateFormat("EEEE    ");
        date_F = new SimpleDateFormat("dd ,MM, YYYY");
        time_L = new JLabel();
        time_L.setFont(new Font("Verdana",Font.PLAIN,50));
        time_L.setForeground(new Color(0x00ff00));
        time_L.setBackground(Color.BLACK);
        time_L.setOpaque(true);
        day_L = new JLabel();
        day_L.setFont(new Font("Ink Free",Font.PLAIN,35));
        date_L = new JLabel();
        date_L.setFont(new Font("Ink Free",Font.PLAIN,35));
        add(time_L);
        add(day_L);
        add(date_L);
        setVisible(true);
        setTime();
    }

    private void setIconImage(String path) {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(path)));
    }
    private void setTime()
    {
        while (true) {
            time = time_F.format(Calendar.getInstance().getTime());
            time_L.setText(time);
            day = day_F.format(Calendar.getInstance().getTime());
            day_L.setText(day);
            date = date_F.format(Calendar.getInstance().getTime());
            date_L.setText(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
