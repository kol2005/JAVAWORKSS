package com.biz.jack.Exec;

import java.util.List;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.service.DeckServiceV1;
import com.biz.jack.service.PlayerServiceV1;

public class JackEx_02 {

	public static void main(String[] args) {
		
		DeckServiceV1 ds = new DeckServiceV1();
		ds.makeDeck();
		List<DeckVO> deckList = ds.getDeck();
		
		PlayerServiceV1 µô·¯ = new PlayerServiceV1(deckList);
		PlayerServiceV1 °í´Ï = new PlayerServiceV1(deckList,"°í´Ï");
		
		µô·¯.hit();
		°í´Ï.hit();
		µô·¯.hit();
		°í´Ï.hit();
		if(µô·¯.sumValue() < 17)µô·¯.hit();
		°í´Ï.hit();
		if(µô·¯.sumValue() < 17)µô·¯.hit();
		°í´Ï.hit();
		if(µô·¯.sumValue() < 17)µô·¯.hit();
		°í´Ï.hit();

	}

}
