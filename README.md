# cnb-tomcat-example

This is a testing repo for buildpack builder.

## Local testing

Use `*.env` files in folder `buildpack` to create three images:
  - cnb-tomcat-example
  - cnb-tomcat-api-example
  - cnb-tomcat-ui-example 

### cnb-tomcat-example

First, run `docker run --rm -it -p 8080:8080 cnb-tomcat-example`
Then, use browser to check following urls:
  - http://localhost:8080/api
  - http://localhost:8080/api/hello
  - http://localhost:8080/api/healthcheck
  - http://localhost:8080/ui/header
  - http://localhost:8080/ui/info
  - http://localhost:8080/ui/cookie
  - http://localhost:8080/ui/params

### cnb-tomcat-api-example

First, run `docker run --rm -it -p 8080:8080 cnb-tomcat-api-example`
Then, use browser to check following urls:
  - http://localhost:8080/api/
  - http://localhost:8080/api/hello
  - http://localhost:8080/api/healthcheck

### cnb-tomcat-ui-example

First, run `docker run --rm -it -p 8080:8080 cnb-tomcat-ui-example`
Then, use browser to check following urls:
  - http://localhost:8080/
  - http://localhost:8080/info
  - http://localhost:8080/header
  - http://localhost:8080/cookie
  - http://localhost:8080/params
