package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Karate: ImageVector
    get() {
        if (_Karate != null) {
            return _Karate!!
        }
        _Karate = ImageVector.Builder(
            name = "Karate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.8f, 2f)
                lineTo(11.6f, 8.7f)
                lineTo(10.39f, 7.66f)
                lineTo(14f, 5.58f)
                lineTo(9.41f, 1f)
                lineTo(8f, 2.41f)
                lineTo(10.74f, 5.15f)
                lineTo(5f, 8.46f)
                lineTo(3.81f, 12.75f)
                lineTo(6.27f, 17f)
                lineTo(8f, 16f)
                lineTo(5.97f, 12.5f)
                lineTo(6.32f, 11.18f)
                lineTo(9.5f, 13f)
                lineTo(10f, 22f)
                horizontalLineTo(12f)
                lineTo(12.5f, 12f)
                lineTo(21f, 3.4f)
                lineTo(19.8f, 2f)
                moveTo(5f, 3f)
                curveTo(6.11f, 3f, 7f, 3.9f, 7f, 5f)
                reflectiveCurveTo(6.11f, 7f, 5f, 7f)
                reflectiveCurveTo(3f, 6.11f, 3f, 5f)
                reflectiveCurveTo(3.9f, 3f, 5f, 3f)
                close()
            }
        }.build()

        return _Karate!!
    }

@Suppress("ObjectPropertyName")
private var _Karate: ImageVector? = null
