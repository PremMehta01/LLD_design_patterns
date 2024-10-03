public class URLBuilder {

    // static builder class inside class
    public static class Builder {

        private String protocol;
        private String host;
        private int port;
        private String pathParam;
        private String queryParam;


        public URLBuilder build() {
            return new URLBuilder(this);
        }

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder pathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }
    }



    // used final here to make Builder object immutable
    public final String protocol;
    public final String host;
    public final int port;
    public final String pathParam;
    public final String queryParam;


    public URLBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.host = builder.host;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.queryParam = builder.queryParam;
    }

}
