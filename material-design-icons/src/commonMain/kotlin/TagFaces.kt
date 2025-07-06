package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagFaces: ImageVector
    get() {
        if (_TagFaces != null) {
            return _TagFaces!!
        }
        _TagFaces = ImageVector.Builder(
            name = "TagFaces",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                curveTo(11.68f, 18f, 9f, 15.31f, 9f, 12f)
                curveTo(9f, 8.68f, 11.68f, 6f, 15f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 18f)
                moveTo(4f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13f)
                moveTo(22f, 3f)
                horizontalLineTo(7.63f)
                curveTo(6.97f, 3f, 6.38f, 3.32f, 6f, 3.81f)
                lineTo(0f, 12f)
                lineTo(6f, 20.18f)
                curveTo(6.38f, 20.68f, 6.97f, 21f, 7.63f, 21f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                verticalLineTo(5f)
                curveTo(24f, 3.89f, 23.1f, 3f, 22f, 3f)
                moveTo(13f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 11f)
                moveTo(15f, 16f)
                curveTo(16.86f, 16f, 18.35f, 14.72f, 18.8f, 13f)
                horizontalLineTo(11.2f)
                curveTo(11.65f, 14.72f, 13.14f, 16f, 15f, 16f)
                moveTo(17f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 11f)
                close()
            }
        }.build()

        return _TagFaces!!
    }

@Suppress("ObjectPropertyName")
private var _TagFaces: ImageVector? = null
