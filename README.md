# java9-features
Java 9 features examples

## [module-examples](https://www.oracle.com/corporate/features/understanding-java-9-modules.html)
This sub folder has the 2 modules used as example for the module feature from java 9.

### module.feature
The module with the main class that executes something using the module `publicapi.example`

### publicapi.example
Module with the consumable api's. At module.feature is possible to use the impl from PublicApiService and it's possible to access PrivateApiExample throu composition.

### How to compile and run
There is 2 scripts in the base folder, one that compiles and onther to run the app. It's possible to run throu IDE like `Intelij`, but make sure to import hte module `publicapi.example` as an module dependency to module.feature.