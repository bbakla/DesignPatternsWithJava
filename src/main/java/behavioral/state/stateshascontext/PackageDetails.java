package behavioral.state.stateshascontext;

public class PackageDetails {
  private String packageId;
  private String city;

  public PackageDetails(String packageId, String city) {
    this.packageId = packageId;
    this.city = city;
  }

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
