package com.trufl.roshambo;

import com.trufl.roshambo.player.Player;

public interface Roshambo {
	Results compete(Player _playerOne, Player _playerTwo, int _totalRounds) throws TooEvenlyMatchedException;
}
