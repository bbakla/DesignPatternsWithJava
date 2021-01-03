package structural.decorator.decorators;

import structural.decorator.DataSource;

public abstract class AbstractDecorator implements DataSource {
  protected DataSource dataSource;

  public AbstractDecorator(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void read() {
    dataSource.read();
  }

  @Override
  public void writeData(String data) {
    dataSource.writeData(data);
  }

  @Override
  public String getDataSourceName() {
    return dataSource.getDataSourceName();
  }
}
