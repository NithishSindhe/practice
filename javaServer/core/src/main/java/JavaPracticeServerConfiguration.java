import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotEmpty;

public class JavaPracticeServerConfiguration extends Configuration {

    @NotEmpty
    private String name;

    @JsonProperty
    public void setName(String name){
        this.name=name;
    }
    @JsonProperty
    public String getName() {
        return name;
    }
}
