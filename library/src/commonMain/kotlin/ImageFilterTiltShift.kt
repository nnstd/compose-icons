package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageFilterTiltShift: ImageVector
    get() {
        if (_ImageFilterTiltShift != null) {
            return _ImageFilterTiltShift!!
        }
        _ImageFilterTiltShift = ImageVector.Builder(
            name = "ImageFilterTiltShift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.68f, 19.74f)
                curveTo(7.16f, 20.95f, 9f, 21.75f, 11f, 21.95f)
                verticalLineTo(19.93f)
                curveTo(9.54f, 19.75f, 8.21f, 19.17f, 7.1f, 18.31f)
                moveTo(13f, 19.93f)
                verticalLineTo(21.95f)
                curveTo(15f, 21.75f, 16.84f, 20.95f, 18.32f, 19.74f)
                lineTo(16.89f, 18.31f)
                curveTo(15.79f, 19.17f, 14.46f, 19.75f, 13f, 19.93f)
                moveTo(18.31f, 16.9f)
                lineTo(19.74f, 18.33f)
                curveTo(20.95f, 16.85f, 21.75f, 15f, 21.95f, 13f)
                horizontalLineTo(19.93f)
                curveTo(19.75f, 14.46f, 19.17f, 15.79f, 18.31f, 16.9f)
                moveTo(15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                moveTo(4.07f, 13f)
                horizontalLineTo(2.05f)
                curveTo(2.25f, 15f, 3.05f, 16.84f, 4.26f, 18.32f)
                lineTo(5.69f, 16.89f)
                curveTo(4.83f, 15.79f, 4.25f, 14.46f, 4.07f, 13f)
                moveTo(5.69f, 7.1f)
                lineTo(4.26f, 5.68f)
                curveTo(3.05f, 7.16f, 2.25f, 9f, 2.05f, 11f)
                horizontalLineTo(4.07f)
                curveTo(4.25f, 9.54f, 4.83f, 8.21f, 5.69f, 7.1f)
                moveTo(19.93f, 11f)
                horizontalLineTo(21.95f)
                curveTo(21.75f, 9f, 20.95f, 7.16f, 19.74f, 5.68f)
                lineTo(18.31f, 7.1f)
                curveTo(19.17f, 8.21f, 19.75f, 9.54f, 19.93f, 11f)
                moveTo(18.32f, 4.26f)
                curveTo(16.84f, 3.05f, 15f, 2.25f, 13f, 2.05f)
                verticalLineTo(4.07f)
                curveTo(14.46f, 4.25f, 15.79f, 4.83f, 16.9f, 5.69f)
                moveTo(11f, 4.07f)
                verticalLineTo(2.05f)
                curveTo(9f, 2.25f, 7.16f, 3.05f, 5.68f, 4.26f)
                lineTo(7.1f, 5.69f)
                curveTo(8.21f, 4.83f, 9.54f, 4.25f, 11f, 4.07f)
                close()
            }
        }.build()

        return _ImageFilterTiltShift!!
    }

@Suppress("ObjectPropertyName")
private var _ImageFilterTiltShift: ImageVector? = null
