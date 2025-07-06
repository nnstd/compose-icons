package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarArrowRight: ImageVector
    get() {
        if (_CarArrowRight != null) {
            return _CarArrowRight!!
        }
        _CarArrowRight = ImageVector.Builder(
            name = "CarArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveTo(12f, 14.69f, 14.69f, 12f, 18f, 12f)
                curveTo(19.09f, 12f, 20.12f, 12.3f, 21f, 12.81f)
                verticalLineTo(12f)
                lineTo(18.92f, 6f)
                curveTo(18.72f, 5.42f, 18.16f, 5f, 17.5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 5f, 5.28f, 5.42f, 5.08f, 6f)
                lineTo(3f, 12f)
                verticalLineTo(20f)
                curveTo(3f, 20.55f, 3.45f, 21f, 4f, 21f)
                horizontalLineTo(5f)
                curveTo(5.55f, 21f, 6f, 20.55f, 6f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(12.09f)
                curveTo(12.04f, 18.67f, 12f, 18.34f, 12f, 18f)
                moveTo(6.5f, 6.5f)
                horizontalLineTo(17.5f)
                lineTo(19f, 11f)
                horizontalLineTo(5f)
                lineTo(6.5f, 6.5f)
                moveTo(6.5f, 16f)
                curveTo(5.67f, 16f, 5f, 15.33f, 5f, 14.5f)
                reflectiveCurveTo(5.67f, 13f, 6.5f, 13f)
                reflectiveCurveTo(8f, 13.67f, 8f, 14.5f)
                reflectiveCurveTo(7.33f, 16f, 6.5f, 16f)
                moveTo(19f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                lineTo(22f, 18f)
                lineTo(19f, 21f)
            }
        }.build()

        return _CarArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _CarArrowRight: ImageVector? = null
