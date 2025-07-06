package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoInputAntenna: ImageVector
    get() {
        if (_VideoInputAntenna != null) {
            return _VideoInputAntenna!!
        }
        _VideoInputAntenna = ImageVector.Builder(
            name = "VideoInputAntenna",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12f)
                horizontalLineTo(19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                moveTo(13f, 14.29f)
                curveTo(13.88f, 13.9f, 14.5f, 13.03f, 14.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 12f)
                curveTo(9.5f, 13f, 10.12f, 13.9f, 11f, 14.29f)
                verticalLineTo(17.59f)
                lineTo(7.59f, 21f)
                lineTo(9f, 22.41f)
                lineTo(12f, 19.41f)
                lineTo(15f, 22.41f)
                lineTo(16.41f, 21f)
                lineTo(13f, 17.59f)
                verticalLineTo(14.29f)
                moveTo(12f, 1f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12f)
                horizontalLineTo(3f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                horizontalLineTo(23f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                close()
            }
        }.build()

        return _VideoInputAntenna!!
    }

@Suppress("ObjectPropertyName")
private var _VideoInputAntenna: ImageVector? = null
