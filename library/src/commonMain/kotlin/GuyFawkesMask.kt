package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GuyFawkesMask: ImageVector
    get() {
        if (_GuyFawkesMask != null) {
            return _GuyFawkesMask!!
        }
        _GuyFawkesMask = ImageVector.Builder(
            name = "GuyFawkesMask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                lineTo(3.03f, 4.43f)
                curveTo(5.68f, 2.88f, 8.76f, 2f, 12.05f, 2f)
                curveTo(15.3f, 2f, 18.36f, 2.87f, 21f, 4.38f)
                verticalLineTo(13f)
                moveTo(13f, 19.93f)
                curveTo(16.39f, 19.44f, 19f, 16.5f, 19f, 13f)
                verticalLineTo(5.59f)
                curveTo(16.9f, 4.57f, 14.54f, 4f, 12.05f, 4f)
                curveTo(9.5f, 4f, 7.08f, 4.6f, 4.94f, 5.66f)
                lineTo(5f, 13f)
                curveTo(5f, 16.5f, 7.63f, 19.44f, 11f, 19.93f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(19.93f)
                moveTo(11f, 16f)
                horizontalLineTo(8f)
                lineTo(6f, 13f)
                lineTo(9f, 14f)
                horizontalLineTo(10f)
                lineTo(11f, 13f)
                horizontalLineTo(13f)
                lineTo(14f, 14f)
                horizontalLineTo(15f)
                lineTo(18f, 13f)
                lineTo(16f, 16f)
                horizontalLineTo(13f)
                lineTo(12f, 15f)
                lineTo(11f, 16f)
                moveTo(6f, 9.03f)
                curveTo(6.64f, 8.4f, 7.5f, 8.05f, 8.5f, 8.05f)
                curveTo(9.45f, 8.05f, 10.34f, 8.4f, 11f, 9.03f)
                curveTo(10.34f, 9.65f, 9.45f, 10f, 8.5f, 10f)
                curveTo(7.5f, 10f, 6.64f, 9.65f, 6f, 9.03f)
                moveTo(13f, 9.03f)
                curveTo(13.64f, 8.4f, 14.5f, 8.05f, 15.5f, 8.05f)
                curveTo(16.45f, 8.05f, 17.34f, 8.4f, 18f, 9.03f)
                curveTo(17.34f, 9.65f, 16.45f, 10f, 15.5f, 10f)
                curveTo(14.5f, 10f, 13.64f, 9.65f, 13f, 9.03f)
                close()
            }
        }.build()

        return _GuyFawkesMask!!
    }

@Suppress("ObjectPropertyName")
private var _GuyFawkesMask: ImageVector? = null
