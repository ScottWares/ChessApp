package com.lads.chess.app.enums;

/**
 * 
 * @author scott
 * @version 1.0
 * @implSpec Enumeration denoting valid PieceTypes
 */

public enum PieceType {
	PAWN("pawn"),
	QUEEN("queen"),
	KING("king"),
	ROOK("rook"),
	BISHOP("bishop"),
	KNIGHT("knight");
	
	private String pieceType;
	
	private PieceType(String aType) {
		this.pieceType = aType;
	}

	public String getPieceType() {return this.pieceType;}
}
