package structural.decorator.filedecorator;

import javax.xml.crypto.Data;
import structural.decorator.filedecorator.decorators.CompressionDecorator;
import structural.decorator.filedecorator.decorators.ConvertToPdfDecorator;
import structural.decorator.filedecorator.decorators.EncryptionDecorator;

public class Client {

  public static void main(String[] args) {
    DataSource dataSource = new FileDataSource("example.txt");

    dataSource = new EncryptionDecorator(dataSource);
    dataSource = new CompressionDecorator(dataSource, "main.zip");
    dataSource = new ConvertToPdfDecorator(dataSource);

    dataSource.writeData("%data%");
    dataSource.read();

    //Actually the same with above but we create more instances unnecessarily.
   /* DataSource dataSource2 = new FileDataSource("example.txt");

    DataSource dataSourceEn = new EncryptionDecorator(dataSource2);
    DataSource dataSourceCo = new CompressionDecorator(dataSourceEn, "main.zip");
    DataSource dataSourcePdf = new ConvertToPdfDecorator(dataSourceCo);

    dataSourcePdf.writeData("%data%");
    dataSourcePdf.read();*/
  }

}