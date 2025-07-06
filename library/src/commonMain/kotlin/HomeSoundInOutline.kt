package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeSoundInOutline: ImageVector
    get() {
        if (_HomeSoundInOutline != null) {
            return _HomeSoundInOutline!!
        }
        _HomeSoundInOutline = ImageVector.Builder(
            name = "HomeSoundInOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.58f, 2f)
                curveTo(6.51f, 4.616f, 4.53f, 6.596f, 1.984f, 6.596f)
                verticalLineTo(8.01f)
                curveTo(5.449f, 8.081f, 8.136f, 5.394f, 7.995f, 2f)
                horizontalLineTo(6.58f)
                close()
                moveTo(1.984f, 3.626f)
                verticalLineTo(5.041f)
                curveTo(3.752f, 4.97f, 5.025f, 3.697f, 5.025f, 2f)
                horizontalLineTo(3.611f)
                curveTo(3.469f, 2.849f, 2.833f, 3.485f, 1.984f, 3.626f)
                close()
                moveTo(22.016f, 6.596f)
                curveTo(19.47f, 6.596f, 17.49f, 4.616f, 17.42f, 2f)
                horizontalLineTo(16.005f)
                curveTo(15.864f, 5.394f, 18.551f, 8.081f, 22.016f, 8.01f)
                verticalLineTo(6.596f)
                close()
                moveTo(22.016f, 5.041f)
                verticalLineTo(3.626f)
                curveTo(21.167f, 3.485f, 20.531f, 2.849f, 20.389f, 2f)
                horizontalLineTo(18.975f)
                curveTo(18.975f, 3.697f, 20.248f, 4.97f, 22.016f, 5.041f)
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
                moveTo(12f, 5.7f)
                lineTo(17f, 10.2f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(10.2f)
                lineTo(12f, 5.7f)
                close()
            }
        }.build()

        return _HomeSoundInOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSoundInOutline: ImageVector? = null
