package dummy.MahjonggCalc.db.model;

public class Participant implements Model {
	private Long id;
//	private List<LocationCell> locationCells;

    public Participant() {
//        locationCells = new ArrayList<LocationCell>();
    }

	@Override
	public String toString() {
		return "GameSession()";
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
