package com.trufl.roshambo;

import com.trufl.roshambo.player.Player;

public interface Results {
	Player getWinner();
	int getScore(Player _player);
}
