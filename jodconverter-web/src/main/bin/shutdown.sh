#!/bin/bash
kill 15 `ps -ef|grep DocumentPreview|awk '{print $2}'`