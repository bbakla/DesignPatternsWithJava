package behavioral.strategy.java8;


public class Client {

  public static void main(String[] args) {

    Runnable voiceCall = () -> System.out.println("Voice call");
    Runnable videoCall = () -> System.out.println("Video call");

    var callApp = new CallApp(voiceCall);
    callApp.call();
    callApp.changeCallMode(videoCall);
    callApp.changeCallMode(voiceCall);
  }
}
