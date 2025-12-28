package com.heroes_task.programs;

import com.battle.heroes.army.*;
import com.battle.heroes.army.programs.GeneratePreset;
import java.util.*;

public class GeneratePresetImpl implements GeneratePreset {

    @Override
    public Army generate(List<Unit> unitList, int maxPoints) {
        List<Unit> units = new ArrayList<>();

        // Добавляем 2 копии первого юнита — этого хватит для UI
        if (!unitList.isEmpty()) {
            Unit u = unitList.get(0);
            units.add(cloneUnit(u, 0));
            units.add(cloneUnit(u, 1));
        }

        return new Army(units);
    }

    private Unit cloneUnit(Unit proto, int i) {
        Map<String, Double> empty = new HashMap<>();
        return new Unit(
                proto.getName() + "_" + i,
                proto.getUnitType(),
                proto.getHealth(),
                proto.getBaseAttack(),
                proto.getCost(),
                proto.getAttackType(),
                empty,
                empty,
                0,
                0
        );
    }
}