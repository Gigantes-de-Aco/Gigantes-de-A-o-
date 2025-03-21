package GrandDestroyer;
import robocode.*;
import java.awt.Color;

/**
 GrandDestroyer - a class by (Paulo Vitor Pereira)
 */
public class GrandDestroyer extends Robot {
    public void run()    {
		setColors(Color.blue,Color.white,Color.blue,Color.white,Color.blue);
		while(true) {
			ahead(200);
			back(0);
		    turnRight(150);
			turnLeft(100);
			
		}
	}
	//tank robô inimigo detectado
	public void onScannedRobot(ScannedRobotEvent e) {
		 String robotank = e.getName();
		 double distancia = e.getDistance();
		 System.out.println(robotank + "distancia" + distancia);
		 if (distancia < 135) {
			 fire(3);
		 } else {
			 fire(1);
		 }
		 scan();
	}
	//colisão com a parede
	public void onHitWall(HitWallEvent e) {
		back(50);
		turnRight(90);
	}
}
