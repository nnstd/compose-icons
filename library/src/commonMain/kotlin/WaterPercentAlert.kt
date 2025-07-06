package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterPercentAlert: ImageVector
    get() {
        if (_WaterPercentAlert != null) {
            return _WaterPercentAlert!!
        }
        _WaterPercentAlert = ImageVector.Builder(
            name = "WaterPercentAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(18f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                moveTo(10f, 3.25f)
                curveTo(10f, 3.25f, 4f, 10f, 4f, 14f)
                curveTo(4f, 17.32f, 6.69f, 20f, 10f, 20f)
                reflectiveCurveTo(16f, 17.31f, 16f, 14f)
                curveTo(16f, 10f, 10f, 3.25f, 10f, 3.25f)
                moveTo(7.75f, 10f)
                curveTo(8.44f, 10f, 9f, 10.56f, 9f, 11.25f)
                reflectiveCurveTo(8.44f, 12.5f, 7.75f, 12.5f)
                reflectiveCurveTo(6.5f, 11.94f, 6.5f, 11.25f)
                reflectiveCurveTo(7.06f, 10f, 7.75f, 10f)
                moveTo(12.25f, 17f)
                curveTo(11.56f, 17f, 11f, 16.44f, 11f, 15.75f)
                reflectiveCurveTo(11.56f, 14.5f, 12.25f, 14.5f)
                reflectiveCurveTo(13.5f, 15.06f, 13.5f, 15.75f)
                reflectiveCurveTo(12.94f, 17f, 12.25f, 17f)
                moveTo(7.53f, 17.03f)
                lineTo(6.47f, 15.97f)
                lineTo(12.47f, 9.97f)
                lineTo(13.53f, 11.03f)
                lineTo(7.53f, 17.03f)
                close()
            }
        }.build()

        return _WaterPercentAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WaterPercentAlert: ImageVector? = null
