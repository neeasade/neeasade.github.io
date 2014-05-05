#Meant to be used to configure blank system with current packages and dotfiles.
sudo pacman -Syu --noconfirm
sudo pacman -S sudo git base-devel abs file expac --noconfirm

#install pacaur:
#build cower and install:
curl https://aur.archlinux.org/packages/co/cower/cower.tar.gz
tar xzf cower.tar.gz
cd cower
makepkg -i
cd ..
curl https://aur.archlinux.org/packages/pa/pacaur/pacaur.tar.gz
cd pacaur
makepkg -i
cd ..
git clone http://bitbucket.com/nathanisom27/packages_arch
cd packages arch
./stuff.sh

