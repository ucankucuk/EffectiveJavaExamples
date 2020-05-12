package builderDesignPattern;

public class SerumBuilderSolution {
	private final int water; // (ml) required
	private final int sodiumIon; // required
	private final int magnesium; // optional
	private final int creatine; // (g) optional
	private final int globulin; // (mg)optional
	private final int carbohydrate; // (g) optional
	private SerumBuilder builder;

	public static class SerumBuilder {
		// Zorunlu Desigkenler
		private final int water; // (ml) required
		private final int sodiumIon; // required

		// Optional Degiskenler
		private int magnesium = 0; // optional
		private int creatine = 0; // (g) optional
		private int globulin = 0; // (mg)optional
		private int carbohydrate = 0; // (g) optional

		public SerumBuilder(int water, int sodiumIon) {
			this.water = water;
			this.sodiumIon = sodiumIon;
		}

		public SerumBuilder magnesium(int val) {
			magnesium = val;
			return this;
		}

		public SerumBuilder creatine(int val) {
			creatine = val;
			return this;
		}

		public SerumBuilder globulin(int val) {
			creatine = val;
			return this;
		}

		public SerumBuilder carbohydrate(int val) {
			creatine = val;
			return this;
		}

		public SerumBuilderSolution build() {
			return new SerumBuilderSolution(this);
		}

	}

	@Override
	public String toString() {
		return "SerumBuilderSolution is created [water=" + water + ", sodiumIon=" + sodiumIon + ", magnesium="
				+ magnesium + ", creatine=" + creatine + ", globulin=" + globulin + ", carbohydrate=" + carbohydrate;
	}

	/**
	 * Degerlerimi builder'a atiyorum . Builder da degerleri constructor icerisinde
	 * atiyor.
	 * 
	 */
	private SerumBuilderSolution(SerumBuilder builder) {
		water = builder.water;
		sodiumIon = builder.sodiumIon;
		magnesium = builder.magnesium;
		creatine = builder.creatine;
		globulin = builder.globulin;
		carbohydrate = builder.carbohydrate;
		System.out.println(toString());
	}

	public static void main(String[] args) {
		// Builder tasarým kalibi
		// Dahili static sinif / vekil kullaniyoruz.
		// Degiskenlerin hepsi final kaldi.
		// Thread Safe kullanabilirim.
		// Required alanlari zorunlu doldurduk .
		// build() fonksiyonu ile SerumBuilderSolution ait bir nesneyi olusturmus
		// oluyorum.
		// Gerekli ve optional alanlarýn ayrýmý Builder icerisinde oluyor.
		// Cok alanli bir obje varsa builder tasarim deseni bu soruna cözüm buluyor

		SerumBuilderSolution serum = new SerumBuilder(240, 8).magnesium(100).creatine(35).carbohydrate(75).build();
		// SerumBuilderSolution is created [water=240, sodiumIon=8, magnesium=100,creatine=75, globulin=0, carbohydrate=0
	}

}
