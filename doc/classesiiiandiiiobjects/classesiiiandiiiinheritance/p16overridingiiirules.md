
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Overriding Rules

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p16overridingiiirules

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    } // interface members are 'open' by default

    fun b() {
        print("b")
    }
}

class C() : A(), B {
    // The compiler requires f() to be overridden:
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}
```

## Java

**C.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p16overridingiiirules;

public final class C extends A implements B {
  @Override
  public void f() {
    super.f();
    B.DefaultImpls.f(this);
  }

  @Override
  public void b() {
    B.DefaultImpls.b(this);
  }
}

```

**B.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p16overridingiiirules;

public interface B {
  public void f();

  public void b();

  public static final class DefaultImpls {
    public static void f(B $this) {
      String string = "B";
      System.out.print((Object) string);
    }

    public static void b(B $this) {
      String string = "b";
      System.out.print((Object) string);
    }
  }
}

```

**A.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p16overridingiiirules;

public class A {
  public void f() {
    String string = "A";
    System.out.print((Object) string);
  }

  public final void a() {
    String string = "a";
    System.out.print((Object) string);
  }
}

```
