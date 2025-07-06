package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LedVariantOff: ImageVector
    get() {
        if (_LedVariantOff != null) {
            return _LedVariantOff!!
        }
        _LedVariantOff = ImageVector.Builder(
            name = "LedVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(10.05f, 3f, 8.43f, 4.4f, 8.08f, 6.25f)
                lineTo(16.82f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                moveTo(3.28f, 4f)
                lineTo(2f, 5.27f)
                lineTo(8f, 11.27f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(11.73f)
                lineTo(13f, 16.27f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(18.27f)
                lineTo(18.73f, 22f)
                lineTo(20f, 20.72f)
                lineTo(15f, 15.72f)
                lineTo(8f, 8.72f)
                lineTo(3.28f, 4f)
                close()
            }
        }.build()

        return _LedVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _LedVariantOff: ImageVector? = null
