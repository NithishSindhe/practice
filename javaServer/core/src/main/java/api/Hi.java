package api;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Hi {
        private String content;

        public Hi() {
            // Jackson deserialization
        }

        public Hi(String content) {
            this.content = content;
        }

        @JsonProperty
        public String getContent() {
            return content;
        }
}
