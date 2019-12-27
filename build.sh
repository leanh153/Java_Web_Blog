#!/bin/bash
# get current working dir name
# clean wording dir
if [ -d "build" ];then
   rm -r build
fi

wd=$( echo $PWD | sed -E 's#(^\/.*)*\/##' )
echo "working dir: $wd "
# Create README.md file
echo "Creating README.md"
> README.md
# Get Project's name for README.md title
project_name=$( echo $wd | sed -E 's#[-_]# #g' )
echo "Project name: $project_name"
echo "# $project_name


 " >> README.md

echo "## Table of contents

- [Pre-Requisites](#Pre-Requisites)
- [Demo](#Demo)
- [How to run](#How-to-run)
- [What's included](#whats-included)
- [Creators](#creators)

## Pre-Requisites
- [Install JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Install Eclipse IDE](https://www.eclipse.org/downloads/)
- [Install Tomcat server](https://tomcat.apache.org/download-90.cgi)

## Demo
- [Video]()

## How to run

- Copy or move file with .war extension to tomcat "webapps" folder and start server.

## What's included


\`\`\`text" >> README.md

# get tree picture
tree_pic=""
if [ "$1" == "-L" ];then
	echo "Contain -L need deep tree"
	cd ..
	echo "Option: $1 and depth $2"
	tree  $1 $2 $wd >> $wd/README.md
	cd $wd
else
	echo "No contain deep tree option."
	cd ..
	tree $wd >> $wd/README.md
	cd $wd
fi
echo "\`\`\`" >> README.md

echo "## Creators

- [Github](https://github.com/leanh153)

- Make friend [FACEBOOK](https://WWW.facebook.com/leanh153)

- My [LinkIn](https://www.linkedin.com/in/lênanh)

Enjoy :metal:" >> README.md
echo "Complete!"
