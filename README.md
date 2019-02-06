# Java Study

### Do not write basic things, try to use git for new learn!!!

+ Difference between Overriding and Overloading
  1. Overriding\
  The subclass redefine the methods that the superclass has.
  2. Overloading\
  A technique to have multiple methods with the same name, but different types and numbers of parameters.

+ Difference between implement and extends
  1. Implement\
  It's same as extends but there are some differences. Implement must redefine parent method. And it can get multiple inheritance.
  2. Extends\
  Java doesn't support mulitiple inheritance!

+ JVM, JRE, JDK
  1. JVM\
  Java Virtual Machine : It reads binary code
  2. JRE\
  Java Runtime Environment : The JVM requires library files and other files. The JRE implements the execution environment of the JVM.
  3. JDK\
  Java Development Kit : JRE + kit for development (javac + java)
  
+ What is Singleton Pattern?
  1. Singleton Pattern\
  Singleton is a design pattern in which an application allocates memory for the first time (Static) and creates an instance in that memory when the application is started.
 
+ Difference between Abstract class and Interface?\
  Java can't override 2 methods.
  + Implicit Intent / Explicit Inent
    1. Implicit Intent
    ```
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        
        StartActivity(intent);
    ```
    2. Explicit Intent
    ```
        Intent intent = new Intent(this, classname.class);
        StartActivity(intent);
    ```    
+ Difference between class and Interface?
    1. Class(Fully implemented)
        - contains state
        - Methods are fully implemented
    
    2. Abstract Class(Partially implemented)
        - Contains state
        - Some methods are fully implemented
        - Some methods are abstract
    
    3. Interface(Not implemented at all)
        - No state
        - All methods are abstract(Not implemented)
        - Interface defines what a class should do but not how to do it.
        - Think about Java class couldn't  get multiple inheritance.

+ Array Search
    - How do we Search minimal speed in array

    ```
    public double search(double[] speed){
        int size = speed.length;
        double min = speed[0];
        for(int i=1; i < size; i++){
            if(speed[i]<min){
                min = speed[i];
            }
        }
    }
    ```
+ Find longest name

    ```
    public String findLongestName(String [] names){
    
    int size = names.length;
    String longestName = names[0];

    for(int i=1; i<size; i++){
        if(longestName.length() < names[i].length()){
            longestName = names[i];
            }
        }
    return longestName;
    }
    ```
    - But there are problem with tie. If max size words are apple and grape than longestName returns the first array.

+ 2D arrays
    ```
    int total = 0;
    for(int i = 0; i < 4; i++;){
        for(int j=0; j<5; j++){
            total += grades[i][j];
        }
    }
    ```
    
+ Server Programming
  - What is JSP? How to use?
  - servelet to .java
  - Difference between redirect and forward
  
