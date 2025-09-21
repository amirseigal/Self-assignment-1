
public class StringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text = "To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer"
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";

        int spaces = 0,
            vowels = 0,
            letters = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (c == ' ') {
                spaces++;
            }
            else if (Character.isLetter(c)) {
                letters++;

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
            }
        }

        System.out.println("The text contained vowels: " + vowels
            + "\n consonants " + (letters - vowels)
            + "\n spaces: " + spaces);
	}

}
