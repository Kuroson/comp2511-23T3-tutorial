package thrones;

public class Game {

    public Character createCharacter(String type, int x, int y) {
        if (type.equals("King")) {
            return new King(x, y, 0);
        } else if (type.equals("Queen")) {
            return new Queen(x, y);
        }
        return null;
    }

    public King createKing(int x, int y) {
        return new King(x, y, 0);
    }

    public static void main(String[] args) {
        Game g = new Game();
        King king = g.createKing(0, 0);
        Queen queen = new Queen(0, 1);
        Knight knight = new Knight(0, 2);
        Dragon dragon = new Dragon(-1, 0);

        knight.attack(dragon);
    }

}