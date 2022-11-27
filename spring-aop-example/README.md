# Spring Boot Example

## Agenda

- This repo Will be used by A BuildConfig as part of Integrating Openshift BuildConfig with JFrog Artifactory.
- This repo will be used and cloned by Openshift pipelines'(Tekton Pipelines) pipeline in order to build a CI/CD pipeline that  will deploy this app using    Artifactory' Maven Virtual Repository(that points to maven central), Docker repository in Artifactory(after building the image in the pipeline) and Helm Chart that will be hosted in Artifactory helm repository.
