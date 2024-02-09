package yandexTraine.lecture2.task7;

/*
Игра PitCraft происходит в двумерном массиве, который состоит из блоков 1 x 1
Остров игрока представляет собой набор столбцов различной высоты, состоящих из блоков
камня и окружённый морем.
Над островом прошёл ливень, заполнил водой все низины, а не поместившаяся
в них вода стекла в море, не увеличив его уровень.

По ландшафту острова определите, сколько блоков воды осталось(кол-во блоков)
после дождя в низинах на острове
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7 {

    public static int islandFlood(int[] island) {
        int maxIndex = 0;
        for (int i = 1; i < island.length; i++)
            if (island[i] > island[maxIndex])
                maxIndex = i;

        int countBlocks = 0;
        int elementLandBlock = 0;
        for (int i = 0; i <= maxIndex; i++) {
            if (island[i] > elementLandBlock) {
                elementLandBlock = island[i];
            }
            countBlocks += elementLandBlock - island[i];
        }

        elementLandBlock = 0;
        for (int i = island.length-1; i >= maxIndex; i--) {
            if (island[i] > elementLandBlock) {
                elementLandBlock = island[i];
            }
            countBlocks += elementLandBlock - island[i];
        }

        return countBlocks;
    }

    static class Test {

        @org.junit.jupiter.api.Test
        public void check_islandFlood() {
            int[] island = {3,1,4,3,5,1,1,3,2};
            int result = islandFlood(island);
            System.out.println("result: " + result);
            Assertions.assertEquals(7,result);
        }
    }

}
