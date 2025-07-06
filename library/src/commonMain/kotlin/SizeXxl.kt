package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SizeXxl: ImageVector
    get() {
        if (_SizeXxl != null) {
            return _SizeXxl!!
        }
        _SizeXxl = ImageVector.Builder(
            name = "SizeXxl",
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
                moveTo(2f, 7f)
                horizontalLineTo(4f)
                lineTo(5f, 9.5f)
                lineTo(6f, 7f)
                horizontalLineTo(8f)
                lineTo(6f, 12f)
                lineTo(8f, 17f)
                horizontalLineTo(6f)
                lineTo(5f, 14.5f)
                lineTo(4f, 17f)
                horizontalLineTo(2f)
                lineTo(4f, 12f)
                lineTo(2f, 7f)
                close()
            }
        }.build()

        return _SizeXxl!!
    }

@Suppress("ObjectPropertyName")
private var _SizeXxl: ImageVector? = null
