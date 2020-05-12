package builderDesignPattern;

public class SerumConstructorSolution {
	private final int water; // (ml) required
	private final int sodiumIon; // required
	private final int magnesium; // optional
	private final int creatine; // (g) optional
	private final int globulin; // (mg)optional
	private final int carbohydrate; // (g) optional

	public SerumConstructorSolution(int water, int sodiumIon) {
		this(water, sodiumIon, 0);
	}

	public SerumConstructorSolution(int water, int sodiumIon, int magnesium) {
		this(water, sodiumIon, magnesium, 0);
	}

	public SerumConstructorSolution(int water, int sodiumIon, int magnesium, int creatine) {
		this(water, sodiumIon, magnesium, creatine, 0);
	}

	public SerumConstructorSolution(int water, int sodiumIon, int magnesium, int creatine, int globulin) {
		this(water, sodiumIon, magnesium, creatine, globulin, 0);
	}

	public SerumConstructorSolution(int water, int sodiumIon, int magnesium, int creatine, int globulin,
			int carbohydrate) {
		this.water = water;
		this.sodiumIon = sodiumIon;
		this.magnesium = magnesium;
		this.creatine = creatine;
		this.globulin = globulin;
		this.carbohydrate = carbohydrate;
	}

	public static void main(String[] args) {
		// 5 constructor var
		// Hangi yapýlandiriciyi cagirmam gerek burda okunabilirlik zayif

		// Asýl sorun burada yanlis degiskene yanlis deger atanabilir .
		// 6 global degiskeni olan bir sinifta durum boyleyken daha fazla degiskeni olan
		// siniflarda durum dahada karisacaktir.
		SerumConstructorSolution serum = new SerumConstructorSolution(240, 8, 100, 0, 35, 27);
	}

}
