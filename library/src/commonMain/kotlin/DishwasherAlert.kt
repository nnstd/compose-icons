package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DishwasherAlert: ImageVector
    get() {
        if (_DishwasherAlert != null) {
            return _DishwasherAlert!!
        }
        _DishwasherAlert = ImageVector.Builder(
            name = "DishwasherAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(16f)
                curveTo(17.11f, 22f, 18f, 21.11f, 18f, 20f)
                verticalLineTo(4f)
                curveTo(18f, 2.9f, 17.11f, 2f, 16f, 2f)
                moveTo(8f, 4f)
                curveTo(8.55f, 4f, 9f, 4.45f, 9f, 5f)
                reflectiveCurveTo(8.55f, 6f, 8f, 6f)
                reflectiveCurveTo(7f, 5.55f, 7f, 5f)
                reflectiveCurveTo(7.45f, 4f, 8f, 4f)
                moveTo(5f, 4f)
                curveTo(5.55f, 4f, 6f, 4.45f, 6f, 5f)
                reflectiveCurveTo(5.55f, 6f, 5f, 6f)
                reflectiveCurveTo(4f, 5.55f, 4f, 5f)
                reflectiveCurveTo(4.45f, 4f, 5f, 4f)
                moveTo(16f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                moveTo(12.67f, 15.33f)
                curveTo(12.69f, 16.03f, 12.41f, 16.71f, 11.91f, 17.21f)
                curveTo(10.86f, 18.26f, 9.15f, 18.27f, 8.09f, 17.21f)
                curveTo(7.59f, 16.71f, 7.31f, 16.03f, 7.33f, 15.33f)
                curveTo(7.4f, 14.62f, 7.63f, 13.94f, 8f, 13.33f)
                curveTo(8.37f, 12.5f, 8.81f, 11.73f, 9.33f, 11f)
                lineTo(10f, 10f)
                curveTo(11.79f, 12.59f, 12.67f, 14.36f, 12.67f, 15.33f)
                moveTo(20f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                moveTo(20f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _DishwasherAlert!!
    }

@Suppress("ObjectPropertyName")
private var _DishwasherAlert: ImageVector? = null
