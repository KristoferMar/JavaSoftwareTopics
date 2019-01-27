package ObjectOrientedProgramming;

public class DefenceTower {
	
	int attackDamage;
	int attackSpeed;
	
	public DefenceTower(int damage, int attackSpeed) {
		damage = this.attackDamage;
		attackSpeed = this.attackDamage;
	}
	
	public void placeTower() {
		System.out.println("New tower was placed");
	}
	
	public void sellTower(DefenceTower tower) {
		System.out.println("Tower was just selled.");
	}

}
