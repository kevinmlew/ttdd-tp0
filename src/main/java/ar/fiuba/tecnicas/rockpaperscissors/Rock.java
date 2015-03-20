package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock implements Move {

	public Move vs(Move m) {
		return m.vs(this);
	}

	public Rock vs(Rock rock) {
		return this;
	}

	public Paper vs(Paper paper) {
		return paper;
	}

	public Rock vs(Scissors scissors) {
		return this;
	}

}
