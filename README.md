# youDevise fork of Play 2.0.x

Fork of the Play 2.0 framework codebase, solely for the purpose of 
backporting useful fixes from the 2.1.x series onto the latest stable version
of 2.0.x.

Each of our backports is applied incrementally in a new branch. For example, as of 15-May-2013, 
the latest backport branch, which also includes all previous backports, is:
[2.0.x-yd6-backport-update-to-fluentlenium-0.8.0](https://github.com/youdevise/Play20/tree/2.0.x-yd6-backport-update-to-fluentlenium-0.8.0).

List of incremental backport branches:
  * 2.0.x-yd1-backport-fix-for-692-jaxen-maven-dep-error
  * 2.0.x-yd2-backport-fix-for-470-deadlock-in-dev-mode
  * 2.0.x-yd3-backport-fix-for-158-gzip-compression-decompression
  * 2.0.x-yd4-backport-fix-for-632-stop-plugins-in-reverse-order
  * 2.0.x-yd5-backport-make-ws-timeout-configuration-per-request
  * 2.0.x-yd6-backport-update-to-fluentlenium-0.8.0

For pre-built packages including these backports, see the branch:
[packages-2.0.x-yd](https://github.com/youdevise/Play20/tree/packages-2.0.x-yd).

