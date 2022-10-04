import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 28.09.2022
 */
public class FactsAboutCat {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final int upvotes;

    public FactsAboutCat(@JsonProperty("id") String id,
                         @JsonProperty("text") String text,
                         @JsonProperty("type") String type,
                         @JsonProperty("user") String user,
                         @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "FactsAboutCats{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }
}
