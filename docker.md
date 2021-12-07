docker run -it --name name1 ubuntu bash
apt-get upadate
apt-get install figlet
figlet welcome
docker run -it -d --name name1 ubuntu bash
docker ps -q
docker container exec -it container-name/id bash
exit
docker diff container-name/id
docker commit container-name/id(modified) ashwini-figlet
docker container start container-name/id
docker images
docker run -it -d --name myimagecontainer ashwini_figlet bash




CREATE IMAGE OUT OF DOCKER FILES:



rm -rf directory_name
mkdir ashu_images && cd ashu_images
gedit Dockerfile



#Inside Dockerfile
FROM ubuntu
RUN apt-get update
RUN apt-get install figlet



ls
cat Dockerfile



docker build -t auto_ashu_figlet .
docker build -t auto_ashu_figlet .
docker build --no-cache -t auto_ashu_figlet .
docker history auto_ashu_figlet
docker build -f dockerfiles/Dockerfile.debug -t myapp_debug .
docker build -f dockerfiles/Dockerfile.prod -t myapp_prod .



figlet -f script "welcome to docker"



CMD figlet -f script "welcome to docker"

docker run auto_ashu_figlet



#In Dockerfile
ENTRYPOINT ["figlet","-f","script"]



#By default it runs with msg "welcome to docker"
docker run auto_ashu_figlet welcome to docker



#To overwrite ENTRYPOINT
docker run -it --entrypoint bash auto_ashu_figlet
docker run -it --entrypoint bash echo auto_ashu_figlet hello!!!



gedit hello.c



#Inside hello.c
int main()
{
puts("Hello World!!!");
return 0;
}



gedit Dockerfile



#Inside Dockerfile
RUN apt-get -y install build-essential
COPY hello.c /
RUN make hello
CMD /hello



docker build -t my_new_image
docker run my_new_image



#Multiple Dockerfiles scenario:
cp Dockerfile Dockerfile.c
docker build -f Dockerfile.c -t c_program
docker run c_program



#using sample application nginx container from repo
git clone https://github.com/sshelake25/thbs_docker_labs.git
cd thbs_docker_labs
ls



gedit Dockerfile
#inside Dockerfile
FROM nginx
COPY . /usr/share/nginx/html



docker build -t nginx_image .
docker run -d -p 100:80 nginx_image



Go to browser and give 192.168.0.110:100 (ip-address of ur machine)



#For Apache



gedit Dockerfile



#Inside Dockerfile
FROM httpd:2.4
COPY . /usr/local/apache2/htdocs/



docker build -t apache_image .
docker stop nginx_image_container
docker run -d -p 100:80 apache_image
