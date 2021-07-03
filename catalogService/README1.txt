docker script:
docker run --name mysql1 -e
MYSQL_USER=root -e
MYSQL_PASSWORD=root -e
MYSQL_DATABASE=homedb -p
3306:3306 -d mysql/mysql-server:8.0