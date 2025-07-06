package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleCirclesGroup: ImageVector
    get() {
        if (_GoogleCirclesGroup != null) {
            return _GoogleCirclesGroup!!
        }
        _GoogleCirclesGroup = ImageVector.Builder(
            name = "GoogleCirclesGroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                curveTo(3f, 13.11f, 3.9f, 14f, 5f, 14f)
                curveTo(6.11f, 14f, 7f, 13.11f, 7f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 10f)
                moveTo(5f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16f)
                moveTo(10.5f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                lineTo(18f, 12f)
                lineTo(14f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(10.5f)
                verticalLineTo(11f)
                moveTo(5f, 6f)
                curveTo(4.55f, 6f, 4.11f, 6.05f, 3.69f, 6.14f)
                curveTo(5.63f, 3.05f, 9.08f, 1f, 13f, 1f)
                curveTo(19.08f, 1f, 24f, 5.92f, 24f, 12f)
                curveTo(24f, 18.08f, 19.08f, 23f, 13f, 23f)
                curveTo(9.08f, 23f, 5.63f, 20.95f, 3.69f, 17.86f)
                curveTo(4.11f, 17.95f, 4.55f, 18f, 5f, 18f)
                curveTo(5.8f, 18f, 6.56f, 17.84f, 7.25f, 17.56f)
                curveTo(8.71f, 19.07f, 10.74f, 20f, 13f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4f)
                curveTo(10.74f, 4f, 8.71f, 4.93f, 7.25f, 6.44f)
                curveTo(6.56f, 6.16f, 5.8f, 6f, 5f, 6f)
                close()
            }
        }.build()

        return _GoogleCirclesGroup!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleCirclesGroup: ImageVector? = null
