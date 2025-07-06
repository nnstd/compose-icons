package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Yurt: ImageVector
    get() {
        if (_Yurt != null) {
            return _Yurt!!
        }
        _Yurt = ImageVector.Builder(
            name = "Yurt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14.87f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(14.87f)
                curveTo(2f, 14.33f, 2.29f, 13.83f, 2.76f, 13.57f)
                lineTo(8.66f, 10.2f)
                curveTo(8.88f, 10.07f, 9.14f, 10f, 9.4f, 10f)
                horizontalLineTo(12.5f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(14.59f)
                curveTo(14.85f, 10f, 15.11f, 10.07f, 15.33f, 10.2f)
                lineTo(21.23f, 13.57f)
                curveTo(21.71f, 13.84f, 22f, 14.33f, 22f, 14.87f)
                moveTo(7.86f, 6.25f)
                horizontalLineTo(9.4f)
                curveTo(10.73f, 6.25f, 11.92f, 6.95f, 12.5f, 8f)
                horizontalLineTo(14f)
                curveTo(13.6f, 6.2f, 12f, 4.85f, 10.1f, 4.85f)
                verticalLineTo(3.35f)
                curveTo(11.1f, 3.35f, 11.95f, 2.5f, 11.95f, 1.5f)
                verticalLineTo(1f)
                horizontalLineTo(7.86f)
                verticalLineTo(2.5f)
                curveTo(6.86f, 2.5f, 6f, 3.23f, 6f, 4.25f)
                reflectiveCurveTo(6.86f, 6.25f, 7.86f, 6.25f)
                close()
            }
        }.build()

        return _Yurt!!
    }

@Suppress("ObjectPropertyName")
private var _Yurt: ImageVector? = null
