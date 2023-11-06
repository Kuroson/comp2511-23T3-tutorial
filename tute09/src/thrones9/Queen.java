package thrones9;

import java.util.Random;

/**
 * A queen can move to any square in the same column, row or diagonal as she is
 * currently on, and has a 1 in 3 chance of inflicting 12 points of damage or a
 * 2 out of 3 chance of inflicting 6 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Queen extends Character {
    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public void attack(Character victim) {
        Random r = new Random(1323);
        if (r.nextInt(3) == 2) {
            // [0,3) => 0, 1, 2
            // 1/3
            victim.damage(12);
        } else {
            // 2/3
            victim.damage(6);
        }
    }

    @Override
    public boolean canMove(int dx, int dy) {
        // 1. Diagonal
        if (dx == dy) {
            return true;
        } else if (dx == 0 && dy != 0) {
            // 2. vertical
            return true;
        } else if (dy == 0 && dx != 0) {
            // 3. horizontal
            return true;
        }
        return false;
    }

}
