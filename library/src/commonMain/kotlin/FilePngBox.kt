package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilePngBox: ImageVector
    get() {
        if (_FilePngBox != null) {
            return _FilePngBox!!
        }
        _FilePngBox = ImageVector.Builder(
            name = "FilePngBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(9f, 11.5f)
                curveTo(9f, 12.3f, 8.3f, 13f, 7.5f, 13f)
                horizontalLineTo(6.5f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7.5f)
                curveTo(8.3f, 9f, 9f, 9.7f, 9f, 10.5f)
                verticalLineTo(11.5f)
                moveTo(14f, 15f)
                horizontalLineTo(12.5f)
                lineTo(11.5f, 12.5f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(11.5f)
                lineTo(12.5f, 11.5f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                moveTo(19f, 10.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(13.7f)
                curveTo(19f, 14.4f, 18.5f, 15f, 17.7f, 15f)
                horizontalLineTo(16.4f)
                curveTo(15.6f, 15f, 15.1f, 14.3f, 15.1f, 13.7f)
                verticalLineTo(10.4f)
                curveTo(15f, 9.7f, 15.5f, 9f, 16.3f, 9f)
                horizontalLineTo(17.6f)
                curveTo(18.4f, 9f, 18.9f, 9.7f, 18.9f, 10.3f)
                verticalLineTo(10.5f)
                horizontalLineTo(19f)
                moveTo(6.5f, 10.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _FilePngBox!!
    }

@Suppress("ObjectPropertyName")
private var _FilePngBox: ImageVector? = null
