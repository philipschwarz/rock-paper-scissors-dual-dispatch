# rock-paper-scissors-dual-dispatch

While looking for something in Object Design: Roles, Responsibilities, and Collaborations 
http://www.wirfs-brock.com/DesignBooks.html, I came across a section on Double Dispatch, 
which uses the Rock/Paper Scissors as an example.

I entered the example's code in my IDE, and I found that the refactored version, the one 
that improves on the single dispatch version by using double dispatch, is not quite right
in that x.beats(y) calls y.beatsX(), and so x beats y when y beats x. For example,
rock.beats(paper) calls paper.beatsRock(), and so rock beats paper because paper beats rock,
which is not right.

I fixed the double dipatch version by changing the second dispatch method from 'beats' to
'beatenBy'.

I then found there is an errata for the book http://www.wirfs-brock.com/PDFs/Book%20Corrections.pdf, 
which acknowledges the error and proposes as a solution that x.beats(y) calls !y.beatsX(), but 
that in turnrequires that x.beatsX() be true, which is not right.
