package com.heroes_task.programs;

import com.battle.heroes.army.Unit;
import com.battle.heroes.army.programs.SuitableForAttackUnitsFinder;
import java.util.*;

public class SuitableForAttackUnitsFinderImpl implements SuitableForAttackUnitsFinder {

    @Override
    public List<Unit> getSuitableUnits(List<List<Unit>> unitsByRow, boolean isLeftArmyTarget) {
        List<Unit> suitable = new ArrayList<>();

        for (List<Unit> row : unitsByRow) {
            if (row.isEmpty()) continue;

            if (isLeftArmyTarget) {
                // Атакуем левую армию: подходят юниты, НЕ прикрытые СЛЕВА
                // → в упорядоченном списке (слева→направо) — только первый юнит
                suitable.add(row.get(0));
            } else {
                // Атакуем правую армию: подходят юниты, НЕ прикрытые СПРАВА
                // → в упорядоченном списке — только последний юнит
                suitable.add(row.get(row.size() - 1));
            }
        }

        return suitable;
    }
}