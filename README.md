# Bamboo ChuckNorris-Plugin 
[![Build Status](https://travis-ci.com/sknopp/bamboo-chuck-norris-plugin.svg?branch=master)](https://travis-ci.com/sknopp/bamboo-chuck-norris-plugin)

Displays a picture of Chuck Norris and a random Chuck Norris 'The Programmer' fact on each build page.

[original idea](https://plugins.jenkins.io/chucknorris) by Baptiste Mathus for Jenkins ported to Bamboo.

---

## How to build with Docker

```bash
docker run --rm -P --mount type=bind,source="$(pwd)",target=/app --mount source=atlasmvncache,target=/root/.m2/repository sknopp94/atlassdkwithfirefoxselenium package
```
