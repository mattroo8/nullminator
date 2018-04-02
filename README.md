# Nullminator

A groovy extension which removes null and "null" from your List types.

```
List myList = [null, "null", 'null', "hello"]
myList = myList.removeAllNulls()
assert myList.size() == 1​
```

### Gradle
#### build.gradle

```
repositories {
    maven { url "https://dl.bintray.com/mattroo8/Plugins" }
}

dependencies {
    compile 'com.mroodev:nullminator:1.1'
}
```