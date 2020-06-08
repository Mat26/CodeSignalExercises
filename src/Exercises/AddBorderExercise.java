package Exercises;

public class AddBorderExercise {

	public static void main(String[] args) {
		String[] picture = { "abc", "ded" };
		System.out.println("Test1: "+addBorder(picture));

	}

	static String[] addBorder(String[] picture) {
		String[] border = new String[picture.length + 2];
		int longValuePicture = picture[0].length() + 2;
		for (int i = 0; i < border.length; i++) {
			int count = 0;
			String asteriscos = "";
			while (count < longValuePicture) {
				asteriscos += "*";
				count++;
			}
			if (i == 0 || i == border.length - 1) {
				border[i] = asteriscos;
			} else {
				border[i] = "*" + picture[i - 1] + "*";
			}
		}
		return border;
	}

}
