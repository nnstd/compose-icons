package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DishwasherOff: ImageVector
    get() {
        if (_DishwasherOff != null) {
            return _DishwasherOff!!
        }
        _DishwasherOff = ImageVector.Builder(
            name = "DishwasherOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4f, 5.89f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.58f, 22f, 19.1f, 21.75f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(6.11f)
                lineTo(10.5f, 12.37f)
                curveTo(10.31f, 12.69f, 10.15f, 13f, 10f, 13.33f)
                curveTo(9.63f, 13.94f, 9.4f, 14.62f, 9.33f, 15.33f)
                curveTo(9.31f, 16.03f, 9.59f, 16.71f, 10.09f, 17.21f)
                curveTo(11.15f, 18.27f, 12.86f, 18.26f, 13.91f, 17.21f)
                curveTo(14.16f, 16.97f, 14.35f, 16.68f, 14.5f, 16.36f)
                lineTo(18f, 19.89f)
                verticalLineTo(20f)
                moveTo(11.2f, 8f)
                horizontalLineTo(18f)
                verticalLineTo(14.8f)
                lineTo(20f, 16.8f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.11f, 2f, 18f, 2f)
                horizontalLineTo(6f)
                curveTo(5.76f, 2f, 5.54f, 2.05f, 5.33f, 2.13f)
                lineTo(11.2f, 8f)
                moveTo(10f, 4f)
                curveTo(10.55f, 4f, 11f, 4.45f, 11f, 5f)
                reflectiveCurveTo(10.55f, 6f, 10f, 6f)
                reflectiveCurveTo(9f, 5.55f, 9f, 5f)
                reflectiveCurveTo(9.45f, 4f, 10f, 4f)
                close()
            }
        }.build()

        return _DishwasherOff!!
    }

@Suppress("ObjectPropertyName")
private var _DishwasherOff: ImageVector? = null
