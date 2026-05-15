public class TesteSalaDeAula {
	public static void main(String[] args) {

		SalaDeAula sala1 = new SalaDeAula();
		SalaDeAula sala2 = new SalaDeAula();
		SalaDeAula sala3 = new SalaDeAula();

		SalaDeAula.adicionarAlunos();
		SalaDeAula.adicionarAlunos();
		SalaDeAula.adicionarAlunos();
		SalaDeAula.adicionarAlunos();
		SalaDeAula.adicionarAlunos();

		SalaDeAula.totalAlunos();
	}
}