
public abstract class Symbol {
	private char symbol;
	
	/**
	 * Creates new Symbol by the given character.
	 * @param symbol the character to be stored
	 */
	protected Symbol(char symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * Returns the stored character.
	 * @return the character representation of the Symbol
	 */
	public char getSymbol() {
		return symbol;
	}
}