package Exercises;

public class ChessBoardCellColorExercise {

	public static void main(String[] args) {
		System.out.println("Test1: " + chessBoardCellColor("A1", "C3"));//True

	}

	static boolean chessBoardCellColor(String cell1, String cell2) {
		return cell1.matches("[ACEG][1357]|[BDFH][2468]") == cell2.matches("[ACEG][1357]|[BDFH][2468]") ? true : false;
	}

}
