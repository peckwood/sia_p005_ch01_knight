package com.raidencentral.knights;
import static org.mockito.Mockito.*;

import org.junit.Test;



public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class);
		Knight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
