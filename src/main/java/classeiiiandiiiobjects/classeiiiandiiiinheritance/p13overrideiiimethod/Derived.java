/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p13overrideiiimethod;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p13overrideiiimethod/Derived;",
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p13overrideiiimethod/Base;",
      "()V",
      "openFunction1",
      "",
      "openFunction2",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class Derived extends Base {
  @NotNull
  @Override
  public String openFunction1() {
    return "Can still override this method";
  }

  @NotNull
  @Override
  public final String openFunction2() {
    return "Cannot be further overridden";
  }
}