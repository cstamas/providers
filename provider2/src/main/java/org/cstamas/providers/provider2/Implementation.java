package org.cstamas.providers.provider2;

import javax.inject.Named;
import javax.inject.Singleton;

import org.cstamas.providers.Interface;

@Singleton
@Named
public class Implementation
    implements Interface
{
  @Override
  public String getMessage() {
    return "provider2";
  }
}
