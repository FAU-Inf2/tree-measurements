# tree-measurements

This repository contains the
evaluation of the research paper "G. Dotzler, M. Philippsen: Move-Optimized Source Code Tree Differencing".
The implementation is available [here](https://github.com/FAU-Inf2/treedifferencing).

Archived Copy:

[![DOI](https://zenodo.org/badge/46181111.svg)](https://zenodo.org/badge/latestdoi/46181111)


## Structure

This repository is structured as follows:
- `data/pso`: Contains the results or the particle swarm optimization runs stored in JSON files.
- `data/repositories`: Contains the results of the tree differencing algorithms as JSON files. Each
file contains the commit and file of the change, the resulting matches and the size of the edit script.
Use [lrzip](https://github.com/ckolivas/lrzip) to uncompress the archives.
Warning! the uncompressed archives are huge!
- `data/repositories/Ant.tar.lrz`: Data for the [Ant repository](https://git-wip-us.apache.org/repos/asf/ant.git), uncompressed size: 3,4G
- `data/repositories/Checkstyle.tar.lrz`: Data for the [Checkstyle repository](https://github.com/checkstyle/checkstyle.git), uncompressed size: 1,9G
- `data/repositories/Cobertura.tar.lrz`: Data for the [Cobertura repository](https://github.com/cobertura/cobertura.git), uncompressed size: 136M 
- `data/repositories/DrJava.tar.lrz`: Data for the [DrJava repository](http://git.code.sf.net/p/drjava/git_repo), uncompressed size: 2,3G
- `data/repositories/EclipseJDTCore.tar.lrz`: Data for the [EclipseJDTCore repository](http://git.eclipse.org/c/jdt/eclipse.jdt.core.git), uncompressed size: 6,3G 
- `data/repositories/Findbugs.tar.lrz`: Data for the [Findbugs repository](https://code.google.com/p/findbugs/), uncompressed size: 3,0G
- `data/repositories/Fitlibrary.tar.lrz`: Data for the [Fitlibrary repository](http://sourceforge.net/projects/fitlibrary/), uncompressed size: 211M
- `data/repositories/JGraphT.tar.lrz`: Data for the [JGraphT repository](https://github.com/jgrapht/jgrapht), uncompressed size: 643M
- `data/repositories/JUnit.tar.lrz`: Data for the [JUnit repository](https://github.com/junit-team/junit.git), uncompressed size: 622M
- `data/time/TimeJenkins.tar.lrz`: Contains the results of the time measurement on [Jenkins](https://github.com/jenkinsci/jenkins.git) as JSON files in an archive.
- `data/validation.tar.lrz`: Contains the voting input and voting results of the 8 voters.
- `data/examples`: Contains some uncompressed examples for the repositories and the time measurements.
- `src/java/main`: Contains Java source code to read (and write) the JSON
  files together with a simple example application. The code relies on the [Jackson](https://github.com/FasterXML/jackson) library to parse the JSON
  files.



## Building and running the example application

Just type the following:

> gradle run

This builds the code and executes the example application.

## License

- The source code of the Java interface in `src/java/main` is licensed under
  the MIT license (see LICENSE.mit).
- `data` is licensed under the CC0 license (see LICENSE.cc0).
- The css, js and html code in `data/validation.tar.lrz` is part of gumtree and licensed under LGPL version 3 (see [LICENSE](https://github.com/FAU-Inf2/gumtree/blob/develop/LICENSE)).
