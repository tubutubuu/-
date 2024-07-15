FROM  postgres:latest

ADD dump/init.sql /docker-entrypoint-initdb.d
RUN apt update
RUN apt-get install -y vim
RUN apt install sudo
RUN sudo adduser pompom --disabled-password
RUN echo "pompom:pompom" | sudo chpasswd
RUN mkdir -p /usr/local/pgsql/data
RUN chown postgres /usr/local/pgsql/data
USER postgres
RUN  pg_ctl -D /usr/local/pgsql/data initdb
RUN echo "host  all  all 0.0.0.0/0 md5">> /usr/local/pgsql/data/pg_hba.conf


