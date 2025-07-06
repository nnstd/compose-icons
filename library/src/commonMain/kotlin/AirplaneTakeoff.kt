package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneTakeoff: ImageVector
    get() {
        if (_AirplaneTakeoff != null) {
            return _AirplaneTakeoff!!
        }
        _AirplaneTakeoff = ImageVector.Builder(
            name = "AirplaneTakeoff",
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
                moveTo(22.07f, 9.64f)
                curveTo(21.86f, 8.84f, 21.03f, 8.36f, 20.23f, 8.58f)
                lineTo(14.92f, 10f)
                lineTo(8f, 3.57f)
                lineTo(6.09f, 4.08f)
                lineTo(10.23f, 11.25f)
                lineTo(5.26f, 12.58f)
                lineTo(3.29f, 11.04f)
                lineTo(1.84f, 11.43f)
                lineTo(3.66f, 14.59f)
                lineTo(4.43f, 15.92f)
                lineTo(6.03f, 15.5f)
                lineTo(11.34f, 14.07f)
                lineTo(15.69f, 12.91f)
                lineTo(21f, 11.5f)
                curveTo(21.81f, 11.26f, 22.28f, 10.44f, 22.07f, 9.64f)
                close()
            }
        }.build()

        return _AirplaneTakeoff!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneTakeoff: ImageVector? = null
