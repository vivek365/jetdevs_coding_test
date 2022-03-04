# JetDevs
* Spring boot application which uses the Java 11.
* To run this just run the uploaded `jetdevs-0.0.1-SNAPSHOT.jar`.
* To import project clone this repository then just import this project as `Existing Maven Project`.
## Service with Spring boot for the below problems.
### 1. Remove invalid brackets from strings
```
API Path: /brackets
Method: Post
Request Body:
{
  text: "test (t(e)x)t)"
}
Response Body:
{
  text: "test (t(e)x)t"
}
```
#### Files for this solution
* BracketController.java
* BracketService.java
* BracketServiceImpl.java
* Bracket.java

#### Demo

![1  Brackets](https://user-images.githubusercontent.com/31569507/156703438-45b721f7-bed1-4c7b-b036-411dcdf7bc8b.PNG)

### 2. Product availability problem
`A product is available in multiple countries around the world and is only available from
09:00 -18:00 local time. Enter the time zone to determine if the service is available
during local time.`

#### Files for this solution
* ProductAvailabilityController.java
* ProductAvailabilityService.java
* ProductAvailabilityServiceImpl.java

#### Demo
1. Service is not available demo
![2  ServiceNotAvailable](https://user-images.githubusercontent.com/31569507/156704715-c4bbb748-a057-43f0-ac10-6bb9852dbeb6.PNG)
2. Service is available demo
![2  ServiceAvailable](https://user-images.githubusercontent.com/31569507/156704720-43648828-7cf2-49c3-8c01-bae8b0a5cc50.PNG)

### 6. Use nested conditional operators to solve this problem:
`Students with academic scores >= 90 are represented by A, those with scores between
60 and 89 are represented by B, and those with scores below 60 are represented by C.`
```
API Path: /students
Method: Post
Request Body:
  [ 99, 79, 30, 66, ... ]
Response Body:
  [ A, B, C, B, ... ]
```
#### Files for this solution
* StudentGradeController.java
* StudentGradeService.java
* StudentGradeServiceImpl.java

#### Demo
![6  Student Grade](https://user-images.githubusercontent.com/31569507/156705210-eaacc5d8-f9a0-432b-a9d2-7e24085b0d88.PNG)

### 7. Find the minimum number of platforms in a train station
`This question will give the arrival and departure times of trains to a particular station. It
is necessary to find the minimum number of platforms required at a station at any point
in time.`
```
API Path: /trains
Method: Post
Response Body:
{
    "arrival": ["1:00","1:40","1:50","2:00","2:15","4:00"],
    "departure": ["1:10", "3:00","2:20","2:30","3:15","6:00"]
}
Response Body:
{
platforms: 4
}
```
#### Files for this solution
* TrainController.java
* TrainService.java
* TrainServiceImpl.java
* TrainTiming.java
* ArrivalDepart.java

#### Demo
![7  Minimum Platforms Required](https://user-images.githubusercontent.com/31569507/156705487-38b6ef19-2b68-4f99-beb6-d962bb7953ab.PNG)


### 10. Implement an object caching pool
* Adding objects to the cache pool
```
API Path: /pool
Method: Post // Adding objects to the cache pool
Request Body:
[
	{
    "key": "object 1",
    "value": 0
	},
	{
    "key": "object 2",
    "value": 2
	},
	{
    "key": "object 3",
    "value": 3
	}
]
Response Body:
{
  total_objects: 3 // Total number of objects in the current cache pool
}
```
#### Demo
![10  Save To Object Pool](https://user-images.githubusercontent.com/31569507/156705820-f50e2254-513f-4488-b49c-75bad1dae4f0.PNG)

* Fetching objects from the cache pool
```
Method: Get // Fetching objects from the cache pool
Query Parameter: /pool/{key}
Response Body:
Success:
{
  value: 3
}
```
#### Demo
![10  Get From Object Pool](https://user-images.githubusercontent.com/31569507/156706032-27aa0d49-3058-4ac5-9fab-2d316e62ba36.PNG)

Does not exist returns 404
![10  Get From Object Pool_1](https://user-images.githubusercontent.com/31569507/156706036-30340874-98dd-4fc2-b41f-ba113b57ecba.PNG)


* Deleting objects from the cache pool
```
Method: Delete // Deleting objects from the cache pool
Query Parameter: /pool/{key}
{
  value: 3
}
```
#### Demo
Success returns 200

![10  Delete From Object Pool](https://user-images.githubusercontent.com/31569507/156706184-ec4c3ffe-6116-4205-b67b-025d587a560c.PNG)

Non-existent returns 404

![10  Delete From Object Pool_1](https://user-images.githubusercontent.com/31569507/156706201-3a8e5f02-7fef-4189-a081-e754115414cf.PNG)

#### Files for this solution
* ObjectCachePoolController.java
* ObjectCachePoolService.java
* ObjectCachePoolServiceImpl.java
* ObjectCachePool.java



