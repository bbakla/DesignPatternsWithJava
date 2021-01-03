package structural.decorator.decorators;

import structural.decorator.DataSource;

public class EncryptionDecorator extends AbstractDecorator {

  public EncryptionDecorator(DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public void read() {
    super.read();
    System.out.printf("Decrypting data from %s and reading afterwards\n", dataSource.getDataSourceName());
  }

  @Override
  public void writeData(String data) {
    super.writeData(data);
    System.out.printf("Encrypting data and writing into %s afterwards\n", dataSource.getDataSourceName());
  }
}

