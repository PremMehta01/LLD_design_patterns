

///////////////////////////////////////////////////
//  Bit advanced compared to URLBuilder_Traditional_Way
// PROS:
// 1. Simple to understand
// CONS:
// Very difficult to create all permutation/combination constructors
// Difficult to add any new constructor every time we have new requirements
//////////////////////////////////////////////////


public class URLBuilder_Telescope {
     private String protocol;
     private String host;
     private int port;
     private String pathParam;
     private String queryParam;

     public URLBuilder_Telescope(String protocol) {
         this.protocol = protocol;
     }

     public URLBuilder_Telescope(String protocol, String host) {
         this(protocol);
         this.host = host;
     }

     public URLBuilder_Telescope(String protocol, String host, int port) {
         this(protocol, host);
         this.port = port;
     }

     // similarly goes on....


}
