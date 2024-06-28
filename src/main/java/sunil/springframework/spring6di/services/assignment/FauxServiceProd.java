package sunil.springframework.spring6di.services.assignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("fauxService")
public class FauxServiceProd implements FauxService {

    @Override
    public String getFaux() {
        return "PROD!!!";
    }
}
