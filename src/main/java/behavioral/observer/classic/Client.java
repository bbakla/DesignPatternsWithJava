package behavioral.observer.classic;

import behavioral.observer.classic.observers.App;
import behavioral.observer.classic.observers.TVStation;
import behavioral.observer.classic.observers.Website;
import behavioral.observer.classic.subject.NewsAgency;

public class Client {

  public static void main(String[] args) {
    var subject = new NewsAgency();
    var app = new App("mobile app");
    var website = new Website("www.a.com");
    var tv = new TVStation("K Tv");

    subject.subscribe(app);
    subject.subscribe(website);
    subject.subscribe(tv);

    subject.publish(new Message("first message"));
    subject.publish(new Message("second message"));
    subject.publish(new Message("third message"));
  }

}
