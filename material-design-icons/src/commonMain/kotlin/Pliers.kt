package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pliers: ImageVector
    get() {
        if (_Pliers != null) {
            return _Pliers!!
        }
        _Pliers = ImageVector.Builder(
            name = "Pliers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.4f, 12.2f)
                curveTo(9.4f, 12.2f, 11.7f, 15.3f, 13.8f, 17.4f)
                curveTo(14.7f, 18.3f, 15.6f, 18.9f, 16.3f, 19.4f)
                curveTo(17.1f, 19.9f, 17.3f, 21f, 16.6f, 21.7f)
                curveTo(16.2f, 22.1f, 15.5f, 22.3f, 15f, 22f)
                curveTo(14.2f, 21.6f, 13f, 20.8f, 11.7f, 19.6f)
                curveTo(9.6f, 17.5f, 7.3f, 14.4f, 7.3f, 14.4f)
                lineTo(9.4f, 12.2f)
                moveTo(12.2f, 9.4f)
                curveTo(12.2f, 9.4f, 15.3f, 11.7f, 17.4f, 13.8f)
                curveTo(18.3f, 14.7f, 18.9f, 15.6f, 19.4f, 16.3f)
                curveTo(19.9f, 17.1f, 21f, 17.3f, 21.7f, 16.6f)
                curveTo(22.1f, 16.2f, 22.3f, 15.5f, 22f, 15f)
                curveTo(21.6f, 14.2f, 20.8f, 13f, 19.6f, 11.7f)
                curveTo(17.5f, 9.6f, 14.4f, 7.3f, 14.4f, 7.3f)
                lineTo(12.2f, 9.4f)
                moveTo(10.4f, 5.5f)
                lineTo(7.6f, 2.7f)
                lineTo(4.1f, 2f)
                lineTo(3.6f, 2.5f)
                lineTo(5.9f, 4.8f)
                curveTo(6.4f, 4.7f, 6.9f, 4.8f, 7.3f, 5.2f)
                curveTo(7.9f, 5.8f, 7.9f, 6.7f, 7.3f, 7.3f)
                reflectiveCurveTo(5.8f, 7.9f, 5.2f, 7.3f)
                curveTo(4.8f, 6.9f, 4.7f, 6.3f, 4.8f, 5.8f)
                lineTo(2.5f, 3.6f)
                lineTo(2f, 4.1f)
                lineTo(2.7f, 7.6f)
                lineTo(5.5f, 10.4f)
                lineTo(6.9f, 13.2f)
                lineTo(8.8f, 11.3f)
                lineTo(7.8f, 9.5f)
                lineTo(9.4f, 7.9f)
                lineTo(11.3f, 8.8f)
                lineTo(13.2f, 6.9f)
                lineTo(10.4f, 5.5f)
                close()
            }
        }.build()

        return _Pliers!!
    }

@Suppress("ObjectPropertyName")
private var _Pliers: ImageVector? = null
