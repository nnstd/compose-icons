package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightFloodDown: ImageVector
    get() {
        if (_LightFloodDown != null) {
            return _LightFloodDown!!
        }
        _LightFloodDown = ImageVector.Builder(
            name = "LightFloodDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                curveTo(8.55f, 9f, 9f, 9.45f, 9f, 10f)
                curveTo(9f, 10.55f, 8.55f, 11f, 8f, 11f)
                moveTo(14.87f, 4.35f)
                lineTo(14.5f, 5.27f)
                lineTo(8.18f, 4.86f)
                lineTo(6.9f, 8f)
                horizontalLineTo(8f)
                curveTo(9.1f, 8f, 10f, 8.9f, 10f, 10f)
                reflectiveCurveTo(9.1f, 12f, 8f, 12f)
                horizontalLineTo(5.27f)
                lineTo(4.41f, 14.12f)
                lineTo(9.21f, 18.24f)
                lineTo(8.83f, 19.16f)
                lineTo(10.69f, 19.92f)
                lineTo(16.72f, 5.1f)
                lineTo(14.87f, 4.35f)
                moveTo(20.81f, 6.29f)
                lineTo(21.57f, 8.14f)
                lineTo(19.26f, 9.1f)
                lineTo(18.5f, 7.25f)
                lineTo(20.81f, 6.29f)
                moveTo(18.78f, 13.57f)
                lineTo(21.55f, 14.72f)
                lineTo(20.79f, 16.57f)
                lineTo(18f, 15.42f)
                lineTo(18.78f, 13.57f)
                moveTo(16.15f, 21.23f)
                lineTo(14.3f, 22f)
                lineTo(13.34f, 19.69f)
                lineTo(15.19f, 18.93f)
                lineTo(16.15f, 21.23f)
                close()
            }
        }.build()

        return _LightFloodDown!!
    }

@Suppress("ObjectPropertyName")
private var _LightFloodDown: ImageVector? = null
