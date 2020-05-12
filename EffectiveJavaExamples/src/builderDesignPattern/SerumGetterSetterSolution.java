package builderDesignPattern;

public class SerumGetterSetterSolution {
	private int water; // (ml) required
	private int sodiumIon; // required
	private int magnesium; // optional
	private int creatine; // (g) optional
	private int globulin; // (mg)optional
	private int carbohydrate; // (g) optional

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getSodiumIon() {
		return sodiumIon;
	}

	public void setSodiumIon(int sodiumIon) {
		this.sodiumIon = sodiumIon;
	}

	public int getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(int magnesium) {
		this.magnesium = magnesium;
	}

	public int getCreatine() {
		return creatine;
	}

	public void setCreatine(int creatine) {
		this.creatine = creatine;
	}

	public int getGlobulin() {
		return globulin;
	}

	public void setGlobulin(int globulin) {
		this.globulin = globulin;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public static void main(String[] args) {
		// Burada final kullanamiyoruz. Cünkü ilk degerleri constructor veya bloklar
		// icinde verebiliyoruz.

		// Bu yuzden burada thread safelikten taviz vermis oluruz.
		// Coklu ortamlarda bu degiskenleri istedigim gibi dagitamam.

		// Constructor a gore okunabilirlik daha fazla
		// Ancak final kullanýmý kaybedildi , zorunlu alanlar by pass edilebilir oldu .
		SerumGetterSetterSolution serum = new SerumGetterSetterSolution();
		// serum.setWater(240); // Zorunlu Alan
		serum.setSodiumIon(8);
		serum.setMagnesium(100);
		serum.setCreatine(35);
		serum.setCarbohydrate(27);
	}

}
