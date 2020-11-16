Go to root of the project

To create configmaps
kubectl create configmap apt-config --from-env-file=kubernetes/aptenv.config

To create deploy and svc
kubectl create -f kubernetes/aptenv-kub.yaml