# docker-seleniumGrid-Demo-Project

- Go to the location of the folder where the yaml file is available and run the below docker commands:
docker-compose up

- Browse http://localhost:4444

- you will see selenium grid is set-up and nodes are ready 

- Increase the number of nodes say chrome 2 and edge 2 by typing the below commands in new cmd:
docker-compose up --scale chrome=2
docker-compose up --scale edge=2
- Run the Automation Scripts by replicating more tests and adding to testng.xml file and add parallel="classes" inside suite tag in tesng.xml
- Scripts will run in parallel on all the containers

- Stop all the containers using the below command:
docker-compose down
- check the images and containers whether still running 
docker images
docker ps
if running stop them from cmd or gui of docker desktop
