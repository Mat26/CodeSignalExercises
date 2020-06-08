package Exercises;

public class AreSimilarExercise {

	public static void main(String[] args) {
    int[] a = {1,2,3};
    int[] b = {1,2,3};
    System.out.println("Test1: " + areSimilar(a, b));//True
    
	}

	static boolean areSimilar(int[] a, int[] b) {
		boolean similar = true;
		int count = 0;
		int pos1 = 0;
		int pos2 = 0;
		if (a == b) {
			return similar;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					count++;
					if (count == 1) {
						pos1 = i;
					}
					if (count == 2) {
						pos2 = i;
						if (a[pos1] != b[pos2] || a[pos2] != b[pos1]) {
							similar = false;
							break;
						}
					}
					if (count > 2) {
						similar = false;
						break;
					}

				}
			}
		}
		return similar;
	}

}
