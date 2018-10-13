package br.com.kimae.moduleexample;

import br.com.kimae.api.notprivateapi.PrivateAccessiblePublicApi;
import br.com.kimae.api.publicapi.MyPublicApi;
import br.com.kimae.api.publicapi.PublicApiService;
import br.com.kimae.transitivityexample.publicapis.TransitivityExample;

import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ServiceLoader;

public class ModuleExample {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        final MyPublicApi publicApi = new MyPublicApi();

        // Accessing a implementation provided by the module
        ServiceLoader.load(PublicApiService.class).findFirst()
                .get()
                .execute();

        //Accessing an public method exposed by requires the module
        System.out.println(publicApi.getInfoApi() + " (requires)");

        // Accessing an public method from a package not exposed by composition
        System.out.println(publicApi.retrievePrivateInfo() + " (composition)");

        // Trying to access by reflection a private method from a public api exposed (but not open)
        Method privateMethod = publicApi.getClass().getDeclaredMethod("mySecretMethod");
        try {
            privateMethod.setAccessible(true);

            System.out.println(privateMethod.invoke(publicApi));
        } catch (InaccessibleObjectException e) {
            System.out.println("Not accessible by reflection :(. " + e.getMessage());
        }

        // Accessing a private method from a public class exposed and open
        final PrivateAccessiblePublicApi privateAccessiblePublicApi = new PrivateAccessiblePublicApi();

        Method notTooPrivateMathod = privateAccessiblePublicApi.getClass().getDeclaredMethod("notTooPrivateMathod");

        notTooPrivateMathod.setAccessible(true);

        System.out.println(notTooPrivateMathod.invoke(privateAccessiblePublicApi));

        // Accessing transitive class
        TransitivityExample transitivityExample = new TransitivityExample();

        System.out.println(transitivityExample.transitiveMethod());
    }
}
