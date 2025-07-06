package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatSize: ImageVector
    get() {
        if (_FormatSize != null) {
            return _FormatSize!!
        }
        _FormatSize = ImageVector.Builder(
            name = "FormatSize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                moveTo(21f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _FormatSize!!
    }

@Suppress("ObjectPropertyName")
private var _FormatSize: ImageVector? = null
