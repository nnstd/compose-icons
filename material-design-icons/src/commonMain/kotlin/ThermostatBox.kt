package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermostatBox: ImageVector
    get() {
        if (_ThermostatBox != null) {
            return _ThermostatBox!!
        }
        _ThermostatBox = ImageVector.Builder(
            name = "ThermostatBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(12f, 5f)
                curveTo(13.57f, 5f, 15f, 5.5f, 16.19f, 6.4f)
                lineTo(14f, 8.56f)
                curveTo(13.43f, 8.21f, 12.74f, 8f, 12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                curveTo(8f, 13.1f, 8.45f, 14.1f, 9.17f, 14.83f)
                lineTo(7.05f, 16.95f)
                curveTo(5.78f, 15.68f, 5f, 13.93f, 5f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                moveTo(17.6f, 7.81f)
                curveTo(18.5f, 9f, 19f, 10.43f, 19f, 12f)
                curveTo(19f, 13.93f, 18.22f, 15.68f, 16.95f, 16.95f)
                lineTo(14.83f, 14.83f)
                curveTo(15.55f, 14.1f, 16f, 13.1f, 16f, 12f)
                curveTo(16f, 11.26f, 15.79f, 10.57f, 15.43f, 10f)
                lineTo(17.6f, 7.81f)
                close()
            }
        }.build()

        return _ThermostatBox!!
    }

@Suppress("ObjectPropertyName")
private var _ThermostatBox: ImageVector? = null
