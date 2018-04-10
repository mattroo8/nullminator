[![Build Status](https://travis-ci.org/mattroo8/nullminator.svg?branch=master)](https://travis-ci.org/mattroo8/nullminator)
[![codecov](https://codecov.io/gh/mattroo8/nullminator/branch/master/graph/badge.svg)](https://codecov.io/gh/mattroo8/nullminator)
[ ![Download](https://api.bintray.com/packages/mattroo8/Plugins/nullminator/images/download.svg) ](https://bintray.com/mattroo8/Plugins/nullminator/_latestVersion)

# Nullminator

A groovy extension which removes null and "null" from your List types.

```
List myList = [null, "null", 'null', "hello"]
myList = myList.removeAllTheNulls()
assert myList.size() == 1​
```


### Gradle
#### build.gradle

```
repositories {
    maven { url "https://dl.bintray.com/mattroo8/Plugins" }
}

dependencies {
    compile "com.mroodev:nullminator:1.0"
}
```
