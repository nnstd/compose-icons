package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShoppingSearchOutline: ImageVector
    get() {
        if (_ShoppingSearchOutline != null) {
            return _ShoppingSearchOutline!!
        }
        _ShoppingSearchOutline = ImageVector.Builder(
            name = "ShoppingSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.31f, 18.9f)
                curveTo(20.64f, 16.8f, 20f, 14f, 17.91f, 12.69f)
                reflectiveCurveTo(13.03f, 12f, 11.7f, 14.1f)
                reflectiveCurveTo(11f, 19f, 13.1f, 20.3f)
                curveTo(14.56f, 21.22f, 16.42f, 21.23f, 17.88f, 20.32f)
                lineTo(21f, 23.39f)
                lineTo(22.39f, 22f)
                moveTo(15.5f, 19f)
                curveTo(14.12f, 19f, 13f, 17.88f, 13f, 16.5f)
                reflectiveCurveTo(14.12f, 14f, 15.5f, 14f)
                reflectiveCurveTo(18f, 15.12f, 18f, 16.5f)
                reflectiveCurveTo(16.88f, 19f, 15.5f, 19f)
                moveTo(10.03f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(11.03f)
                curveTo(19.81f, 11.55f, 20.5f, 12.24f, 21f, 13.05f)
                verticalLineTo(8f)
                curveTo(21f, 6.9f, 20.1f, 6f, 19f, 6f)
                horizontalLineTo(17f)
                curveTo(17f, 3.2f, 14.8f, 1f, 12f, 1f)
                reflectiveCurveTo(7f, 3.2f, 7f, 6f)
                horizontalLineTo(5f)
                curveTo(3.9f, 6f, 3f, 6.9f, 3f, 8f)
                verticalLineTo(20f)
                curveTo(3f, 21.1f, 3.9f, 22f, 5f, 22f)
                horizontalLineTo(12.05f)
                curveTo(11.24f, 21.5f, 10.55f, 20.81f, 10.03f, 20f)
                moveTo(12f, 3f)
                curveTo(13.7f, 3f, 15f, 4.3f, 15f, 6f)
                horizontalLineTo(9f)
                curveTo(9f, 4.3f, 10.3f, 3f, 12f, 3f)
                moveTo(15f, 9f)
                horizontalLineTo(17f)
                curveTo(17f, 9.4f, 16.95f, 9.78f, 16.86f, 10.15f)
                curveTo(16.42f, 10.05f, 15.97f, 10f, 15.5f, 10f)
                curveTo(15.27f, 10f, 15.04f, 10f, 14.82f, 10.04f)
                curveTo(14.93f, 9.71f, 15f, 9.37f, 15f, 9f)
                moveTo(9.76f, 13.46f)
                curveTo(8.12f, 12.65f, 7f, 11f, 7f, 9f)
                horizontalLineTo(9f)
                curveTo(9f, 10.34f, 9.82f, 11.42f, 11f, 11.82f)
                curveTo(10.5f, 12.3f, 10.08f, 12.85f, 9.76f, 13.46f)
                close()
            }
        }.build()

        return _ShoppingSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingSearchOutline: ImageVector? = null
