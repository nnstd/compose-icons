package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoffeeMakerCheck: ImageVector
    get() {
        if (_CoffeeMakerCheck != null) {
            return _CoffeeMakerCheck!!
        }
        _CoffeeMakerCheck = ImageVector.Builder(
            name = "CoffeeMakerCheck",
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
                moveTo(13f, 18f)
                curveTo(13f, 15.78f, 14.21f, 13.85f, 16f, 12.81f)
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
                curveTo(13.58f, 20.94f, 13f, 19.54f, 13f, 18f)
                moveTo(10f, 9f)
                curveTo(10f, 9.55f, 10.45f, 10f, 11f, 10f)
                reflectiveCurveTo(12f, 9.55f, 12f, 9f)
                reflectiveCurveTo(11.55f, 8f, 11f, 8f)
                reflectiveCurveTo(10f, 8.45f, 10f, 9f)
                close()
            }
        }.build()

        return _CoffeeMakerCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeMakerCheck: ImageVector? = null
