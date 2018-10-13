import br.com.kimae.api.publicapi.PublicApiService;
import br.com.kimae.api.service.MyApiService;

module publicapi.example {
    exports br.com.kimae.api.publicapi;
    exports br.com.kimae.api.notprivateapi;
    opens br.com.kimae.api.notprivateapi;
    requires transitive transitivity.example;
    provides PublicApiService with MyApiService;
}