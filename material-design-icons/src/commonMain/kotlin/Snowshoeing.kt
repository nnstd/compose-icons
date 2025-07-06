package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Snowshoeing: ImageVector
    get() {
        if (_Snowshoeing != null) {
            return _Snowshoeing!!
        }
        _Snowshoeing = ImageVector.Builder(
            name = "Snowshoeing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 3.5f)
                curveTo(12.5f, 2.4f, 13.4f, 1.5f, 14.5f, 1.5f)
                reflectiveCurveTo(16.5f, 2.4f, 16.5f, 3.5f)
                reflectiveCurveTo(15.6f, 5.5f, 14.5f, 5.5f)
                reflectiveCurveTo(12.5f, 4.6f, 12.5f, 3.5f)
                moveTo(6.32f, 19.03f)
                lineTo(5.18f, 17.56f)
                lineTo(4f, 18.5f)
                lineTo(6.38f, 21.54f)
                curveTo(6.89f, 22.19f, 7.54f, 22.69f, 8.26f, 22.95f)
                curveTo(8.54f, 23.05f, 8.79f, 23f, 9f, 22.84f)
                curveTo(9.28f, 22.61f, 9.4f, 22.14f, 9.1f, 21.77f)
                curveTo(9f, 21.67f, 8.9f, 21.6f, 8.79f, 21.55f)
                curveTo(8.36f, 21.37f, 7.97f, 21.1f, 7.65f, 20.72f)
                lineTo(7.57f, 20.62f)
                lineTo(11f, 18.2f)
                lineTo(11.89f, 15f)
                lineTo(14f, 17f)
                verticalLineTo(21.5f)
                horizontalLineTo(12f)
                verticalLineTo(23f)
                horizontalLineTo(15.87f)
                curveTo(16.69f, 23f, 17.5f, 22.79f, 18.13f, 22.39f)
                curveTo(18.39f, 22.23f, 18.5f, 22f, 18.5f, 21.75f)
                curveTo(18.5f, 21.37f, 18.2f, 21f, 17.73f, 21f)
                curveTo(17.6f, 21f, 17.47f, 21.04f, 17.36f, 21.1f)
                curveTo(16.96f, 21.33f, 16.5f, 21.47f, 16f, 21.5f)
                verticalLineTo(15.5f)
                lineTo(13.89f, 13.5f)
                lineTo(14.5f, 10.5f)
                curveTo(15.79f, 12f, 17.8f, 13f, 20f, 13f)
                verticalLineTo(11f)
                curveTo(18.1f, 11f, 16.5f, 10f, 15.69f, 8.58f)
                lineTo(14.69f, 7f)
                curveTo(14.29f, 6.4f, 13.69f, 6f, 13f, 6f)
                curveTo(12.24f, 6f, 11.58f, 6.34f, 7f, 8.28f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(9.58f)
                lineTo(10.79f, 8.88f)
                lineTo(9.2f, 17f)
                lineTo(6.32f, 19.03f)
                close()
            }
        }.build()

        return _Snowshoeing!!
    }

@Suppress("ObjectPropertyName")
private var _Snowshoeing: ImageVector? = null
