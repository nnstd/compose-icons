package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SourceFork: ImageVector
    get() {
        if (_SourceFork != null) {
            return _SourceFork!!
        }
        _SourceFork = ImageVector.Builder(
            name = "SourceFork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                curveTo(9f, 6.28f, 8.19f, 7.38f, 7.06f, 7.81f)
                curveTo(7.15f, 8.27f, 7.39f, 8.83f, 8f, 9.63f)
                curveTo(9f, 10.92f, 11f, 12.83f, 12f, 14.17f)
                curveTo(13f, 12.83f, 15f, 10.92f, 16f, 9.63f)
                curveTo(16.61f, 8.83f, 16.85f, 8.27f, 16.94f, 7.81f)
                curveTo(15.81f, 7.38f, 15f, 6.28f, 15f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                curveTo(21f, 6.32f, 20.14f, 7.45f, 18.95f, 7.85f)
                curveTo(18.87f, 8.37f, 18.64f, 9f, 18f, 9.83f)
                curveTo(17f, 11.17f, 15f, 13.08f, 14f, 14.38f)
                curveTo(13.39f, 15.17f, 13.15f, 15.73f, 13.06f, 16.19f)
                curveTo(14.19f, 16.62f, 15f, 17.72f, 15f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 19f)
                curveTo(9f, 17.72f, 9.81f, 16.62f, 10.94f, 16.19f)
                curveTo(10.85f, 15.73f, 10.61f, 15.17f, 10f, 14.38f)
                curveTo(9f, 13.08f, 7f, 11.17f, 6f, 9.83f)
                curveTo(5.36f, 9f, 5.13f, 8.37f, 5.05f, 7.85f)
                curveTo(3.86f, 7.45f, 3f, 6.32f, 3f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                moveTo(6f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4f)
                moveTo(18f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 4f)
                moveTo(12f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                close()
            }
        }.build()

        return _SourceFork!!
    }

@Suppress("ObjectPropertyName")
private var _SourceFork: ImageVector? = null
