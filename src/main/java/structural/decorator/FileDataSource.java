package structural.decorator;

import structural.decorator.decorators.DataSource;

//Concrete Component
public class FileDataSource implements DataSource {

  private String fileName;

  public FileDataSource(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void read() {
    System.out.printf("\n\nReading data from %s\n\n", fileName);
  }

  @Override
  public void writeData(String data) {
    System.out.printf("\n\nWriting data %s to the file %s\n\n", data, fileName);
  }

  @Override
  public String getDataSourceName() {
    return fileName;
  }
}
