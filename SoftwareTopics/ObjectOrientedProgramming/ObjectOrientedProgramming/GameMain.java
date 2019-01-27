package ObjectOrientedProgramming;

import towers.FreezeTower;
import towers.SplashTower;

/*
 * This is the main starting point of the application.
 */

public class GameMain {
	
	public static void main(String args[]) {
		
		FreezeTower tower = new FreezeTower(100, 10);
		tower.placeFreezeTower();	
		
		SplashTower splashTower = new SplashTower(120, 8);
		splashTower.placeSplashTower();
	}
}
