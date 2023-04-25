# RPS (ROCK PAPER SCISSORS)


ROCK PAPER SCISSORS game using Microservices , Spring , Spring Boot

# Technology Used

**1. Spring**

**2. Spring Boot**

**5. Spring WEB**

**3. JDK 17**



## Steps to Setup

**1. Clone the application**

```bash
https://github.com/Raghavendra-Thakur/Raghavendra_Thakur_RPS_Assingment.git
```
**2. Import all services to your prefered IDE (ellipse, intelij, STS)**

**3. run all 4 services**

**4. In preferd Browser**
```bash
http://localhost:8765/human/action/{action}
```
In place Of Action
Type Your action
1. rock
2. paper
3. scissors

## Swagger Documentation

**Human-player-service**

http://localhost:8001/swagger-ui.html

**Computer-player-service**

http://localhost:8100/swagger-ui.html

## Request
| Request Method|Request URL         | 
| ------------- |:-------------:| 
| GET     | /human/action/{action} | 
|GET | /computer/action|

##### It gives Following Response
**1.  /human/action/{action}**

***Response***

```json
{
"humanAction": "String",
"computerAction": "String",
"result": "String"
}
```
***Example***

```json
{
"humanAction": "PAPER",
"computerAction": "PAPER",
"result": "It is a tie"
}
```
**2.  /computer/action

***Response***
String

***Example***
ROCK

