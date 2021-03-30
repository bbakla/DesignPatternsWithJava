package structural.decorator.decorators;

public interface DataSource {

  public void read();
  public void writeData(String data);
  public String getDataSourceName();

}
