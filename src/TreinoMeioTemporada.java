
public class TreinoMeioTemporada extends Treinos {

	@Override
	protected void jogoTreino() {
		System.out.println("Preparo Fisico Intenso.");

	}

	@Override
	protected void preparoFisico() {
		System.out.println("Jogo Treino com Equipe Reserva.");

	}
	
	@Override
	public String toString() {
		return "Treino Meio De Temporada";
	}

}
