package sunil.springframework.spring6di.services.assignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("fauxService")
public class FauxServiceDev implements FauxService {
    @Override
    public String getFaux() {
        return "DEV!!!";
    }
}
