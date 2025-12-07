package SwingProject2.real_estate_project.model;

public class Seller {
  public Integer id;
  public String name;
  public String email;
  public String phone;

  // Notes about seller or property
  public String notes;

  // NEW: seller’s demand price range
  public Double demandMin;
  public Double demandMax;
}
