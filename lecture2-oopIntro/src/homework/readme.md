# All user list : 

```Java
// get all user list. 
System.out.println("");
System.out.println("|id|name|surname|");
System.out.println("|---|---|---|");
for (User user : studentService.getAll()) {
  System.out.println("|" + user.id + "|" + user.name + "|" + user.surname + "|");
} 
```
# Result : 
|id|name|surname|
|---|---|---|
|1|Karcan|Özbal|
|2|Ömer|Acar|
|4|Pınar|Darıcı|
