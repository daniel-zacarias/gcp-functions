package fiap.com.br.googlecloudfunctions;

import java.io.Writer;

import fiap.com.br.googlecloudfunctions.service.GrettingService;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("httpFunction")
@ApplicationScoped
public class HttpFunctionTest implements HttpFunction {

    @Inject
    GrettingService grettingService;

    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
        Writer writer = response.getWriter();
        writer.write(grettingService.hello());
    }
}
