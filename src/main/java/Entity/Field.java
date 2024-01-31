package Entity;


import Enums.CellState;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Field {

    private CellState[][] cells = new CellState[16][16];

    private Ship[] ships = new Ship[21];

    public Field(){
        for (int i = 0; i < 16; i++)
        {
        Arrays.fill(cells[i], CellState.EMPTY);
        }
    }
}
