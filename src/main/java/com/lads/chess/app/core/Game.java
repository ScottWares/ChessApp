package com.lads.chess.app.core;

import java.util.ArrayList;

import com.lads.chess.app.enums.GameStatus;
import com.lads.chess.app.enums.PieceColour;
import com.lads.chess.app.enums.Result;

/** 
 * 
 * @author scott
 * @version 1.0
 * @implSpec Class representing a game
 */
public class Game {

	private ArrayList<Move> playedMoves;
	private PieceColour currentTurn;
	private Player[] players;
	private Result result;
	private GameStatus status;
	
	public void addMove(){}
	public void create() {}
	public void isEnded() {}
	public void isChecked() {}
	public void isCheckmated() {}
	
}
