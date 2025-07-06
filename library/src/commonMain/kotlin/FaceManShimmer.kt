package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaceManShimmer: ImageVector
    get() {
        if (_FaceManShimmer != null) {
            return _FaceManShimmer!!
        }
        _FaceManShimmer = ImageVector.Builder(
            name = "FaceManShimmer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.41f, 3.41f)
                lineTo(16f, 4.5f)
                lineTo(18.41f, 5.59f)
                lineTo(19.5f, 8f)
                lineTo(20.6f, 5.59f)
                lineTo(23f, 4.5f)
                lineTo(20.6f, 3.41f)
                lineTo(19.5f, 1f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 10.53f, 21.67f, 9.13f, 21.1f, 7.87f)
                lineTo(19.86f, 10.59f)
                curveTo(19.94f, 11.05f, 20f, 11.5f, 20f, 12f)
                curveTo(20f, 16.43f, 16.43f, 20f, 12f, 20f)
                curveTo(7.57f, 20f, 4f, 16.43f, 4f, 12f)
                curveTo(4f, 11.96f, 4f, 11.91f, 4f, 11.87f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.74f, 6.31f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 10f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.83f, 9.91f)
                lineTo(17.35f, 6.65f)
                lineTo(12.6f, 4.5f)
                lineTo(16.13f, 2.9f)
                curveTo(14.87f, 2.33f, 13.47f, 2f, 12f, 2f)
                moveTo(9f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11.75f)
                moveTo(15f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11.75f)
                close()
            }
        }.build()

        return _FaceManShimmer!!
    }

@Suppress("ObjectPropertyName")
private var _FaceManShimmer: ImageVector? = null
