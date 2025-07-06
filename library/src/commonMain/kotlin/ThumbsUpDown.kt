package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThumbsUpDown: ImageVector
    get() {
        if (_ThumbsUpDown != null) {
            return _ThumbsUpDown!!
        }
        _ThumbsUpDown = ImageVector.Builder(
            name = "ThumbsUpDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 10f)
                horizontalLineTo(15.75f)
                curveTo(15.13f, 10f, 14.6f, 10.38f, 14.37f, 10.91f)
                lineTo(12.11f, 16.2f)
                curveTo(12.04f, 16.37f, 12f, 16.56f, 12f, 16.75f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 19f)
                horizontalLineTo(18.18f)
                lineTo(17.5f, 22.18f)
                verticalLineTo(22.42f)
                curveTo(17.5f, 22.73f, 17.63f, 23f, 17.83f, 23.22f)
                lineTo(18.62f, 24f)
                lineTo(23.56f, 19.06f)
                curveTo(23.83f, 18.79f, 24f, 18.41f, 24f, 18f)
                verticalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 10f)
                moveTo(12f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 5f)
                horizontalLineTo(5.82f)
                lineTo(6.5f, 1.82f)
                verticalLineTo(1.59f)
                curveTo(6.5f, 1.28f, 6.37f, 1f, 6.17f, 0.79f)
                lineTo(5.38f, 0f)
                lineTo(0.44f, 4.94f)
                curveTo(0.17f, 5.21f, 0f, 5.59f, 0f, 6f)
                verticalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 14f)
                horizontalLineTo(8.25f)
                curveTo(8.87f, 14f, 9.4f, 13.62f, 9.63f, 13.09f)
                lineTo(11.89f, 7.8f)
                curveTo(11.96f, 7.63f, 12f, 7.44f, 12f, 7.25f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _ThumbsUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbsUpDown: ImageVector? = null
