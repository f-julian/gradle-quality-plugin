# PMD

!!! summary ""
    Java | [Home](http://pmd.sourceforge.net) | [Plugin](https://docs.gradle.org/current/userguide/pmd_plugin.html)
    
By default, plugin is activated if java sources available (`src/main/java`).    

[Default config](https://github.com/xvik/gradle-quality-plugin/blob/master/src/main/resources/ru/vyarus/quality/config/pmd/pmd.xml)
contains all java checks, but some of them are disabled. Remove exclusion to enable disabled rule.

## Output

```
23 PMD rule violations were found in 2 files

[Comments | CommentRequired] sample.(Sample.java:3) 
  headerCommentRequirement Required
  https://pmd.github.io/pmd-5.4.0/pmd-java/rules/java/comments.html#CommentRequired

...
```

## Config

Tool config options with defaults:

```groovy
quality {
    pmdVersion = '5.8.1'
    pmd = true // false to disable automatic plugin activation
}
```

## Suppress

To [suppress violation](https://pmd.github.io/pmd-5.4.0/usage/suppressing.html):

```java
@SuppressWarnings("PMD.CommentRequired")
```

To suppress all violations:

```java
@SuppressWarnings("PMD")
```
