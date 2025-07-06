package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Microscope: ImageVector
    get() {
        if (_Microscope != null) {
            return _Microscope!!
        }
        _Microscope = ImageVector.Builder(
            name = "Microscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.46f, 6.28f)
                lineTo(11.05f, 9f)
                curveTo(8.47f, 9.26f, 6.5f, 11.41f, 6.5f, 14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 19f)
                curveTo(13.55f, 19f, 15.31f, 17.77f, 16.08f, 16f)
                horizontalLineTo(13.5f)
                verticalLineTo(14f)
                horizontalLineTo(21.5f)
                verticalLineTo(16f)
                horizontalLineTo(19.25f)
                curveTo(18.84f, 17.57f, 17.97f, 18.96f, 16.79f, 20f)
                horizontalLineTo(19.5f)
                verticalLineTo(22f)
                horizontalLineTo(3.5f)
                verticalLineTo(20f)
                horizontalLineTo(6.21f)
                curveTo(4.55f, 18.53f, 3.5f, 16.39f, 3.5f, 14f)
                curveTo(3.5f, 10.37f, 5.96f, 7.2f, 9.46f, 6.28f)
                moveTo(12.74f, 2.07f)
                lineTo(13.5f, 3.37f)
                lineTo(14.36f, 2.87f)
                lineTo(17.86f, 8.93f)
                lineTo(14.39f, 10.93f)
                lineTo(10.89f, 4.87f)
                lineTo(11.76f, 4.37f)
                lineTo(11f, 3.07f)
                lineTo(12.74f, 2.07f)
                close()
            }
        }.build()

        return _Microscope!!
    }

@Suppress("ObjectPropertyName")
private var _Microscope: ImageVector? = null
