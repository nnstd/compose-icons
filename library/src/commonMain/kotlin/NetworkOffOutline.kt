package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkOffOutline: ImageVector
    get() {
        if (_NetworkOffOutline != null) {
            return _NetworkOffOutline!!
        }
        _NetworkOffOutline = ImageVector.Builder(
            name = "NetworkOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.04f, 5.27f)
                lineTo(5f, 9.23f)
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
                horizontalLineTo(17.77f)
                lineTo(19.77f, 24f)
                lineTo(21.04f, 22.72f)
                lineTo(2.32f, 4f)
                lineTo(1.04f, 5.27f)
                moveTo(7f, 11.23f)
                lineTo(10.77f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(11.23f)
                moveTo(15f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17.23f)
                lineTo(15.77f, 20f)
                horizontalLineTo(15f)
                moveTo(22f, 20f)
                verticalLineTo(21.14f)
                lineTo(20.86f, 20f)
                horizontalLineTo(22f)
                moveTo(7f, 6.14f)
                lineTo(5.14f, 4.28f)
                curveTo(5.43f, 3.53f, 6.16f, 3f, 7f, 3f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5f)
                verticalLineTo(15f)
                curveTo(19f, 15.85f, 18.47f, 16.57f, 17.72f, 16.86f)
                lineTo(15.86f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(6.14f)
                close()
            }
        }.build()

        return _NetworkOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkOffOutline: ImageVector? = null
