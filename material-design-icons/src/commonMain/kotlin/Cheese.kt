package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cheese: ImageVector
    get() {
        if (_Cheese != null) {
            return _Cheese!!
        }
        _Cheese = ImageVector.Builder(
            name = "Cheese",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17.5f)
                curveTo(11f, 16.67f, 11.67f, 16f, 12.5f, 16f)
                curveTo(12.79f, 16f, 13.06f, 16.09f, 13.29f, 16.23f)
                lineTo(20.75f, 11.93f)
                curveTo(20.35f, 11.22f, 19.9f, 10.55f, 19.41f, 9.9f)
                curveTo(19.29f, 9.96f, 19.15f, 10f, 19f, 10f)
                curveTo(18.45f, 10f, 18f, 9.55f, 18f, 9f)
                curveTo(18f, 8.8f, 18.08f, 8.62f, 18.18f, 8.46f)
                curveTo(16.45f, 6.64f, 14.34f, 5.2f, 12f, 4.25f)
                curveTo(11.85f, 5.24f, 11f, 6f, 10f, 6f)
                curveTo(8.9f, 6f, 8f, 5.11f, 8f, 4f)
                curveTo(8f, 3.72f, 8.06f, 3.45f, 8.16f, 3.21f)
                curveTo(7.3f, 3.08f, 6.41f, 3f, 5.5f, 3f)
                curveTo(5.33f, 3f, 5.17f, 3f, 5f, 3.03f)
                verticalLineTo(9.05f)
                curveTo(6.14f, 9.28f, 7f, 10.29f, 7f, 11.5f)
                reflectiveCurveTo(6.14f, 13.72f, 5f, 13.95f)
                verticalLineTo(21f)
                lineTo(11f, 17.54f)
                curveTo(11f, 17.53f, 11f, 17.5f, 11f, 17.5f)
                moveTo(14f, 9f)
                curveTo(15.11f, 9f, 16f, 9.9f, 16f, 11f)
                reflectiveCurveTo(15.11f, 13f, 14f, 13f)
                reflectiveCurveTo(12f, 12.11f, 12f, 11f)
                reflectiveCurveTo(12.9f, 9f, 14f, 9f)
                moveTo(9f, 16f)
                curveTo(8.45f, 16f, 8f, 15.55f, 8f, 15f)
                reflectiveCurveTo(8.45f, 14f, 9f, 14f)
                reflectiveCurveTo(10f, 14.45f, 10f, 15f)
                reflectiveCurveTo(9.55f, 16f, 9f, 16f)
                moveTo(9f, 10f)
                curveTo(8.45f, 10f, 8f, 9.55f, 8f, 9f)
                reflectiveCurveTo(8.45f, 8f, 9f, 8f)
                reflectiveCurveTo(10f, 8.45f, 10f, 9f)
                reflectiveCurveTo(9.55f, 10f, 9f, 10f)
                close()
            }
        }.build()

        return _Cheese!!
    }

@Suppress("ObjectPropertyName")
private var _Cheese: ImageVector? = null
