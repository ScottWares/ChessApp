package com.lads.chess.app.enums;

/**
 * 
 * @author scott
 * @version 1.0
 * @implSpec Enumeration denoting valid game statuses
 *
 */
public enum GameStatus {
	
	BlackInCheck,
	WhiteInCheck,
	BlackCheckmated,
	WhiteCheckmated,
	InProgress,
	Resigned,
	Abandoned;

}
