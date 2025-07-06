package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FruitCherries: ImageVector
    get() {
        if (_FruitCherries != null) {
            return _FruitCherries!!
        }
        _FruitCherries = ImageVector.Builder(
            name = "FruitCherries",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13f)
                horizontalLineTo(15.5f)
                curveTo(14.8f, 11.7f, 14.3f, 10f, 13.8f, 8.3f)
                lineTo(14.7f, 9.2f)
                curveTo(17.4f, 11.3f, 19.8f, 10.9f, 19.8f, 10.9f)
                reflectiveCurveTo(20.5f, 7.1f, 17.8f, 5.1f)
                curveTo(15.5f, 3.3f, 13.4f, 3.3f, 12.8f, 3.4f)
                curveTo(12.7f, 2.8f, 12.7f, 2.3f, 12.6f, 1.9f)
                lineTo(11.2f, 2f)
                curveTo(11.2f, 5.2f, 8.5f, 11.1f, 7.6f, 13f)
                curveTo(5.6f, 13.2f, 4f, 14.9f, 4f, 17f)
                curveTo(4f, 19.2f, 5.8f, 21f, 8f, 21f)
                curveTo(9.1f, 21f, 10f, 20.6f, 10.7f, 19.9f)
                curveTo(10.3f, 19f, 10f, 18f, 10f, 17f)
                reflectiveCurveTo(10.3f, 15f, 10.7f, 14.1f)
                curveTo(10.3f, 13.7f, 9.7f, 13.4f, 9.2f, 13.2f)
                curveTo(9.9f, 11.7f, 11.1f, 9f, 11.9f, 6.4f)
                curveTo(12.3f, 8.7f, 13.1f, 11.4f, 14.1f, 13.5f)
                curveTo(12.9f, 14.2f, 12f, 15.5f, 12f, 17f)
                curveTo(12f, 19.2f, 13.8f, 21f, 16f, 21f)
                reflectiveCurveTo(20f, 19.2f, 20f, 17f)
                reflectiveCurveTo(18.2f, 13f, 16f, 13f)
                moveTo(8f, 15.5f)
                curveTo(7.2f, 15.5f, 6.5f, 16.2f, 6.5f, 17f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 15.6f, 6.6f, 14.5f, 8f, 14.5f)
                verticalLineTo(15.5f)
                moveTo(16f, 15.5f)
                curveTo(15.2f, 15.5f, 14.5f, 16.2f, 14.5f, 17f)
                horizontalLineTo(13.5f)
                curveTo(13.5f, 15.6f, 14.6f, 14.5f, 16f, 14.5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _FruitCherries!!
    }

@Suppress("ObjectPropertyName")
private var _FruitCherries: ImageVector? = null
