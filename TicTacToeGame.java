package com.workshop.tictactoegame;

public class TicTacToeGame {
	
	public static void main(String[] args) {
		
		System.out.println("Tic Tac Toe game");
		board();
	}
	
		// creating a board to play
		static void board() {
			 char[] board = new char[10];           // declaring array board
			 
		// giving each array index value as empty initially
	    for(int i = 1; i < 10; i++) {
	    		board[i] = ' ';
	    	}
		}
	}
	

