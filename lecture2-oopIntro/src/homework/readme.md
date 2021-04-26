# All students list : 
```Java
// get all student list. 
for (Student student : studentService.getAll()) {
  System.out.println(student.id + ", " + student.name + ", " + student.surname);
} 
```
# Result : 
|id|name|surname|
|---|---|---|
|1|Karcan|Özbal|
|2|Ömer|Acar|
|4|Pınar|Darıcı|

* * *

# Get student by id : 
```Java
Student student = studentService.getById(2);
System.out.println(student.id + ", " + student.name + ", " + student.surname);
```
# Result : 
|id|name|surname|
|---|---|---|
|2|Ömer|Acar|

