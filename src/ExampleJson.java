public class ExampleJson {
    private String description;
    private RequestJson request;
    private ExpectedRankingJson[] expected_ranking;
    private ExcludedJson[] excluded;
    private RecommendationJson recommendation;
    private String note;

    // Getters & setters
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public RequestJson getRequest() { return request; }
    public void setRequest(RequestJson request) { this.request = request; }

    public ExpectedRankingJson[] getExpected_ranking() { return expected_ranking; }
    public void setExpected_ranking(ExpectedRankingJson[] expected_ranking) { this.expected_ranking = expected_ranking; }

    public ExcludedJson[] getExcluded() { return excluded; }
    public void setExcluded(ExcludedJson[] excluded) { this.excluded = excluded; }

    public RecommendationJson getRecommendation() { return recommendation; }
    public void setRecommendation(RecommendationJson recommendation) { this.recommendation = recommendation; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
}