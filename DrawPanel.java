import javax.swing.*;
import java.awt.*;

class DrawPanel extends JPanel {
    static final int cols = 11;
    static final int rows = 6;
    static final int cellSize = 70;
    static final int margin = 40;
    
    private int robotX = 1;
    private String robotDirection = "Right";
    private int robotY = 1;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        g.drawLine(margin, 500-margin, margin, margin);
        g.drawLine(margin, 500-margin, 800-margin, 500-margin);
        
        g.setColor(Color.RED);
        for (int i=0;i<cols;i++) {
            g.drawLine((cellSize/2 + margin + cellSize*i),(500-margin), (cellSize/2 + margin + cellSize*i), margin);
        }
        
        for (int j=0;j<rows;j++) {
            g.drawLine(margin, (-(cellSize/2) + (500-margin) - cellSize*j), 800-margin, (-cellSize/2 + (500-margin) - cellSize*j));
        }
        
        drawRobot(g, robotX, robotY, robotDirection);
    }
    
    private void drawRobot(Graphics g, int col, int row, String direction) {
        int px = toPixelX(col);
        int py = toPixelY(row);
        
        int s = cellSize/2-4;
        int r = cellSize/3;
        
        int dx = 0, dy = 0;
        switch (direction) {
            case "right" -> dx =  s;
            case "left"  -> dx = -s;
            case "up"    -> dy = -s;
            case "down"  -> dy =  s;
        }
        
        g.setColor(Color.BLUE);
        g.fillOval(px - r, py - r, r * 2, r * 2); 
        g.setColor(Color.BLACK);
        g.drawOval(px - r, py - r, r * 2, r * 2);
        g.drawLine(px, py, px + dx, py + dy);
        
        
    }
    
    public void setRobotPosition(int x, int y, String direction) {
        robotX = x;
        robotY = y;
        robotDirection = direction;
        
        repaint();
    }
    
    int toPixelX(int col) {
        return margin + cellSize * (col - 2) + cellSize / 2;
    }
    
    int toPixelY(int row) {
        return (500 - margin) - cellSize * (row - 2) - cellSize / 2;
    }
    
    public DrawPanel() {
        setBackground(Color.WHITE);
    }
}
