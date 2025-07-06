package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatColorFill: ImageVector
    get() {
        if (_FormatColorFill != null) {
            return _FormatColorFill!!
        }
        _FormatColorFill = ImageVector.Builder(
            name = "FormatColorFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11.5f)
                curveTo(19f, 11.5f, 17f, 13.67f, 17f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                curveTo(21f, 13.67f, 19f, 11.5f, 19f, 11.5f)
                moveTo(5.21f, 10f)
                lineTo(10f, 5.21f)
                lineTo(14.79f, 10f)
                moveTo(16.56f, 8.94f)
                lineTo(7.62f, 0f)
                lineTo(6.21f, 1.41f)
                lineTo(8.59f, 3.79f)
                lineTo(3.44f, 8.94f)
                curveTo(2.85f, 9.5f, 2.85f, 10.47f, 3.44f, 11.06f)
                lineTo(8.94f, 16.56f)
                curveTo(9.23f, 16.85f, 9.62f, 17f, 10f, 17f)
                curveTo(10.38f, 17f, 10.77f, 16.85f, 11.06f, 16.56f)
                lineTo(16.56f, 11.06f)
                curveTo(17.15f, 10.47f, 17.15f, 9.5f, 16.56f, 8.94f)
                close()
            }
        }.build()

        return _FormatColorFill!!
    }

@Suppress("ObjectPropertyName")
private var _FormatColorFill: ImageVector? = null
