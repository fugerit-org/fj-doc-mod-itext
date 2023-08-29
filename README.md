# Fugerit Document Generation Framework (fj-doc)

## Itext 2.1.X Renderer (PDF/RTF/HTML)(fj-doc-mod-itext)

[back to fj-doc index](https://github.com/fugerit-org/fj-doc.git)  

[![Maven Central](https://img.shields.io/maven-central/v/org.fugerit.java/fj-doc-mod-itext.svg)](https://mvnrepository.com/artifact/org.fugerit.java/fj-doc-mod-itext)

*Note* : In case you need an itext compatible implementation, consider the new module [fj-doc-mod-openpdf](https://github.com/fugerit-org/fj-doc-mod-openpdf) based on [OpenPDF](https://github.com/LibrePDF/OpenPDF) (an IText fork).

*Deprecation* (2022-11-17):  
Previously this module was part of the [Fugerit Doc Venus](https://github.com/fugerit-org/fj-doc.git) and now is formally deprecated and put in an separate repository.

*Description* :  
Type handlers for generating documents in PDF, RTF and HTML formats using last free version of 
[IText 2.1.7](https://mvnrepository.com/artifact/com.lowagie/itext/2.1.7).

*Status* :  
All basic features are implemented.  
The code is mature, and as IText 2.1.X is deprecated, this module is not likely to be updated.  
Better to use the module based on Apache FOP [fj-doc/fj-doc-mod-fop](https://github.com/fugerit-org/fj-doc.git) 

*Quickstart* :  
Basically this is only a type handler, see core library [fj-doc-base](https://github.com/fugerit-org/fj-doc.git).  
NOTE: If you have any special need you can open a pull request or create your own handler based on this.

See [CHANGELOG.md](CHANGELOG.md) for details.