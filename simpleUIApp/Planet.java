package simpleUIApp;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D; 

public class Planet extends Item {
	int stock_vesso;
	int temps;
	

	public Planet(double x, double y, int w) {
		super(x, y, w);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		temps++;
		if (temps==10) {
			stock_vesso++;
			temps = 0;
		}
	}

	public void draw(Graphics2D arg0) {
		Point2D pos = this.center;
		int x = (int) pos.getX(), y = (int) pos.getY(), w = this.getWidth();
		arg0.setColor(Color.green);
		arg0.fillRect(x - w / 2, y - w / 2, w, w);
	}

	@Override
	public void setObjective(Item o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Point2D p) {
		// TODO Auto-generated method stub
		return false;
	}

}
