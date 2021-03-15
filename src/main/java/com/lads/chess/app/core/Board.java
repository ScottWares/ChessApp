package com.lads.chess.app.core;

import com.lads.chess.app.enums.PieceColour;

/**
 * 
 * @author scott
 * @version 1.0
 * @implSpec Class defining a single board
 * @implNote Adopts Singleton pattern
 *
 */
public final class Board {
	
	/* State */

	private Square[][] squares;
	private PieceSet[] pieceSets;
	private PieceColour topColour;
	
	public static Board INSTANCE;
	
	/* Constructor */
	
	private Board() {}
	
	/* Public Methods */
	
	public void create() {}
	
	public static Board getInstance()
	{
		return INSTANCE ==null? new Board() : INSTANCE;
	}
	
	/* Accessors */

	public Square[][] getSquares() {
		return squares;
	}

	public void setSquares(Square[][] squares) {
		this.squares = squares;
	}

	public PieceSet[] getPieceSets() {
		return pieceSets;
	}

	public void setPieceSets(PieceSet[] pieceSets) {
		this.pieceSets = pieceSets;
	}

	public PieceColour getTopColour() {
		return topColour;
	}

	public void setTopColour(PieceColour topColour) {
		this.topColour = topColour;
	}

	public static Board getINSTANCE() {
		return INSTANCE;
	}

	public static void setINSTANCE(Board iNSTANCE) {
		INSTANCE = iNSTANCE;
	}
	
}
