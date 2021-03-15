package com.lads.chess.app.core;

import java.util.ArrayList;

import com.lads.chess.app.engines.HumanPlayer;
import com.lads.chess.app.enums.GameStatus;
import com.lads.chess.app.enums.PieceColour;
import com.lads.chess.app.enums.Result;
import com.lads.chess.interfaces.IPlayerEngine;

/** 
 * 
 * @author scott
 * @version 1.0
 * @implSpec Class representing a game
 */
public class Game {

	/* State */
	
	private ArrayList<Move> playedMoves;
	private PieceColour currentTurn;
	private Player[] players;
	private Result result;
	private GameStatus gameStatus;
	private Board board;
	
	/* Constructor */
	
	public Game(IPlayerEngine[] playerTypes) {
		this.board= Board.getInstance();
		this.currentTurn = PieceColour.WHITE;
		initialisePlayers(playerTypes);
		this.gameStatus=GameStatus.InProgress;
	}
	
	/* Public Methods */
	
	public void addMove(){}
	public void create() {}
	public void isEnded() {}
	public void isChecked() {}
	public void isCheckmated() {}
	
	/* Private Methods */
	
	/**
	 * @apiNote  Can be improved in the future to include the option of starting colour
	 * @implSpec initialises two players for a new game, ensuring opposite colours
	 */
	private boolean initialisePlayers(IPlayerEngine[] playerTypes) {
		int playerCount = 0;
		for(IPlayerEngine p : playerTypes) {
			playerCount++;
			if(playerCount < 1 || playerCount > 2) break;
			players[playerCount-1] = new Player(p, currentTurn);
		}
		return playerCount == 2 ? true : false;
	}
	
}
