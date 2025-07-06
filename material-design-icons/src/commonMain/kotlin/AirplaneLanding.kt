package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneLanding: ImageVector
    get() {
        if (_AirplaneLanding != null) {
            return _AirplaneLanding!!
        }
        _AirplaneLanding = ImageVector.Builder(
            name = "AirplaneLanding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 19f)
                horizontalLineTo(21.5f)
                verticalLineTo(21f)
                horizontalLineTo(2.5f)
                verticalLineTo(19f)
                moveTo(9.68f, 13.27f)
                lineTo(14.03f, 14.43f)
                lineTo(19.34f, 15.85f)
                curveTo(20.14f, 16.06f, 20.96f, 15.59f, 21.18f, 14.79f)
                curveTo(21.39f, 14f, 20.92f, 13.17f, 20.12f, 12.95f)
                lineTo(14.81f, 11.53f)
                lineTo(12.05f, 2.5f)
                lineTo(10.12f, 2f)
                verticalLineTo(10.28f)
                lineTo(5.15f, 8.95f)
                lineTo(4.22f, 6.63f)
                lineTo(2.77f, 6.24f)
                verticalLineTo(11.41f)
                lineTo(4.37f, 11.84f)
                lineTo(9.68f, 13.27f)
                close()
            }
        }.build()

        return _AirplaneLanding!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneLanding: ImageVector? = null
