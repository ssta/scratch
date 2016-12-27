package ssta.lombok;

import lombok.*;
import lombok.experimental.Wither;
import lombok.extern.java.Log;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

@Log
@AllArgsConstructor
public class Foo {
  @Getter
  @Setter
  int foo;
  @Getter
  @Setter(AccessLevel.PRIVATE)
  String bar;
  @Getter
  @Setter
  @Wither
  Foo objFoo;


  public Foo() {}


  public String bytesToHexNibbles(@NonNull byte[] in, boolean spaceSeparated) {
    if (in.length == 0) return "";
    StringBuilder out = new StringBuilder(in.length * 2 + (spaceSeparated ? in.length - 1 : 0));
    for (int i = 0; i < in.length; i++) {
      if (spaceSeparated && out.length() > 0) out.append(' ');
      out.append(String.format("%02X", in[i]));
    }
    return out.toString();
  }


}
