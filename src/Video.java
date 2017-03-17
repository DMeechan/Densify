import com.sun.media.jfxmedia.track.VideoTrack;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Video {
	private int length;
	private StringProperty name = new SimpleStringProperty("");
	private String location;
	private VideoTrack video;

	public Video(VideoTrack videoTrack, String location) {
		Keyframe[] keyframes;
	}

	public void split() {}

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

	public VideoTrack getVideo() {
		return video;
	}

	public void setVideo(VideoTrack video) {
		this.video = video;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}