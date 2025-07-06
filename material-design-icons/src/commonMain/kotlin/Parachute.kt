package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Parachute: ImageVector
    get() {
        if (_Parachute != null) {
            return _Parachute!!
        }
        _Parachute = ImageVector.Builder(
            name = "Parachute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.2f, 10.95f)
                lineTo(12f, 23f)
                lineTo(2.78f, 10.96f)
                lineTo(2.87f, 10.88f)
                curveTo(3.08f, 10.67f, 3.33f, 10.5f, 3.58f, 10.36f)
                lineTo(10.73f, 19.69f)
                lineTo(8.58f, 13f)
                lineTo(9.24f, 11.81f)
                lineTo(12f, 20.38f)
                lineTo(14.73f, 11.8f)
                lineTo(15.4f, 13f)
                lineTo(13.27f, 19.69f)
                lineTo(20.41f, 10.35f)
                curveTo(20.66f, 10.5f, 20.9f, 10.64f, 21.1f, 10.85f)
                lineTo(21.2f, 10.95f)
                moveTo(5f, 9f)
                curveTo(6.5f, 9f, 7.81f, 9.86f, 8.5f, 11.1f)
                curveTo(9.17f, 9.86f, 10.47f, 9f, 12f, 9f)
                curveTo(13.5f, 9f, 14.8f, 9.85f, 15.5f, 11.09f)
                curveTo(16.16f, 9.84f, 17.47f, 9f, 19f, 9f)
                curveTo(20.09f, 9f, 21.09f, 9.42f, 21.81f, 10.14f)
                curveTo(20.94f, 5.5f, 16.88f, 2f, 12f, 2f)
                curveTo(7.09f, 2f, 3.03f, 5.5f, 2.16f, 10.17f)
                curveTo(2.89f, 9.45f, 3.89f, 9f, 5f, 9f)
                close()
            }
        }.build()

        return _Parachute!!
    }

@Suppress("ObjectPropertyName")
private var _Parachute: ImageVector? = null
