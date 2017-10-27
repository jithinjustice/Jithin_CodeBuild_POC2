#Base Image
FROM ubuntu:14.04

#Adding description to the images


# File Author / Maintainer
MAINTAINER jithin

RUN apt-get update
RUN apt-get install -y --no-install-recommends openjdk-7-jdk
RUN apt-get install -y maven


