#!/usr/bin/env bash

docker run --rm -P --mount type=bind,source="$(pwd)",target=/app --mount source=atlasmvncache,target=/root/.m2/repository sknopp94/atlassdkwithfirefoxselenium package
