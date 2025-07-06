package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SizeXl: ImageVector
    get() {
        if (_SizeXl != null) {
            return _SizeXl!!
        }
        _SizeXl = ImageVector.Builder(
            name = "SizeXl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 7f)
                horizontalLineTo(8f)
                lineTo(9f, 9.5f)
                lineTo(10f, 7f)
                horizontalLineTo(12f)
                lineTo(10f, 12f)
                lineTo(12f, 17f)
                horizontalLineTo(10f)
                lineTo(9f, 14.5f)
                lineTo(8f, 17f)
                horizontalLineTo(6f)
                lineTo(8f, 12f)
                lineTo(6f, 7f)
                moveTo(13f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _SizeXl!!
    }

@Suppress("ObjectPropertyName")
private var _SizeXl: ImageVector? = null
