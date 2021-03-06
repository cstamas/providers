SISU powered provider demo
==========================

Module "api" contains the interface to implement.

Providers implement the API using some other APIs.

Module "provider1" implement the API using AbstractMojo (that comes from provided dependency).

Module "provider2" implement the API using pure Java.

Hence, at runtime, only provider2 is available, UNLESS we explicitly add provider1 dependency to dependencies.

Essentially, the "runtime" module "simulates" maven runtime for mojo, where depending on runtime version (3.0, 3.1, etc) things on classpath just "come and go" (think org.sonatype vs org.eclipse for aether or other things).

Still, in each provider you code "cleanly" against given API, but all the deps MUST BE PROVIDED SCOPE, as real runtime will make them available to you.

Hint: SISU will do the work for you: as long as you dont address the component DIRECTLY by key, but perform "collection lookups" only (ie. `@Inject Map<String, Interface> components`, SISU will make sure to make available ONLY those components, that can be loaded. So all we need in provider1, provider2, etc to PREVENT class from being loaded (CNFEx).

We have SISU at disposal, let's unleash it power! :smile:

Have fun!

