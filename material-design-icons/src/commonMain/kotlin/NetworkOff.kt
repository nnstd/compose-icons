package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkOff: ImageVector
    get() {
        if (_NetworkOff != null) {
            return _NetworkOff!!
        }
        _NetworkOff = ImageVector.Builder(
            name = "NetworkOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 5.27f)
                lineTo(5f, 9.27f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 23f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 22f)
                horizontalLineTo(17.73f)
                lineTo(19.73f, 24f)
                lineTo(21f, 22.72f)
                lineTo(2.28f, 4f)
                lineTo(1f, 5.27f)
                moveTo(15f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17.27f)
                lineTo(15.73f, 20f)
                horizontalLineTo(15f)
                moveTo(17.69f, 16.87f)
                lineTo(5.13f, 4.31f)
                curveTo(5.41f, 3.55f, 6.14f, 3f, 7f, 3f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5f)
                verticalLineTo(15f)
                curveTo(19f, 15.86f, 18.45f, 16.59f, 17.69f, 16.87f)
                moveTo(22f, 20f)
                verticalLineTo(21.18f)
                lineTo(20.82f, 20f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _NetworkOff!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkOff: ImageVector? = null
