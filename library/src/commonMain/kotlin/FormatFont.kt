package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatFont: ImageVector
    get() {
        if (_FormatFont != null) {
            return _FormatFont!!
        }
        _FormatFont = ImageVector.Builder(
            name = "FormatFont",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                lineTo(12.5f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                lineTo(17f, 8f)
                moveTo(18f, 9f)
                lineTo(14.5f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                moveTo(5f, 3f)
                horizontalLineTo(10f)
                curveTo(11.11f, 3f, 12f, 3.89f, 12f, 5f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                moveTo(6f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _FormatFont!!
    }

@Suppress("ObjectPropertyName")
private var _FormatFont: ImageVector? = null
