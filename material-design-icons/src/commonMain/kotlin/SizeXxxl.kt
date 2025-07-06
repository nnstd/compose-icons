package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SizeXxxl: ImageVector
    get() {
        if (_SizeXxxl != null) {
            return _SizeXxxl!!
        }
        _SizeXxxl = ImageVector.Builder(
            name = "SizeXxxl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                horizontalLineTo(11f)
                lineTo(12f, 9.5f)
                lineTo(13f, 7f)
                horizontalLineTo(15f)
                lineTo(13f, 12f)
                lineTo(15f, 17f)
                horizontalLineTo(13f)
                lineTo(12f, 14.5f)
                lineTo(11f, 17f)
                horizontalLineTo(9f)
                lineTo(11f, 12f)
                lineTo(9f, 7f)
                moveTo(16f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                moveTo(8f, 15f)
                curveTo(8f, 16.11f, 7.11f, 17f, 6f, 17f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                curveTo(7.1f, 7f, 8f, 7.89f, 8f, 9f)
                verticalLineTo(10.5f)
                curveTo(8f, 11.33f, 7.33f, 12f, 6.5f, 12f)
                curveTo(7.33f, 12f, 8f, 12.67f, 8f, 13.5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _SizeXxxl!!
    }

@Suppress("ObjectPropertyName")
private var _SizeXxxl: ImageVector? = null
