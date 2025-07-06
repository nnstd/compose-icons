package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortVariantOff: ImageVector
    get() {
        if (_SortVariantOff != null) {
            return _SortVariantOff!!
        }
        _SortVariantOff = ImageVector.Builder(
            name = "SortVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(11.11f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(9.11f)
                lineTo(6.11f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(4.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(15f, 11f)
                horizontalLineTo(14.2f)
                lineTo(15f, 11.8f)
                verticalLineTo(11f)
                moveTo(21f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(9.2f)
                lineTo(11.2f, 8f)
                horizontalLineTo(21f)
                moveTo(3f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _SortVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _SortVariantOff: ImageVector? = null
