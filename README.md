### This is a Sample Project for creating a docker Image Using Google JIB plugin tool
---

 ```
    <plugin>
        <groupId>com.google.cloud.tools</groupId>
        <artifactId>jib-maven-plugin</artifactId>
        <version>3.4.1</version>
        <configuration>
          <to>
            <image>myimage</image>
          </to>
        </configuration>
      </plugin>
```
## To Create Docker image by below commad

 ` mvn compile jib:dockerBuild `



##  You can learn more about Google jib by click the link below
> [!NOTE]
>  https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin 

 Thank you 😄
      


  
