package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScreenRotationLock: ImageVector
    get() {
        if (_ScreenRotationLock != null) {
            return _ScreenRotationLock!!
        }
        _ScreenRotationLock = ImageVector.Builder(
            name = "ScreenRotationLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.8f, 2.5f)
                curveTo(16.8f, 1.56f, 17.56f, 0.8f, 18.5f, 0.8f)
                curveTo(19.44f, 0.8f, 20.2f, 1.56f, 20.2f, 2.5f)
                verticalLineTo(3f)
                horizontalLineTo(16.8f)
                verticalLineTo(2.5f)
                moveTo(16f, 9f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 8f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 2.5f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 4f)
                verticalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                moveTo(8.47f, 20.5f)
                curveTo(5.2f, 18.94f, 2.86f, 15.76f, 2.5f, 12f)
                horizontalLineTo(1f)
                curveTo(1.5f, 18.16f, 6.66f, 23f, 12.95f, 23f)
                lineTo(13.61f, 22.97f)
                lineTo(9.8f, 19.15f)
                lineTo(8.47f, 20.5f)
                moveTo(23.25f, 12.77f)
                lineTo(20.68f, 10.2f)
                lineTo(19.27f, 11.61f)
                lineTo(21.5f, 13.83f)
                lineTo(15.83f, 19.5f)
                lineTo(4.5f, 8.17f)
                lineTo(10.17f, 2.5f)
                lineTo(12.27f, 4.61f)
                lineTo(13.68f, 3.2f)
                lineTo(11.23f, 0.75f)
                curveTo(10.64f, 0.16f, 9.69f, 0.16f, 9.11f, 0.75f)
                lineTo(2.75f, 7.11f)
                curveTo(2.16f, 7.7f, 2.16f, 8.65f, 2.75f, 9.23f)
                lineTo(14.77f, 21.25f)
                curveTo(15.36f, 21.84f, 16.31f, 21.84f, 16.89f, 21.25f)
                lineTo(23.25f, 14.89f)
                curveTo(23.84f, 14.3f, 23.84f, 13.35f, 23.25f, 12.77f)
                close()
            }
        }.build()

        return _ScreenRotationLock!!
    }

@Suppress("ObjectPropertyName")
private var _ScreenRotationLock: ImageVector? = null
