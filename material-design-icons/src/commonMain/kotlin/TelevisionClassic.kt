package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionClassic: ImageVector
    get() {
        if (_TelevisionClassic != null) {
            return _TelevisionClassic!!
        }
        _TelevisionClassic = ImageVector.Builder(
            name = "TelevisionClassic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.16f, 3f)
                lineTo(6.75f, 4.41f)
                lineTo(9.34f, 7f)
                horizontalLineTo(4f)
                curveTo(2.89f, 7f, 2f, 7.89f, 2f, 9f)
                verticalLineTo(19f)
                curveTo(2f, 20.11f, 2.89f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(21.11f, 21f, 22f, 20.11f, 22f, 19f)
                verticalLineTo(9f)
                curveTo(22f, 7.89f, 21.11f, 7f, 20f, 7f)
                horizontalLineTo(14.66f)
                lineTo(17.25f, 4.41f)
                lineTo(15.84f, 3f)
                lineTo(12f, 6.84f)
                lineTo(8.16f, 3f)
                moveTo(4f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(19.5f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 9f)
                moveTo(19.5f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 12f)
                close()
            }
        }.build()

        return _TelevisionClassic!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionClassic: ImageVector? = null
