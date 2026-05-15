public class TestAplicacao {
	
	public static void main(String[] args) {

		Livro livro01 = new Livro();
		Livro livro02 = new Livro("Inteligência Emocional", "Daniel Goleman, ph.D.");
		Livro livro03 = new Livro("Inteligência Emocional", "Daniel Goleman, ph.D.", 1995, 53.50);

		System.out.println(livro03);	
	}
}