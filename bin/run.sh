#!/bin/bash
profile=dev
if [ ! -z $1 ]
then
 profile=$1
fi
echo $profile
cd $( dirname $0 && pwd )
cd ../target/ 
java -jar -Dspring.profiles.active=$profile spring-boot-mybatis-1.0.0.jar
