package fi.antti.jee.maven.tentti4.bean;

public class Levyt {

	private int id;
	private String artisti, albumi, formaatti;

	public Levyt(int id, String artisti, String albumi, String formaatti) {
		super();
		this.id = id;
		this.artisti = artisti;
		this.albumi = albumi;
		this.formaatti = formaatti;
	}

	public Levyt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtisti() {
		return artisti;
	}

	public void setArtisti(String artisti) {
		this.artisti = artisti;
	}

	public String getAlbumi() {
		return albumi;
	}

	public void setAlbumi(String albumi) {
		this.albumi = albumi;
	}

	public String getFormaatti() {
		return formaatti;
	}

	public void setFormaatti(String formaatti) {
		this.formaatti = formaatti;
	}

	@Override
	public String toString() {
		return "Levyt [id=" + id + ", artisti=" + artisti + ", albumi="
				+ albumi + ", formaatti=" + formaatti + "]";
	}

}
