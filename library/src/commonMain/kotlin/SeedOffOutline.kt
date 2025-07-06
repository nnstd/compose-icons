package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeedOffOutline: ImageVector
    get() {
        if (_SeedOffOutline != null) {
            return _SeedOffOutline!!
        }
        _SeedOffOutline = ImageVector.Builder(
            name = "SeedOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(5.9f, 7.8f)
                curveTo(3.8f, 10.5f, 2.6f, 14.6f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21f, 6.4f, 21f)
                curveTo(10.9f, 21f, 14.1f, 19.9f, 16.3f, 18.2f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(6.4f, 19f)
                horizontalLineTo(5.1f)
                curveTo(4.9f, 14.8f, 5.6f, 11.5f, 7.3f, 9.2f)
                lineTo(8.9f, 10.8f)
                curveTo(7f, 13.7f, 7f, 17f, 7f, 17f)
                curveTo(8f, 15f, 9.1f, 13.4f, 10.2f, 12.1f)
                lineTo(14.8f, 16.7f)
                curveTo(12.8f, 18.2f, 10f, 19f, 6.4f, 19f)
                moveTo(10f, 6.8f)
                lineTo(8.5f, 5.3f)
                curveTo(11.3f, 3.4f, 14.7f, 3f, 17.2f, 3f)
                curveTo(19.3f, 3f, 20.7f, 3.3f, 20.7f, 3.3f)
                reflectiveCurveTo(22.1f, 10.3f, 18.7f, 15.5f)
                lineTo(17.2f, 14f)
                curveTo(19.1f, 10.9f, 19f, 7.1f, 18.9f, 5.1f)
                curveTo(18.4f, 5f, 17.8f, 5f, 17.2f, 5f)
                curveTo(15.1f, 5f, 12.3f, 5.3f, 10f, 6.8f)
                moveTo(12.8f, 9.6f)
                lineTo(11.6f, 8.4f)
                curveTo(12.9f, 7.5f, 14.7f, 7f, 17f, 7f)
                curveTo(17f, 7f, 15.1f, 7.6f, 12.8f, 9.6f)
                close()
            }
        }.build()

        return _SeedOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SeedOffOutline: ImageVector? = null
