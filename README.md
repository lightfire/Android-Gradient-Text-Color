# Android-Gradient-Text-Color

[![](https://jitpack.io/v/lightfire/Android-Gradient-Text-Color.svg)](https://jitpack.io/#lightfire/Android-Gradient-Text-Color)


### Installation

```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

```
dependencies {
    compile 'com.github.lightfire:Android-Gradient-Text-Color:b0047755f7'
}
```


### Maven
```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```



```xml
<dependency>
	    <groupId>com.github.lightfire</groupId>
	    <artifactId>Android-Gradient-Text-Color</artifactId>
	    <version>e66cd5cf65</version>
	</dependency>
```



#Button
```sh
<com.lightfire.gradienttextcolor.GradientButton
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Hello World! Button"
        app:gradientStart="@color/test1"
        app:gradientEnd="@color/test2"
        android:textStyle="bold"
        android:textSize="30sp"
        android:textColor="#d83737" />
```


#TextView
```sh
<com.lightfire.gradienttextcolor.GradientTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Hello World! Text"
        app:gradientStart="@color/test2"
        app:gradientEnd="@color/test1"
        android:textStyle="bold"
        android:textSize="30sp"
        android:textColor="#d83737" />
```



### Warning

##### in GradientTextView or GradientButton
 ```app:gradientStart```  ```app:gradientEnd``` tags your textColor has no meaning.




License
----

MIT
