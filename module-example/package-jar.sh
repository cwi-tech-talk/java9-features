#!/bin/bash
mkdir -p target
jar --create --file target/publicapi-example.jar -C outDir/publicapi.example .
jar --create --file target/transitivity-example.jar -C outDir/transitivity.example .
jar --create --file target/module-example.jar --main-class br.com.kimae.moduleexample.ModuleExample -C outDir/module.feature .
