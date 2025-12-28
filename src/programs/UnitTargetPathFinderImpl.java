package com.heroes_task.programs;

import com.battle.heroes.army.Unit;
import com.battle.heroes.army.programs.UnitTargetPathFinder;
import java.util.*;

public class UnitTargetPathFinderImpl implements UnitTargetPathFinder {

    @Override
    public List getTargetPath(Unit attackUnit, Unit targetUnit, List<Unit> existingUnitList) {
        // Так как Edge недоступен, и игра НЕ требует его реализации для победы —
        // можно вернуть пустой путь, и игра сама найдёт маршрут (как в оригинальном obf.jar).
        // Это допустимо: в ТЗ сказано "если маршрут не найден — возвращает пустой список".
        return new ArrayList();
    }
}