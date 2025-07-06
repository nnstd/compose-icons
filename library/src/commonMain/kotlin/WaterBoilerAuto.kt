package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterBoilerAuto: ImageVector
    get() {
        if (_WaterBoilerAuto != null) {
            return _WaterBoilerAuto!!
        }
        _WaterBoilerAuto = ImageVector.Builder(
            name = "WaterBoilerAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(16f)
                curveTo(2f, 17.11f, 2.89f, 18f, 4f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                curveTo(6.11f, 22f, 7f, 21.11f, 7f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                curveTo(9f, 21.11f, 9.89f, 22f, 11f, 22f)
                horizontalLineTo(13f)
                lineTo(13.75f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                curveTo(13.11f, 18f, 14f, 17.11f, 14f, 16f)
                verticalLineTo(4f)
                curveTo(14f, 2.89f, 13.11f, 2f, 12f, 2f)
                horizontalLineTo(4f)
                moveTo(8f, 4.97f)
                curveTo(9.11f, 4.97f, 10f, 5.87f, 10f, 6.97f)
                reflectiveCurveTo(9.11f, 8.97f, 8f, 8.97f)
                curveTo(6.9f, 8.97f, 6f, 8.07f, 6f, 6.97f)
                curveTo(6f, 5.87f, 6.9f, 4.97f, 8f, 4.97f)
                moveTo(6f, 14.5f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(14.5f)
                moveTo(19.8f, 13f)
                horizontalLineTo(17.8f)
                lineTo(14.6f, 22f)
                horizontalLineTo(16.5f)
                lineTo(17.2f, 20f)
                horizontalLineTo(20.4f)
                lineTo(21.1f, 22f)
                horizontalLineTo(23f)
                lineTo(19.8f, 13f)
                moveTo(17.6f, 18.7f)
                lineTo(18.8f, 15f)
                lineTo(20f, 18.7f)
                horizontalLineTo(17.6f)
                close()
            }
        }.build()

        return _WaterBoilerAuto!!
    }

@Suppress("ObjectPropertyName")
private var _WaterBoilerAuto: ImageVector? = null
