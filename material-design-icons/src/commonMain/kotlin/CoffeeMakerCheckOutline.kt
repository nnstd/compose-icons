package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoffeeMakerCheckOutline: ImageVector
    get() {
        if (_CoffeeMakerCheckOutline != null) {
            return _CoffeeMakerCheckOutline!!
        }
        _CoffeeMakerCheckOutline = ImageVector.Builder(
            name = "CoffeeMakerCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.75f, 21.16f)
                lineTo(15f, 18.16f)
                lineTo(16.16f, 17f)
                lineTo(17.75f, 18.59f)
                lineTo(21.34f, 15f)
                lineTo(22.5f, 16.41f)
                lineTo(17.75f, 21.16f)
                moveTo(13f, 18.21f)
                curveTo(12.5f, 18.7f, 11.78f, 19f, 11f, 19f)
                curveTo(9.35f, 19f, 8f, 17.65f, 8f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(14.69f)
                curveTo(14.5f, 13.92f, 15.2f, 13.27f, 16f, 12.81f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.64f, 6.81f, 19.09f, 8.03f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                curveTo(6f, 6.55f, 6.45f, 7f, 7f, 7f)
                horizontalLineTo(15f)
                curveTo(15.55f, 7f, 16f, 6.55f, 16f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(14.54f)
                curveTo(13.63f, 21f, 13.06f, 19.67f, 13f, 18.21f)
                moveTo(10f, 9f)
                curveTo(10f, 9.55f, 10.45f, 10f, 11f, 10f)
                reflectiveCurveTo(12f, 9.55f, 12f, 9f)
                reflectiveCurveTo(11.55f, 8f, 11f, 8f)
                reflectiveCurveTo(10f, 8.45f, 10f, 9f)
                close()
            }
        }.build()

        return _CoffeeMakerCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeMakerCheckOutline: ImageVector? = null
