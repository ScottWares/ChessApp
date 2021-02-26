package com.lads.chess.app.core;

import com.lads.chess.app.abstracts.Piece;

/**
 * 
 * @author scott
 * @version 1.0
 * @implSpec Class representing a single move
 */
public class Move {
	private Square start;
	private Square end;
	private Piece piece;
	private Piece capturedPiece;
	
	public void move() {}
}
