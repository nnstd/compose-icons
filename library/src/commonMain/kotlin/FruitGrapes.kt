package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FruitGrapes: ImageVector
    get() {
        if (_FruitGrapes != null) {
            return _FruitGrapes!!
        }
        _FruitGrapes = ImageVector.Builder(
            name = "FruitGrapes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                curveTo(14f, 13.1f, 13.1f, 14f, 12f, 14f)
                reflectiveCurveTo(10f, 13.1f, 10f, 12f)
                reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                moveTo(7f, 10f)
                curveTo(5.9f, 10f, 5f, 10.9f, 5f, 12f)
                reflectiveCurveTo(5.9f, 14f, 7f, 14f)
                reflectiveCurveTo(9f, 13.1f, 9f, 12f)
                reflectiveCurveTo(8.1f, 10f, 7f, 10f)
                moveTo(17f, 10f)
                curveTo(15.9f, 10f, 15f, 10.9f, 15f, 12f)
                reflectiveCurveTo(15.9f, 14f, 17f, 14f)
                reflectiveCurveTo(19f, 13.1f, 19f, 12f)
                reflectiveCurveTo(18.1f, 10f, 17f, 10f)
                moveTo(14.5f, 6f)
                curveTo(13.4f, 6f, 12.5f, 6.9f, 12.5f, 8f)
                reflectiveCurveTo(13.4f, 10f, 14.5f, 10f)
                reflectiveCurveTo(16.5f, 9.1f, 16.5f, 8f)
                reflectiveCurveTo(15.6f, 6f, 14.5f, 6f)
                moveTo(9.5f, 6f)
                curveTo(8.4f, 6f, 7.5f, 6.9f, 7.5f, 8f)
                reflectiveCurveTo(8.4f, 10f, 9.5f, 10f)
                reflectiveCurveTo(11.5f, 9.1f, 11.5f, 8f)
                reflectiveCurveTo(10.6f, 6f, 9.5f, 6f)
                moveTo(14.5f, 14f)
                curveTo(13.4f, 14f, 12.5f, 14.9f, 12.5f, 16f)
                reflectiveCurveTo(13.4f, 18f, 14.5f, 18f)
                reflectiveCurveTo(16.5f, 17.1f, 16.5f, 16f)
                reflectiveCurveTo(15.6f, 14f, 14.5f, 14f)
                moveTo(9.5f, 14f)
                curveTo(8.4f, 14f, 7.5f, 14.9f, 7.5f, 16f)
                reflectiveCurveTo(8.4f, 18f, 9.5f, 18f)
                reflectiveCurveTo(11.5f, 17.1f, 11.5f, 16f)
                reflectiveCurveTo(10.6f, 14f, 9.5f, 14f)
                moveTo(12f, 18f)
                curveTo(10.9f, 18f, 10f, 18.9f, 10f, 20f)
                reflectiveCurveTo(10.9f, 22f, 12f, 22f)
                reflectiveCurveTo(14f, 21.1f, 14f, 20f)
                reflectiveCurveTo(13.1f, 18f, 12f, 18f)
                moveTo(14.4f, 2.2f)
                lineTo(13.6f, 1f)
                curveTo(11.4f, 2f, 11.2f, 5.6f, 11.2f, 6f)
                horizontalLineTo(12.7f)
                curveTo(12.8f, 5.2f, 13.1f, 2.7f, 14.4f, 2.2f)
                close()
            }
        }.build()

        return _FruitGrapes!!
    }

@Suppress("ObjectPropertyName")
private var _FruitGrapes: ImageVector? = null
