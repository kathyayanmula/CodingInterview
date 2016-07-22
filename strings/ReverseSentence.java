package strings;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "my name is goud";
		String[] splitSentence = sentence.split(" ");
		for(int i = splitSentence.length - 1; i >= 0; i--){
			System.out.println(splitSentence[i]);
		}

	}

}
