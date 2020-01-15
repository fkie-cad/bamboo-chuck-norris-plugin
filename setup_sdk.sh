#!/bin/bash
wget -q https://marketplace.atlassian.com/download/plugins/atlassian-plugin-sdk-tgz -O plugin-sdk.tgz
mkdir -p opt
mkdir -p download
tar -xzf *plugin-sdk* -C download
mv download/*plugin-sdk* opt/atlassian-plugin-sdk
chmod a+x opt/atlassian-plugin-sdk/bin/*
chmod a+x opt/atlassian-plugin-sdk/apache-maven-*/bin/*
atlas-version $MAVEN_OPTS
wget https://github.com/mozilla/geckodriver/releases/download/v0.26.0/geckodriver-v0.26.0-linux64.tar.gz
mkdir -p geckodriver
tar -xzf geckodriver-v0.26.0-linux64.tar.gz -C geckodriver
export PATH=$PATH:$PWD/geckodriver
