#!/bin/bash
jlink --module-path "target:$JAVA_HOME/jmods" --add-modules module.feature --launcher module.feature=module.feature/br.com.kimae.moduleexample.ModuleExample --output dist --strip-debug --compress 2 --no-header-files --no-man-pages
