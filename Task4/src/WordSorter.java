public class WordSorter {
	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;"
                + " Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Define words
        String[] words = text.toLowerCase().split("[^a-zA-Z]+");

        // Bubble sort
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].compareTo(words[i + 1]) > 0) {
                    // swap
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        // Output sorted words
        System.out.println("Words in alphabetical order:");
        for (String word : words) {
        	// skip empty strings from split
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
	}
}
