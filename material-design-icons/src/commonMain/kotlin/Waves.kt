package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Waves: ImageVector
    get() {
        if (_Waves != null) {
            return _Waves!!
        }
        _Waves = ImageVector.Builder(
            name = "Waves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                curveTo(18.62f, 14f, 17.26f, 13.65f, 16f, 13f)
                curveTo(13.5f, 14.3f, 10.5f, 14.3f, 8f, 13f)
                curveTo(6.74f, 13.65f, 5.37f, 14f, 4f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                curveTo(5.39f, 12f, 6.78f, 11.53f, 8f, 10.67f)
                curveTo(10.44f, 12.38f, 13.56f, 12.38f, 16f, 10.67f)
                curveTo(17.22f, 11.53f, 18.61f, 12f, 20f, 12f)
                moveTo(20f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                curveTo(18.62f, 8f, 17.26f, 7.65f, 16f, 7f)
                curveTo(13.5f, 8.3f, 10.5f, 8.3f, 8f, 7f)
                curveTo(6.74f, 7.65f, 5.37f, 8f, 4f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                curveTo(5.39f, 6f, 6.78f, 5.53f, 8f, 4.67f)
                curveTo(10.44f, 6.38f, 13.56f, 6.38f, 16f, 4.67f)
                curveTo(17.22f, 5.53f, 18.61f, 6f, 20f, 6f)
                moveTo(20f, 18f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                curveTo(18.62f, 20f, 17.26f, 19.65f, 16f, 19f)
                curveTo(13.5f, 20.3f, 10.5f, 20.3f, 8f, 19f)
                curveTo(6.74f, 19.65f, 5.37f, 20f, 4f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                curveTo(5.39f, 18f, 6.78f, 17.53f, 8f, 16.67f)
                curveTo(10.44f, 18.38f, 13.56f, 18.38f, 16f, 16.67f)
                curveTo(17.22f, 17.53f, 18.61f, 18f, 20f, 18f)
                close()
            }
        }.build()

        return _Waves!!
    }

@Suppress("ObjectPropertyName")
private var _Waves: ImageVector? = null
