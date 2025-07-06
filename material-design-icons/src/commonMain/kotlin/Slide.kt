package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Slide: ImageVector
    get() {
        if (_Slide != null) {
            return _Slide!!
        }
        _Slide = ImageVector.Builder(
            name = "Slide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.83f, 15.45f)
                curveTo(14.47f, 14.9f, 14.18f, 14.39f, 13.91f, 13.92f)
                curveTo(12.74f, 11.91f, 11.79f, 10.55f, 9f, 10.13f)
                verticalLineTo(5.5f)
                curveTo(9f, 3.57f, 7.43f, 2f, 5.5f, 2f)
                reflectiveCurveTo(2f, 3.57f, 2f, 5.5f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(12.16f)
                curveTo(10.76f, 12.5f, 11.29f, 13.39f, 12.17f, 14.92f)
                curveTo(12.46f, 15.43f, 12.78f, 15.97f, 13.17f, 16.56f)
                curveTo(15.41f, 19.92f, 17.67f, 22f, 22f, 22f)
                verticalLineTo(20f)
                curveTo(18.53f, 20f, 16.8f, 18.4f, 14.83f, 15.45f)
                moveTo(5.5f, 4f)
                curveTo(6.33f, 4f, 7f, 4.67f, 7f, 5.5f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(5.5f)
                curveTo(4f, 4.67f, 4.67f, 4f, 5.5f, 4f)
                moveTo(4f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                moveTo(7f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Slide!!
    }

@Suppress("ObjectPropertyName")
private var _Slide: ImageVector? = null
