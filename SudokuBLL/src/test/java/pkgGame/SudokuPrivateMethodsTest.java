package pkgGame;

import static org.junit.Assert.*;


import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuPrivateMethodsTest {
	
	@Test
	public void TestSetRegion() throws Exception {
		Sudoku s = null;
		int[][] puzzle = { 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		int[][] Filledpuzzle = { 
				{ 1, 2, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 3, 4, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		
		s = new Sudoku(puzzle);
		s.setRegion(2);
		
		assertFalse(Arrays.equals(puzzle, Filledpuzzle));
	}
	@Test
	public void TestFillDiagonalRegion() throws Exception {
		int[][] puzzle = {{0, 0, 0 ,0},
				{0, 0, 0 ,0},
				{0, 0, 0 ,0},
				{0, 0, 0 ,0} };
		int[][] otherpuzzle = {{0, 0, 0 ,0},
				{0, 0, 0 ,0},
				{0, 0, 0 ,0},
				{0, 0, 0 ,0} };
		Sudoku s = new Sudoku(puzzle);
		s.FillDiagonalRegions();
		assertFalse(Arrays.equals(puzzle, otherpuzzle));
	}
	
	private void PrintStars() 
	{
		for (int j = 0; j < 50; j++)
			
		System.out.print("*");
		System.out.println();

}
	
	@Test
	public void printStars_test() {
		System.out.println("Stars");
		
		PrintStars();
	}
}
