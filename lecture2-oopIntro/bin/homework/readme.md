# Student Service
```Java
StudentService studentService = new StudentService();
```
### All students list : 
```Java
for (Student student : studentService.getAll()) {
  System.out.println(student.id + ", " + student.name + ", " + student.surname);
} 
```
### Result : 
|id|name|surname|
|---|---|---|
|1|Karcan|Özbal|
|2|Ömer|Acar|
|4|Pınar|Darıcı|

* * *

### Get student by id : 
```Java
Student student = studentService.getById(2);
System.out.println(student.id + ", " + student.name + ", " + student.surname);
```
### Result : 
|id|name|surname|
|---|---|---|
|2|Ömer|Acar|

* * *

# Lecture Service
```Java
LectureService lectureService = new LectureService();
```
### All lectures list : 
```Java
for (Lecture lecture : lectureService.getAll()) {
  System.out.println("|"+ lecture.id + "|" + lecture.courseId + "|" + lecture.name + "|" + lecture.date + "|");
}
```
### Result : 
|id|courseId|name|date|
|---|---|---|---|
|1|1|Ders 1|Mon Apr 26 11:59:46 TRT 2021|
|2|1|Ders 2|Mon Apr 26 11:59:46 TRT 2021|
|3|1|Ders 3|Mon Apr 26 11:59:46 TRT 2021|
|4|1|Ders 4|Mon Apr 26 11:59:46 TRT 2021|
|5|1|Ders 5|Mon Apr 26 11:59:46 TRT 2021|

* * *

### Get lecture by id : 
```Java
Lecture lecture = lectureService.getById(2);
System.out.println(lecture.id + ", " + lecture.courseId + ", " + lecture.name + ", " + lecture.date);
```
### Result : 
|id|courseId|name|date|
|---|---|---|---|
|2|1|Ders 2|Mon Apr 26 11:59:46 TRT 2021|

* * * 

### Get lectures by courseId : 
```Java
for (Lecture lecture : lectureService.getAllByCourseId(1)) {
  System.out.println(lecture.id + ", " + lecture.courseId + ", " + lecture.name + ", " + lecture.date);
}
```
### Result :
|id|courseId|name|date|
|---|---|---|---|
|1|1|Ders 1|Mon Apr 26 11:59:46 TRT 2021|
|2|1|Ders 2|Mon Apr 26 11:59:46 TRT 2021|
|3|1|Ders 3|Mon Apr 26 11:59:46 TRT 2021|
|4|1|Ders 4|Mon Apr 26 11:59:46 TRT 2021|
|5|1|Ders 5|Mon Apr 26 11:59:46 TRT 2021|

