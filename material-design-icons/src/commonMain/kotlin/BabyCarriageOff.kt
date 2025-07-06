package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BabyCarriageOff: ImageVector
    get() {
        if (_BabyCarriageOff != null) {
            return _BabyCarriageOff!!
        }
        _BabyCarriageOff = ImageVector.Builder(
            name = "BabyCarriageOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                curveTo(22f, 5.6f, 18.4f, 2f, 14f, 2f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                moveTo(14.2f, 11f)
                horizontalLineTo(22f)
                curveTo(22f, 12.8f, 21.4f, 14.5f, 20.3f, 15.9f)
                curveTo(21f, 16.5f, 21.4f, 17.4f, 21.5f, 18.3f)
                lineTo(14.2f, 11f)
                moveTo(20.8f, 22.7f)
                lineTo(22.1f, 21.4f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(9.1f, 11f)
                horizontalLineTo(7.4f)
                lineTo(6.5f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5.2f)
                curveTo(5.2f, 11f, 7.1f, 15.1f, 7.3f, 15.4f)
                curveTo(6.3f, 15.9f, 5.6f, 16.9f, 5.5f, 18f)
                curveTo(5.2f, 19.9f, 6.6f, 21.7f, 8.5f, 22f)
                curveTo(10.4f, 22.3f, 12.2f, 20.9f, 12.5f, 19f)
                horizontalLineTo(14.6f)
                curveTo(14.7f, 19.4f, 14.8f, 19.8f, 15f, 20.2f)
                curveTo(15.9f, 21.9f, 18.1f, 22.5f, 19.7f, 21.6f)
                lineTo(20.8f, 22.7f)
                moveTo(10.5f, 18.5f)
                curveTo(10.5f, 19.3f, 9.8f, 20f, 9f, 20f)
                reflectiveCurveTo(7.5f, 19.3f, 7.5f, 18.5f)
                reflectiveCurveTo(8.2f, 17f, 9f, 17f)
                reflectiveCurveTo(10.5f, 17.7f, 10.5f, 18.5f)
                moveTo(18.1f, 20f)
                curveTo(17.2f, 20f, 16.5f, 19.3f, 16.5f, 18.5f)
                verticalLineTo(18.4f)
                lineTo(18.1f, 20f)
                close()
            }
        }.build()

        return _BabyCarriageOff!!
    }

@Suppress("ObjectPropertyName")
private var _BabyCarriageOff: ImageVector? = null
