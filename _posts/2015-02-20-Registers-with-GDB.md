---
layout: post
title: GDB Registers
---


This will serve as a brief guide on setting up GDB to step through assembly code and witness register changes on the fly.

#Compile the program to debug

I'm assuming here that you have the source of the C file that you wish to step through(this post assumes you are trying to learn about registers for educational purposes).

Create a Makefile for your architecture(s) of choice. Here is an example of a Makefile for 3 of them:

{% highlight Makefile linenos %}
all: 32bit 64bit 64bitInLine

32bit: MyProgram.c
	gcc -g -O1 -fno-inline -fno-omit-frame-pointer -m32 MyProgram.c -o MyProgram

64bit: MyProgram.c
	gcc -O1 -fno-inline MyProgram.c -o MyProgram_64bit

64bitInLine: MyProgram.c
	gcc -O1 MyProgram.c -o MyProgram_64bit_inline

{% endhighlight %}

(Note for Adam: notice I only removed the -S flag and changed the output name)


This should result in 3 output files with different assembly associated with each.

#GDB

The GNU Project Debugger(GDB) is a fantastic tool that I am still learning about. If you have no idea what it is, it is a fairly powerful utility for debugging primarily c/c++ as I currently understand it. I recommend this [crash course guide](http://beej.us/guide/bggdb/) for a quick intro. One of it's many features is the ability to step through and view registers as they change(the purpose of this post).

So, to run GDB on a program made for this purpose you can use:
{% highlight bash linenos %}
$gdb MyProgram
{% endhighlight %}

once at the GDB prompt, set a breakpoint at the main() function and then run the program - this will cause the breakpoint to instantly be hit.

{% highlight bash linenos %}
(gdb)break main
(gdb)run
{% endhighlight %}

The command we can use from here to step through the program by assembly line is 'si'(step instruction). However, we would not be able to see the values of registers as they change on the fly - this is accomplished with a tui view. You can activate the register tui layout with the command `layout reg`, which will result in something like this:

![GDB](http://i.imgur.com/SZkGALi.png "GDB")

And now you can step through each instruction using 'si'. As registers change value, they will be highlighted in the top window. Have fun!


