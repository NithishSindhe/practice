import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resource.HiResource;

public class JavaPracticeServerApplication extends Application<JavaPracticeServerConfiguration> {
    public static void main(String[] args) throws Exception {
        new JavaPracticeServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "javaPraticeServer";
    }

    @Override
    public void initialize(Bootstrap<JavaPracticeServerConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(JavaPracticeServerConfiguration javaPracticeServerConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new HiResource());
    }
}
