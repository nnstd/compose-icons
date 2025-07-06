package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileWordBoxOutline: ImageVector
    get() {
        if (_FileWordBoxOutline != null) {
            return _FileWordBoxOutline!!
        }
        _FileWordBoxOutline = ImageVector.Builder(
            name = "FileWordBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(5f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(17.9f, 7f)
                lineTo(15.5f, 17f)
                horizontalLineTo(14f)
                lineTo(12f, 9.5f)
                lineTo(10f, 17f)
                horizontalLineTo(8.5f)
                lineTo(6.1f, 7f)
                horizontalLineTo(7.8f)
                lineTo(9.34f, 14.5f)
                lineTo(11.3f, 7f)
                horizontalLineTo(12.7f)
                lineTo(14.67f, 14.5f)
                lineTo(16.2f, 7f)
                horizontalLineTo(17.9f)
                close()
            }
        }.build()

        return _FileWordBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileWordBoxOutline: ImageVector? = null
