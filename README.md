# Association
ASSOCIATION:
         Association is the relationship between two separate classes that are associated
 with each other through objects.Association can be one-to-one,one-to-many,many-to-one,
 many-to-many relationship.
 
1.One-to-one:
         One person is having only one passport is the example of one-to-one relationship.
It is the relationship between the person and the passport.
 
2.One-to-Many:
         It is the relationship between room and a house.That means,single house have 
multiple rooms which shows it is one-to-many relationship.
    
 
3.Many-to-one:
       There can be many books in a one library.This is the example of many-to-one 
relationship where many book is associated with a library.
   
4.Many-to-many:
       It is the relationship between teacher and student where one teacher associated
with many students and also a student may be associated to many teachers.

There are two forms of association.They are:

1.Composition
2.Aggregation
         
ASSOCIATION:
      Aggregation is kind of association.It represent the HAS-A relationship between 
classes.In aggregation,both the objects survive independently.It means if one object 
destroy it won't affect the other object.For example,Bank and Employee,if we delete 
Bank employee still exist.In the 'aggregation' package the'Institute' class which has
no.of department.'Department' class has no.of students.So we make an institute class
which has a reference to list of objects of the department class.That means Institute
class is associated with Department class.And Department class also has a reference
to list of object with Student class.SO,department is associated with student class.
This represent a HAS-A relationship.

COMPOSITION:
     Composition is another kind of association.It represent a part-of relationship
between two objects.In composition,the entities are completely dependent on each 
other.They cannot exist without each other entity.In the composition package,a 
library has no books.So,if the Library get destroyed then all the Books within that
library will get destroyed.This shows that Books cannot exist with Library.    

JunitTest:
      There is JUnit Test also present for all the entities and test coverage are 100%
successful by jacoco reports. 

sonarqube
gradle sonarqube 
  -Dsonar.projectKey=Association 
  -Dsonar.host.url=http://localhost:9000
  -Dsonar.login=9447924f5d7eb76993a08e439596828b94eed34a