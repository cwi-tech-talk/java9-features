import br.com.kimae.api.publicapi.PublicApiService;
import br.com.kimae.api.service.MyApiService;

module publicapi.example {
    exports br.com.kimae.api.publicapi;
    provides PublicApiService with MyApiService;
}