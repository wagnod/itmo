while(<>) {
  s/\([^\)]*\)/()/g;
  print;
}