package Service;

import Entity.Field;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FieldService {

    private void printLetters()
    {
        for (char ch = 65; ch < 65 + 16; ch++)
        {
            System.out.print(ch + " ");
        }
    }
    public static void printFields(Field myfield, Field enemyField)
    {
        System.out.printf("\n%21s %47s", "You", "Enemy\n\n");
        System.out.printf("%6s", "| ");
        printLetters();
        System.out.printf("%12s", "| ");
        printLetters();
        System.out.print("\n");

        for(int i = 0; i < 16; i++){
            {
                System.out.printf("|%-3s|", i);
                StringBuilder myRow = new StringBuilder();
                StringBuilder enemyRow = new StringBuilder();
                for(int j = 0; j < 16; j++)
                {
                    myRow.append(" ").append(myfield.getCells()[i][j].getCellState());
                    enemyRow.append(" ").append(enemyField.getCells()[i][j].getCellState());
                }
                System.out.print(myRow + "\t\t");
                System.out.printf("|%-3s|", i);
                System.out.println(enemyRow);
            }
        }
    }
}
