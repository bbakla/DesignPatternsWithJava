package structural.decorator.filedecorator.decorators;

import structural.decorator.filedecorator.DataSource;

public class CompressionDecorator extends AbstractDecorator {

  private String compressedDataFileName;

  public CompressionDecorator(DataSource dataSource, String compressedDataFileName) {
    super(dataSource);
    this.compressedDataFileName = compressedDataFileName;
  }

  @Override
  public void read() {
    super.read();
    System.out.printf("Decompressing data from %s and reading afterwards\n", dataSource.getDataSourceName());
  }

  @Override
  public void writeData(String data) {
    super.writeData(data);
    System.out.printf("Writing into %s and zipping it as %s afterwards\n", dataSource.getDataSourceName(), this.compressedDataFileName);
  }
}
