package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeNotEqualVariant: ImageVector
    get() {
        if (_CodeNotEqualVariant != null) {
            return _CodeNotEqualVariant!!
        }
        _CodeNotEqualVariant = ImageVector.Builder(
            name = "CodeNotEqualVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6.5f)
                verticalLineTo(9.33f)
                lineTo(8.33f, 12f)
                lineTo(11f, 14.67f)
                verticalLineTo(17.5f)
                lineTo(5.5f, 12f)
                moveTo(13f, 6.43f)
                lineTo(18.57f, 12f)
                lineTo(13f, 17.57f)
                verticalLineTo(14.74f)
                lineTo(15.74f, 12f)
                lineTo(13f, 9.26f)
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _CodeNotEqualVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CodeNotEqualVariant: ImageVector? = null
