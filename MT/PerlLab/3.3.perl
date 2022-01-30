@result = ();
while (my $input = <>) {
    if ($input =~ /<\s*(a)(.+?)href\s*=\s*\"(([^:]+:)\/\/)?(?<host>\w+.*?)('|"|\/|:)(.*)>/) {
        push(@result, $+{host} . "\n")
    }
}

@out = keys %{{map {$_ => 1} @result}};
for (sort {$a cmp $b} @out) {
    print $_;
}