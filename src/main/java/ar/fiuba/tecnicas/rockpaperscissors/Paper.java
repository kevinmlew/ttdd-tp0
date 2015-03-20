package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper implements Move {

	public Move vs(Move m) {
		return m.vs(this);
	}

	public Paper vs(Rock rock) {
		return this;
	}

	public Paper vs(Paper paper) {
		return this;
	}

	public Scissors vs(Scissors scissors) {
		return scissors;
	}
}
