package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderLock: ImageVector
    get() {
        if (_FolderLock != null) {
            return _FolderLock!!
        }
        _FolderLock = ImageVector.Builder(
            name = "FolderLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.1f, 6f, 22f, 6.89f, 22f, 8f)
                verticalLineTo(11.04f)
                curveTo(21.17f, 10.4f, 20.13f, 10f, 19f, 10f)
                curveTo(16.4f, 10f, 14.2f, 12.06f, 14.2f, 14.5f)
                verticalLineTo(14.74f)
                curveTo(13.5f, 15.34f, 13f, 16.24f, 13f, 17.2f)
                verticalLineTo(20f)
                moveTo(23f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23f, 21.4f, 22.4f, 22f, 21.7f, 22f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22f, 15f, 21.4f, 15f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15f, 16.6f, 15.6f, 16f, 16.2f, 16f)
                verticalLineTo(14.5f)
                curveTo(16.2f, 13.1f, 17.6f, 12f, 19f, 12f)
                reflectiveCurveTo(21.8f, 13.1f, 21.8f, 14.5f)
                verticalLineTo(16f)
                curveTo(22.4f, 16f, 23f, 16.6f, 23f, 17.3f)
                moveTo(20.5f, 14.5f)
                curveTo(20.5f, 13.7f, 19.8f, 13.2f, 19f, 13.2f)
                reflectiveCurveTo(17.5f, 13.7f, 17.5f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(20.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _FolderLock!!
    }

@Suppress("ObjectPropertyName")
private var _FolderLock: ImageVector? = null
