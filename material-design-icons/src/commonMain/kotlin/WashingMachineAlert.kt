package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WashingMachineAlert: ImageVector
    get() {
        if (_WashingMachineAlert != null) {
            return _WashingMachineAlert!!
        }
        _WashingMachineAlert = ImageVector.Builder(
            name = "WashingMachineAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.83f, 11.17f)
                curveTo(14.39f, 12.73f, 14.39f, 15.27f, 12.83f, 16.83f)
                reflectiveCurveTo(8.73f, 18.39f, 7.17f, 16.83f)
                lineTo(12.83f, 11.17f)
                moveTo(4f, 2f)
                horizontalLineTo(16f)
                curveTo(17.11f, 2f, 18f, 2.9f, 18f, 4f)
                verticalLineTo(20f)
                curveTo(18f, 21.11f, 17.11f, 22f, 16f, 22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                moveTo(5f, 4f)
                curveTo(4.45f, 4f, 4f, 4.45f, 4f, 5f)
                reflectiveCurveTo(4.45f, 6f, 5f, 6f)
                reflectiveCurveTo(6f, 5.55f, 6f, 5f)
                reflectiveCurveTo(5.55f, 4f, 5f, 4f)
                moveTo(8f, 4f)
                curveTo(7.45f, 4f, 7f, 4.45f, 7f, 5f)
                reflectiveCurveTo(7.45f, 6f, 8f, 6f)
                reflectiveCurveTo(9f, 5.55f, 9f, 5f)
                reflectiveCurveTo(8.55f, 4f, 8f, 4f)
                moveTo(10f, 8f)
                curveTo(6.69f, 8f, 4f, 10.69f, 4f, 14f)
                reflectiveCurveTo(6.69f, 20f, 10f, 20f)
                reflectiveCurveTo(16f, 17.31f, 16f, 14f)
                reflectiveCurveTo(13.31f, 8f, 10f, 8f)
                moveTo(20f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                moveTo(20f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _WashingMachineAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WashingMachineAlert: ImageVector? = null
