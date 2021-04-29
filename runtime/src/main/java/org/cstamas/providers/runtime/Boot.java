package org.cstamas.providers.runtime;

import java.util.Map;
import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.cstamas.providers.Interface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
@Named
public class Boot
{
  private final Logger logger = LoggerFactory.getLogger(getClass());

  private final Map<String, Interface> implementations;

  @Inject
  public Boot(final Map<String, Interface> implementations) {
    this.implementations = Objects.requireNonNull(implementations);
  }

  public void dump() {
    for (Map.Entry<String, Interface> entry : implementations.entrySet()) {
      logger.info("{} -> {}", entry.getKey(), entry.getValue().getMessage());
    }
  }
}
