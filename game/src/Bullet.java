

import java.awt.Color;
import java.awt.Graphics2D;

public class Bullet {
	private double x;
	private double y;
	private int r;
	private double dx;
	private double dy;
	private double rad;
	private double speed;
	private Color color1;

	public Bullet(double angle, int x, int y) {
		this.x = x;
		this.y = y;
		r = 4;
		rad = Math.toRadians(angle);
		speed = 15;
		dx = Math.cos(rad) * speed;
		dy = Math.sin(rad) * speed;

		color1 = Color.WHITE;
	}

	public double getx() {
		return x;
	};

	public double gety() {
		return y;
	};

	public double getr() {
		return r;
	};

	public boolean update() {
		x += dx;
		y += dy;
		if (x < -r || x > GamePanel.width + r || y < -r || y > GamePanel.height + r) {
			return true;
		}
		return false;

	}

	public void draw(Graphics2D g) {
		g.setColor(color1);
		g.fillOval((int) (x - r), (int) (y - r), 2 * r, 2 * r);
	}
}
