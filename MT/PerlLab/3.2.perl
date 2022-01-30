$result = "";
while (my $input = <>) {
    $input =~ s/(<).*?(>)//g;
    $input =~ s/(\s){2,}/$1/g;
    $input =~ s/^([\s ^\n])+/\n/g;
    $input =~ s/([\s ^\n])+$/\n/g;

    $result = $result . $input;
}
$result =~ s/(\n){2,}/\n\n/g;
$result =~ s/^\n+//g;
$result =~ s/\n+$//g;
print $result;