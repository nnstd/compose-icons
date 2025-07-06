package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderMusicOutline: ImageVector
    get() {
        if (_FolderMusicOutline != null) {
            return _FolderMusicOutline!!
        }
        _FolderMusicOutline = ImageVector.Builder(
            name = "FolderMusicOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(13.78f)
                curveTo(13.38f, 18.59f, 13.13f, 19.26f, 13.04f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.1f, 6f, 22f, 6.89f, 22f, 8f)
                moveTo(18.5f, 13f)
                verticalLineTo(18.21f)
                curveTo(18.19f, 18.07f, 17.86f, 18f, 17.5f, 18f)
                curveTo(16.12f, 18f, 15f, 19.12f, 15f, 20.5f)
                reflectiveCurveTo(16.12f, 23f, 17.5f, 23f)
                reflectiveCurveTo(20f, 21.88f, 20f, 20.5f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()

        return _FolderMusicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMusicOutline: ImageVector? = null
