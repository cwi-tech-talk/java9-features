import br.com.kimae.api.publicapi.PublicApiService;

module module.feature {
    requires java.base;
    requires publicapi.example;
    uses PublicApiService;
}