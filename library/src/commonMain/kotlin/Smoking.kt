package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Smoking: ImageVector
    get() {
        if (_Smoking != null) {
            return _Smoking!!
        }
        _Smoking = ImageVector.Builder(
            name = "Smoking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 16f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                moveTo(20.5f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(20.5f)
                verticalLineTo(16f)
                moveTo(18f, 16f)
                horizontalLineTo(19.5f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                moveTo(18.85f, 7.73f)
                curveTo(19.47f, 7.12f, 19.85f, 6.28f, 19.85f, 5.35f)
                curveTo(19.85f, 3.5f, 18.35f, 2f, 16.5f, 2f)
                verticalLineTo(3.5f)
                curveTo(17.5f, 3.5f, 18.35f, 4.33f, 18.35f, 5.35f)
                curveTo(18.35f, 6.37f, 17.5f, 7.2f, 16.5f, 7.2f)
                verticalLineTo(8.7f)
                curveTo(18.74f, 8.7f, 20.5f, 10.53f, 20.5f, 12.77f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(12.76f)
                curveTo(22f, 10.54f, 20.72f, 8.62f, 18.85f, 7.73f)
                moveTo(16.03f, 10.2f)
                horizontalLineTo(14.5f)
                curveTo(13.5f, 10.2f, 12.65f, 9.22f, 12.65f, 8.2f)
                curveTo(12.65f, 7.18f, 13.5f, 6.45f, 14.5f, 6.45f)
                verticalLineTo(4.95f)
                curveTo(12.65f, 4.95f, 11.15f, 6.45f, 11.15f, 8.3f)
                arcTo(3.35f, 3.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 11.65f)
                horizontalLineTo(16.03f)
                curveTo(17.08f, 11.65f, 18f, 12.39f, 18f, 13.7f)
                verticalLineTo(15f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.36f)
                curveTo(19.5f, 11.55f, 17.9f, 10.2f, 16.03f, 10.2f)
                close()
            }
        }.build()

        return _Smoking!!
    }

@Suppress("ObjectPropertyName")
private var _Smoking: ImageVector? = null
