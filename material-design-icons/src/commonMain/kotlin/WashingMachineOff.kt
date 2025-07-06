package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WashingMachineOff: ImageVector
    get() {
        if (_WashingMachineOff != null) {
            return _WashingMachineOff!!
        }
        _WashingMachineOff = ImageVector.Builder(
            name = "WashingMachineOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4f, 5.89f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.58f, 22f, 19.1f, 21.75f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12f, 20f)
                curveTo(8.69f, 20f, 6f, 17.31f, 6f, 14f)
                curveTo(6f, 12.32f, 6.7f, 10.8f, 7.82f, 9.71f)
                lineTo(12.06f, 13.95f)
                lineTo(9.17f, 16.83f)
                curveTo(10.73f, 18.39f, 13.27f, 18.39f, 14.83f, 16.83f)
                curveTo(14.85f, 16.81f, 14.86f, 16.79f, 14.88f, 16.77f)
                lineTo(16.29f, 18.18f)
                curveTo(15.2f, 19.3f, 13.69f, 20f, 12f, 20f)
                moveTo(11.25f, 8.05f)
                curveTo(11.5f, 8f, 11.75f, 8f, 12f, 8f)
                curveTo(15.31f, 8f, 18f, 10.69f, 18f, 14f)
                curveTo(18f, 14.25f, 18f, 14.5f, 17.95f, 14.75f)
                lineTo(20f, 16.8f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.11f, 2f, 18f, 2f)
                horizontalLineTo(6f)
                curveTo(5.76f, 2f, 5.54f, 2.05f, 5.33f, 2.13f)
                lineTo(11.25f, 8.05f)
                moveTo(10f, 4f)
                curveTo(10.55f, 4f, 11f, 4.45f, 11f, 5f)
                reflectiveCurveTo(10.55f, 6f, 10f, 6f)
                reflectiveCurveTo(9f, 5.55f, 9f, 5f)
                reflectiveCurveTo(9.45f, 4f, 10f, 4f)
                close()
            }
        }.build()

        return _WashingMachineOff!!
    }

@Suppress("ObjectPropertyName")
private var _WashingMachineOff: ImageVector? = null
