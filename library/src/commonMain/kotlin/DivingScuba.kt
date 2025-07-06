package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DivingScuba: ImageVector
    get() {
        if (_DivingScuba != null) {
            return _DivingScuba!!
        }
        _DivingScuba = ImageVector.Builder(
            name = "DivingScuba",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 13f)
                curveTo(1f, 11.9f, 1.9f, 11f, 3f, 11f)
                reflectiveCurveTo(5f, 11.9f, 5f, 13f)
                reflectiveCurveTo(4.1f, 15f, 3f, 15f)
                reflectiveCurveTo(1f, 14.1f, 1f, 13f)
                moveTo(8.89f, 10.11f)
                lineTo(13.42f, 8.9f)
                lineTo(12.64f, 6f)
                lineTo(8.11f, 7.21f)
                curveTo(7.31f, 7.42f, 6.83f, 8.25f, 7.05f, 9.05f)
                curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f)
                moveTo(20.5f, 5.9f)
                lineTo(23f, 3f)
                lineTo(22f, 2f)
                lineTo(19f, 5f)
                lineTo(17f, 9f)
                lineTo(7.5f, 11.87f)
                curveTo(6.7f, 12.07f, 6.13f, 12.76f, 6f, 13.55f)
                lineTo(5.24f, 18f)
                lineTo(2.4f, 21.8f)
                lineTo(4f, 23f)
                lineTo(7f, 19f)
                lineTo(8.14f, 15.86f)
                lineTo(14f, 14f)
                lineTo(19f, 10.5f)
                lineTo(20.5f, 5.9f)
                close()
            }
        }.build()

        return _DivingScuba!!
    }

@Suppress("ObjectPropertyName")
private var _DivingScuba: ImageVector? = null
