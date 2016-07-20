package strings;

public class IntegerToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 6;
		StringBuilder Binary = new StringBuilder();
		while(i > 1){
			Binary.append(i%2);
			i = i/2;
		}
		Binary.append(1);
		System.out.println(Binary);
		System.out.print(Binary.reverse());

}
}
