#Meant to be used to configure blank system with current packages and dotfiles.
sudo pacman -Syu --noconfirm

echo root pass:
passwd

echo hostname:
read hostname
echo $hostname > /etc/hostname

echo user:
read user
useradd $user
echo password:
passwd $user
ln -sf /usr/share/zoneinfo/America/Chicago /etc/localtime
echo en_US.UTF-8 UTF-8 > /etc/locale.gen
locale-gen
locale > /etc/locale.conf

mkdir -p /home/$user/temp
cd /home/$user/temp
git clone http://bitbucket.org/nathanisom27/packages_arch

cd /home/
chown -R $user $user

echo login as $user and run stuff.
