package SwingProject2.real_estate_project.model;

public class Buyer {
  public Integer id;
  public String name;
  public String email;
  public String phone;

  // Where the buyer wants property
  public String preferredLocation;
  // Requirements / details
  public String requirements;

  // NEW: budget range
  public Double minBudget;
  public Double maxBudget;
}
