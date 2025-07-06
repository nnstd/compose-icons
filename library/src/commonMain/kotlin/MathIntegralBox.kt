package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MathIntegralBox: ImageVector
    get() {
        if (_MathIntegralBox != null) {
            return _MathIntegralBox!!
        }
        _MathIntegralBox = ImageVector.Builder(
            name = "MathIntegralBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(15.9f, 6.9f)
                curveTo(15.9f, 6.9f, 15.2f, 6.6f, 14.9f, 6.6f)
                curveTo(14.3f, 6.5f, 13.9f, 6.7f, 13.7f, 7.7f)
                lineTo(12f, 16.8f)
                curveTo(11.8f, 17.6f, 11.5f, 18.2f, 11f, 18.6f)
                curveTo(10.6f, 18.9f, 10.2f, 19f, 9.7f, 19f)
                curveTo(8.9f, 19f, 7.7f, 18.5f, 7.7f, 18.5f)
                lineTo(8.2f, 17.1f)
                curveTo(8.2f, 17.1f, 9f, 17.4f, 9.2f, 17.4f)
                curveTo(9.5f, 17.5f, 9.7f, 17.4f, 9.9f, 17.3f)
                curveTo(10.1f, 17.2f, 10.2f, 16.9f, 10.3f, 16.6f)
                lineTo(11.9f, 7.4f)
                curveTo(12f, 6.6f, 12.4f, 6f, 12.9f, 5.5f)
                curveTo(13.5f, 5.1f, 14.2f, 5f, 15f, 5.1f)
                curveTo(15.7f, 5.2f, 16.5f, 5.6f, 16.5f, 5.6f)
                lineTo(15.9f, 6.9f)
                close()
            }
        }.build()

        return _MathIntegralBox!!
    }

@Suppress("ObjectPropertyName")
private var _MathIntegralBox: ImageVector? = null
