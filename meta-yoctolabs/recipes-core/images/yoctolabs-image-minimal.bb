SUMMARY = "Image minimale labs"
DESCRIPTION = "Minimal image with nvinvaders"
LICENSE = "MIT"

IMAGE_INSTALL = "packagegroup-core-boot packagegroup-yoctolabs-games"
IMAGE_INSTALL:append = " lsb-release"
IMAGE_INSTALL:append = " dropbear"

inherit core-image

# EXTRA_USERS_PARAMS:append = " \
#   useradd -p '\$5\$J88GpAcpPGwwjSAC\$dMslrF4Sgc/iuysF7WmJmp3hX23kN.lhfatmmjpX28A' user; \
#   usermod -p '\$5\$5BZ7az6OjH0gzg45\$xqpE/rCdapovy0J6N1eSlTdAfsR2Cd5IZlr/ZXVTgv/' root; \
# "

IMAGE_INSTALL:append = " u-boot-fw-utils"
IMAGE_INSTALL:append = " rauc"
IMAGE_INSTALL:append = " e2fsprogs-mke2fs"
IMAGE_INSTALL:append = " casync"