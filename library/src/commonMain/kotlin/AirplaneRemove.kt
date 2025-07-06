package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneRemove: ImageVector
    get() {
        if (_AirplaneRemove != null) {
            return _AirplaneRemove!!
        }
        _AirplaneRemove = ImageVector.Builder(
            name = "AirplaneRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.97f, 13.83f)
                curveTo(15.08f, 14.35f, 14.34f, 15.09f, 13.82f, 16f)
                lineTo(11.55f, 11.63f)
                lineTo(7.66f, 15.5f)
                lineTo(8f, 18f)
                lineTo(6.95f, 19.06f)
                lineTo(5.18f, 15.87f)
                lineTo(2f, 14.11f)
                lineTo(3.06f, 13.05f)
                lineTo(5.54f, 13.4f)
                lineTo(9.43f, 9.5f)
                lineTo(2f, 5.62f)
                lineTo(3.41f, 4.21f)
                lineTo(12.61f, 6.33f)
                lineTo(16.5f, 2.44f)
                curveTo(17.08f, 1.85f, 18.03f, 1.85f, 18.62f, 2.44f)
                curveTo(19.2f, 3.03f, 19.2f, 4f, 18.62f, 4.56f)
                lineTo(14.73f, 8.45f)
                lineTo(15.97f, 13.83f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }.build()

        return _AirplaneRemove!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneRemove: ImageVector? = null
