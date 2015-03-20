package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors implements Move {

	public Move vs(Move m) {
		return m.vs(this);
	}

	public Rock vs(Rock rock) {
		return rock;
	}

	public Scissors vs(Paper paper) {
		return this;
	}

	public Scissors vs(Scissors scissors) {
		return this;
	}
}
