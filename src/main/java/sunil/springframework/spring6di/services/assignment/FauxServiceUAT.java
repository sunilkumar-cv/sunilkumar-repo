package sunil.springframework.spring6di.services.assignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("fauxService")
public class FauxServiceUAT implements FauxService {
    @Override
    public String getFaux() {
        return "UAT!!!";
    }
}
