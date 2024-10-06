package observer_design_pattern;

/*
 * Observer class
 */
public class NewsChannel implements Channel{

    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
        System.out.println(news);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
