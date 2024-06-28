package sunil.springframework.spring6di.services.assignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("fauxService")
public class FauxServiceQA implements FauxService {
    @Override
    public String getFaux() {
        return "QA!!!";
    }
}
