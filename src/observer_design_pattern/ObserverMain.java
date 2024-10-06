package observer_design_pattern;

public class ObserverMain {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addChannels(observer);
        observable.setNews("This is Krishna");
      //  System.out.println(observer.getNews());
    }
}
