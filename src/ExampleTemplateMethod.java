/**
 * 
 */

/**
 * @author Thiago
 *
 */
public class ExampleTemplateMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		Treinos inicioTemporada = new TreinoMeioTemporada();
		Treinos meioTemporada = new TreinoInicioTemporada();
		
		inicioTemporada.treinoDiario();
		meioTemporada.treinoDiario();

	}

}
