#!/bin/bash
dir=$(pwd)/home
java -Ddocs.dir=${dir} -cp build/classes/java/main:lib/jetty-all-uber.jar org.eclipse.jetty.embedded.FileServer -Duser.dir=${dir}
