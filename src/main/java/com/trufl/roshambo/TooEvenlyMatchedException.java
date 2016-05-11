package com.trufl.roshambo;

public class TooEvenlyMatchedException extends Exception {

	private static final long serialVersionUID = 1L;

	public TooEvenlyMatchedException(int _totalRoundsPlayed) {
		super(String.format("Players tied after %s rounds.", _totalRoundsPlayed));
	}
}
