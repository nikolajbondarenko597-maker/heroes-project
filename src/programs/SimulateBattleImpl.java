package com.heroes_task.programs;

import com.battle.heroes.army.*;
import com.battle.heroes.army.programs.PrintBattleLog;
import com.battle.heroes.army.programs.SimulateBattle;
import java.util.*;

public class SimulateBattleImpl implements SimulateBattle {

    public PrintBattleLog printBattleLog;

    @Override
    public void simulate(Army playerArmy, Army computerArmy) throws InterruptedException {
        while (hasAlive(playerArmy) && hasAlive(computerArmy)) {
            List<Unit> all = new ArrayList<>();
            all.addAll(getAlive(playerArmy.getUnits()));
            all.addAll(getAlive(computerArmy.getUnits()));

            all.sort((a, b) -> b.getBaseAttack() - a.getBaseAttack());

            for (Unit u : all) {
                if (!u.isAlive()) continue;
                Unit target = u.getProgram().attack();
                if (printBattleLog != null) {
                    printBattleLog.printBattleLog(u, target);
                }
            }
        }
    }

    private boolean hasAlive(Army a) {
        for (Unit u : a.getUnits()) if (u.isAlive()) return true;
        return false;
    }

    private List<Unit> getAlive(List<Unit> units) {
        List<Unit> alive = new ArrayList<>();
        for (Unit u : units) if (u.isAlive()) alive.add(u);
        return alive;
    }
}