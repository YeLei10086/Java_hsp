package homework.homework01;

/**
 * @author 叶磊
 */
public class News_ {
    private String title;
    private String content;

    public News_(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "title=" + title;
    }
}
