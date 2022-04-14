## How to install scala notebook using docker
* Create a scala repo and clone it
```
git clone <>
```
* spin up all spark docker container and assign the volume
```
docker run -v ~/work/scala:/home/jovyan/work -d -p 8888:8888 jupyter/all-spark-notebook
```
* goto localhost:8888 to login
