#!/bin/bash

GLOBIGNORE="*"

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

JAVA="$DIR/java"
ANDRA="$DIR/andra"

LAUNCH="$ANDRA/@launchJar@"

exec $JAVA/bin/java -cp $ANDRA/* -jar $LAUNCH
