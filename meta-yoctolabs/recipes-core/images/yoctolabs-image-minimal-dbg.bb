DESCRIPTION = "Minimal image with debugging tools"

require yoctolabs-image-minimal.bb

IMAGE_FEATURES:append = " dbg-pkgs"