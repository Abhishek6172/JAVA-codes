import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StopWatch extends JFrame implements ActionListener, Runnable {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private int hours, minutes, seconds;

    public StopWatch() {
        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 50));
        timeLabel.setHorizontalAlignment(JLabel.CENTER);

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        panel.add(startButton);
        panel.add(stopButton);
        panel.add(resetButton);

        setLayout(new BorderLayout());
        add(timeLabel, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setTitle("Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void start() {
        if (!running) {
            running = true;
            Thread thread = new Thread(this);
            thread.start();
        }
    }

    public void stop() {
        running = false;
    }

    public void reset() {
        running = false;
        hours = 0;
        minutes = 0;
        seconds = 0;
        updateTimeLabel();
    }

    private void updateTimeLabel() {
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        timeLabel.setText(time);
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(1000);
                seconds++;
                if (seconds == 60) {
                    seconds = 0;
                    minutes++;
                }
                if (minutes == 60) {
                    minutes = 0;
                    hours++;
                }
                updateTimeLabel();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            start();
        } else if (e.getSource() == stopButton) {
            stop();
        } else if (e.getSource() == resetButton) {
            reset();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StopWatch stopwatch = new StopWatch();
            stopwatch.setVisible(true);
        });
    }
}
