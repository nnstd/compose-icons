package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MathIntegral: ImageVector
    get() {
        if (_MathIntegral != null) {
            return _MathIntegral!!
        }
        _MathIntegral = ImageVector.Builder(
            name = "MathIntegral",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 19.1f)
                curveTo(11.3f, 20.2f, 10.9f, 21f, 10.2f, 21.5f)
                curveTo(9.5f, 22f, 8.6f, 22.1f, 7.5f, 21.9f)
                curveTo(7.1f, 21.8f, 6.3f, 21.7f, 6f, 21.5f)
                lineTo(6.5f, 20f)
                curveTo(6.8f, 20.1f, 7.4f, 20.3f, 7.7f, 20.3f)
                curveTo(8.8f, 20.5f, 9.4f, 20f, 9.6f, 18.8f)
                lineTo(12f, 5.2f)
                curveTo(12.2f, 4f, 12.7f, 3.2f, 13.4f, 2.6f)
                curveTo(14.1f, 2.1f, 15.1f, 1.9f, 16.2f, 2.1f)
                curveTo(16.6f, 2.2f, 17.4f, 2.3f, 18f, 2.6f)
                lineTo(17.5f, 4f)
                curveTo(17.3f, 3.9f, 16.6f, 3.8f, 16.3f, 3.7f)
                curveTo(15f, 3.5f, 14.3f, 4.1f, 14f, 5.6f)
                lineTo(11.5f, 19.1f)
                close()
            }
        }.build()

        return _MathIntegral!!
    }

@Suppress("ObjectPropertyName")
private var _MathIntegral: ImageVector? = null
