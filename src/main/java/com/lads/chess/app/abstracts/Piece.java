package com.lads.chess.app.abstracts;

import com.lads.chess.app.core.Square;
import com.lads.chess.app.enums.PieceColour;
/**
 * 
 * @author scott
 * @version 1.0
 * @implSpec Abstract class defining a single piece
 */
public abstract class Piece {

	private PieceColour pieceColour;
	private Square currentlyPlaced;
	private boolean hasMoved;
	
	//public Square[] validMoves() {}
	//public Square[] attackSquares() {}
	//public Square[] nonAttackSquares() {}
	
}
