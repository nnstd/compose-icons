package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppleIcloud: ImageVector
    get() {
        if (_AppleIcloud != null) {
            return _AppleIcloud!!
        }
        _AppleIcloud = ImageVector.Builder(
            name = "AppleIcloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15.04f)
                curveTo(22f, 17.23f, 20.24f, 19f, 18.07f, 19f)
                horizontalLineTo(5.93f)
                curveTo(3.76f, 19f, 2f, 17.23f, 2f, 15.04f)
                curveTo(2f, 13.07f, 3.43f, 11.44f, 5.31f, 11.14f)
                curveTo(5.28f, 11f, 5.27f, 10.86f, 5.27f, 10.71f)
                curveTo(5.27f, 9.33f, 6.38f, 8.2f, 7.76f, 8.2f)
                curveTo(8.37f, 8.2f, 8.94f, 8.43f, 9.37f, 8.8f)
                curveTo(10.14f, 7.05f, 11.13f, 5.44f, 13.91f, 5.44f)
                curveTo(17.28f, 5.44f, 18.87f, 8.06f, 18.87f, 10.83f)
                curveTo(18.87f, 10.94f, 18.87f, 11.06f, 18.86f, 11.17f)
                curveTo(20.65f, 11.54f, 22f, 13.13f, 22f, 15.04f)
                close()
            }
        }.build()

        return _AppleIcloud!!
    }

@Suppress("ObjectPropertyName")
private var _AppleIcloud: ImageVector? = null
