
public class TreinoInicioTemporada extends Treinos {

	@Override
	protected void jogoTreino() {
		System.out.println("Preparo Fisico Leve.");

	}

	@Override
	protected void preparoFisico() {
		System.out.println("Jogo Treino com Equipe Junior.");

	}
	
	@Override
	public String toString() {
		return "Treino Início De Temporada";
	}
}
