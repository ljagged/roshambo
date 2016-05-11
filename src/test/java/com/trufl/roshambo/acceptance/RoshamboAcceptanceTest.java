package com.trufl.roshambo.acceptance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trufl.roshambo.Results;
import com.trufl.roshambo.Roshambo;
import com.trufl.roshambo.TooEvenlyMatchedException;
import com.trufl.roshambo.player.PaperPlayer;
import com.trufl.roshambo.player.Player;
import com.trufl.roshambo.player.RockPlayer;

public class RoshamboAcceptanceTest {
	private Roshambo roshamboUT;
	
	@Before
	public void setup() {
		this.roshamboUT = (Roshambo)new ClassPathXmlApplicationContext("application-context.xml").getBean("roshambo");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldRequirePlayerOne() throws Exception {
		this.roshamboUT.compete(null, new PaperPlayer(), 3);
	}

	@Test(expected=IllegalArgumentException.class)
	public void shouldRequirePlayerTwo() throws Exception {
		this.roshamboUT.compete(new PaperPlayer(), null, 3);
	}

	@Test(expected=IllegalArgumentException.class)
	public void shouldRequireMoreRoundsThanZero_0() throws Exception {
		this.roshamboUT.compete(new PaperPlayer(), new PaperPlayer(), 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldRequireMoreRoundsThanZero_negative() throws Exception {
		this.roshamboUT.compete(new PaperPlayer(), new PaperPlayer(), -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldRequireOddRounds() throws Exception {
		this.roshamboUT.compete(new PaperPlayer(), new PaperPlayer(), 2);
	}
	
	@Test(expected=TooEvenlyMatchedException.class)
	public void shouldThrowExceptionOnTie() throws Exception {
		this.roshamboUT.compete(new PaperPlayer(), new PaperPlayer(), 3);
	}
	
	@Test
	public void shouldProvideWinner() throws Exception {
		Player playerOne = new RockPlayer();
		Player playerTwo = new PaperPlayer();
		
		Results results = this.roshamboUT.compete(playerOne, playerTwo, 3);
		
		assertThat(results.getWinner()).isEqualTo(playerOne);
	}

	@Test
	public void shouldProvideScore() throws Exception {
		Player playerOne = new RockPlayer();
		Player playerTwo = new PaperPlayer();
		
		Results results = this.roshamboUT.compete(playerOne, playerTwo, 3);
		
		assertThat(results.getScore(playerOne)).isEqualTo(3);
		assertThat(results.getScore(playerTwo)).isEqualTo(0);
	}
}
