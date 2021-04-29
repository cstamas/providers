package org.cstamas.providers.provider1;

import javax.inject.Named;
import javax.inject.Singleton;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.cstamas.providers.Interface;

@Singleton
@Named
public class Implementation
    extends AbstractMojo
    implements Interface
{
  @Override
  public String getMessage() {
    return "provider1";
  }

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {

  }
}
