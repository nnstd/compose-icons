package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterBoilerOff: ImageVector
    get() {
        if (_WaterBoilerOff != null) {
            return _WaterBoilerOff!!
        }
        _WaterBoilerOff = ImageVector.Builder(
            name = "WaterBoilerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 6.82f)
                lineTo(6.25f, 3.05f)
                curveTo(6.59f, 2.42f, 7.24f, 2f, 8f, 2f)
                horizontalLineTo(16f)
                curveTo(17.11f, 2f, 18f, 2.89f, 18f, 4f)
                verticalLineTo(14.8f)
                lineTo(12.16f, 8.96f)
                curveTo(13.19f, 8.87f, 14f, 8f, 14f, 6.97f)
                curveTo(14f, 5.87f, 13.11f, 4.97f, 12f, 4.97f)
                curveTo(10.95f, 4.97f, 10.1f, 5.78f, 10f, 6.82f)
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                curveTo(13.89f, 22f, 13f, 21.11f, 13f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                curveTo(11f, 21.11f, 10.11f, 22f, 9f, 22f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.89f, 18f, 6f, 17.11f, 6f, 16f)
                verticalLineTo(7.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(16.1f, 18f)
                curveTo(16.06f, 18f, 16.03f, 18f, 16f, 18f)
                horizontalLineTo(15f)
                moveTo(14f, 16f)
                verticalLineTo(15.89f)
                lineTo(12.61f, 14.5f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _WaterBoilerOff!!
    }

@Suppress("ObjectPropertyName")
private var _WaterBoilerOff: ImageVector? = null
