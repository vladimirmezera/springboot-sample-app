package hello;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        // add whatever data you want to expose on info endpoint...
        builder.withDetail("remoteServiceVersion", getRemoteServiceVersion());
    }
    // service would check version of some remote service being used
    private String getRemoteServiceVersion(){
        return "1.2.3";
    }
}
