package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderFile: ImageVector
    get() {
        if (_FolderFile != null) {
            return _FolderFile!!
        }
        _FolderFile = ImageVector.Builder(
            name = "FolderFile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8f)
                curveTo(12.79f, 8f, 11f, 9.79f, 11f, 12f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.1f, 6f, 22f, 6.89f, 22f, 8f)
                verticalLineTo(10.17f)
                lineTo(20.41f, 8.59f)
                lineTo(19.83f, 8f)
                horizontalLineTo(15f)
                moveTo(23f, 14f)
                verticalLineTo(21f)
                curveTo(23f, 22.11f, 22.11f, 23f, 21f, 23f)
                horizontalLineTo(15f)
                curveTo(13.9f, 23f, 13f, 22.11f, 13f, 21f)
                verticalLineTo(12f)
                curveTo(13f, 10.9f, 13.9f, 10f, 15f, 10f)
                horizontalLineTo(19f)
                lineTo(23f, 14f)
                moveTo(21f, 14.83f)
                lineTo(18.17f, 12f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(14.83f)
                close()
            }
        }.build()

        return _FolderFile!!
    }

@Suppress("ObjectPropertyName")
private var _FolderFile: ImageVector? = null
