package com.lads.chess.app.core;

import com.lads.chess.app.enums.PieceColour;
import com.lads.chess.interfaces.IPlayerEngine;

/**
 * 
 * @author scott
 * @version 1.0
 * @implSpec Class representing a player
 *
 */
public class Player{
	
	/* State */
	
	private PieceColour colour;
	private IPlayerEngine playerEngine;
	
	/* Constructor */
	
	public Player(IPlayerEngine playerType, PieceColour playerColour) {
		this.colour = playerColour;
		this.playerEngine =  playerType;
	}
}
