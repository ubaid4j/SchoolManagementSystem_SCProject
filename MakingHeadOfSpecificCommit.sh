git checkout a9d495ce6b7599098ca1411d2c749402bdd358c7
git branch temp
git checkout temp
git branch -f master temp
git checkout master
git branch -d temp