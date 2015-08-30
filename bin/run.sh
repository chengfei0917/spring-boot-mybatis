#!/bin/bash
#profile=dev
#if [ ! -z $1 ]
#then
# profile=$1
#fi
#echo $profile
cd $( dirname $0 )
cd ../target/ 
nohup java -jar $@ spring-boot-mybatis-1.0.0.jar >> ../logs/catalina.out 2>../logs/error.log &
echo $!>../logs/pid.log

