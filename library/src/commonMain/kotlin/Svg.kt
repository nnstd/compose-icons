package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Svg: ImageVector
    get() {
        if (_Svg != null) {
            return _Svg!!
        }
        _Svg = ImageVector.Builder(
            name = "Svg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.13f, 10.71f)
                horizontalLineTo(8.87f)
                lineTo(6.22f, 8.06f)
                curveTo(5.21f, 8.06f, 4.39f, 7.24f, 4.39f, 6.22f)
                arcTo(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.22f, 4.39f)
                curveTo(7.24f, 4.39f, 8.06f, 5.21f, 8.06f, 6.22f)
                lineTo(10.71f, 8.87f)
                verticalLineTo(5.13f)
                curveTo(10f, 4.41f, 10f, 3.25f, 10.71f, 2.54f)
                curveTo(11.42f, 1.82f, 12.58f, 1.82f, 13.29f, 2.54f)
                curveTo(14f, 3.25f, 14f, 4.41f, 13.29f, 5.13f)
                verticalLineTo(8.87f)
                lineTo(15.95f, 6.22f)
                curveTo(15.95f, 5.21f, 16.76f, 4.39f, 17.78f, 4.39f)
                curveTo(18.79f, 4.39f, 19.61f, 5.21f, 19.61f, 6.22f)
                curveTo(19.61f, 7.24f, 18.79f, 8.06f, 17.78f, 8.06f)
                lineTo(15.13f, 10.71f)
                horizontalLineTo(18.87f)
                curveTo(19.59f, 10f, 20.75f, 10f, 21.46f, 10.71f)
                curveTo(22.18f, 11.42f, 22.18f, 12.58f, 21.46f, 13.29f)
                curveTo(20.75f, 14f, 19.59f, 14f, 18.87f, 13.29f)
                horizontalLineTo(15.13f)
                lineTo(17.78f, 15.95f)
                curveTo(18.79f, 15.95f, 19.61f, 16.76f, 19.61f, 17.78f)
                arcTo(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.78f, 19.61f)
                curveTo(16.76f, 19.61f, 15.95f, 18.79f, 15.95f, 17.78f)
                lineTo(13.29f, 15.13f)
                verticalLineTo(18.87f)
                curveTo(14f, 19.59f, 14f, 20.75f, 13.29f, 21.46f)
                curveTo(12.58f, 22.18f, 11.42f, 22.18f, 10.71f, 21.46f)
                curveTo(10f, 20.75f, 10f, 19.59f, 10.71f, 18.87f)
                verticalLineTo(15.13f)
                lineTo(8.06f, 17.78f)
                curveTo(8.06f, 18.79f, 7.24f, 19.61f, 6.22f, 19.61f)
                curveTo(5.21f, 19.61f, 4.39f, 18.79f, 4.39f, 17.78f)
                curveTo(4.39f, 16.76f, 5.21f, 15.95f, 6.22f, 15.95f)
                lineTo(8.87f, 13.29f)
                horizontalLineTo(5.13f)
                curveTo(4.41f, 14f, 3.25f, 14f, 2.54f, 13.29f)
                curveTo(1.82f, 12.58f, 1.82f, 11.42f, 2.54f, 10.71f)
                curveTo(3.25f, 10f, 4.41f, 10f, 5.13f, 10.71f)
                close()
            }
        }.build()

        return _Svg!!
    }

@Suppress("ObjectPropertyName")
private var _Svg: ImageVector? = null
