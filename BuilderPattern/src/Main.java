public class Main {
    public static void main(String[] args) {
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("https://").host("www.google.com").pathParam("/userId=123").queryParam("?location=IN");

        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.host);
        System.out.print(urlBuilder.pathParam);
        System.out.print(urlBuilder.queryParam);
    }
}