#!/usr/bin/env bash

mkdir microservices
cd microservices

for svc in "product-service se.magnus.microservices.core.product" \
           "review-service se.magnus.microservices.core.review" \
           "recommendation-service se.magnus.microservices.core.recommendation" \
           "product-composite-service se.magnus.microservices.composite.product"; do
  set -- $svc
  spring init \
  --boot-version=4.0.7 \
  --type=gradle-project \
  --java-version=21 \
  --packaging=jar \
  --name=$1 \
  --package-name=$2 \
  --groupId=$2 \
  --dependencies=actuator,webflux \
  --version=1.0.0-SNAPSHOT \
  $1
done

cd ..
