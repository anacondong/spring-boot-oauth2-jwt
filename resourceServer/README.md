# spring-boot-oauth2-jwt

This project is an exemple of Spring + Spring Security + OAuth2 using JWT Token focous in microservice. 

### *authorizationServer* 
Is responsable to manager user, auth and manager the Token.The project will run on 8080 
Every time the aplication start creates two users:

* run with : mvn clean install >>> mvn spring-boot:run

* **user** witch password **test** and role USER
* **admin** witch password **test** and rolse ADMIN

```bash
curl -X POST -u my-trusted-client:secret "http://localhost:8080/oauth/token?grant_type=password&username=user&password=test"
```

### *resourceServer* 
Is responsible to response for API endpoint, and the only will do this if the user is auth. The project will run on 8081 and havce two endpoint\

* run with : mvn clean install >>> mvn spring-boot:run

* http://localhost:8081/endpointadmin only role ADMIN
* http://localhost:8081/endpointuser only role USER



```bash
curl -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoiUk9MRV9VU0VSIiwidXNlcl9uYW1lIjoidGFkZXVjcnV6Iiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTQ5NTcwNTEyOCwidXVpZCI6ImUwZjNjOGM4LThmNzMtNDkzNS1hYjY3LWUxMDRhNjkyNzg2YyIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJqdGkiOiJjY2M0MTJiMi05ZTQ0LTQzODktOWIwMS01YzRjODRhYzRmNjUiLCJjbGllbnRfaWQiOiJteS10cnVzdGVkLWNsaWVudCJ9.65kTz4Omiy1a1RTgAoEtGKcidh9VUeqoM3wskHdw4sc" http://localhost:8081/endpointuser
```


# References 

* https://github.com/tadeucruz/spring-oauth2-jwt
