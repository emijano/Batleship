package com.emijano;

public class Player {
	
	private int submarineCnt = 0, destroyerCnt = 0, cruiserCnt = 0, battleshipCnt = 0;
	private final int maxSubmarineCnt, maxDestroyerCnt, maxCruiserCnt, maxBattleshipCnt;
	
	Player(Configuration cfg) {
		maxSubmarineCnt = cfg.submarineCnt;
		maxDestroyerCnt = cfg.destroyerCnt;
		maxCruiserCnt = cfg.cruiserCnt;
		maxBattleshipCnt = cfg.battleshipCnt;
	}
	
	void cofigureFleet(GameConfigurator configurator) {
		
		while(isConfigFinished())
			configurator.performConfig();
	}
	
	
	private boolean isConfigFinished() {
		if (battleshipCnt == maxBattleshipCnt)
			return true;
		
		return false;
	}

	}
