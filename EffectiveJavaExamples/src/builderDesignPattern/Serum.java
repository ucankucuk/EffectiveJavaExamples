package builderDesignPattern;

public class Serum {

	private final int water = 0; // (ml) required
	private final int sodiumIon = 0; // required
	private final int magnesium = 0; // optional
	private final int creatine = 0; // (g) optional
	private final int globulin = 0; // (mg)optional
	private final int carbohydrate = 0; // (g) optional

	public static void main(String[] args) {
		// Serum sinifina ait bir obje olusturdugum zaman water ve sodiumIon
		// deðiþkenlerini girmem lazým.
		// Final 'larý korumak (thread safe) istiyorum
		// 1. Cozum Constructor kullanmak. -> SerumConstructorSolution.java
		// 2. Cozum GetterSetter kullanmak -> SerumGetterSetterSolution.java
		// 3. Cozum Builder Tasarim (Dahili static bir sinif kullanmak)

	}

}
