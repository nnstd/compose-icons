package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockReset: ImageVector
    get() {
        if (_LockReset != null) {
            return _LockReset!!
        }
        _LockReset = ImageVector.Builder(
            name = "LockReset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.63f, 2f)
                curveTo(18.16f, 2f, 22.64f, 6.5f, 22.64f, 12f)
                curveTo(22.64f, 17.5f, 18.16f, 22f, 12.63f, 22f)
                curveTo(9.12f, 22f, 6.05f, 20.18f, 4.26f, 17.43f)
                lineTo(5.84f, 16.18f)
                curveTo(7.25f, 18.47f, 9.76f, 20f, 12.64f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.64f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.64f, 4f)
                curveTo(8.56f, 4f, 5.2f, 7.06f, 4.71f, 11f)
                horizontalLineTo(7.47f)
                lineTo(3.73f, 14.73f)
                lineTo(0f, 11f)
                horizontalLineTo(2.69f)
                curveTo(3.19f, 5.95f, 7.45f, 2f, 12.63f, 2f)
                moveTo(15.59f, 10.24f)
                curveTo(16.09f, 10.25f, 16.5f, 10.65f, 16.5f, 11.16f)
                verticalLineTo(15.77f)
                curveTo(16.5f, 16.27f, 16.09f, 16.69f, 15.58f, 16.69f)
                horizontalLineTo(10.05f)
                curveTo(9.54f, 16.69f, 9.13f, 16.27f, 9.13f, 15.77f)
                verticalLineTo(11.16f)
                curveTo(9.13f, 10.65f, 9.54f, 10.25f, 10.04f, 10.24f)
                verticalLineTo(9.23f)
                curveTo(10.04f, 7.7f, 11.29f, 6.46f, 12.81f, 6.46f)
                curveTo(14.34f, 6.46f, 15.59f, 7.7f, 15.59f, 9.23f)
                verticalLineTo(10.24f)
                moveTo(12.81f, 7.86f)
                curveTo(12.06f, 7.86f, 11.44f, 8.47f, 11.44f, 9.23f)
                verticalLineTo(10.24f)
                horizontalLineTo(14.19f)
                verticalLineTo(9.23f)
                curveTo(14.19f, 8.47f, 13.57f, 7.86f, 12.81f, 7.86f)
                close()
            }
        }.build()

        return _LockReset!!
    }

@Suppress("ObjectPropertyName")
private var _LockReset: ImageVector? = null
