Annotation Error
================

This example project demonstrates how plexus-compiler-javac swallows errors from
annotation processors. 

The expected output from Maven should include

```
[ERROR] Intentional error
```

which is an error message produced by the annotation processor.

In current versions of plexus-compiler-javac, this error is lost because only
errors that come from the last line of output of the compiler appear to be kept.
See [this commit](https://github.com/gmarkall/plexus-compiler/commit/e5af71439b86669a25b902b02b2f296bc9f1ae49)
for a change that avoids the consumption of this error.
