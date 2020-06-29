
public class Word implements Comparable<Word>, SentenceObject {
	private String word;
	
	public Word(String word) {
		this.word = word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public String getWord() {
		return word;
	}

	@Override
	public int compareTo(Word anotherWord) {
		return word.compareToIgnoreCase(anotherWord.getWord());
	}
}