public class TestStatic_Exemplo02 {

	public static void exibirValor(int a) {

		System.out.println(a);
	}

	public static void exibirValor(String str) {

		System.out.println(str);
	}

	public static void main(String[] args) {

		TestStatic_Exemplo02 ts = new TestStatic_Exemplo02();

		ts.exibirValor("A minha idade é " + 23 + " anos");
		ts.exibirValor("Meu nome é Pablo Bernardino");

	}
}