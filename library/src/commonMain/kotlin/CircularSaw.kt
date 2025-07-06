package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircularSaw: ImageVector
    get() {
        if (_CircularSaw != null) {
            return _CircularSaw!!
        }
        _CircularSaw = ImageVector.Builder(
            name = "CircularSaw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 11f)
                moveTo(7.86f, 6.25f)
                curveTo(9.14f, 4.87f, 10.97f, 4f, 13f, 4f)
                curveTo(16.5f, 4f, 19.44f, 6.61f, 19.93f, 10f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                horizontalLineTo(2.05f)
                curveTo(2.25f, 7.73f, 3.14f, 5.66f, 4.5f, 4f)
                lineTo(7.86f, 6.25f)
                moveTo(6.73f, 7.89f)
                lineTo(5.06f, 6.77f)
                curveTo(4.53f, 7.75f, 4.18f, 8.84f, 4.06f, 10f)
                horizontalLineTo(6.07f)
                curveTo(6.18f, 9.25f, 6.4f, 8.54f, 6.73f, 7.89f)
                moveTo(7.4f, 15.4f)
                lineTo(6f, 14f)
                horizontalLineTo(11.79f)
                curveTo(12.03f, 14.42f, 12.5f, 14.7f, 13f, 14.7f)
                curveTo(13.5f, 14.7f, 13.97f, 14.42f, 14.21f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(15.4f)
                curveTo(18.39f, 14.42f, 18.46f, 15.75f, 18.46f, 15.75f)
                verticalLineTo(17.71f)
                lineTo(16.5f, 19.67f)
                curveTo(16f, 17.92f, 15.1f, 18.9f, 15.1f, 18.9f)
                lineTo(13.7f, 20.3f)
                horizontalLineTo(10.9f)
                curveTo(11.88f, 18.69f, 10.55f, 18.76f, 10.55f, 18.76f)
                horizontalLineTo(8.59f)
                lineTo(6.63f, 16.8f)
                curveTo(8.38f, 16.31f, 7.4f, 15.4f, 7.4f, 15.4f)
                close()
            }
        }.build()

        return _CircularSaw!!
    }

@Suppress("ObjectPropertyName")
private var _CircularSaw: ImageVector? = null
