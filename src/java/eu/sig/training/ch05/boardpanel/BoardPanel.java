package eu.sig.training.ch05.boardpanel;

import java.awt.Graphics;
import java.util.List;

class Point() {
	public int x;
	public int y;
	public void Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class SquareSize() {
	public int w;
	public int h;
	public void SquareSize(int w, int h) {
		this.w = w;
		this.h = h;
	}
}

public class BoardPanel {
    @SuppressWarnings("unused")
    // tag::render[]
    /**
     * Renders a single square on the given graphics context on the specified
     * rectangle.
     * 
     * @param square
     *            The square to render.
     * @param g
     *            The graphics context to draw on.
     * @param x
     *            The x position to start drawing.
     * @param y
     *            The y position to start drawing.
     * @param w
     *            The width of this square (in pixels).
     * @param h
     *            The height of this square (in pixels).
     */
    private void render(Square square, Graphics g, Point point, SquareSize squareSize) {
        square.getSprite().draw(g, point, squareSize);
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, point, squareSize);
        }
    }
    // end::render[]

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g, Point point, SquareSize squareSize) {

        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }

    }

}
