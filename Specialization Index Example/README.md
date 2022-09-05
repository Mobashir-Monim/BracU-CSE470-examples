
# Specialization Index Example  


#### Please note that the files in this folder might not be executable *as is* and are just for example purposes

---
In this example, we assume that the top level class is **`Person`** class and it does not have any parent classes (meaning it does not inherit anything). The files/classes in this folder are as follow:
- **`Person`** class
- **`Student`** class, extends **`Person`** class
- **`Freshman`** class, extends **`Student`** class (*a freshman is a first year student*)
- **`Sophomore`** class, extends **`Freshman`** class (*a sophomore is a second year student*)
- **`Junior`** class, extends **`Sophomore`** class (*a junior is a third year student*)
- **`Senior`** class, extends **`Junior`** class (*a senior is a fourth year student*)

For each of these classes we will be finding out the specialization index of them by finding the values of:
- `DIT`: *depth of inheritance*
- `NMO`: *number of methods overridden*
- `NMI`: *number of methods inherited*
- `NMA`: *number of methods added*

The above mentioned values of each of the classes are mentioned in the table below. See if you can find the values before looking at the table. After that check if the values that you found matches with the ones mentioned below.

---

| Class			| DIT			| NMO			| NMI			| NMA			|
|---------------|---------------|---------------|---------------|---------------|
|Person			|0				|0				|0				|2				|
|Student		|1				|1				|1				|1				|
|Freshman		|2				|0				|3				|0				|
|Sophomore		|3				|2				|1				|0				|
|Junior			|4				|2				|1				|1				|
|Senior			|5				|4				|0				|2				|
---