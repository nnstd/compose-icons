package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Counter: ImageVector
    get() {
        if (_Counter != null) {
            return _Counter!!
        }
        _Counter = ImageVector.Builder(
            name = "Counter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                moveTo(4f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(20f, 18f)
                verticalLineTo(6f)
                horizontalLineTo(18.76f)
                curveTo(19f, 6.54f, 18.95f, 7.07f, 18.95f, 7.13f)
                curveTo(18.88f, 7.8f, 18.41f, 8.5f, 18.24f, 8.75f)
                lineTo(15.91f, 11.3f)
                lineTo(19.23f, 11.28f)
                lineTo(19.24f, 12.5f)
                lineTo(14.04f, 12.47f)
                lineTo(14f, 11.47f)
                curveTo(14f, 11.47f, 17.05f, 8.24f, 17.2f, 7.95f)
                curveTo(17.34f, 7.67f, 17.91f, 6f, 16.5f, 6f)
                curveTo(15.27f, 6.05f, 15.41f, 7.3f, 15.41f, 7.3f)
                lineTo(13.87f, 7.31f)
                curveTo(13.87f, 7.31f, 13.88f, 6.65f, 14.25f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(15.58f)
                lineTo(15.57f, 17.14f)
                lineTo(16.54f, 17.13f)
                curveTo(16.54f, 17.13f, 17.45f, 16.97f, 17.46f, 16.08f)
                curveTo(17.5f, 15.08f, 16.65f, 15.08f, 16.5f, 15.08f)
                curveTo(16.37f, 15.08f, 15.43f, 15.13f, 15.43f, 15.95f)
                horizontalLineTo(13.91f)
                curveTo(13.91f, 15.95f, 13.95f, 13.89f, 16.5f, 13.89f)
                curveTo(19.1f, 13.89f, 18.96f, 15.91f, 18.96f, 15.91f)
                curveTo(18.96f, 15.91f, 19f, 17.16f, 17.85f, 17.63f)
                lineTo(18.37f, 18f)
                horizontalLineTo(20f)
                moveTo(8.92f, 16f)
                horizontalLineTo(7.42f)
                verticalLineTo(10.2f)
                lineTo(5.62f, 10.76f)
                verticalLineTo(9.53f)
                lineTo(8.76f, 8.41f)
                horizontalLineTo(8.92f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _Counter!!
    }

@Suppress("ObjectPropertyName")
private var _Counter: ImageVector? = null
