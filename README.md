I updated the build.gradle files in this project and built it with all new dependencies (latest versions of gdx and libktx). I used gradle 
5.1 - just like with [the fish game](https://github.com/jojomickymack/egu2016), I pretty much left the original source alone with the 
exception of removing some kotlin co-routines stuff - kotlin 1.3 has coroutines enabled by default and I don't quite understand what role the 
coroutines are playing in this example.

This game is different from the one with the fishies in that it's using the 'io.github.libktx' and the latest version at that - which makes 
this the most complete and up to date example from the creators there is! Here you can find examples of the 
[asset manager](https://github.com/libktx/ktx/tree/master/assets), [scene2d builder](https://github.com/libktx/ktx/tree/master/scene2d) and 
[dependency injection](https://github.com/libktx/ktx/tree/master/inject) in use! It also uses a entity component system.

For me though, the gameplay is too hard - the theme of thee gamejam was '10 seconds' and only if I just run away from the monsters can I 
survive longer than that! You might miss the lighting and particle effects.

I also reformatted all of the code (ctrl+alt+i in intellij). Hopefully this updated project helps others read the code and build it - removing 
everything from this and starting with only the menu screen was my first attempt to play with this cool library!

below is the readme from the original project.

# BialJam'17

**Outlive the horde!**

You're a witch. A goblin horde is after you. Survive as long as you can! Plan your actions carefully - your spells need
some time to recharge!

![Menu](.github/0.png)
![Game](.github/1.png)
![Loss](.github/2.png)

## About

Created in under 40 hours (minus sleep) with [KTX](https://github.com/libktx/ktx) by a single Java backend developer and
a cute graphics designer on a game jam organized by the *Bialystok University of Technology*. The jam's topic was
*10 seconds* - hence the 10 seconds delay on spell usage.

**We won!** Somehow.

- [@czyzby](https://github.com/czyzby): coding, game idea, some graphics (the ugly ones).
- [@marsza](https://github.com/marszaa): most graphics (the pretty ones).

We didn't have enough time to finish everything by ourselves - the background, some simple graphics and sounds were
taken from the [OpenGameArt](https://opengameart.org/). Sprites and spell special effects are all custom, although some
designs were based on existing artworks.

Initially, we planned on creating a tower defense game where you have 10 seconds to build the base and survive through
a 10 seconds wave of chicken siege. It was only after 8 hours of the jam that we came up with this concept. The initial
commits contain some code and assets from the previous project - it was continued by half of our 4 person team
[in this repository](https://github.com/czyzby/bialjam-17/).

_The actual game looks better than the screen shots, make sure to [give it a try](https://github.com/czyzby/bialjam17/releases)._

## Assets

Well, it _was_ a game jam with a limited time frame. The project includes examples of poor code reuse, the worst usage
of OOP there is, coroutines overuse, loading assets on demand (not via an asynchronous asset manager), and so on. It
isn't exactly a prime example of a well-structured [KTX](https://github.com/libktx/ktx) game and of what the framework
can do, but - well - it got the job done. Don't judge me by this code.

### Licensing

You can use the code in **commercial** projects (if you are really brave), as long as you release the sources under the
same license. Graphics are published under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/)
license: you can use them in **non-commercial** projects as long as you credit the authors (make sure to link to this
repository) and release your assets on the same license.

