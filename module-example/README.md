# Modularity with Java 9

## Directives explained
Follows a quick and simples explanation for each directive and file:  
* `module-info.java`: The java file that describes the module dependencies and public apis;
* `exports package.name`: Exports a package as a public api, everything inside the package (non-recursive) is accessible, but it's possible to use reflection at runtime;
* `requires module.name`: Tells that this module requires the module `module.name`;
* `provide interface.name with class.name`: Provides an interface with a specific implementatin;
* `uses interface.name`: Uses the implementation provided to `interface.name` by another module;
* `opens package.name`: Permits the application to access the class by reflection at runtime.

## Modules

### module.feature
The module with the main class that executes something using the module `publicapi.example`

### publicapi.example
Module with the consumable api's. At `module.feature` is possible to use the impl from PublicApiService and it's possible to access PrivateApiExample throu composition.

### transitivity.example
The only porpuse for this module is to demonstrate the `transitive` directive.

## How to compile and run
In order to compile the project execute: 
```
./compile.sh
```

In order to execute just execute:
```
./execute.sh
```

There are to additional scripts to create and execute jar packaged apps.

## Future
The next step is to test a more advanced scenario using modularity, with project manager tool, like `gradle` or `maven`.