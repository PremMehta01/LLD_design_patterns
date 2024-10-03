
///////////////////////////////////////////////////
//  Basic approach, comes with lots of challenge
// PROS:
// 1. Simple to understand
// CONS:
// Very difficult to create all permutation/combination constructors
// Difficult to add any new constructor every time we have new requirements
//////////////////////////////////////////////////



public class URLBuilder_Traditional_Way {

    private String protocol;
    private String host;
    private int port;
    private String pathParam;
    private String queryParam;

    public URLBuilder_Traditional_Way() {}

    public URLBuilder_Traditional_Way(String protocol, String host, int port, String pathParam, String queryParam) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.pathParam = pathParam;
        this.queryParam = queryParam;
    }

    public URLBuilder_Traditional_Way(String protocol, String host, int port) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
    }

    public URLBuilder_Traditional_Way(String protocol, String host, String pathParam) {
        this.protocol = protocol;
        this.host = host;
        this.pathParam = pathParam;
    }

    // constructor permutation/combination goes on
}
