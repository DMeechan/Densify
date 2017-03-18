import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import marvin.image.MarvinImage;
import marvin.video.MarvinJavaCVAdapter;
import marvin.video.MarvinVideoInterface;
import marvin.video.MarvinVideoInterfaceException;

public class Video {
	private int length;
	private StringProperty name = new SimpleStringProperty("");
	private String location;
	private MarvinVideoInterface videoInterface;
	private MarvinImage frame;
	private Keyframe[] keyframes;

	public Video(String location) {
		try {
			videoInterface = new MarvinJavaCVAdapter();
			videoInterface.loadResource(location);

		} catch (MarvinVideoInterfaceException e) {
			Main.outputError(e);
		}

		videoInterface.getFrameNumber();

	}

	public void split() {
		try {
			while (videoInterface.getFrame() != null) {
				frame = videoInterface.getFrame();
				if (videoInterface.getFrameNumber() == 10) {
					// do fun stuff, and edit the if statement of course to accept any multiple of 10...
				}
			}
		} catch (MarvinVideoInterfaceException e) {
			Main.outputError(e);
		}

	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getName() {
		return name.get();
	}

	public StringProperty nameProperty() {
		return name;
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}