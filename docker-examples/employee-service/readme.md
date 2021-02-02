docker network ls
docker network create employee-service-nw
docker pull mysql:8
docker container run --name employee-service-db --network employee-service-nw --env MYSQL_ROOT_PASSWORD=mysql --env MYSQL_DATABASE=employee-service-db -p 3306:3306 -d mysql:8
to goto mysql shell : docker container exec -it <container_id> bash
docker image build -t employee-service .
docker container run --name employee-service --network employee-service-nw -p 8080:8080 -d employee-service


connection detail : database : employee-service-db?allowPublicKeyRetrieval=true&useSSL=false