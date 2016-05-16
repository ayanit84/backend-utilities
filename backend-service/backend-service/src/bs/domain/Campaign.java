package bs.domain;

public class Campaign {
	private String name;
	private CampaignCategory category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CampaignCategory getCategory() {
		return category;
	}

	public void setCategory(CampaignCategory category) {
		this.category = category;
	}
}
