
public abstract class Treinos {
	
	public final void treinoDiario() {
		System.out.println("########################################");
		System.out.println(this.toString());
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}

	private final void treinoTatico() {
		System.out.println("Treino tático");
		
	}

	protected abstract void jogoTreino();

	protected abstract void preparoFisico();

}
