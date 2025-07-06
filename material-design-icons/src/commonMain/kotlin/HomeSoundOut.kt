package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeSoundOut: ImageVector
    get() {
        if (_HomeSoundOut != null) {
            return _HomeSoundOut!!
        }
        _HomeSoundOut = ImageVector.Builder(
            name = "HomeSoundOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.404f, 7.012f)
                curveTo(2.475f, 4.395f, 4.454f, 2.416f, 7f, 2.416f)
                verticalLineTo(1.001f)
                curveTo(3.535f, 0.931f, 0.848f, 3.618f, 0.99f, 7.012f)
                lineTo(2.404f, 7.012f)
                close()
                moveTo(7f, 5.385f)
                verticalLineTo(3.971f)
                curveTo(5.232f, 4.042f, 3.959f, 5.315f, 3.959f, 7.012f)
                horizontalLineTo(5.374f)
                curveTo(5.515f, 6.163f, 6.151f, 5.527f, 7f, 5.385f)
                close()
                moveTo(17f, 2.416f)
                curveTo(19.546f, 2.416f, 21.525f, 4.395f, 21.596f, 7.012f)
                lineTo(23.01f, 7.012f)
                curveTo(23.152f, 3.618f, 20.465f, 0.931f, 17f, 1.001f)
                verticalLineTo(2.416f)
                close()
                moveTo(17f, 3.971f)
                verticalLineTo(5.385f)
                curveTo(17.848f, 5.527f, 18.485f, 6.163f, 18.626f, 7.012f)
                horizontalLineTo(20.041f)
                curveTo(20.041f, 5.315f, 18.768f, 4.042f, 17f, 3.971f)
                close()
                moveTo(19f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                lineTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _HomeSoundOut!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSoundOut: ImageVector? = null
