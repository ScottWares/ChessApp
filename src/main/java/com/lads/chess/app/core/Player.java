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
	private PieceColour colour;
	private IPlayerEngine playerEngine;
}
