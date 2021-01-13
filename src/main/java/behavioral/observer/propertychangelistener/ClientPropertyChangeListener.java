package behavioral.observer.propertychangelistener;

import behavioral.observer.classic.Message;
import behavioral.observer.propertychangelistener.observers.MobileApp;
import behavioral.observer.propertychangelistener.observers.ObserverChangeListener;
import behavioral.observer.propertychangelistener.observers.Website;

public class ClientPropertyChangeListener {

  public static void main(String[] args) {
    var subject = new NewsAgencyWithChangeSupport();
    ObserverChangeListener app = new MobileApp("mobile app");
    ObserverChangeListener website = new Website("www.att.com");
    //var tv = new TVStation("K Tv");

    subject.subscribe(app);
    subject.subscribe(website);


    subject.publish(new Message("first message"));
    subject.publish(new Message("second message"));
    subject.publish(new Message("third message"));
  }

}
