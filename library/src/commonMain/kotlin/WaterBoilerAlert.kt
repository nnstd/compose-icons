package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterBoilerAlert: ImageVector
    get() {
        if (_WaterBoilerAlert != null) {
            return _WaterBoilerAlert!!
        }
        _WaterBoilerAlert = ImageVector.Builder(
            name = "WaterBoilerAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(16f)
                curveTo(4f, 17.11f, 4.89f, 18f, 6f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                curveTo(8.11f, 22f, 9f, 21.11f, 9f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                curveTo(11f, 21.11f, 11.89f, 22f, 13f, 22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                curveTo(15.11f, 18f, 16f, 17.11f, 16f, 16f)
                verticalLineTo(4f)
                curveTo(16f, 2.89f, 15.11f, 2f, 14f, 2f)
                horizontalLineTo(6f)
                moveTo(10f, 4.97f)
                curveTo(11.11f, 4.97f, 12f, 5.87f, 12f, 6.97f)
                reflectiveCurveTo(11.11f, 8.97f, 10f, 8.97f)
                curveTo(8.9f, 8.97f, 8f, 8.07f, 8f, 6.97f)
                curveTo(8f, 5.87f, 8.9f, 4.97f, 10f, 4.97f)
                moveTo(8f, 14.5f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(14.5f)
                moveTo(18f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                moveTo(18f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _WaterBoilerAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WaterBoilerAlert: ImageVector? = null
