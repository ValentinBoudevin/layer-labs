SUMMARY = "nInvaders game"
DESCRIPTION = "nInvaders is a Space Invaders clone based on ncurses for ASCII output"
HOMEPAGE = "http://ninvaders.sourceforge.net/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://gpl.txt;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = " \
        https://sourceforge.net/projects/${PN}/files/${PN}/${PV}/${PN}-${PV}.tar.gz \
        file://0001-updated-for-crosscompiling.patch \
        file://joystick-support.patch"

SRC_URI[sha256sum] = "bfbc5c378704d9cf5e7fed288dac88859149bee5ed0850175759d310b61fd30b"

DEPENDS = "ncurses"

#CFLAGS="-fcommon"
# EXTRA_OEMAKE += "'CC=${CC}' CFLAGS=${CFLAGS}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/nInvaders ${D}${bindir}
}