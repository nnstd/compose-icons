package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SimpleIcons: ImageVector
    get() {
        if (_SimpleIcons != null) {
            return _SimpleIcons!!
        }
        _SimpleIcons = ImageVector.Builder(
            name = "SimpleIcons",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.25f, 17f)
                curveTo(18.25f, 17.88f, 18.07f, 18.74f, 17.71f, 19.53f)
                horizontalLineTo(16.31f)
                curveTo(17.71f, 17.15f, 16.91f, 14.09f, 14.53f, 12.69f)
                curveTo(13.76f, 12.24f, 12.89f, 12f, 12f, 12f)
                curveTo(9.24f, 12f, 7f, 9.76f, 7f, 7f)
                curveTo(7f, 4.24f, 9.24f, 2f, 12f, 2f)
                curveTo(14.76f, 2f, 17f, 4.24f, 17f, 7f)
                horizontalLineTo(15.75f)
                curveTo(15.75f, 4.93f, 14.07f, 3.25f, 12f, 3.25f)
                curveTo(9.93f, 3.25f, 8.25f, 4.93f, 8.25f, 7f)
                curveTo(8.25f, 9.07f, 9.93f, 10.75f, 12f, 10.75f)
                curveTo(15.45f, 10.75f, 18.25f, 13.56f, 18.25f, 17f)
                moveTo(6.29f, 19.53f)
                curveTo(5.93f, 18.74f, 5.75f, 17.87f, 5.75f, 17f)
                horizontalLineTo(7f)
                curveTo(7f, 17.93f, 7.25f, 18.79f, 7.69f, 19.53f)
                horizontalLineTo(6.29f)
                moveTo(18.25f, 20.75f)
                verticalLineTo(22f)
                horizontalLineTo(5.75f)
                verticalLineTo(20.75f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.75f)
                horizontalLineTo(8.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(15.75f)
                verticalLineTo(15.75f)
                horizontalLineTo(14.5f)
                verticalLineTo(20.75f)
                horizontalLineTo(18.25f)
                moveTo(13.25f, 15.75f)
                horizontalLineTo(10.75f)
                verticalLineTo(20.75f)
                horizontalLineTo(13.25f)
                verticalLineTo(15.75f)
                moveTo(14.44f, 7.07f)
                curveTo(14.4f, 8.4f, 13.33f, 9.47f, 12f, 9.5f)
                curveTo(10.62f, 9.46f, 9.53f, 8.32f, 9.57f, 6.94f)
                curveTo(9.6f, 5.61f, 10.67f, 4.53f, 12f, 4.5f)
                curveTo(13.38f, 4.54f, 14.47f, 5.68f, 14.44f, 7.07f)
                moveTo(13.25f, 7f)
                curveTo(13.25f, 6.31f, 12.69f, 5.75f, 12f, 5.75f)
                curveTo(11.31f, 5.75f, 10.75f, 6.31f, 10.75f, 7f)
                curveTo(10.75f, 7.69f, 11.31f, 8.25f, 12f, 8.25f)
                curveTo(12.69f, 8.25f, 13.25f, 7.69f, 13.25f, 7f)
                close()
            }
        }.build()

        return _SimpleIcons!!
    }

@Suppress("ObjectPropertyName")
private var _SimpleIcons: ImageVector? = null
