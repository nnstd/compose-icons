package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WheelBarrow: ImageVector
    get() {
        if (_WheelBarrow != null) {
            return _WheelBarrow!!
        }
        _WheelBarrow = ImageVector.Builder(
            name = "WheelBarrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15.5f)
                curveTo(18.83f, 15.5f, 19.5f, 16.17f, 19.5f, 17f)
                reflectiveCurveTo(18.83f, 18.5f, 18f, 18.5f)
                reflectiveCurveTo(16.5f, 17.83f, 16.5f, 17f)
                reflectiveCurveTo(17.17f, 15.5f, 18f, 15.5f)
                moveTo(18f, 14f)
                curveTo(16.34f, 14f, 15f, 15.34f, 15f, 17f)
                reflectiveCurveTo(16.34f, 20f, 18f, 20f)
                curveTo(19.66f, 20f, 21f, 18.66f, 21f, 17f)
                reflectiveCurveTo(19.66f, 14f, 18f, 14f)
                moveTo(7f, 8f)
                lineTo(5f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(5.13f)
                lineTo(8f, 11.3f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                lineTo(12.57f, 15f)
                horizontalLineTo(14.55f)
                curveTo(15.25f, 13.81f, 16.5f, 13f, 18f, 13f)
                curveTo(18.88f, 13f, 19.69f, 13.29f, 20.35f, 13.78f)
                lineTo(22f, 8f)
                horizontalLineTo(7f)
                moveTo(9.39f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(12.8f)
                lineTo(9.87f, 14.11f)
                curveTo(10.23f, 14.64f, 10.82f, 14.96f, 11.45f, 15f)
                lineTo(9.39f, 19f)
                close()
            }
        }.build()

        return _WheelBarrow!!
    }

@Suppress("ObjectPropertyName")
private var _WheelBarrow: ImageVector? = null
