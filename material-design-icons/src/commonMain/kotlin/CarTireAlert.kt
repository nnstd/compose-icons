package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarTireAlert: ImageVector
    get() {
        if (_CarTireAlert != null) {
            return _CarTireAlert!!
        }
        _CarTireAlert = ImageVector.Builder(
            name = "CarTireAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(11f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                moveTo(17f, 4.76f)
                curveTo(18.86f, 6.19f, 20f, 8.61f, 20f, 11f)
                curveTo(20f, 14f, 18.33f, 16.64f, 15.86f, 18f)
                horizontalLineTo(8.14f)
                curveTo(5.67f, 16.64f, 4f, 14f, 4f, 11f)
                curveTo(4f, 8.61f, 5.09f, 6.17f, 7f, 4.76f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(3.86f)
                curveTo(3.15f, 5.68f, 2f, 8.2f, 2f, 11f)
                curveTo(2f, 13.8f, 3.15f, 16.32f, 5f, 18.14f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(18.14f)
                curveTo(20.85f, 16.32f, 22f, 13.8f, 22f, 11f)
                curveTo(22f, 8.2f, 20.85f, 5.68f, 19f, 3.86f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                verticalLineTo(4.76f)
                close()
            }
        }.build()

        return _CarTireAlert!!
    }

@Suppress("ObjectPropertyName")
private var _CarTireAlert: ImageVector? = null
