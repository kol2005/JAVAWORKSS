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
		
		PlayerServiceV1 ���� = new PlayerServiceV1(deckList);
		PlayerServiceV1 ��� = new PlayerServiceV1(deckList,"���");
		
		����.hit();
		���.hit();
		����.hit();
		���.hit();
		if(����.sumValue() < 17)����.hit();
		���.hit();
		if(����.sumValue() < 17)����.hit();
		���.hit();
		if(����.sumValue() < 17)����.hit();
		���.hit();

	}

}
