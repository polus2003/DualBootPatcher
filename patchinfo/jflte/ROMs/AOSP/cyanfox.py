from multiboot.fileinfo import FileInfo
import multiboot.autopatcher as autopatcher

file_info = FileInfo()

filename_regex           = r"^CyanFox.*\.zip$"
file_info.name           = 'CyanFox'
file_info.ramdisk        = 'jflte/AOSP/AOSP.def'
file_info.patch          = autopatcher.auto_patch
file_info.extract        = autopatcher.files_to_auto_patch
