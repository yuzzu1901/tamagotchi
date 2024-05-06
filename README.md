        Fixit Tools Agreement

        Copyright © 2008-2019 by XPtsp Development Team. All rights reserved.

        Usage of this program is allowed provided the following conditions are met: 

        1. Use of this script is at your own risk.
         
        2. DISCLAIMER:                       
        ALL SOFTWARE OFFERED BY XPTSP.COM AND Fixit Tools IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, 
        INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
        IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL 
        DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES LOSS OF USE, DATA, OR PROFITS OR BUSINESS INTERRUPTION) 
        HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
        ARISING IN ANY WAY OUT OF THE USE OF THE SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.


        XPtsp Development Team

---------------------------------------------------------------------------------------------------------------------------
       For patching some system files with res files, 7tsp uses Reshacker by Angus Johnson http://www.angusj.com 
       please download and install the latest version.
---------------------------------------------------------------------------------------------------------------------------
       For patching most files 7tsp uses public domain software BatchResourceUpdater.exe for mutch faster patching.
       by Jeff Bush http://www.coderforlife.com
       E.G. 10x faster patching of imageres.dll
---------------------------------------------------------------------------------------------------------------------------
       For extracting zipped 7tsp packs 7tsp uses 7za.exe, 
       The 7zip Lzma compression implementation is placed under Public Domain and as such is not copyrighted.
       LZMA compression technology developed by Igor Pavlov - http://www.7-zip.org
---------------------------------------------------------------------------------------------------------------------------


                      Se7en Theme Source Patcher 
                      Script written by: Mr.Fixit

                 

---------------------------------------------------------------------------------------------------------------------------
Windows Se7en Theme Source Patcher v 0.6 Beta Build(2019)
---------------------------------------------------------------------------------------------------------------------------

Patches your Windows 7 with a resource or icon pack.

There are official 7tsp color packs in development and available to download.
Also several of our users have created custom 7tsp packs which they have made available to the public! 

----------------------------------------------------------------------------------------------------------------------------

The Patcher will:

1. Extract the selected resource pack to the work folder and looks for each system file this pack will mod. (while patching)

A  backup will be made of those files in the case a backup does not yet exist. 
   If Windows updated a file the backup will be updated as well before (re-)patching the file.

2. The current file ownerships of a file are stored and then administrator ownerships are taken.

3. The file will be patched with the new resources and replaces the original file.

4. The file ownerships and permissions will be restored how they were found the first time the patcher was used. 

It's also possible to create your own custom Theme/Icon pack('s) and apply them with the 7tsp GUI.
Modifications can include icons, bitmaps, a theme, a side panel bitmap, a logon screen, task manager colors and many more.
 
----------------------------------------------------------------------------------------------------------------------------
pack.ini: Some settings explained to create a pack, 
Extract a pack (preferable 7tsp black pack) , replace all or some of the resources with your own and/or just remove any unwanted file or mod...
Re compress the files and folders again as it was with 7zip
and name it "7tsp_my_custom_pack_v0.1.7z"  ("my_custom" can be "any_name" (no spaces))

(Edit and use one of the official 7tsp pack's pack.ini files, do not copy from this explanation)

[Base Pack]
Pack=                  << Name of your custom pack
by=                    << Name of pack creator
Version=               << Version number of your custom pack (e.g. "1.0")
Date=date

[7tsp]
theme creator=         << Name of Theme Creator
theme=mytheme.theme    << The name of the theme file that will be applied as placed in the "Extra" folder, e.g.:  "mytheme.themepack" 
                          or "mytheme.theme" (and place the folder that goes with it "mytheme" also in the "Extra" Folder).
                          Any amount of .theme files and corresponding folders can be added to the Extra folder.

uxhex=yes              << In case the theme needs uxtheme.dll to be patched, else write "no".
mui=no                 << Set to "yes" if the pack has any *.mui.res files in the resources folder
os=win7                << Optional if the pack is only for windows 7 to warn windows 8, 8.1 and 10 users


[taskmanager]          << Will only be used if "taskmgr.exe.res" is in the resources folder... (this may also be a 0kb "taskmgr.exe.res" dummy file)
grid=00FF00            << Use any color in hex format
memory=FFFF00
CPU=00FFFF
Digits=00ff00

[CopyAnimation]        << Will only be used if this is in the pack.ini (and enabled by the user in the option menu)
color1=FF0000          << Use any color in hex format
color2=00FF00
color3=0000FF
Fontcolor=FFFF00

                      
[CopyAnimation]        << Or to use a bitmap instead of gradient colors
Bitmap=100             << Place a 'Bitmap'(.BMP) of 400x40px in shell32.dll.res with name: '100' and language ID: '1033'
Fontcolor=FFFF00

[OEMINFO]              << Will be used if a bitmap 120x120px is placed in the "Extra\OEMLogo\logo.bmp" folder.
Manufacturer=          << Leave blank what not applies
Model=
logo=logo.bmp
SupportURL=
SupportPhone=
SupportHours=

--------------------------------------------------------------------------------------------------------------
Change log:

25 Jun 2019 v0.6 RC1 Build 2019
~Create restorepoint fixed for all windows versions
~Fixed regedit not being patched on x64 systems
~Added a new default skin by Devillinside
~Added .mun file patching support - any .mun file can be added in *.mun.res format (experimental, not recommended)
~many small script updates
~Removed misc options from Extra section
~Removed update check from info menu


1 Feb 2015 v0.4 Build 2015
~Added the option to start patching from Program menu
~Added some GUI skins which can be set from 7tsp menu
~Disabled some settings not (yet) supported on win8+
~Added check to see if there is enough free disk space left for patching
~Fixed bug where pack.ini could not be found on systems with with special characters like "&" or spaces in the username
~Major patching speedup for shell32.dll and imageres.dll
~Improved cleanup code

7 Jan 2015 v0.4 Build 2015 RC1
~Added oemedit to the misc section, and the ability to add OEM Information changes to a custom pack (on request by Robi450)
~Fixed iexplorer bug on x64(caused by reshacker breaking x64 dll files, bru patcher now patches those files)
~Fixed bug when clicked on program / Extra / 7tsp menu, patching process would freeze
~Fixed bug regedit would not change on x64
~Fixed uxpatch X86 and X64
~Fixed uxpatch reminder while "install visual style" was disabled in the options menu
~Fixed a bug that some dialog windows would not always refresh
~Added lots of new file locations (on request by Robi450)
~Added check for latest reshacker version
~Added 2 extra checks to see if restore point creation is disabled in windows settings (hopefully this bug wont appear AGAIN :S )
~Fixed a bug when patch timedate.clp was disabled in options menu, "wmplayer.exe.res" got deleted
~Fixed speech folder ownership bug
~Trusted installer ownership is now properly restored (forced for all system files)
~Updated 7za to latest version
~Added the new file locations to the restore function
~Fixed replace at reboot code for locked files
~And lots of script updates/fixes

15 Okt 2011 v0.3 Build 3004
~ Added Chinese translation (tnx to user zkm) (not confirmed yet)
~ Uxtheme patching for x86/x64 systems should work again (tnx Dougiefresh for helping)

6 March 2011 V0.3 Build 3003
~ Small script updates
~ Updated the task manager hexing code for SP1

20 Jan 2011, V0.3 Build 3002
~ Small script updates
~ Added recognition for sidebar.exe.res
~ Added recognition for wmplayer.exe.res
~ Added multiple theme install from the extra folder (on "multiple" user requests)
~ Updated the German language file (tnx Heebijeebi)
~ Fully enabled patch from backup option
~ Enabled Download/enable Black Glass Enhanced option (Thnx Curiouso9 for his permission!)


15 Okt 2010, V0.3 build 3001
~ Fixed the font install code
~ New GUI background (thnx Kirs)
~ Updated mui file patch support
~ Lots of scrip updates and bug fixes
~ Shifted buttons and options around
~ Rewrote the complete translation code
~ Added better menu start button support
~ Updated selected pack preview function
~ Removed internal resources from the GUI
~ Added the option to restore the uxtheme files
~ GUI language can now also be manually chosen from the 7tsp menu
~ Detects if uxstyle core is running to auto skip ux file patching
~ A bitmap can now also be used for the copy/delete animations in stead of gradient colors
~ Updated the logonui preview function to better reflect how it will look like after patching
~ The restore button will now open a "Restore Menu" where all restore methods can be selected
~ Made more things optional, like the visual style, wmp skin, timedate cpl, sounds install, font install....	 
~ Fixed a bug where logonui did not change when a "logonUI changer" has been used
~ basebrd.dll.res can now be added for home pro and ultimate
(Extra\basebrd\basebrdhome.dll.res and basebrdpro.dll.res and resources\basebrd.dll.res for the ultimate or universal bitmaps) 

22 Aug 2010, build 2005
~ Updated the "must reboot" check

10 aug 2010, build 2004
~ Added support to modify the Copy/move/delete animation colors (known limitation: the green glow on the moving folders, including the moving folders are not changeable)
~ Added mui file support for the system32\en-US\ folder ( if your system is English, Dutch, France, Magyar or Chineese the correct lang mui folder is patched)
~ Added support for .cur cursors and cursor inf scheme install

26 July 2010, build 2003
~ Added support to install new fonts
~ Added support to install new sound files
~ Added support to install new Sound schemes
~ Bug (on x64 only) fixed in the restore function

8 July 2010, build 2002
~ Minor script fixes and updates
~ Written a fail safe to replace still locked files on next reboot (also for the restore function)
~ Added code to the cleanup script to restore ownerships for files replaced at next reboot
~ Wrote an installer/uninstaller for the 7tsp GUI (still very boring but functional)
~ Added start menu buttons to explorer.exe.res in the Basic packs (tnx to Kirs for making the buttons)

30 June 2010, Build 2001
~ GUI updates and fixes.
~ GUI is now translatable and currently available in English, French and Dutch.
~ GUI appearance has changed (nothing permanent).
~ All folders and icons are removed from the internal pack. A Black pack has been made to replace these changes.
~ Color packs are updated (not perfect yet lol).
~ Task Manager Color Hexing can be set in the pack.ini.
~ Removed the GUI sounds.

11 June 2010, Build 1010
~ Bug fixed when system restore is disabled in windows (thanx to Jatin Beniwal for reporting).
~ Added SFC /scannow and /scanfile to the program menu to restore the complete system or a single file via windows file protection.

8 June 2010, Build 1009
~ Added support to use a custom .theme file and folder in a pack.
~ Added the option to hexedit UxTheme.dll while patching to support 3rd party themes.

26 May 2010, Build 1008
~First public beta release 

--------------------------------------------------------------------------------------------------------------

Have Fun!

Regards 

Fixit

<<-XPtsp Development Team->>


Comments
       : Patcher will run in Admin mode
       : Just an .exe nothing will be installed. (except for the backup files and settings.ini file).
       : Made for Windows Seven x86 and x64 (will also function on 8, 8.1 and 10 x86 and x64)
       : This is still BETA software. if you are not sure, please try it in a virtual machine fist...
