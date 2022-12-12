package first.java.concurrency;

import java.util.Date;

public class UpdateRequest {

    private String IP;
    private Date date;
    private Integer timeout;

    public UpdateRequest() {
    }

    public UpdateRequest withTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public UpdateRequest withIP(String IP) {
        this.IP = IP;
        return this;
    }

    public String send() throws Exception {
        return "Response";
    }

}
