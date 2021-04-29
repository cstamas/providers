SISU powered provider demo
==========================

Module "api" contains the interface to implement.

Providers implement the API using some other APIs.

Module "provider1" implement the API using AbstractMojo (that comes from provided dependency).

Module "provider2" implement the API using pure Java.

Hence, at runtime, only provider2 is available, UNLESS we explicitly add provider1 dependency to dependencies.



Have fun!

