#Meant to be used to configure blank system with current packages and dotfiles.
pacman -S git
git clone https://github.com/neeasade/AutoArch install
cd install
./config.sh
cd ..
rm -r install

