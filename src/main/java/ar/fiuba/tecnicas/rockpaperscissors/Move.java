package ar.fiuba.tecnicas.rockpaperscissors;

public interface Move {

	public Move vs(Move m);
	public Move vs(Rock rock);
	public Move vs(Paper paper);
	public Move vs(Scissors scissors);
}
