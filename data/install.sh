#Meant to be used to configure blank system with current packages and dotfiles.
sudo pacman -Syu --noconfirm
sudo pacman -S wget sudo git base-devel abs file expac --needed --noconfirm

#install pacaur:
#build cower and install:
wget http://aur.archlinux.org/packages/co/cower/cower.tar.gz
tar xzf cower.tar.gz
cd cower
makepkg -i
cd ..
wget http://aur.archlinux.org/packages/pa/pacaur/pacaur.tar.gz
cd pacaur
makepkg -i
cd ..
git clone http://bitbucket.org/nathanisom27/packages_arch
cd packages arch
./stuff.sh

