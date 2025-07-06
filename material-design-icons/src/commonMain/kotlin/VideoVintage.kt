package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoVintage: ImageVector
    get() {
        if (_VideoVintage != null) {
            return _VideoVintage!!
        }
        _VideoVintage = ImageVector.Builder(
            name = "VideoVintage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.5f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 10f)
                horizontalLineTo(16f)
                curveTo(18.24f, 8.39f, 18.76f, 5.27f, 17.15f, 3f)
                curveTo(15.54f, 0.78f, 12.42f, 0.26f, 10.17f, 1.87f)
                curveTo(9.5f, 2.35f, 8.96f, 3f, 8.6f, 3.73f)
                curveTo(6.25f, 2.28f, 3.17f, 3f, 1.72f, 5.37f)
                curveTo(0.28f, 7.72f, 1f, 10.8f, 3.36f, 12.25f)
                curveTo(3.57f, 12.37f, 3.78f, 12.5f, 4f, 12.58f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 22f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 21f)
                verticalLineTo(17.5f)
                lineTo(22f, 21.5f)
                verticalLineTo(10.5f)
                lineTo(18f, 14.5f)
                moveTo(13f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 4f)
                moveTo(6f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                close()
            }
        }.build()

        return _VideoVintage!!
    }

@Suppress("ObjectPropertyName")
private var _VideoVintage: ImageVector? = null
