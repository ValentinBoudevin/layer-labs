DEPENDS += "u-boot-tools-native"

do_deploy:append() {
    ${STAGING_BINDIR_NATIVE}/mkenvimage -s 0x20000 -o ${DEPLOYDIR}/uboot.env ${DEPLOYDIR}/u-boot-bb.org-initial-env 
}

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI:append = " file://fragment.cfg \
    file://0001-custom-uboot-commmands-for-RAUC.patch"