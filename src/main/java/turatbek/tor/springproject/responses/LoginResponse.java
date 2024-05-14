package turatbek.tor.springproject.responses;

public class LoginResponse {
    private String token;

    private long expiresIn;

    public String setToken(String jwtToken) {
        return token;
    }

    // Getters and setters...
}
