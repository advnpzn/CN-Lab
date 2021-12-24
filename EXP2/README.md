# Client-Server Program to download an Image using TCP Sockets

## Prerequisites
+ Java 17
+ An image file in the root directory.

## How to run ?
- Compile both the `Client.java` and `Server.java` files using the command ```javac Client.java Server.java```
- Now run the Server by using `java Server.java`
- Then start the Client by `java Client.java`
- That's it!

## Notes
+ An image file with preferably common and most used format is prefered such as jpg and png. You could change the following code snippet in `Client.java` to your wish.
```java
img = ImageIO.read(new File("image.jpg"));
```
In the above code, you could specify the name of your image file with the extention.

+ If you get any `PORT ` error or is unavailable, then you could actually use a different `PORT`. 
+ Editing the `PORT` number in the following code snippet in both the `Client.java` and `Server.java` will do the trick.
+ For `Client.java`
```java
client = new Socket("localhost", 4000);
```
+ For `Server.java`
```java
server = new ServerSocket(4000);
```

+ If there's anything you'd like to suggest, such as any optimisations, editing, correction, feel free to pull request :D
