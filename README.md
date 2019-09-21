## setup zsh for ubuntu

This repos. provides a step-by-step instruction for setting up the zsh for ubuntu.

1. install zsh
> sudo apt-get update && sudo apt-get -y install zsh

check the installed version
> zsh --version 

set zsh as the default shell, password required. If you do not have root access, it is also fine. You find need to type zsh, whenever you open the terminal.
> chsh -s /bin/zsh

exit and open a new terminal (ctr + A + D)

2. install oh-my-zsh

> sh -c "$(wget -O- https://raw.githubusercontent.com/robbyrussell/oh-my-zsh/master/tools/install.sh)"

3. install zsh-syntax-highlighting

> git clone https://github.com/zsh-users/zsh-syntax-highlighting.git

> echo "source ${(q-)PWD}/zsh-syntax-highlighting/zsh-syntax-highlighting.zsh" >> ${ZDOTDIR:-$HOME}/.zshrc

> source ./zsh-syntax-highlighting/zsh-syntax-highlighting.zsh

If you finish the previous steps, you should be able to customize the .zshrc file in your home directory. Here I prefer to use the two plugins (zsh-autosuggestions, autojump and colorls) for my zsh.

4. zsh-autosuggestions

> git clone https://github.com/zsh-users/zsh-autosuggestions.git $ZSH_CUSTOM/plugins/zsh-autosuggestions

5. autojump

> git clone git://github.com/wting/autojump.git

> cd autojump

> ./install.py or ./uninstall.py

6. colorls (follow the instruction from https://github.com/athityakumar/colorls)

You may need to have the nerd font first installed.

> brew tap homebrew/cask-fonts

> brew cask install font-hack-nerd-font

After this, you should be able to set the Hack Nerd Font as the default for Non-ASCII font. (go to the setting for iterms2 preference (cmd + ,) - Profiles - Text - Non-ASCII Font- choose Hack Nerd Fonts). If you can not find it, try to check the update for iterms (iterm2 - check for update). 

> sudo apt update

> sudo apt install ruby-full

> ruby --version

> gem install colorls

> source $(dirname $(gem which colorls))/tab_complete.sh

7. add the plugins into the .zshrc

edit and add the following lines:

> plugins=(git zsh-autosuggestions autojump)

> [[ -s /home/ubuntu/.autojump/etc/profile.d/autojump.sh ]] && source /home/ubuntu/.autojump/etc/profile.d/autojump.sh

> alias ls="colorls --sd -A"

Restart the terminal or login the server once again. It should work now!

Note: For mac users, it is better to use iterm2 as an alternative to the original shell. Most of the previous steps are also quitable for mac. You need to set the iTerm2 as the default shell, and bind a shortcut to relaunch a new window for iTerm2. It is also quite easy to customize the basic settings, such as foreground or background colors.

8. some useful alias to improve productivity of zsh by adding the following lines in the .zsh file

> alias -s {yml,yaml,csv,txt,conllu}=vim

> d='dirs -v | head -10'
1='cd -'
2='cd -2'
3='cd -3'
4='cd -4'
5='cd -5'
6='cd -6'
7='cd -7'
8='cd -8'
9='cd -9'

9. add the key bindings to the .zshrc file

> wget https://raw.githubusercontent.com/JakeJing/zsh_setup/master/bindings.txt

> cat bindings.txt >> .zshrc


