package com.lads.chess.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author scott
 * @version 1.0
 * @implSpec class defining the RESTful API endpoints
 */
@Controller
@RequestMapping("/game")
public class RestAPI {
	
	/**
	 * @implSpec REST endpoint for piece movement
	 * @apiNote The formal parameter will likely change to POJO mapping
	 * @param payload: JSON String representing a move
	 * @return ResponseEntity<String>: HTTP ResponseEntity 
	 */
	@PostMapping("/move")
	@RequestMapping(consumes = "application/json")
	public ResponseEntity<String>doMove(@RequestBody String payload){
		return new ResponseEntity<String>("move endpoint", HttpStatus.OK);
	}
	
	/**
	 * @implSpec REST endpoint for starting a new game
	 */
	@PostMapping("/new")
	@RequestMapping(consumes = "application/json")
	public ResponseEntity<String>makeNewGame(){
		return new ResponseEntity<String>("new game endpoint", HttpStatus.OK);
	}
	
	/**
	 * @implSpec REST endpoint for starting a new game
	 */
	@PostMapping("/resign")
	@RequestMapping(consumes = "application/json")
	public ResponseEntity<String>resigngame(){
		return new ResponseEntity<String>("resign endpoint", HttpStatus.OK);
	}

}
