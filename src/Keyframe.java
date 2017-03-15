import javafx.scene.paint.Color;

public class Keyframe {
	private int position;
	private Color averageColour;

	public Keyframe() {
		throw new UnsupportedOperationException();
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Color getAverageColour() {
		return this.averageColour;
	}

	public void setAverageColour(Color averageColour) {
		this.averageColour = averageColour;
	}
}