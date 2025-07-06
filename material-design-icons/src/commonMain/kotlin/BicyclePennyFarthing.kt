package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BicyclePennyFarthing: ImageVector
    get() {
        if (_BicyclePennyFarthing != null) {
            return _BicyclePennyFarthing!!
        }
        _BicyclePennyFarthing = ImageVector.Builder(
            name = "BicyclePennyFarthing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 5.06f)
                verticalLineTo(2f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(13.5f)
                verticalLineTo(5.04f)
                curveTo(12.71f, 5.11f, 11.94f, 5.27f, 11.2f, 5.5f)
                curveTo(11.03f, 5.2f, 10.72f, 5f, 10.36f, 5f)
                horizontalLineTo(7f)
                curveTo(6.45f, 5f, 6f, 5.45f, 6f, 6f)
                reflectiveCurveTo(6.45f, 7f, 7f, 7f)
                horizontalLineTo(8.05f)
                curveTo(5.09f, 9f, 3.12f, 12.36f, 3f, 16.18f)
                curveTo(1.85f, 16.59f, 1f, 17.69f, 1f, 19f)
                curveTo(1f, 20.66f, 2.34f, 22f, 4f, 22f)
                reflectiveCurveTo(7f, 20.66f, 7f, 19f)
                curveTo(7f, 17.7f, 6.17f, 16.61f, 5f, 16.19f)
                curveTo(5.07f, 14.67f, 5.46f, 13.25f, 6.14f, 12f)
                curveTo(6.05f, 12.5f, 6f, 13f, 6f, 13.5f)
                curveTo(6f, 18.19f, 9.81f, 22f, 14.5f, 22f)
                curveTo(19.19f, 22f, 23f, 18.19f, 23f, 13.5f)
                curveTo(23f, 9.14f, 19.72f, 5.56f, 15.5f, 5.06f)
                moveTo(4f, 20f)
                curveTo(3.45f, 20f, 3f, 19.55f, 3f, 19f)
                reflectiveCurveTo(3.45f, 18f, 4f, 18f)
                reflectiveCurveTo(5f, 18.45f, 5f, 19f)
                reflectiveCurveTo(4.55f, 20f, 4f, 20f)
                moveTo(14.5f, 20f)
                curveTo(10.92f, 20f, 8f, 17.08f, 8f, 13.5f)
                curveTo(8f, 10.26f, 10.39f, 7.57f, 13.5f, 7.09f)
                verticalLineTo(15f)
                horizontalLineTo(15.5f)
                verticalLineTo(7.09f)
                curveTo(18.61f, 7.57f, 21f, 10.26f, 21f, 13.5f)
                curveTo(21f, 17.08f, 18.08f, 20f, 14.5f, 20f)
                close()
            }
        }.build()

        return _BicyclePennyFarthing!!
    }

@Suppress("ObjectPropertyName")
private var _BicyclePennyFarthing: ImageVector? = null
