# Conversion JSON to Java objects

The program converts the JSON format to Java objects from [JsonDeserialization](https://github.com/bbogdasha/conversionJSON/blob/master/Json%20to%20objects.json) and vice versa - Java objects to JSON format in file [JsonSerialization](https://github.com/bbogdasha/conversionJSON/blob/master/Objects%20to%20json.json).

### Tech

* JSON;
* Jackson.

### Result

**1.** First operation converts JSON format to Java objects and display in console:

![Screenshot](https://github.com/bbogdasha/conversionJSON/blob/master/screenshots/Screenshot_1.jpg)

**2.** Second operation converts this Java objects:

```
List<Notebook> notebook = new ArrayList<>();
String[] phoneOne = {"+46374673674", "+23525367423"};
String[] phoneTwo = {"+15738302434", "+9738727642", "+8278273822"};
notebook.add(new Notebook("Bob", "Shone", "1996-03-27", phoneOne));
notebook.add(new Notebook("Merry", "Collins", "1987-11-12", phoneTwo));
notebook.add(new Notebook("William", "Walles", "1997-09-13", phoneTwo));
notebook.add(new Notebook("Melinda", "Morri", "1975-12-20", phoneOne));
Staff staff = new Staff("NewCompany", notebook);
```
to JSON format in file [Objects to json.json](https://github.com/bbogdasha/conversionJSON/blob/master/Objects%20to%20json.json).

```java
{
  "company" : "NewCompany",
  "staff" : [ {
    "firstname" : "Bob",
    "surname" : "Shone",
    "dateOfBirth" : "1996-03-27",
    "phone" : [ "+46374673674", "+23525367423" ]
  }, {
    "firstname" : "Merry",
    "surname" : "Collins",
    "dateOfBirth" : "1987-11-12",
    "phone" : [ "+15738302434", "+9738727642", "+8278273822" ]
  }, {
    "firstname" : "William",
    "surname" : "Walles",
    "dateOfBirth" : "1997-09-13",
    "phone" : [ "+15738302434", "+9738727642", "+8278273822" ]
  }, {
    "firstname" : "Melinda",
    "surname" : "Morri",
    "dateOfBirth" : "1975-12-20",
    "phone" : [ "+46374673674", "+23525367423" ]
  } ]
}
```
