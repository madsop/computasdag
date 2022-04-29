import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/computas")
public class ComputasController {

    @GET
    public String computas() {
        return "Computas er veldig bra!";
    }
}
