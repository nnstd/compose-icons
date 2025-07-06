package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileWordBox: ImageVector
    get() {
        if (_FileWordBox != null) {
            return _FileWordBox!!
        }
        _FileWordBox = ImageVector.Builder(
            name = "FileWordBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 17f)
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _FileWordBox!!
    }

@Suppress("ObjectPropertyName")
private var _FileWordBox: ImageVector? = null
