package org.cstamas.providers.runtime;

import com.google.inject.Guice;
import com.google.inject.Module;
import org.eclipse.sisu.space.BeanScanning;

public class Main
{
  public static void main(String[] args) {
    final Module app = org.eclipse.sisu.launch.Main.wire(
        BeanScanning.INDEX
    );
    Boot boot = Guice.createInjector(app).getInstance(Boot.class);
    boot.dump();
  }
}
