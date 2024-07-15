FROM  postgres:latest

RUN apt update
RUN apt-get install -y vim
RUN apt install sudo



