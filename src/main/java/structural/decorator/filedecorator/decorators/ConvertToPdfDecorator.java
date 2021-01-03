package structural.decorator.filedecorator.decorators;

import structural.decorator.filedecorator.DataSource;

public class ConvertToPdfDecorator extends AbstractDecorator {

  public ConvertToPdfDecorator(DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public void read() {
    super.read();
    System.out.printf("Converting data to pdf before reading from %s\n", dataSource.getDataSourceName());
  }

  @Override
  public void writeData(String data) {
    super.writeData(data);
    System.out.printf("Converting %s to pdf after writing into\n", dataSource.getDataSourceName());
  }
}

