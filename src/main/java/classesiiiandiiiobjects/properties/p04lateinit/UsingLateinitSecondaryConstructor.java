package classesiiiandiiiobjects.properties.p04lateinit;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingLateinitSecondaryConstructor {
  @NotNull public String name;

  @NotNull
  public final String getName() {
    String string = this.name;
    if (string == null) {
      Intrinsics.throwUninitializedPropertyAccessException((String) "name");
    }
    return string;
  }

  public final void setName(@NotNull String string) {
    Intrinsics.checkParameterIsNotNull((Object) string, (String) "<set-?>");
    this.name = string;
  }

  @Inject
  public UsingLateinitSecondaryConstructor(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }
}
