package fiap.com.br.googlecloudfunctions.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GrettingService {
    public String hello() {
        return "Hello, GCP World";
    }
}
