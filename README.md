# mRUBiS
mRUBiS is an exemplar for self-adaptive software, particularly for developing, testing, and evaluating adaptation engines that perform model-based architectural self-adaptation.

## Motivation
Self-adaptive software systems are often structured into an adaptation engine that manages an adaptable software by operating on a runtime model that represents the architecture of the software (model-based architectural self-adaptation). Despite the popularity of such approaches, existing exemplars provide only application programming interfaces but no runtime model to develop adaptation engines. Consequently, there does not exist any exemplar that supports developing, testing, and evaluating model-based self-adaptation off the shelf. For this purpose, we present mRUBiS.

## Overview
mRUBiS is an extensible exemplar for model-based architectural self-healing and self-optimization.

It is modeled after the well-known [RUBiS](http://rubis.ow2.org) example.
In contrast to RUBiS that only describes a single shop in a monolithic way, mRUBiS is a marketplace that hosts multiple shops where one shop belongs to a tenant. Each shop is modularized into a set of components. All shops share the same component types but each shop has its own components (i.e., instances of component types) that can be individually configured, that is, each shop has its own sub-architecture isolated from the sub-architectures of the other shops (cf. multi-tenancy).

The mRUBiS exemplar simulates the mRUBiS marketplace as the adaptable software and therefore provides and maintains an architectural runtime model of the software, which can be directly used by adaptation engines to realize and perform self-adaptation.

Particularly, mRUBiS supports injecting issues into the model, which should be handled by self-adaptation, and validating the model as well as computing the utility of the system based on the model to assess the self-adaptation. mRUBiS allows developers to explore variants of adaptation engines (e.g., it provides change events to drive the model-based self-adaptation) and to evaluate the scalability of self-adaptation by scaling the size of the model and the number of issues to be injected into the model. Finally, developers can use their favorite technologies to implement the adaptation engines such as pure code or even model-driven techniques (e.g., [OCL](https://projects.eclipse.org/projects/modeling.mdt.ocl), [Story Diagrams](https://projects.eclipse.org/projects/modeling.mdt.ocl), [Henshin](https://www.eclipse.org/henshin/) etc.) that operate on the architectural runtime model.

The architectural runtime model is expressed by the CompArch language, for which we provide a modeling editor. The language is based on the [Eclipse Modeling Framework (EMF)](https://www.eclipse.org/modeling/emf/) so that the technologies used to implement the adaptation engine must be compatible to EMF.

mRUBiS is extensible. Developers can develop their individual injectors to inject issues into the model, validators to validiate the model after a self-adaptation, and utility functions to compute the utility of the system based on the model. Since the CompArch language and the core simulator is independent of the specific system, they allow developers to specify any other component-based system than mRUBiS.

## Install mRUBiS
mRUBiS has been developed as an Eclipse plug-in. Use the [Eclipse Oxygen.2 (4.7.2) Release with the Eclipse Modeling Tools package](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/oxygen2) and install the mRUBiS plug-in using the following Eclipse update site:

[`https://thomas-vogel.github.io/mRUBiS/`](https://thomas-vogel.github.io/mRUBiS/)

mRUBiS has been developed and tested on Ubuntu 16.04, only basic tests have been made with Windows.

## More information about mRUBiS
A detailed description of the mRUBiS exemplar, the CompArch language, modeling editor, and the use of the exemplar can be found in the [Wiki](https://github.com/thomas-vogel/mRUBiS/wiki).
