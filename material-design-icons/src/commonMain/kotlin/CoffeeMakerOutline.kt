package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoffeeMakerOutline: ImageVector
    get() {
        if (_CoffeeMakerOutline != null) {
            return _CoffeeMakerOutline!!
        }
        _CoffeeMakerOutline = ImageVector.Builder(
            name = "CoffeeMakerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(15.97f)
                curveTo(17.2f, 19.09f, 18f, 17.64f, 18f, 16f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                curveTo(8f, 17.64f, 8.81f, 19.09f, 10.03f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                curveTo(8f, 6.55f, 8.45f, 7f, 9f, 7f)
                horizontalLineTo(17f)
                curveTo(17.55f, 7f, 18f, 6.55f, 18f, 6f)
                moveTo(10f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                curveTo(16f, 17.65f, 14.65f, 19f, 13f, 19f)
                reflectiveCurveTo(10f, 17.65f, 10f, 16f)
                moveTo(13f, 8f)
                curveTo(13.55f, 8f, 14f, 8.45f, 14f, 9f)
                reflectiveCurveTo(13.55f, 10f, 13f, 10f)
                reflectiveCurveTo(12f, 9.55f, 12f, 9f)
                reflectiveCurveTo(12.45f, 8f, 13f, 8f)
                close()
            }
        }.build()

        return _CoffeeMakerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeMakerOutline: ImageVector? = null
