package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterPumpOff: ImageVector
    get() {
        if (_WaterPumpOff != null) {
            return _WaterPumpOff!!
        }
        _WaterPumpOff = ImageVector.Builder(
            name = "WaterPumpOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.7f, 2.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 7f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 13f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(12.2f)
                moveTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(11f, 10.34f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3.65f, 5.54f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(12.89f)
                close()
            }
        }.build()

        return _WaterPumpOff!!
    }

@Suppress("ObjectPropertyName")
private var _WaterPumpOff: ImageVector? = null
