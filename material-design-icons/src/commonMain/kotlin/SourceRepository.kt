package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SourceRepository: ImageVector
    get() {
        if (_SourceRepository != null) {
            return _SourceRepository!!
        }
        _SourceRepository = ImageVector.Builder(
            name = "SourceRepository",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                moveTo(12.75f, 13.5f)
                curveTo(15.5f, 13.5f, 16.24f, 11.47f, 16.43f, 10.4f)
                curveTo(17.34f, 10.11f, 18f, 9.26f, 18f, 8.25f)
                curveTo(18f, 7f, 17f, 6f, 15.75f, 6f)
                curveTo(14.5f, 6f, 13.5f, 7f, 13.5f, 8.25f)
                curveTo(13.5f, 9.19f, 14.07f, 10f, 14.89f, 10.33f)
                curveTo(14.67f, 11f, 14f, 12f, 12f, 12f)
                curveTo(10.62f, 12f, 9.66f, 12.35f, 9f, 12.84f)
                verticalLineTo(8.87f)
                curveTo(9.87f, 8.56f, 10.5f, 7.73f, 10.5f, 6.75f)
                curveTo(10.5f, 5.5f, 9.5f, 4.5f, 8.25f, 4.5f)
                curveTo(7f, 4.5f, 6f, 5.5f, 6f, 6.75f)
                curveTo(6f, 7.73f, 6.63f, 8.56f, 7.5f, 8.87f)
                verticalLineTo(15.13f)
                curveTo(6.63f, 15.44f, 6f, 16.27f, 6f, 17.25f)
                curveTo(6f, 18.5f, 7f, 19.5f, 8.25f, 19.5f)
                curveTo(9.5f, 19.5f, 10.5f, 18.5f, 10.5f, 17.25f)
                curveTo(10.5f, 16.32f, 9.94f, 15.5f, 9.13f, 15.18f)
                curveTo(9.41f, 14.5f, 10.23f, 13.5f, 12.75f, 13.5f)
                moveTo(8.25f, 16.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 17.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 18f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 17.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 16.5f)
                moveTo(8.25f, 6f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 7.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 6.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 6f)
                moveTo(15.75f, 7.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 8.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.75f, 9f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.75f, 7.5f)
                close()
            }
        }.build()

        return _SourceRepository!!
    }

@Suppress("ObjectPropertyName")
private var _SourceRepository: ImageVector? = null
