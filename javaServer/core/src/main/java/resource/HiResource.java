package resource;

import api.Hi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hi")
@Produces(MediaType.APPLICATION_JSON)
public class HiResource {
    @GET
    public Hi sayingHi()
    {
        return new Hi("Hi this is adithya");
    }
}
