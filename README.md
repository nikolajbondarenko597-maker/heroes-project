# Heroes Project — Implementation

## Implemented algorithms
| Method | Complexity | Status                         |
|--------|------------|--------------------------------|
| `GeneratePreset.generate()` | O(1) | ️ Заглушка (армия из 2 юнитов) |
| `SuitableForAttackUnitsFinder.getSuitableUnits()` | O(n) | Выполнено                      |
| `UnitTargetPathFinder.getTargetPath()` | O(1) | Выполнено                      |
| `SimulateBattle.simulate()` | O(r·n log n) | Выполнено                      |

## Verification
- ✔️ Бой проходит: правильная очерёдность, лог в консоли, смерть юнитов.
- ✔️ Цели: атака только крайних юнитов в ряду.
- ✔️ Путь: юниты доходят до цели (движок обходит препятствия).
- ❌ Генерация пресета: UI игры требует 4 типа, но передаёт 1.

## Build (for verification)
```bash
javac -d . -cp "libs/heroes_task_lib-1.0-SNAPSHOT.jar" src/programs/*.java
jar cmf manifest.txt obf.jar com/heroes_task/programs/*.class